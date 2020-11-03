

public class Triangle extends Shape {
	private double  length;
	private double  width;

	public Triangle(double  length, double  width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double  getLength() {
		return length;
	}

	public void setLength(double  length) {
		this.length = length;
	}

	public double  getWidth() {
		return width;
	}

	public void setWidth(double  width) {
		this.width = width;
	}

	@Override
	public double computeArea() {
		double res = (.5)* length * width;
		//System.out.println("area triangle  " + res + " " + length + " "+ width);
		return res;
		

	}

	@Override
	public String toString() {
		return "Triangle [length=" + length + ", width=" + width + "]";
	}

}
