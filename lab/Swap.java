public class Swap
{
	public static void main(String args[])
	{
		System.out.println("Before Swap: ");
		int a = 10;
		int b = 5;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println();
		System.out.println("After Swap: ");		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
