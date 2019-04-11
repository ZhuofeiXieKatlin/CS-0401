public class Fraction implements Comparable<Fraction>
// < > can compare myself with the Fractions 
{
	private int numer;
	private int denom;

	// ACCESSORS (SETTERS)
	public int getNumer()
	{	return numer;
	}
	public int getDenom()
	{	return denom;
	}
	// MUTATORS (GETTERS)
	public void setNumer( int n )
	{	numer = n;
	}
	public void setDenom( int d )
	{
		if (d==0) { System.out.println("Can't have 0 in denom"); System.exit(0); }
		else denom=d;
	}
	
	// FULL CONSTRUCTOR - an arg for each class data member
	public Fraction( int n, int d )
	{	int gcd = gcd( n, d );
		setNumer(n/gcd);
		setDenom(d/gcd);
	}

	private int gcd( int n, int d )
	{	int gcd = n<d ? n : d; // same as::  
		//if (n<d) 
		//    gcd=n;
		//else 
		//    gcd=d;
		while( gcd > 0 ) // NOT EFFICIENT AS EUCLID BUT SIMPLE
			if (n%gcd==0 && d%gcd==0) return gcd; else --gcd;
		return 1; // they were co-prime no GCD exceopt 1 :(
	}
	// COPY CONSTRUCTOR - takes ref to some already initialized Comparable<Fraction> object
	public Fraction( Fraction other )
	{
		this( other.getNumer(), other.getDenom() ); // call my full C'Tor with other Fraction's data
	}

	// REQUIRED BY THE COMPARABLE INTERFACE 
	// if this == other return 0; if this>other return 1; else return -1

	private Fraction subtract(Fraction other)
	{
		return new Fraction (this.getNumer() * other.getDenom() - other.getNumer() * this.getDenom(), this.getDenom() * other.getDenom()); 
	}
	public int compareTo( Fraction other )
	{
		// we cannot change the fractions to the doules directly, because when we have infinite fractions, it's not working 
		//int n = 0; 
		Fraction diff = new Fraction(this.subtract(other)); 


		// changing the denominator of both fractions same, then compare their numerators

		if (diff.getNumer() * diff.getDenom() < 0)
		    return -1; 

		else if (diff.getNumer() * diff.getDenom() > 0)
		    return 1;

		else
		    return 0; 
	}

	public String toString()  // "22/7        3.14....."
	{
	    return getNumer() +  "/" + getDenom() + "\t=" +  + ((double)getNumer()/(double)getDenom()); 
	                                                       // It's only make a copy of the value, but the value itself doesn't change
	}
}// EOF
