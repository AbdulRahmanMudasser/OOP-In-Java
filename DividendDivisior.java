package practiceprograms;

import java.util.Scanner;

public class DividendDivisior 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		int dividend , divisior , quotient , remainder ;
		
		System.out.print( "Enter Dividend : " );
		dividend = scanner.nextInt();
		
		System.out.print( "Enter Divisior : " );
		divisior = scanner.nextInt();
		
		System.out.println();
		
		quotient = dividend / divisior ;
		remainder = dividend % divisior ;
		
		System.out.println( "Quotient : " + quotient );
		System.out.println( "Remainder : " + remainder );
		
		scanner.close();
		
	}
}
