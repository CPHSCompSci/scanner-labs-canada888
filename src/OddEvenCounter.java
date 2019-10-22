//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
	   setLine("");
   }

   public OddEvenCounter(String s)
   {
	   setLine(s);
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getEvenCount()
	{
		int count=0;
		Scanner input = new Scanner(line);
		
		while(input.hasNextInt())
		{
			if(input.nextInt() % 2 == 0)
			{
				//input.nextInt();
				count++;
			}
			
		}
		return count;
	}

	public int getOddCount()
	{
		int count=0;
		Scanner hello = new Scanner(line);
		
		while(hello.hasNextInt())
		{
			if(hello.nextInt() % 2 == 1)
			{
				//hello.nextInt();
				count++;
			}
		}
		return count;
	}

	public String toString()
	{
		return "Even count = " + getEvenCount() + "\n" + "Odd count = " + getOddCount();
	}
}