import java.io.*;
import java.util.*;

public class Lab41
{
	static final int INITIAL_CAPACITY = 10;
	public static void main(String[] args) throws Exception
	{
		if (args.length<1)
		{
			System.out.println("\nusage: C:\\> java Lab41 jumbles.txt\n\n"); // i.e. C:\> java Project2 dictionary.txt
			System.exit(0);
		}

		//ArrayList<String> wordlist = new ArrayList<String>();
		
		String[] wordlist = new String[INITIAL_CAPACITY]; 
		int wordCount = 0;
		BufferedReader infile = new BufferedReader( new FileReader(args[0]) );
		while ( infile.ready() )
		{
			String word = infile.readLine();
			if (wordlist.length <= wordCount + 1)
			{
				wordlist = UpSize(wordlist);
				wordlist[wordCount] = word;
				wordCount ++;
			}
			else
			{
				wordlist[wordCount] = word;
				wordCount ++;
			}
		}
		infile.close();
		wordlist = trimArr(wordlist,wordCount);


		//printList( "aList .size() = " + wordlist.size() + " after .add() ing 10 random ints between 0..99", wordlist  );
		//Collections.sort( wordlist ); 
		//printList( "aList after Collections.sort()", wordlist );

		for (int x=0; x< wordlist.length; x++)
		{
			System.out.println(wordlist[x]);
		}
	}
	public static String[] UpSize(String[] fullArr)
	{
		String[] newArr = new  String[fullArr.length * 2];
		for(int i = 0; i < fullArr.length; i ++)
		{
			newArr[i] = fullArr[i];
		}
		return newArr; 
	}

	public static String[] trimArr(String[] oldArr, int Count)
	{
		String[] newArr = new String[Count];
		for (int i=0; i < Count; i++)
		{
			newArr[i] = oldArr[i];
		}
		return newArr; 
	}

	//static void printList( String caption, ArrayList<String> list )
	//{
	//	System.out.println( caption );
	//	for (String n : list) 
	//		System.out.print( n + " ");
	//	System.out.println();
	//}
	//*
}














