import java.util.Scanner;
//import java.lang.System.*;  
import java.io.File;
import java.io.FileNotFoundException;
public class OddEvenCounterRunner
{
   public static void main( String args[]) throws FileNotFoundException
   {
	   Scanner scan = new Scanner(new File("OELine.txt"));
	   
	   for(;scan.hasNextLine();)
	   {
		   String line = scan.nextLine();
		   OddEvenCounter lc = new OddEvenCounter(line);
		   
		   System.out.println(line);
		   System.out.println(lc.toString());
	   }
	}
}