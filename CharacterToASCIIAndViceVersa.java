package practiceprograms;

import java.util.Scanner;

public class CharacterToASCIIAndViceVersa 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		int choice ;
		char ch ;
		int number ;
		
		System.out.println( "----------Menu----------" );
		
		System.out.println();
		
		System.out.println( "1.	Convert ASCII to Character" );
		System.out.println( "2.	Convert Character to ASCII" );
		
		System.out.println();
		
		System.out.print( "Enter Your Choice : " );
		choice = scanner.nextInt();
		
		switch ( choice )
		{
		case 1 :
			System.out.print( "Enter a Number : " );
			number = scanner.nextInt();
			
			System.out.println();
			
			ch = (char) number ;
			
			System.out.println( "The Character is : " + ch );
			
			break ;
			
		case 2 :
			System.out.print( "Enter a Character : " );
			ch = scanner.next().charAt(0);
			
			System.out.println();
			
			number = ch ;
			
			System.out.println( "The ASCII Value is : " + number );
			
			break ;
			
		default :
			System.out.println( "Invalid Choice" );
		}
		
		scanner.close();
		
	}
}
