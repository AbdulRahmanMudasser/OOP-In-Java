package practiceprograms;

import java.util.Scanner;

public class CapitalSmallDigitSpecial 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		char ch ;
		
		System.out.println( "Enter a Character : " );
		ch = scanner.next().charAt(0);
		
		System.out.println();
		
		if ( ch >= 65 && ch <= 90 )
		{
			System.out.println( "Entered Character is a Capital Letter" );
		}
		
		else if ( ch >= 97 && ch <= 122 )
		{
			System.out.println( "Entered Character is a Small Letter" );
		}
		
		else if ( ch >= 0 && ch <= 9 )
		{
			System.out.println( "Entered Character is a Digit" );
		}
		
		else
		{
			System.out.println( "Enter Character is Special Symbol" );
		}
		
		scanner.close();
		
	}
}