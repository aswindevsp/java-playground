import java.util.Scanner;

public class temp
{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); 
		int a[] = new int[n];

		for(int i=0; i<n; i++) {
			a[i] = input.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(a[0]);
		}
		input.close();
	}
}
