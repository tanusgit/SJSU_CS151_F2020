

public class Circle extends Shape {
	private double radius;

	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double computeArea() {
		double res = radius * radius * Math.PI;
		return res;

	}

}
