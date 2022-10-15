abstract class Sides {
	abstract void numberOfSides();
}

class Triangle extends Sides {
	void numberOfSides() {
		System.out.println("No of sides of Triangle: 3");
	}
}

class Rectangle extends Sides {
	void numberOfSides() {
		System.out.println("No of sides of Rectangle: 4");
	}
}

class Hexagon extends Sides {
	void numberOfSides() {
		System.out.println("No of sides of Hexagon: 6");
	}
}


public class AbsCon {
	public static void main(String []args) {
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Hexagon h = new Hexagon();
		
		t.numberOfSides();
		r.numberOfSides();
		h.numberOfSides();
	}
}


//No of sides of Triangle: 3
//No of sides of Rectangle: 4
//No of sides of Hexagon: 6

