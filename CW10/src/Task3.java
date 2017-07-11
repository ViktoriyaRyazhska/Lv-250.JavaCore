import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		String fileName = "mytext.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
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
			if (lines.contains("Rav"))
				System.out.println(lines);

			String[] arr = lines.toArray(new String[0]);
			System.out.println("The length of created array = " + arr.length);
			br.close();
			String shortestLine = arr[0];
			for (int i = 1; i < arr.length; i++) {
				System.out.println(Integer.toString(arr[i].length()));
				if (shortestLine.length() > arr[i].length()) {
					shortestLine = arr[i];
				}
			}
			String longestLine = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (longestLine.length() < arr[i].length()) {
					longestLine = arr[i];
				}
			}
			System.out.println("The length of the longest line = " + longestLine.length());
			System.out.println("The length of the shortest line = " + shortestLine.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
