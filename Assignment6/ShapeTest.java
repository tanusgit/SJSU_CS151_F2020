

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		// s.compute();
		System.out.println("printing the length of shapes " + shapes.size());
		for (int i = 0; i < shapes.size(); i++) {
			try {
				FileOutputStream sout = new FileOutputStream("./obj" + (i + 1) + ".txt");
				ObjectOutputStream oOut = new ObjectOutputStream(sout);
				oOut.writeObject(shapes.get(i));
				oOut.close();
				sout.close();

			} catch (IOException e) {
				System.out.println(e);
			}
		}

		Shape shapes2 = new Shape();
		for (int i = 0; i < shapes.size(); i++) {
			// Deserialization
			try {

				// Reading the object from a file
				FileInputStream sout = new FileInputStream("./obj" + (i + 1) + ".txt");
				ObjectInputStream oOut = new ObjectInputStream(sout);

				// Method for deserialization of object
				shapes2 = (Shape) oOut.readObject();
				oOut.close();
				sout.close();
				System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
				System.out.println(shapes2);

				// System.out.println("z = " + object1.z);
			}

			catch (IOException ex) {
				System.out.println("IOException is caught");
			}

			catch (ClassNotFoundException ex) {
				System.out.println("ClassNotFoundException" + " is caught");
			}

		}

		for (int i = 0; i < 4; i++) {
			System.out.println("inside loop -- ");
			Thread object = new Thread(new Shapes(shapes));
			// s.compute();
			object.start();

		}

		System.out.println("-----------------------");
		// max() return the shape with the maximum area
		Shape m = s.max();
		System.out.println("------------------------------------------");
		System.out.println("printing maximum area = " + m.computeArea());
		System.out.println(m.toString());
		System.out.println("------------------------------------------");
		// min() return the shape with the minimum area
		Shape m2 = s.min();
		System.out.println("-------------------------------------------");
		System.out.println("printing minimum area = " + m2.computeArea());
		System.out.println(m2.toString());
		System.out.println("-------------------------------------------");

	}
}
