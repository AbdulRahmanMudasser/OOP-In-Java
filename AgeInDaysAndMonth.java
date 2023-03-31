package practiceprograms;

import java.util.Scanner;

public class AgeInDaysAndMonth 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		int years , days , month ;
		
		System.out.print( "Enter Age in Years : " );
		years = scanner.nextInt();
		
		month = years * 12 ;
		
		years = years / 12 ;
		
		days = years * 360 ;
		
		years = years / 360 ;
		
		System.out.println();
		
		System.out.println( "Age : " + month + " Months " + days + " Days" );
		
		scanner.close();
		
	}
}
