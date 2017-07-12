package com.edu.homework10.task4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Career {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new File("src\\com\\edu\\homework10\\task4\\" + 
				"file1.txt"));
		FileWriter fw = new FileWriter("src\\com\\edu\\homework10\\task4\\file2.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		HashMap <Integer, String> stringMap = new HashMap <Integer, String> ();

		int i = 0;
		int longestString = 0;
		int longestIndex = 0;

		while (sc.hasNextLine()) {
			stringMap.put(i, sc.nextLine());
			if (stringMap.get(i).length() > longestString) {
				longestString = stringMap.get(i).length();
				longestIndex = i;
			}
			i++;
		}

		sc.close();

		bw.write("Number of lines in the file1.txt: " + stringMap.size() + " lines\n");
		bw.write("\nThe longest line in the file1.txt:\n" + 
				stringMap.get(longestIndex));

		Pattern name = Pattern.compile("(\\s+\\b([A-Z])([a-z]+)\\b\\s*){3}");
		Pattern birthdate = Pattern.compile("(\\.\\d+\\.)");
		for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
			Matcher matcherOfName = name.matcher(entry.getValue());
			if (matcherOfName.find()) {
				bw.write("\n\n" + entry.getValue());
			}
			Matcher matcherOfBirthdate = birthdate.matcher(entry.getValue());
			if (matcherOfBirthdate.find()) {
				bw.write("\n" + entry.getValue());
			}
		}

		bw.close();

	}

}
