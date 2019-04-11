import java.io.*;
import java.util.*;

public class FractionTester
{
	public static void main( String args[] ) throws Exception
	{
		Random generator = new Random( 17 );

		// POPULATE AN ARRAYLIST OF FRACTIONS WITH RANDOM VALUES

		ArrayList<Fraction> AList = new ArrayList<Fraction>();
		// we create an array list which is built by a series of random numbers 
		// when we create an arry list, we also create this array list to the object
		for (int i=5 ; i>=0 ; --i )
			AList.add(  new Fraction(1+generator.nextInt(100), 1+generator.nextInt(100)) ); // numer and denom in [1..99]
		    // we add the data from the random numbers to our Array list.   //  100 represents the range of the random numbers that we want 
		    // we add 6 elements into the array list 

		// MAKE DEEP COPY OF THOSE FRACTIONS IN THE ARAYLIST ABOVE,  BUT STORE INTO PLAIN ARRAY OF FRACTION

		Fraction[] plainArr = new Fraction[ AList.size() ];
		// addigning the size of the array 
		                   // making it big enough to hold all strings 
		for ( int i = 0 ; i < plainArr.length ; ++i )
			plainArr[i] = new Fraction( AList.get(i) );
		                  // full of references fractions 
		                  // new mains we can get a new one
		                  // copy the information address and then store it to the plainArr 
		    // copy the value of the array list to the plainarr

		// PRINT BOTH CONTAINERS TO VERIFY THEY MATCH

		System.out.println("\nArrayList OF FRACTIONS UNSORTED:");
		for ( Fraction f : AList )
			System.out.println( f );
		// print out all references in the plainArr

		System.out.println("\nplainArr OF FRACTIONS UNSORTED:");
		for ( Fraction f : plainArr )
			System.out.println( f );

		// SORT BOTH CONTAINERS USING APPROPRIATE LIBRARY

		Collections.sort( AList );
		Arrays.sort( plainArr );

		//RE-PRINT BOTH AND THEY SHOULD BE IDENTICAL AND IN SORTED ORDER

		System.out.println("\nArrayList OF FRACTIONS SORTED:");
		for ( Fraction f : AList )
			System.out.println( f );

		System.out.println("\nplainArr OF FRACTIONS SORTED:");
		for ( Fraction f : plainArr )
			System.out.println( f );
	}// END MAIN
} // END