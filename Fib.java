public class Fib
{
	public static void main(String args[])
	{
		int n = 10;
		
		int a = 0, b = 1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i=2; i<=n; i++) {
			int temp = b;
			b = a + b;
			a = temp;
			
			System.out.print(b + " ");
		}
		System.out.println();
		
	}
}
