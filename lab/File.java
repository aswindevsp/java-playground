import java.io.*;

public class File{
	static void readWrite() {
		try {
			FileInputStream f1 = new FileInputStream("input.txt");
			FileOutputStream f2 = new FileOutputStream("output.txt");
			int a;
			do {
				a = f1.read();
				
				if(a!=-1 ) {
					f2.write((char) a);
				}
			} while(a != -1);
			
			f1.close();
			f2.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String []args) {
		readWrite();
	}
}
