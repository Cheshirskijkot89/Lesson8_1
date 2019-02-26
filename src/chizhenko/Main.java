package chizhenko;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String text;
		File myFile;

		System.out.println("¬ведите текст, дл€ завершени€ работы введите exit");

		while (true) {

			text = sc.nextLine();

			if (text.equals("exit")) {
				break;
			}

			sb.append(text);
			sb.append(System.lineSeparator());

		}

		System.out.println("”кажите им€ файла");

		myFile = new File(sc.nextLine() + ".txt");

		sc.close();

		saveToFile(myFile, sb.toString());

		// System.out.println(sb.toString());

	}

	public static void saveToFile(File pFile, String pText) {

		try (PrintWriter pw = new PrintWriter(pFile)) {
			pw.println(pText);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
