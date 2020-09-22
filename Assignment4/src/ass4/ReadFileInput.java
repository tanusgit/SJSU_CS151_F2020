package ass4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {
	public static void main(String[] args) {
		File file = new File("/home/td/Desktop/SJSU/CS151/SJSU_CS151_F2020/Assignment4/src/ass4/quote.txt");
		FileReader r;
		if (file.length() == 0) {
			System.out.println("your file is empty");
		}
		try {
			r = new FileReader(file);
			int line;

			while ((line = r.read()) != -1)
				System.out.print((char) line);
		} catch (FileNotFoundException e) {
			System.out.println("could not find the file");
		} catch (NullPointerException e) {
			System.out.println("Yo have passed a null value instead of a file");
		} catch (IOException e) {
			System.out.println("You have done wrong operations with file");
		}
	}

}
