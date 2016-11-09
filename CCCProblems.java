import java.util.Scanner;

/**
 * 
 */

/**
 * @author 067721019
 *
 */
public class CCCProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		// Asking for tine length
		System.out.print("Enter tine length");
		
		//Assigning a variable to length
		int tineLength = sc.nextInt();
		
		//Asking for tine spacing 
		System.out.print("Enter tine spacing");
		
		//Variable for tine spacing
		int tineSpacing = sc.nextInt();
		
		// Asking for handle length
		System.out.print("Enter handle length");
		
		// variable for handle length 
		int handleLength = sc.nextInt();
		
		//System.out.print(tineLength);
		String actualSpace = "" ; 
		//Making the spaces between tines
		for (int currentSpace=0; currentSpace<tineSpacing; currentSpace++)
		{
		actualSpace = actualSpace + " " ;
		}
		
		
		//Making the length of the tines
		for (int i=0; i<tineLength; i++)
		{
		System.out.print("*" + actualSpace + "*" + actualSpace + "*" +  "\n");
		}
		//Making actualSpace a string thing so I can find it's length
		String Str1 = new String (actualSpace);
		
		// Finding the length of the spaces 
		int spaceSpace = Str1.length();
		
		int lineHandle = 3 + (2 * spaceSpace  );
		//initializing the string for baseLine which is that long line at the bottom
		String baseLine = "";
		
		// Making a loop to draw the whole line out	
		for (int currentLine=0; currentLine<lineHandle; currentLine++)
		{
		baseLine = baseLine + "*";
		}
		//Printing the line
		System.out.print(baseLine);
		
		// Making the space of the handle

		
		
		// Printing the handle 
		for (int currentHandle=0; currentHandle<handleLength; currentHandle++)
		{
		System.out.print("\n" + " " + actualSpace + "*" );
		}	
		
	}
}
