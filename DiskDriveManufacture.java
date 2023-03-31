package practiceprograms;

import java.util.Scanner;

public class DiskDriveManufacture 
{
	public static void main ( String [] args )
	{
		Scanner scanner = new Scanner ( System.in );
		
		int code ;
		
		System.out.print( "Enter Code from 1 - 5 : " );
		code = scanner.nextInt();
		
		System.out.println();
		
		switch ( code )
		{
		case 1 :
			System.out.println( "Disk Drive Manufactue Western Digital" );
			break ;
			
		case 2 :
			System.out.println( "Disk Drive Manufacture 3M Corporation" );
			break ;
			
		case 3 :
			System.out.println( "Disk Drive Manufacture Maxell Corporation" );
			break ;
			
		case 4 :
			System.out.println( "Disk Drive Manufacture Sony Corporation" );
			break ;
			
		case 5 :
			System.out.println( "Disk Drive Manufacture Verbatim Corporation" );
			break ;
			
		default :
			System.out.println( "Invalid Choice" );
			break ;
		}
		
		scanner.close();
		
	}
}
