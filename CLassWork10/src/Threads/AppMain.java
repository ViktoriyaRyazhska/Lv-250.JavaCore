package Threads;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppMain {

	public static void main(String[] args) {
		String fileName = "mytext.txt";
		FileReader fr = null;
		BufferedReader br = null;
		List<String> words = new ArrayList<String>();

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s = null;
			int count = 1;
			System.out.println("Read data from file: " + fileName);
			while ((s = br.readLine()) != null) {
				words.add(s);
				System.out.println("row " + count++ + " read: " + s);
			}
			
			System.out.println("---count and write the number of symbols in every line-----");
			
			for (String st : words) {
				System.out.println("Symbols = " + st.length());
			}
			
			System.out.println("---find the longest and the shortest line------longest-----");
			int max =0;
			for (String st : words) {
				if (st.length() > max) {
					max = st.length();
				}				
			}				
			System.out.println("Max symbols = " + max);
			
			
			System.out.println("--------------------------------shortest line-------------");
			
			int min = max;
			for (String st : words) {
				if (st.length() < min) {
					min = st.length();
				}				
			}				
			System.out.println("Min symbols = " + min);
			
			System.out.println("------find and write only that lines, which consist of word «var»-------");
			
			Pattern p = Pattern.compile("var");			
			for (String st : words) {
				Matcher m  = p.matcher(st);
				while (m.find()) {
					System.out.println(m.start() + " " + m.group() + "\n" + st);
				}
			}			
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
