package a6;

import java.util.ArrayList;

/*Add the ability to add and remove objects from this attribute using methods add() 
and remove(). This class should have at least one constructor implemented. 
This class should also implement a getter and a setter for shapeList.
Implement a synchronized public method called compute() in which you iterate 
through the members of shapeList and make a call to compute the shape’s area 
and print the result to command line output. */
public class Shapes<T> implements Runnable{
	private ArrayList<T> shapeList = new ArrayList<>();

	public  < T extends Shape > ArrayList<T> getShapeList() {
		return (ArrayList<T>) shapeList;
	}

	public void setShapeList(ArrayList<T> shapeList) {
		this.shapeList = shapeList;
	}

	public Shapes(ArrayList<T> shapeList) {
		super();
		this.shapeList = shapeList;
	}

	public void add(T s) {
		shapeList.add(s);
	}

	public void remove(T s) {
		shapeList.remove(s);
	}
	
	
	public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                                Thread.currentThread().getId() + 
                                " is running"); 
            compute();
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 

	public void compute() {
		for (Shape s : shapeList) {
			double res = s.computeArea();
			System.out.println(s.toString() + " " + res);
		}
	}

	public Shape max() {
		double max = 0.0;
		Shape p = null;
		for (Shape s : shapeList) {	
			double res = s.computeArea();
			if(res > max ) {
				max = res;
				try {
					p = (Shape)s.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		}
		return p;
	}

	public Shape min() {
		double firstArea = shapeList.get(0).computeArea();
		double min = firstArea;
		Shape p = null;
		for (Shape s : shapeList) {
			double res = s.computeArea();
			if(min > res) {
				min = res;
				try {
					p = (Shape)s.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		}
		return p;
	}

}
