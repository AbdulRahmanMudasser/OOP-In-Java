package practiceprograms;

import java.util.Scanner;

public class FirstIsMultipleOfSecond 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		int first_number , second_number ;
		
		System.out.print( "Enter First Number : " );
		first_number = scanner.nextInt();
		
		System.out.print( "Enter Second Number : " );
		second_number = scanner.nextInt();
		
		if ( first_number % second_number == 0 )
		{
			System.out.println( first_number + " is multiple of " + second_number );
		}
		
		else
		{
			System.out.println( "Not a Multiple" );
		}
		
		scanner.close();
		
	}
}
