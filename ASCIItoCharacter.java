package practiceprograms;

import java.util.Scanner;

public class ASCIItoCharacter 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		// Declaring Variables
		
		int num ;
		char ch ;
		
		// Taking User Input
		
		System.out.print( "Enter Character : " );
		ch = scanner.next().charAt(0);
		
		System.out.println();
		
		// Assigning Character to Int Data Type Variable
		
		num = ch ;
		
		// Displaying Output
		
		System.out.println( "The ASCII of the character " + ch + " is : " + num );
		
		scanner.close();
		
	}
}
