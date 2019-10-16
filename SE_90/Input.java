import java.util.Scanner;
/**
 * Class Input - a class to accept user's keyboard input.
 * 
 * @author Jialiang Wu
 * @version 09 September 2019
 */
public class Input
{
  /**
   * Constructor for objects of class Input.
   */
  public Input()
  {
      
  }
  
  /**
   * Accept user's String type keyboard input.
   * 
   * @param displayMessage Message to guide user what to input.
   * @return Return user's input.
   */
  public String acceptStringInput(String displayMessage)
  {
      Scanner console = new Scanner(System.in);
      System.out.println(displayMessage);
      String userInput = console.nextLine().trim();
      return userInput;
  }
  
  /**
   * Accept user's integer type keyboard input.
   * 
   * @param displayMessage Message to guide user what to input.
   * @return Return user's input.
   */
  public int acceptIntegerInput(String displayMessage)
  {
      int userInput = 0;
      boolean isInteger = false;
      while(!isInteger)
      {
          try
          {
              Scanner console = new Scanner(System.in);
              System.out.println(displayMessage);
              userInput = console.nextInt();
              isInteger = true;
          }
          catch(Exception exception)
          {
              System.out.println("Invalid input type.");
          }
      }
      return userInput;
  }
}