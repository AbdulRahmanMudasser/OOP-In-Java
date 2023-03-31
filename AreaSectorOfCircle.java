package practiceprograms;

import java.util.Scanner;

public class AreaSectorOfCircle 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		double area , theta , radii ;
		
		System.out.println( "Enter Lenght of Radii : " );
		radii = scanner.nextDouble();
		
		System.out.println( "Enter Angle in Radian : " );
		theta = scanner.nextDouble();
		
		area = ( radii * radii * theta ) / 2.0 ;
		
		System.out.println();
		
		System.out.println( "Area of Sector of the Circle : " + area );
		
		scanner.close();
		
	}
}
