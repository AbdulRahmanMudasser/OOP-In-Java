package practiceprograms;

import java.util.Scanner;

public class DistanceSpeedAndTime 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		// Declaring Variables
		
		float speed , distance ;
		float time ;
		
		// Taking User Input
		
		System.out.print( "Enter Distance Traveled in miles : " );
		distance = scanner.nextFloat();
		
		System.out.print( "Enter Speed of Vehcile (mph) : " );
		speed = scanner.nextFloat();
		
		// Formula
		
		time = distance / speed ;
		
		// Output
		
		System.out.println( "Time Required to reach the dstination is : " + time + " hours" );
		
		scanner.close();
		
	}
}
