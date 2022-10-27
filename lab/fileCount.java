//write a java program to count no of char, word and lines inside a file.

import java.io.*;

public class fileCount{
	static void readFile(String fileName) {
		try {
			FileInputStream f1 = new FileInputStream(fileName);
			int chCount = 0, sCount = 0, lCount = 0;
			int a;
			int count = 0;
			
			a = f1.read();
			while(a != -1) {
				if((char) a == ' ') {
					sCount++;
				} else if(Character.isLetter((char) a) == true)  {
					chCount++;
				} else{
					lCount++;
					sCount++;
				}
				a = f1.read();
			}
			
			f1.close();
			
			System.out.println("Char Count: " + chCount);
			System.out.println("Word Count: " + sCount);
			System.out.println("Line Count: " + lCount);
				
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String []args) {
		readFile("input.txt");
	}
}
