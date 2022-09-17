public class SumArray
{
	public static void main(String args[])
	{
		int arr[] = new int[]{1,3,44,55,2};
				
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum = " + sum);
	}
}
