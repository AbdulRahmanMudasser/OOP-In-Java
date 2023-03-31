package practiceprograms;

import java.util.Scanner;

public class FinalVelocity 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		float initial_velocity , final_velocity , time , acceleration ;
		
		System.out.print( "Enter Initial Velocity : " );
		initial_velocity = scanner.nextFloat();
		
		System.out.print( "Enter Acceleration : " );
		acceleration = scanner.nextFloat();
		
		System.out.print( "Enter Time : " );
		time = scanner.nextFloat();
		
		final_velocity = initial_velocity + acceleration * time ;
		
		System.out.println();
		
		System.out.println( "Final Velocity : " + final_velocity );
		
		scanner.close();
		
	}
}
