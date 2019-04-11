/*
	Coin.java THIS IS THE ONLY FILE YOU HAND IN
	THERE IS NO MAIN METHOD IN THIS CLASS!
*/
import java.util.Random;
public class Coin
{
	private Random rand; 
	private final int HEADS = 1;
	private final int TAILS = 0;
	private int setNumHEADS, setNumTAILS;  

	public Coin(int seed)
	{
		rand = new Random(seed);
		setNumHEADS(0);
		setNumTAILS(0);  
	}

	public String flip()
	{
		int coinFlip= rand.nextInt(2); 

		if (coinFlip == HEADS)
		{
			setNumHEADS(getNumHeads() + 1); 
			return "H";
		}

		else
		{
			setNumTAILS(getNumTails() + 1); 
			return "T"; 
		}
	}
	
	public int getNumHeads()
	{
		return setNumHEADS;
	}
	public int getNumTails()
	{
		return setNumTAILS; 
	}
	private void setNumHEADS (int newNumheads)
	{
		setNumHEADS = newNumheads; 

	}
	private void setNumTAILS (int newNumtails)
	{
		setNumTAILS = newNumtails; 
	}
	public void reset()
	{
		setNumHEADS(0);
		setNumTAILS(0);
	}
} // END COIN CLASS