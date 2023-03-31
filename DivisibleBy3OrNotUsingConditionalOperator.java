package practiceprograms;

import java.util.Scanner;

public class DivisibleBy3OrNotUsingConditionalOperator 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		int number ;
		
		System.out.print( "Enter a Number : " );
		number = scanner.nextInt();
		
		System.out.println( number % 3 == 0 ? "Entered Number is Divisible By 3" : "Entered Number is Not Divisible By 3" );
		
		scanner.close();
	}
}
