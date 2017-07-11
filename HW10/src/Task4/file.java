package Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class file {
	public static void main(String[] args) {
		String fileName = "file1.txt";
		String fileName2 = "file2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s = null;
			int count = 0;

			System.out.println("Read context from file " + fileName + " into array of strings. ");
			List<String> lines = new ArrayList<String>();
			while ((s = br.readLine()) != null) {
				System.out.println("row " + ++count + " read:" + s);
				lines.add(s);
			}

			String[] arr = lines.toArray(new String[0]);
			br.close();

			String longestLine = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (longestLine.length() < arr[i].length()) {
					longestLine = arr[i];
				}
			}
			for (int i = (int) (Math.random() * 10); --i >= 0;) {
				bw.write("The length of created array = " + arr.length);
				bw.newLine();
				bw.write("The longest line in file1.txt = " + longestLine.length());
				bw.newLine();
				bw.write("Orysia Rusanovska");

			}
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
