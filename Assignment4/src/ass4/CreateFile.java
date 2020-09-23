

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		Scanner m = new Scanner(System.in);

		File file = new File(
				"/home/td/Desktop/SJSU/CS151/SJSU_CS151_F2020/Assignment4/src/ass4/command_line_input.txt");

		FileWriter w = new FileWriter(file);

		while (true) {
			String input = m.nextLine();
			if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("@q")) {
				break;
			}
			try {
				w.write(input + " ");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		w.close();
	}

}
