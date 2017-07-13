import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file1 = "file1.txt";
		String file2 = "file2.txt";
		List<String> lines = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(file1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(file2);
			BufferedWriter bw = new BufferedWriter(fw);

			String s = null;

			System.out.println("Read data from file: " + file1);
			int count = 1;
			while ((s = br.readLine()) != null) {
				lines.add(s);
				bw.write("Row " + count++ + " symbols = " + s.length() + "\n");
			}

			int max = 0;
			for (String st : lines) {
				if (st.length() > max) {
					max = st.length();
				}
			}

			bw.write("Max symbols in the line " + max);

			Pattern bdate = Pattern.compile("\\d\\d-\\d\\d");
			Pattern name = Pattern.compile("([A-Z][a-z]+\\s?){3}");

			for (String st : lines) {
				Matcher mName = name.matcher(st);
				if (mName.find()) {
					bw.write("\n\n" + st);
				}
				Matcher mBDAy = bdate.matcher(st);
				if (mBDAy.find()) {
					bw.write("\n" + st);
				}

			}

			System.out.println("Write data to file: " + file2);
			bw.close();
			br.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	
	}

}
