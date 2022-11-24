import java.io.*;
import java.util.*;

public class Easy {

	public static class Student {

		String name;
		String dob;
		String regNo;
		int marks[] = new int[3];
		int totalMark;

		Student(String name, String dob, String regNo){
			this.name = name;
			this.dob = dob;
			this.regNo = regNo;
		}

		void readMark(Scanner input) {

			System.out.print("Enter mark 1: ");
			marks[0] = Integer.parseInt(input.nextLine());

			System.out.print("Enter mark 2: ");
			marks[1] = Integer.parseInt(input.nextLine());

			System.out.print("Enter mark 3: ");
			marks[2] = Integer.parseInt(input.nextLine());

			System.out.println();
		}

		void computeTotal() {
			totalMark = (marks[0] + marks[1] + marks[2]) / 3;
			System.out.println("Total marks: " + totalMark);
		}

		void displayMarks() {
			for (int i = 0; i<marks.length; i++) {
				System.out.println("Mark " + 1 + ": " + marks[i]);
			}
		}

	}

    static class writeToFile {
        final int NAME_SPACE = 18;
        final int DOB_SPACE = 14;
        final int REGNO_SPACE = 20;
        final int TOTAL_MARK = 15;

        Student[] s;
    
        writeToFile(Student sT[]) {
            try{
                s = sT;
                FileWriter fw = new FileWriter("output.txt");
                
                sort(s);

                spacer(fw);
                //Writing table header
                writer(fw, "Student Name", NAME_SPACE);
                writer(fw, "DOB", DOB_SPACE);
                writer(fw, "Register No", REGNO_SPACE);
                writer(fw, "Total Mark", TOTAL_MARK);

                spacer(fw);

                for(int i=0; i<s.length; i++) {
                    writer(fw, s[i].name, NAME_SPACE);
                    writer(fw, s[i].dob, DOB_SPACE);
                    writer(fw, s[i].regNo, REGNO_SPACE);
                    writer(fw, Integer.toString(s[i].totalMark), TOTAL_MARK);
                    fw.write("\n");
                }

                spacer(fw);

                fw.flush();

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        void sort(Student s[]) {
            Student temp = new Student("temp", "temp", "temp");

            System.out.println(s.length);
    
            for(int i=0; i <s.length; i++) {
                for(int j=0; i < s.length - 1 - i; i++) {
                    if(Integer.parseInt(s[j].regNo) > Integer.parseInt(s[j+1].regNo)) {
                        temp = s[j];
                        s[j] = s[j+1];
                        s[j+1] = temp;
                    }
                }
            }
        }

        void spacer(FileWriter fw) {
            try{
                fw.write("\n");
                for(int i=0; i<67; i++) {
                    fw.write("=");
                }
                fw.write("\n");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        void writer(FileWriter fw,String s, int maxSpace) {
            try{
                fw.write(s);
                for(int i=0; i<maxSpace-s.length(); i++) {
                    fw.write(" ");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }
    

	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student limit: ");
		n = Integer.parseInt(input.nextLine());
        
		Student[] s = new Student[n];

		for (int i = 0; i < n; i++) {
			String name, dob, regNo;
			System.out.print("Enter Name: ");
			name = input.nextLine();

			System.out.print("Enter dob: ");
			dob = input.nextLine();

			System.out.print("Enter regNo: ");
			regNo = input.nextLine();

			s[i] = new Student(name, dob, regNo);

			s[i].readMark(input);

            s[i].computeTotal();
    
		}

        writeToFile w = new writeToFile(s);


	}

}