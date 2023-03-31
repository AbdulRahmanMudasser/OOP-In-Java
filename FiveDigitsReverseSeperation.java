package practiceprograms;

import java.util.Scanner;

public class FiveDigitsReverseSeperation 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		int num , digit1 , digit2 , digit3 , digit4 , digit5 ;
		
		System.out.print( "Enter a Five Digit Number : " );
		num = scanner.nextInt();
		
		System.out.println();
		
		// Formula
		
		digit1 = num % 10 ;
		
		num = num / 10 ;
		
		digit2 = num % 10 ;
		
		num = num / 10 ;
		
		digit3 = num % 10 ;
		
		num = num / 10 ;
		
		digit4 = num % 10 ;
		
		num = num / 10 ;
		
		digit5 = num % 10 ;
		
		System.out.println( "In Reverse Order : " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5 );
		
		scanner.close();
		
	}
}
