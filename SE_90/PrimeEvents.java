import java.util.*;
/**
 * Write a description of class PrimeEvents here.
 *
 * @author Yuekai Huang
 * @version 08 SEP, 2019
 */
public class PrimeEvents
{
    // instance variables - replace the example below with your own
    private Customer customer;
    private Administrator administrator;
    private Owner owner;
    
    private int viewOption;
    private int searchOption;
    private int mainOption;
    private int loginOption;
    
    /**
     * Constructor for objects of class PrimeEvents
     */
    public PrimeEvents()
    {
        // initialise instance variables
        customer = new Customer();
        administrator = new Administrator();
        owner = new Owner();
    }

    private void mainMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to View hall");
        System.out.println("Press 2 to Login");
        System.out.println("Press 3 to Register");
        System.out.println("Press 4 Exit\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    private void viewMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events -- View Halls+");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to List Hall");
        System.out.println("Press 2 to Search Hall");
        System.out.println("Press 3 Back to Home Page\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    private void searchMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events -- Search Halls+");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to Search By Name");
        System.out.println("Press 2 to Filter By Event Types");
        System.out.println("Press 3 to Filter By Date");
        System.out.println("Press 4 Back to Home Page\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    private void loginMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events -- Search Halls+");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to Login As Customer");
        System.out.println("Press 2 to Login As Administrator");
        System.out.println("Press 3 to Login As Owner");
        System.out.println("Press 4 Back to Home Page\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    private void ownerMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to View hall");
        System.out.println("Press 2 to Login");
        System.out.println("Press 3 to Register");
        System.out.println("Press 4 to ");
        System.out.println("Press 5 ");
        System.out.println("Press 6 ");
        System.out.println("Press 7 Exit\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    private void customerMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to ");
        System.out.println("Press 2 to ");
        System.out.println("Press 3 to ");
        System.out.println("Press 4 to ");
        System.out.println("Press 5 ");
        System.out.println("Press 6 ");
        System.out.println("Press 7 Exit\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    private void administratorMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to View hall");
        System.out.println("Press 2 to Login");
        System.out.println("Press 3 to Register");
        System.out.println("Press 4 to ");
        System.out.println("Press 5 ");
        System.out.println("Press 6 ");
        System.out.println("Press 7 Exit\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    private void searchHall()
    {
        Scanner input = new Scanner(System.in);
        while(searchOption != 4)
        {
            searchMenu();
            searchOption = input.nextInt();
                switch(searchOption)
                {
                    case 1: 
                            break;
                    case 2: 
                            break;
                    case 3: 
                            break;
                    case 4: viewOption = 3;
                            break;
                            default: System.out.println("You can only choose a number between 1 and 4!");
                }
        }
    }
    
    private void viewHall()
    {
        Scanner input = new Scanner(System.in);
        while(viewOption != 3)
        {
            viewMenu();
            viewOption = input.nextInt();
                switch(viewOption)
                {
                    case 1: 
                            break;
                    case 2: searchHall();
                            break;
                    case 3: 
                            break;
                            default: System.out.println("You can only choose a number between 1 and 3!");
                }
        }
    }
    
    private void login()
    {
        Scanner input = new Scanner(System.in);
        while(loginOption != 4)
        {
            loginMenu();
            searchOption = input.nextInt();
                switch(loginOption)
                {
                    case 1: customer();
                            break;
                    case 2: administrator();
                            break;
                    case 3: owner();
                            break;
                    case 4: break;
                            default: System.out.println("You can only choose a number between 1 and 4!");
                }
        }
    }
    
    private void register()
    {
        
    }
    
    private void customer()
    {
        
    }
   
    private void administrator()
    {
        
    }
      
    private void owner()
    {
        
    }
        
    public void start()
    {
        Scanner input = new Scanner(System.in);
        while(mainOption != 4)
        {
            viewOption = 0;
            searchOption = 0;
            loginOption = 0;
            
            mainMenu();
            mainOption = input.nextInt();
                switch(mainOption)
                {
                    case 1: viewHall();
                            break;
                    case 2: login();
                            break;
                    case 3: register();
                            break;
                    case 4: System.out.println("Thank you for using"); break;
                            default: System.out.println("You can only choose a number between 1 and 4!");
                }
        }
    }
}
