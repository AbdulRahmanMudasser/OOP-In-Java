package practiceprograms;

import java.util.Scanner;

public class AreaOfTriangleAndSquare 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		double areaSquare , areaTriangle , sideSquare , baseTriangle , heightTriangle ;
		char choice ;
		
		System.out.println( "1.	S for Area of Square" );
		System.out.println( "2.	T for Area of Triangle" );
		
		System.out.println();
		
		System.out.print( "Enter Your Choice : " );
		choice = scanner.next().charAt(0);
		
		System.out.println();
		
		if ( choice == 'S' || choice == 's' )
		{
			System.out.println( "---Area of Square---" );
			
			System.out.println();
			
			System.out.print( "Ente Side of Square : " );
			sideSquare = scanner.nextDouble();
			
			areaSquare = sideSquare * sideSquare ;
			
			System.out.println( "Area of Square : " + areaSquare );
		}
		
		else if ( choice == 'T' || choice == 't' )
		{
			System.out.println( "---Area of Triangle---" );
			
			System.out.println();
			
			System.out.print( "Enter Height of Trianlge : " );
			heightTriangle = scanner.nextDouble();
			
			System.out.print( "Enter Base of Trianlge : " );
			baseTriangle = scanner.nextDouble();
			
			areaTriangle = ( heightTriangle * baseTriangle ) * 0.5 ;
			
			System.out.println( "Area of Triangle : " + areaTriangle );
		}
		
		else
		{
			System.out.println( "Invalid Choice" );
		}
		
		scanner.close();
		
	}
}
