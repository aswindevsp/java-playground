public class OddEvenToArray
{
	public static void main(String args[])
	{
		int arr[] = new int[]{1,3,2,44,3,44,45,2,11,343,44};
		int odd[] = new int[100];
		int even[] = new int[100];
		
		System.out.println("Array elements: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int oddIndex = 0, evenIndex = 0;
		for(int i=0; i<arr.length; i++) {	
			if(arr[i]%2 == 0) {
				even[evenIndex] = arr[i];
				evenIndex++;
			}		
			else {
				odd[oddIndex] = arr[i];
				oddIndex++;
			}
		}
		
		System.out.println("Odd Numbers: ");
		for(int i=0; i<oddIndex; i++) {
			System.out.print(odd[i] + " ");
		}
		
		
		System.out.println();
		System.out.println("Even Numbers: ");
		for(int i=0; i<evenIndex; i++) {
			System.out.print(even[i] + " ");
		}
		
		System.out.println();
		
	}
}
