package com.edu.classwork10.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyText {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src\\com\\edu\\classwork10\\task3\\"
				+ "mytext.txt"));
		HashMap <Integer, String> stringMap = new HashMap <Integer, String>();
		
		int i = 0;
		while (sc.hasNextLine()){
			stringMap.put(i, sc.nextLine());
			i++;
		}
		
		sc.close();
		
		int longestString = 0;
		int longestIndex = 0;
		int shortestString = 0;
		int shortestIndex = 0;
	    
		for (Map.Entry <Integer, String> entry : stringMap.entrySet()) {
			System.out.println("Line " + (entry.getKey() + 1) + ". Symbols: " +
					entry.getValue().length());
			
			if(entry.getValue().length() > longestString) {
				longestString = entry.getValue().length();
				longestIndex = entry.getKey();
	    	}
			if(entry.getValue().length() <= shortestString) {
				shortestString = entry.getValue().length();
				shortestIndex = entry.getKey();
	    	}
		}
	    
	    System.out.println("\nThe longest line: line " + (longestIndex + 1) + 
	    		"\nThe shortest line: line " + (shortestIndex + 1) + "\n");
	    
	    Pattern p = Pattern.compile("\\s*\\,*\\.*\\bvar\\b\\s*\\,*\\.*");
	    for (Map.Entry <Integer, String> entry : stringMap.entrySet()) {
	    	Matcher m = p.matcher(entry.getValue());
			if (m.find()) {
				System.out.println(entry.getValue());
			}
		}


	}
}
