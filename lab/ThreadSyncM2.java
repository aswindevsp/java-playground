class EvenOdd{
	 public void even() {
		for(int i=1; i<=10; i+=2) {
			System.out.println("Even: " + i);
		}
	}
	
	 public void odd() {
		for(int i=2; i<=10; i+=2) {
			System.out.println("Odd: " + i);
		}
	}
}

class T1 extends Thread {
	EvenOdd e1 = new EvenOdd();
	
	T1(EvenOdd e) {
		e1 = e;
	}
	public void run () {
		synchronized(e1){
			e1.even();
		}
	}
}

class T2 extends Thread {
	EvenOdd e2 = new EvenOdd();
	
	T2(EvenOdd e) {
		e2 = e;
	}
	
	public void run () {
		synchronized(e2){
			e2.odd();
		}
	}
}
public class ThreadSync {
	public static void main(String []args) {
		EvenOdd eo = new EvenOdd();
		T1 t1 = new T1(eo);
		T2 t2 = new T2(eo);


		t1.start();
		t2.start();
	}
}
