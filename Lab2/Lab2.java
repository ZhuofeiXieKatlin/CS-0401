// Lab2.java

import java.io.*; // BufferedReader
import java.util.*; // Scanner to read from a text file

public class Lab2
{
	public static void main (String args[]) throws Exception // we NEED this 'throws' clause
	{
		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED CMD ARGS
		if (args.length < 3)
		{
			System.out.println("\nusage: C:\\> java Lab2 L2input.txt 1 30\n\n"); 
			// i.e. C:\> java Lab2 L2input.txt 1 30
			System.exit(0);
		}
		String infileName = args[0];
		String lower = args[1];
		String high = args[2];
		int lo = Integer.parseInt(lower);
		int hi = Integer.parseInt(high);
		// grab args[0] and store into a String var named infileName
		
		// grab args[1] and conver to int then store into a var named lo
		
		// grab args[2] and conver to int then store into a var named hi

		// STEP #1: OPEN THE INPUT FILE AND COMPUTE THE MIN AND MAX. NO OUTPUT STATMENTS ALLOWED
		Scanner infile = new Scanner( new File("L2input.txt") );
		int min,max;
		min=max=infile.nextInt(); // WE ASSUME INPUT FILE HAS AT LEAST ONE VALUE
		while ( infile.hasNextInt() )
		{
			int x = infile.nextInt();
			// don't get too many variables in the each time
			if (x<min)
			{
				min = x;
			
			}
			if (x>max)
			{
				max = x;
			}
			// YOUR CODE HERE FIND THE MIN AND MAX VALUES OF THE FILE
			// USING THE LEAST POSSIBLE NUMBER OF COMPARISONS
			// ASSIGN CORRECT VALUES INTO min & max INTHIS LOOP. 
			// MY CODE BELOW WILL FORMAT THEM TO THE SCREEN
			// DO NOT WRITE ANY OUTPUT TO THE SCREEN
		}
		System.out.format("min: %d max: %d\n",min,max); // DO NOT REMOVE OR MODIFY IN ANY WAY


		// STEP #2: DO NOT MODIFY THE REST OF MAIN. USE THIS CODE AS IS 
		// WE ARE TESTING EVERY NUMBER BETWEEN LO AND HI INCLUSIVE FOR
		// BEING PRIME AND/OR BEING PERFECT 
		for ( int i=lo ; i<=hi ; ++i)
		{
			System.out.print( i );
			if ( isPrime(i) ) System.out.print( " prime ");
			if ( isPerfect(i) ) System.out.print( " perfect ");
			System.out.println();
		}
	} // END MAIN
	
	// *************** YOU FILL IN THE METHODS BELOW **********************
	
	// RETURNs true if and only if the number passed in is perfect
	static boolean isPerfect( int n )
	{	
		// the number can equal to the factors of itself 
		// 1+2+3 = 6 
		// 1 + 2 + 4 + 7 + 14 = 28
		// with every number from 1 to (n-1)
		// if that number divides n evenly
		// add it to a runnning total 
		// if the running total = n 
		// n is a perfect numebr
		// do not include n itself

		// however, the largest factor should be half of its number
		// n/2 should be the lst factor		

		int number = 0;
		for (int x = 1; x<= n/2; x++)
		{
			if (n % x == 0)
			{
				number = number + x;
			}
		}
		if (n != number)
		{
			return false;
		}

		return true; // (just to make it compile) YOU CHANGE AS NEEDED
	}
	// RETURNs true if and only if the number passed in is prime
	static boolean isPrime( int n )
	// the number that could only be divided by itself or 1
	// if that divisor divides evenly, than n is not prime ----- returns a false
	     // else return true 
	// if you make it to here ------ returns a true (the number is prime)
	{	
		if (n<2)
		// because 1 is not a prime number
		{
			return false;
		}
		for (int x = 2;2*x<=n; x++)
		{
			if (n%x == 0)
			{
				return false;  // (just to make it compile) YOU CHANGE AS NEEDED
			}
	    }
	    return true;
	} 
} // END Lab2 CLASS