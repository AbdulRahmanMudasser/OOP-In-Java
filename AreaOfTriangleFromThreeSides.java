package practiceprograms;

import java.util.Scanner;

public class AreaOfTriangleFromThreeSides 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		double side1 , side2 , side3 , s , area ;
		
		System.out.print( "Enter Side 1 of Triangle : " );
		side1 = scanner.nextDouble();
		
		System.out.print( "Enter Side 2 of Triangle : " );
		side2 = scanner.nextDouble();
		
		System.out.print( "Enter Side 3 of Triangle : " );
		side3 = scanner.nextDouble();
		
		System.out.println();
		
		s = ( side1 + side2 + side3 ) / 2.0 ;
		area = Math.sqrt( s * ( s - side1 ) * ( s - side2 ) * ( s - side3 ) ) ;
		
		System.out.println( "Area of Triangle : " + area );
		
		scanner.close();
		
	}
}
