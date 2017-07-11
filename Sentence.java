package Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
	public static void main(String[] args) {
		String s = "I like to be happy";
		System.out.println(s);
		int length = 0;
		String theLongestWord = "";
		Scanner scan = new Scanner(s);
		    while(scan.hasNext()){

		        String temp = scan.next();
		        int tempLength = temp.length();

		        if(tempLength > length){
		            length = tempLength;
		            theLongestWord = temp;
		        }
		    }
		   		    System.out.println("The longest word of sentence is -- " + theLongestWord);
		   		 int lengthWord = theLongestWord.length();
		   		 System.out.println("The number of its letters is: " + lengthWord);
		   		Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
		   		Matcher matcher = pattern.matcher(s);
		   		if (matcher.find()) {
		   			String secondWord = matcher.group(1);
		   					   			System.out.println(secondWord);
		   		String reverse = new StringBuffer(secondWord).reverse().toString();
		   		System.out.println("If we reversed second word, we would get --  " + reverse);
		   		s = s.replace("like", reverse);
		   		System.out.println("Finally, if we input our reverse second word in basic sentence we'll get the next sentence: " + s);
		   		}	
		   		
	}

	
	
		
		
		
	}


