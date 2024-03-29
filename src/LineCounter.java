//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
//import static java.lang.System.*;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
   {
	   setLine(s);
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getCount()
	{
		int count=0;
		Scanner input = new Scanner(line);
		
		while(input.hasNextInt())
		{
			input.nextInt();
			count++;
		}
		return count;
	}

	public String getLine()
	{
		return "count = " + getCount();
	}

	public String toString()
	{
		return getLine();
	}
}