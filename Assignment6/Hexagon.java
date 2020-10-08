package a6;

public class Hexagon extends Shape {
	private double side;

	public Hexagon(double side) {
		super();
		this.side = side;
	}

	@Override
	public String toString() {
		return "Hexagon [side=" + side + "]";
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double computeArea() {
		double res = side * side * (3*(Math.sqrt(3)/2));
		return res;
	}

}
