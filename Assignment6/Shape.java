package a6;

public abstract class Shape {
	private double  length;
	private double  width;

	public abstract double computeArea();

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
	public String toString() {
		return "Shape [length=" + length + ", width=" + width + "]";
	}

}
