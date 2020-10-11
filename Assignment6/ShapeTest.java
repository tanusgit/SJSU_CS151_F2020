package a6;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle(2.3);
		Circle c1 = new Circle(2.5);

		Rectangle r = new Rectangle(3.2, 2.0);
		Rectangle r1 = new Rectangle(3.3, 2.1);

		Triangle t = new Triangle(3.2, 2.0);
		Triangle t1 = new Triangle(3.3, 2.1);

		Hexagon h = new Hexagon(5.2);
		Hexagon h1 = new Hexagon(2.2);

		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(c);
		shapes.add(c1);
		shapes.add(r);
		shapes.add(r1);
		shapes.add(t);
		shapes.add(t1);
		shapes.add(h);
		shapes.add(h1);

		Shapes s = new Shapes(shapes);
		//s.compute();
		
		for (int i=0; i<4; i++) 
        { 
			System.out.println("inside loop -- ");
            Thread object = new Thread(new Shapes(shapes)); 
           // s.compute();
            object.start(); 
            
        } 
		
		
		System.out.println("-----------------------");
		//max() return the shape with the maximum area
		Shape m = s.max();
		System.out.println("maximum area = " + m.computeArea());
		System.out.println(m.toString());
		
		//min() return the shape with the minimum area
		Shape m2 = s.min();
		System.out.println("minimum area = " + m2.computeArea());
		System.out.println(m2.toString());

	}
}
