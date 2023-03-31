package practiceprograms;

import java.util.Scanner;

public class AreaOfTriangle 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		float area_triangle , height_triangle , base_triangle ;
		
		System.out.print( "Enter Height of Triangle : " );
		height_triangle = scanner.nextFloat();
		
		System.out.print( "Enter Base of Triangle : " );
		base_triangle = scanner.nextFloat();
		
		System.out.println();
		
		area_triangle = ( height_triangle * base_triangle )* 1 / 2 ;
		
		System.out.println( "Area of Trianlge is : " + area_triangle );
		
		scanner.close();
		
	}
}
