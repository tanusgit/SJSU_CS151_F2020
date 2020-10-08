package a6;

import java.util.ArrayList;

/*Add the ability to add and remove objects from this attribute using methods add() 
and remove(). This class should have at least one constructor implemented. 
This class should also implement a getter and a setter for shapeList.
Implement a synchronized public method called compute() in which you iterate 
through the members of shapeList and make a call to compute the shape’s area 
and print the result to command line output. */
public class Shapes {
	private ArrayList<Shape> shapeList = new ArrayList<>();

	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}

	public Shapes(ArrayList<Shape> shapeList) {
		super();
		this.shapeList = shapeList;
	}

	public void add(Shape s) {
		shapeList.add(s);
	}

	public void remove(Shape s) {
		shapeList.remove(s);
	}

	public void compute() {
		for (Shape s : shapeList) {
			double res = s.computeArea();
			System.out.println(res);
		}
	}

}
