class CheckedException {
	void test() throws Exception{
		throw new IllegalAccessException();
	}
}
public class UncheckedAndChecked {
	public static void main(String []args) {
			CheckedException a = new CheckedException();
			try {
				a.test();
			} catch(Exception e) {
				System.out.println("Works");
			}
	}
}
