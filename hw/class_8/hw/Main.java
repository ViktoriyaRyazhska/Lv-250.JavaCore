package task8.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 09.07.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence");
        String[] sentence = scanner.nextLine().split("\\s+");

        int longest = 0;
        String longestWord = "";
        for (String s: sentence){
            if(s.length() > longest)
            {
                longestWord = s;
                longest = s.length();
            }
        }

        StringBuilder sb = new StringBuilder(sentence[1]);
        sb.reverse();
        sentence[1] = sb.toString();

        System.out.println(sentence[1]);

        //2
        System.out.println("Enter a sentence that contains the words between more than one space");
        String sentence2 = scanner.nextLine();
        System.out.println(sentence2.replaceAll("\\s+"," "));

        //3
        Pattern p = Pattern.compile("\\$\\[0-9]+\\.\\[0-9]{2}?");
        String currency;

        System.out.println("Enter US currency");

        while(true) {
            currency = scanner.nextLine();
            Matcher m = p.matcher(currency);
            if(m.matches()) {
                System.out.println(currency + " is valid");
            }
            else {
                if(currency.equals(" ")) { break; }
                else { System.out.println(currency + " is invalid"); }
            }
        }
        scanner.close();
    }
}
