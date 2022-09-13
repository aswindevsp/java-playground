public class Factorial
{
	public static void main(String args[])
	{
		int n = 5;
		System.out.println("Num = " + n);
		int fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial = " + fact);
	}
}
