public class StudentClass{
	public static class Student{
		int rollNo;
		String name;
		int marks[] = new int[3];
		
		void Studnet(){
			marks[0] = 0;
			marks[1] = 0;
			marks[2] = 0;
		}
		
		int total() {
			int total = 0;
			for(int i=0; i<3; i++)
				total += marks[i];
				
			return total;
		}
	}
	
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.rollNo = 10;
		s1.name = "Kiran";
		s1.marks[0] = 88;
		s1.marks[1] = 90;
		s1.marks[2] = 78;
		
		
		System.out.println("Roll No = " + s1.rollNo);
		System.out.println("Name = " + s1.name);
		System.out.println("Mark1 = " + s1.marks[0]);
		System.out.println("Mark2 = " + s1.marks[1]);
		System.out.println("Mark3 = " + s1.marks[2]);		
		System.out.println("Total Marks = " + s1.total());
	}
}
