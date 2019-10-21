//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cherise Matthew
//Period - 5th period
//October 21 2020

import java.util.Scanner;
//import java.lang.System.*;  
import java.io.File;
import java.io.FileNotFoundException;
public class LineCounterRunner
{
   public static void main( String args[]) throws FileNotFoundException
   {
	   Scanner scan = new Scanner(new File("LineCounter.txt"));
	   
	   for(;scan.hasNextLine();)
	   {
		   String line = scan.nextLine();
		   LineCounter lc = new LineCounter(line);
		   
		   System.out.println(line);
		   System.out.println(lc);
	   }
	}
}