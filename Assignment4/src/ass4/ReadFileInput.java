package ass4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {
	public static void main(String[] args) throws IOException {
		File file = new File("/home/td/Desktop/SJSU/CS151/SJSU_CS151_F2020/Assignment4/src/ass4/quote.txt");
		FileReader r = new FileReader(file);
		int line;
		while ((line = r.read()) != -1)
			System.out.print((char) line);
	}

}
