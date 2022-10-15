public class Voting {
	static void Eligible(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age below 18, not eligbvle for ");
		} else {
			System.out.println("Eligble for Voting");
		}
	}
	
	public static void main(String []args) {
		try {
			Eligible(17);
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}
	
}

