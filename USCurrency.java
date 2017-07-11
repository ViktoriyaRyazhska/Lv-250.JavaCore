package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.event.DocumentListener;

public class USCurrency {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		double grn = 1;
		double eur = 1;
		double dollarERGrn = 0.04;
		double dollarEREur = 1.11;
		
		final double valueGrn = dollarERGrn*grn;
		final double valueEur = dollarEREur*eur;
		
	    	String format = "$%.2f";
	    	System.out.println("Hello, please enter quantity of grn which you wont to exchange to Dollar");
			grn = Integer.parseInt(br.readLine());
			System.out.println("Hello, please enter quantity of eur which you wont to exchange to Dollar");
			eur = Integer.parseInt(br.readLine());
			System.out.printf("If you exchange " + grn + " grn, you'll have the next quantity of Dollars USA: " + format, valueGrn);
			System.out.println();
			System.out.printf("If you exchange " + eur + " eur, you'll have the next quantity of Dollars USA: " + format, valueEur);
			
	    }
		
	}


