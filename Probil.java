package Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Probil {
	public static void main(String[] args) {
		
		String s = "I am     stading JavaCore";
		char[] n = s.toCharArray();
		String s1 = "";
		for(int i = 0; i <s.length()-1; i++)
        {
            if((n[i] == ' '&& n[i+1] != ' ') || (n[i] != ' '))
                s1 += n[i];
        }
		System.out.println(s1);
		
		
		
	}
}