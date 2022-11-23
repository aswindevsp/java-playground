import java.util.Scanner;
import java.util.StringTokenizer;
import java.io. *;
class StringTokem {
	public static void main(String []args) {
		try {
				FileInputStream f1 = new FileInputStream("input.txt");
				Scanner input = new Scanner(f1);
				
				String str = input.nextLine();
				
				int sum = 0;
				
				StringTokenizer s = new StringTokenizer(str);
				
				while(s.hasMoreTokens()) {
					String temp = s.nextToken();
					System.out.println(temp+ " ");
					sum += Integer.parseInt(temp);
				}
				
				System.out.println("Sum: " + sum);
				
				
			
			} catch(Exception e) {
				System.out.println(e);
		}
	}
}
