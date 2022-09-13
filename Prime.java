public class Prime
{
	public static void main(String args[])
	{
		int n = 13;
		System.out.println("Num = " + n);
		
		int flag = 0;
		
		for(int i=2; i<n; i++) {
			if(n % i == 0){
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}	
	}
}
