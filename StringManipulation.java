import java.text.DecimalFormat;
import java.util.Scanner;

/** 
 * Name: Lindsey Reynolds
 * Assignment: Module 1 String Manipulation
 * Date: 10/23/19
 * Description: Reads in the user's first and last name and the number of hours
 * that they work on this class per week. It then prints the user's full name, 
 * prints the number of characters in their full name string and prints the 
 * number of hours they worked in the class, rounded to one decimal place.
 */

public class StringManipulation
{
   // Final variables for the minimum and maximum hours of work for the class
   public static final int MIN_HOURS = 12;
   public static final int MAX_HOURS = 20;
   
   public static void main(String[] args) 
   {
      // Creates a scanner object to read in user input from the keyboard
      Scanner keyboard = new Scanner(System.in);
      
      // Asks the user to input their first and last names
      System.out.println("Please enter your first and last name.");
      System.out.println("Be sure to capitalize them.");
      String firstName = keyboard.next();
      String lastName = keyboard.next();
      
      // Adding new text to this file
      
      // Creates a new variable to store the user's full name
      String fullName = firstName + " " + lastName;

      // Print out the user's full name in various ways
      System.out.println("\nYour full name is: " + fullName);
      System.out.println("This string is " + fullName.length() + 
         " characters long.");
      System.out.println("UPPER CASE: " + fullName.toUpperCase());
      System.out.println("lower case: " + fullName.toLowerCase() + "\n");
   
      // Print out how long the user should be studying per week and then 
      // ask how much time they spend studying, including 3 decimal places
      System.out.printf("You should be spending %d to %d hours per week on "
         + "this class. %n", MIN_HOURS, MAX_HOURS);
      System.out.println("How many hours did you spend this week?");
      System.out.println("Please include three decimal places.");
      
      // Retrieve user's response in the form of a double
      double hours = keyboard.nextDouble();

      // Create a DemcimalFormat pattern to round numbers to one decimal place
      DecimalFormat pattern0dot0 = new DecimalFormat("0.0");

      // Print the users response, using the pattern to round the user's 
      // response to one decimal place 
      System.out.println("\nRounded to one decimal place, your answer is: " + 
         pattern0dot0.format(hours));
   }
}



/********************************OUTPUT************************************

OUTPUT 1

Please enter your first and last name.
Be sure to capitalize them.
Lindsey Reynolds

Your full name is: Lindsey Reynolds
This string is 16 characters long.
UPPER CASE: LINDSEY REYNOLDS
lower case: lindsey reynolds

You should be spending 12 to 20 hours per week on this class.
How many hours did you spend this week?
Please include three decimal places.
12.387

Rounded to one decimal place, your answer is: 12.4

OUTPUT 2

Please enter your first and last name.
Be sure to capitalize them.
Imma Student

Your full name is: Imma Student
This string is 12 characters long.
UPPER CASE: IMMA STUDENT
lower case: imma student

You should be spending 12 to 20 hours per week on this class.
How many hours did you spend this week?
Please include three decimal places.
2.932

Rounded to one decimal place, your answer is: 2.9

 ***************************************************************************/

