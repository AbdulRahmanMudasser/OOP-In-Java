package practiceprograms;

import java.util.Scanner;

public class AllConversions 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		int choice ;
		double value ;
		
		System.out.println( "--------Conversion Menu--------" );
		
		System.out.println();
		
		System.out.println( "1.	Inches to Centimeters" );
		System.out.println( "2.	Centimeters to Inches" );
		System.out.println( "3.	Gallon to Liters" );
		System.out.println( "4.	Liters to Gallon" );
		System.out.println( "5.	Mile to Kilometers" );
		System.out.println( "6.	Kilometers to Miles" );
		System.out.println( "7.	Pound to Kilograms" );
		System.out.println( "8.	Kilogram to Pounds" );
		
		System.out.println();
		
		System.out.print( "Enter Your Choice : " );
		choice = scanner.nextInt();
		
		System.out.println();
		
		System.out.print( "Enter Value : " );
		value = scanner.nextDouble();
		
		System.out.println();
		
		switch ( choice )
		{
		case 1 :
			
			System.out.println( "Inches To Centimeters" );
			
			System.out.println();
			
			System.out.println( "In Centimeters : " + ( value * 2.54 ) + " centimeters" );
			
			break ;
			
		case 2 :
			
			System.out.println( "Centimeters to Inches" );
			
			System.out.println();
			
			System.out.println( "In Inches : " + ( value / 2.54 ) + " inches" );
			
			break ;
			
		case 3 :
			
			System.out.println( "Gallons To Liters" );
			
			System.out.println();
			
			System.out.println( "In Litres : " + ( value * 3.785 ) + " liters" );
			
			break ;
			
		case 4 :
			
			System.out.println( "Litres To Gallons" );
			
			System.out.println();
			
			System.out.println( "In Gallons : " + ( value / 3.785 ) + " gallons" );
			
			break ;
			
		case 5 :
			
			System.out.println( "Miles To Kilometers" );
			
			System.out.println();
			
			System.out.println( "In Kilometers : " + ( value * 1.609 ) + " kilometers" );
			
			break ;
			
		case 6 :
			
			System.out.println( "Kilometers To Miles" );
			
			System.out.println();
			
			System.out.println( "In Miles : " + ( value / 1.609 ) + " miles" );
			
			break ;
			
		case 7 :
			
			System.out.println( "Pounds To Kilograms" );
			
			System.out.println();
			
			System.out.println( "In Kilograms : " + ( value * 0.4536 ) + " kilograms" );
			
			break ;
			
		case 8 :
			
			System.out.println( "Kilograms To Pounds" );
			
			System.out.println();
			
			System.out.println( "In Pounds : " + ( value / 0.4536 ) + " pounds" );
			
			break ;
			
		default :
			
			System.out.println( "Invalid Choice" );
		}
		
		scanner.close();
		
	}
}
