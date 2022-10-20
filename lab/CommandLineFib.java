public class CommandLineFib
{
	public static void main(String args[])
	{
		
		int a = 0, b = 1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i=2; i<=Integer.parseInt(args[0]); i++) {
			int temp = b;
			b = a + b;
			a = temp;
			
			System.out.print(b + " ");
		}
		System.out.println();
		
	}
}
