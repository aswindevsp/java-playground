public class Voting {
	static void Eligible(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age below 18, not eligbvle for voting");
		} else {
			System.out.println("Eligble for Voting");
		}
	}
	
	public static void main(String []args) {
		try {
			Eligible(17);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}



//java.lang.Exception: Age below 18, not eligbvle for voting

