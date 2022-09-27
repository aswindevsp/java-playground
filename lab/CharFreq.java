import java.util.Scanner;

public class CharFreq {
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		String str;
		String ch;
		
		System.out.print("Enter a string: ");
		str = input.nextLine();
		
		
		System.out.print("Enter char: ");
		ch = input.nextLine();
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch.charAt(0)) {
				count++;
			}
		}
		
		System.out.println("Frequncy of " + ch + " is " + count);
	}
}
