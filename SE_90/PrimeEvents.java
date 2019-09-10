import java.util.*;
/**
 * Write a description of class PrimeEvents here.
 *
 * @author Yuekai Huang, Jialiang Wu
 * @version 10 SEP, 2019
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

    /**
     * Home page Menu list
     */
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
    
    /**
     * View Hall page Menu list
     */
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

    /**
     * Searching option Menu list
     */
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
    
    /**
     * login page Menu list
     */
    private void loginMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events -- Login+");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to Login As Customer");
        System.out.println("Press 2 to Login As Administrator");
        System.out.println("Press 3 to Login As Owner");
        System.out.println("Press 4 Back to Home Page\r\n");
        System.out.println("Please Enter Your Choice: ");
    }

    /**
     * Owner page Menu list
     */
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
    
    /**
     * Customer page Menu list
     */    
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
    
    /**
     * administrator page Menu list
     */
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
    
    /**
     * option of Search page
     */    
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
    
    /**
     * option of view hall
     */      
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

    /**
     * option of login
     */  
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
    
    public void register()
    {
        Input input = new Input();
        String choice = input.acceptStringInput("To continue, please choose your account type (C/c as customer, O/o as owner), enter B/b to go back to main menu: ");
        choice.toLowerCase();
        Validation validation = new Validation();
        while(!choice.matches("[bco]"))
        {
            while(validation.stringIsBlank(choice))
            {
                choice = input.acceptStringInput("Account type cannot be blank. Please choose your account type (C/c as customer, O/o as owner) or enter B/b to go back to main menu:").toLowerCase();
                if(choice.matches("[bco]"))
                {
                    break;
                }
            }
            choice = input.acceptStringInput("Invalid command. Please re-enter your account type (C/c as customer, O/o as owner) or enter B/b to go back to main menu:").toLowerCase();
        }
        
        if(choice.equals("b"))
        {
            mainMenu();
        }
        
        String firstName = input.acceptStringInput("Please enter your first name (maximum 20 characters):");
        while(!validation.stringLengthWithinRange(firstName, 1, 20))
        {
            while(validation.stringIsBlank(firstName))
            {
                firstName = input.acceptStringInput("Your first name cannot be blank. Please re-enter your first name (maximum 20 characters):");
                if(validation.stringLengthWithinRange(firstName, 1, 20))
                {
                    break;
                }
            }
            firstName = input.acceptStringInput("Your first name is too long. Please re-enter your first name (maximum 20 characters):");
        }
        
        String lastName = input.acceptStringInput("Please enter your last name (maximum 20 characters):");
        while(!validation.stringLengthWithinRange(lastName, 1, 20))
        {
            while(validation.stringIsBlank(lastName))
            {
                lastName = input.acceptStringInput("Your last name cannot be blank. Please re-enter your last name (maximum 20 characters):");
                if(validation.stringLengthWithinRange(lastName, 1, 20))
                {
                    break;
                }
            }
            lastName = input.acceptStringInput("Your last name is too long. Please re-enter your last name (maximum 20 characters):");
        }
        
        String email = input.acceptStringInput("Please enter your email address:");
        while(!validation.stringIsEmailAddr(email))
        {
            while(validation.stringIsBlank(email))
            {
                email = input.acceptStringInput("Email address cannot be blank. Please re-enter your email address:");
                if(validation.stringIsEmailAddr(email))
                {
                    break;
                }
            }
            email = input.acceptStringInput("Invalid email address. Please re-enter your email address:");
        }
        
        String firstPassword = input.acceptStringInput("Please enter your password (8 to 15 characters including at least one upper case letter):");
        while(!validation.stringLengthWithinRange(firstPassword, 8, 15) || !firstPassword.contains("[A-Z]"))
        {
            while(validation.stringIsBlank(firstPassword))
            {
                firstPassword = input.acceptStringInput("Password cannot be blank. Please re-enter your password (8 to 15 characters including at least one upper case letter):");
                if(validation.stringLengthWithinRange(firstPassword, 8, 15) && firstPassword.contains("[A-Z]"))
                {
                    break;
                }
            }
            firstPassword = input.acceptStringInput("Illegal password. Please re-enter your password (8 to 15 characters including at least one upper case letter):");
        }
        
        String secondPassword = input.acceptStringInput("Please confirm your password:");
        while(!secondPassword.equals(firstPassword))
        {
            secondPassword = input.acceptStringInput("Inconsistent password input. Please reconfirm your password:");
        }
        
        String firstSq = input.acceptStringInput("Please enter your first security question for account retrieval (maximum 50 charaters):");
        while(!validation.stringLengthWithinRange(firstSq, 1, 50))
        {
            while(validation.stringIsBlank(firstSq))
            {
                firstSq = input.acceptStringInput("Security question cannot be blank. Please re-enter your first security question (maximum 50 characters):");
                if(validation.stringLengthWithinRange(firstSq, 1, 50))
                {
                    break;
                }
            }
            firstSq = input.acceptStringInput("Your security question is too long. Please re-enter your first security question (maximum 50 characters):");
        }
        
        String secondSq = input.acceptStringInput("Please enter your second security question for account retrieval (maximum 50 charaters):");
        while(!validation.stringLengthWithinRange(secondSq, 1, 50))
        {
            while(validation.stringIsBlank(secondSq))
            {
                secondSq = input.acceptStringInput("Security question cannot be blank. Please re-enter your second security question (maximum 50 characters):");
                if(validation.stringLengthWithinRange(secondSq, 1, 50))
                {
                    break;
                }
            }
            secondSq = input.acceptStringInput("Your security question is too long. Please re-enter your second security question (maximum 50 characters):");
        }
        
        String phone = "";
        String address = "";
        if(choice.equals("c"))
        {
            boolean isConcession = false;
            String response = input.acceptStringInput("Are you a Veteran/Concession? (Y/N)").toUpperCase();
            while(!response.matches("[NY]"))
            {
                response = input.acceptStringInput("Invalid response. Are you a Veteran/Concession? (Y/N)").toUpperCase();
            }
            if(response.equals("Y"))
            {
                isConcession = true;
            }
            
            phone = input.acceptStringInput("Please enter your phone number (press enter to skip):");
            address = input.acceptStringInput("Please enter your address (maximum 50 characters, press enter to skip):");
            System.out.println("Your account has been created successfully. Thank you for using Prime Event.");
            customer();
        }
        else
        {
            phone = input.acceptStringInput("Please enter your phone number:");
            address = input.acceptStringInput("Please enter your address (maximum 50 characters):");
            System.out.println("Your account has been created successfully. Thank you for using Prime Event.");
            owner();
        }
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

    /**
     * option of home page
     */      
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
