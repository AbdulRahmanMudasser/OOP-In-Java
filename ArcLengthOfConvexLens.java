package practiceprograms;

import java.util.Scanner;

public class ArcLengthOfConvexLens 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		double arc_radius , arc_angle , arc_length ;
		
		System.out.print( "Enter Radius of Arc : " );
		arc_radius = scanner.nextDouble();
		
		System.out.print( "Enter Angle made by Arc : " );
		arc_angle = scanner.nextDouble();
		
		arc_length = arc_radius * arc_angle ;
		
		System.out.println();
		
		System.out.println( "Arc Length : " + arc_length );
		
		scanner.close();
		
	}
}
