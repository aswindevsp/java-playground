class Tri{
	private void print(String s) {
		for(int i=0; i<5; i++) {
			for(int j=0;j<=i; j++ ) {
				System.out.print(s);
			}
			System.out.println();
		}
		System.out.println();
	}
	public void one() {
		print("1 ");
	}
	
	public void star() {	
		print("* ");
	}
}

class T1 extends Thread {
	Tri e1 = new Tri();
	
	T1(Tri e) {
		e1 = e;
	}
	public void run () {
		synchronized(e1){
			e1.one();
		}
	}
}

class T2 extends Thread {
	Tri e2 = new Tri();
	
	T2(Tri e) {
		e2 = e;
	}
	public void run () {
		synchronized(e2){
			e2.star();
		}
	}
}

public class TriangleStar{
	public static void main(String []args) {
	Tri tt = new Tri();
	T1 t1 = new T1(tt);
	T2 t2 = new T2(tt);


	t1.start();
	t2.start();
	}
}
