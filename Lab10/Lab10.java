import java.io.*;
import java.util.*;

public class Lab10
{
	public static void main(String[] args) throws Exception
	{
		HashSet<String> dictionary = new HashSet<String>(); 
		Scanner infile = new Scanner(new File(args[0])); 		

		while (infile.hasNext())
		{
			if(!dictionary.add(infile.next()))
			{
				System.out.println("NOT UNIQUE"); 
				System.exit(0); 
			}
		}
		System.out.println("UNIQUE"); 		
	}
}