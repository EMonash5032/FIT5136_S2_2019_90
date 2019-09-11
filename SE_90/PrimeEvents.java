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
    private ListOfCustomers customers;
    private Administrator administrator;
    private ListOfAdmins admin;
    private Owner owner;
    private ListOfOwners owners;
    
    private int viewOption;
    private int searchOption;
    private int mainOption;
    private int loginOption;
    private int ownerOption;
    private int manageHallOption;
    
    /**
     * Constructor for objects of class PrimeEvents
     */
    public PrimeEvents()
    {
        // initialise instance variables
        customer = new Customer();
        customers = new ListOfCustomers();
        administrator = new Administrator();
        admin = new ListOfAdmins();
        owner = new Owner();
        owners = new ListOfOwners();
    }

    private int getOwnerIndex()
    {
        int index = 0;
        while(index < owners.getAllOwner().length)
        {
            if(owners.getOwner(index).getPassword().equals("????"))
                return index;
            index++;
        }
        return -1;
    }
    
    public int getCheckOwner(String email)
    {

        for(int index = 0 ; index < owners.getAllOwner().length; index++)
        {
            if(owners.getOwner(index).getEmail().equals(email))
                return index;
        }
        return -1;
    }
    
    private int getCustIndex()
    {
        int index = 0;
        while(index < customers.getAllCus().length)
        {
            if(customers.getCustomer(index).getPassword().equals("????"))
                return index;
            index++;
        }
        return -1;
    }
    
    public int getCheckCust(String email)
    {

        for(int index = 0 ; index < customers.getAllCus().length; index++)
        {
            if(customers.getCustomer(index).getEmail().equals(email))
                return index;
        }
        return -1;
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
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events -- Owner Page +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to Manage hall");
        System.out.println("Press 2 to Manage Booking");
        System.out.println("Press 3 to Manage discounts");
        System.out.println("Press 4 to View Halls Booking History");
        System.out.println("Press 5 to Manage Receipt");
        System.out.println("Press 6 to View Feedback");
        System.out.println("Press 7 Back to Home Page and Logout\r\n");
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
            loginOption = input.nextInt();
            resetPage();
                switch(loginOption)
                {
                    case 1: customerLogin();
                            break;
                    case 2: administratorLogin();
                            break;
                    case 3: ownerLogin();
                            break;
                    case 4: break;
                            default: System.out.println("You can only choose a number between 1 and 4!");
                }
        }
    }
    
    public void ownerLogin()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter Owner user name: ");
        String userName = input.nextLine();
        int ownerId = getCheckOwner(userName);
        if(ownerId == -1)
        {
            System.out.println("Account: " + userName + " are not registered yet! Press any key to back!");
            input.nextLine();
            resetPage();
        }
        else
        {
            System.out.println("Please enter Owner password: ");
            String password = input.nextLine();
            boolean status = true;
            while(status == true)
            {
                int index;
                
                for(index = 0; index < owners.getAllOwner().length; index++)
                {
                    if(owners.getOwner(index).getEmail().equals(userName) && owners.getOwner(index).getPassword().equals(password) && !owners.getOwner(index).getEmail().equals("????"))
                    {
                        System.out.println("OK");
                        status = false;
                    }
                    if(owners.getOwner(index).getEmail().equals(userName) && !owners.getOwner(index).getPassword().equals(password))
                    {
                        System.out.println("You have wrong password! Please Enter your password again(if your forgot just type F/f): ");
                        password = input.nextLine();
                    }
                    if(password.toLowerCase().equals("f"))
                    {
                        System.out.println("This need fill information of admin or function of recall security question!!");// method 一次验证机会，如果验证错误就直接admin信息 然后弹出
                        status = false;
                    }
                }

            }
            
            if(password.toLowerCase().equals("f") && status == false)
            {
                System.out.println("Press any key to continue");
                input.nextLine();
                resetPage();
            }
            else
            {
                System.out.println("Welcome! You are successfully login");
                System.out.println("Press any key to continue...");
                input.nextLine();
                resetPage();
                owner();
            }
        }
        
    }
    
    public void register()
    {
        boolean validation = true;
        
        Scanner input = new Scanner(System.in);
        System.out.println("To continue, please choose your account type (C/c as customer, O/o as owner), enter B/b to go back to home page: ");
        String usertype = input.nextLine();
        while(!usertype.toLowerCase().matches("[bco]"))
        {
            System.out.println("Invalid command. Please re-enter your account type (C/c as customer, O/o as owner) or enter B/b to go back to home page:");
            usertype = input.nextLine();
        }
        
        if(usertype.toLowerCase().equals("b"))
        {
            resetPage();
        }
        else
        {
            System.out.println("Please enter your first name");
            String firstName = input.nextLine();
            while(firstName.trim().length() < 3 || firstName.trim().length() > 25)
            {
                System.out.println("Must be between 3 and 25 character long!");
                System.out.println("Please enter your first name again: ");
                firstName = input.nextLine();
            }
            
            System.out.println("Please enter your last name");
            String lastName = input.nextLine();
            while(lastName.trim().length() < 3 || lastName.trim().length() > 25)
            {
                System.out.println("Must be between 3 and 25 character long!");
                System.out.println("Please enter your last name again: ");
                lastName = input.nextLine();
            }
            
            System.out.println("Please enter your email address(account name): ");
            String email = input.nextLine();
            while(!email.contains("@"))
            {
                System.out.println("Invalid email address. Please re-enter your email address:");
                email = input.nextLine();
            }
            
            System.out.println("Please enter your password: ");
            String password = input.nextLine();
            while(password.length() < 8 || password.length() > 15)// || password.matches(".*[A-Z]+.*")) wrong code with case check
            {
                if(password.length() < 8 || password.length() > 15 )
                {
                    System.out.println("Password Must contain 8 to 15 character! Please re-enter:");
                    password = input.nextLine();
                }
                //if(password.matches(".*[A-Z]+.*"))
                //{
                //    System.out.println("Password Must contain at least one upper or lower case! Please re-enter: ");
                //    password = input.nextLine();
                //}
            }
            
            System.out.println("Please re-enter password to confrim: ");
            String cpassword = input.nextLine();
            while(!cpassword.equals(password))
            {
                System.out.println("Please enter again! Make sure your second time enter password is same as first time:");
                cpassword = input.nextLine();
            }
            
            System.out.println("Please enter your first security question");
            String question1 = input.nextLine();
            System.out.println("Please enter your first security answer");
            String answer1 = input.nextLine();
            System.out.println("Please enter your second security question");
            String question2 = input.nextLine();
            System.out.println("Please enter your second security answer");
            String answer2 = input.nextLine();
            
            boolean isConcession;
            String phone;
            String address;
            String choice;
            if(usertype.toLowerCase().equals("c"))
            {
                System.out.println("Please enter your phone number (press enter to skip):");
                phone = input.nextLine();
                while(!phone.isEmpty())
                {
                    if(!phone.matches("[0-9]+"))
                    {
                        System.out.println("Phone number only allow numbers! OR You can hit enter to skip! Please enter again: ");
                        phone = input.nextLine();
                    }
                }
                System.out.println("Please enter your address (press enter to skip):");
                address = input.nextLine();
                
                System.out.println("Are you a Veteran/Concession? (Y/N)");
                choice = input.nextLine();
                while(!choice.toLowerCase().matches("[yn]"))
                {
                    System.out.println("You can only pick yes(y) or no(n)");
                    System.out.println("Please enter again: ");
                    choice = input.nextLine();
                }
                if(choice.toLowerCase().equals("y"))
                {
                    isConcession = true;
                }
                else
                {
                    isConcession = false;
                }
                
                int custId = getCustIndex();
                customers.setCustomer(custId, firstName, lastName, email, address, password, phone, question1, answer1, question2, answer2, isConcession);
            }
            
            if(usertype.toLowerCase().equals("o"))
            {
                System.out.println("Please enter your phone number:");
                phone = input.nextLine();
                while(!phone.matches("[0-9]+"))
                {
                    System.out.println("Phone number only allow numbers! Please enter again: ");
                    phone = input.nextLine();
                }
                
                System.out.println("Please enter your address:");
                address = input.nextLine();
                while(address.trim().length() < 5 || address.trim().length() > 50)
                {
                    System.out.println("Address is required! and must between 5 to 50 characters! Please enter again: ");
                    address = input.nextLine();
                }
                
                int ownerId = getOwnerIndex();
                owners.setOwner(ownerId, firstName, lastName, email, address, password, phone, question1, answer1, question2, answer2);
            }
            resetPage();
            System.out.println("Congratulations! "+ firstName + " " + lastName + "!");
            System.out.println("Your account has been created successfully!");
            System.out.println("Press any key to continue...");
            input.nextLine();
            resetPage();
        }
    }

    
    public void customerLogin()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter Customer email: ");
        String userName = input.nextLine();
        int custID = getCheckCust(userName);
        if(custID == -1)
        {
            System.out.println("Account: " + userName + " are not registered yet! Press any key to back!");
            input.nextLine();
            resetPage();
        }
        else
        {
            System.out.println("Please enter Customer password: ");
            String password = input.nextLine();
            boolean status = true;
            while(status == true)
            {
                int index;
                
                for(index = 0; index < customers.getAllCus().length; index++)
                {
                    if(customers.getCustomer(index).getEmail().equals(userName) && customers.getCustomer(index).getPassword().equals(password) && !customers.getCustomer(index).getEmail().equals("????"))
                    {
                        System.out.println("OK");
                        status = false;
                    }
                    if(customers.getCustomer(index).getEmail().equals(userName) && !customers.getCustomer(index).getPassword().equals(password))
                    {
                        System.out.println("You have wrong password! Please Enter your password again(if your forgot just type F/f): ");
                        password = input.nextLine();
                    }
                    if(password.toLowerCase().equals("f"))
                    {
                        System.out.println("This need fill information of admin or function of recall security question!!");// method 一次验证机会，如果验证错误就直接admin信息 然后弹出
                        status = false;
                    }
                }

            }
            
            if(password.toLowerCase().equals("f") && status == false)
            {
                System.out.println("Press any key to continue");
                input.nextLine();
                resetPage();
            }
            else
            {
                System.out.println("Welcome! You are successfully login");
                System.out.println("Press any key to continue...");
                input.nextLine();
                resetPage();
                //customer();
            }
        }
    }
   
    private void administratorLogin()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter admin user name: ");
        String userName = input.nextLine();
        System.out.println("Please enter admin password: ");
        String password = input.nextLine();
        while(!admin.getAdmin(0).getEmail().equals(userName) || !admin.getAdmin(0).getPassword().equals(password) )
        {
            if(!admin.getAdmin(0).getEmail().equals(userName))
            {
                System.out.println("There is no account as '" + userName + "' Please try another account");
                userName = input.nextLine();
                System.out.println("Please enter password: ");
                password = input.nextLine();
            }
            if(!admin.getAdmin(0).getPassword().equals(password))
            {
                System.out.println("Your password is wrong! Please re-enter your password:");
                password = input.nextLine();
            }
        }
        resetPage();
        System.out.println("Welcome! You are successfully login");
        System.out.println("Press any key to continue...");
        input.nextLine();
        resetPage();
    }
    
    private void owner()
    {           
        Scanner input = new Scanner(System.in);
        while(ownerOption != 7)
        {
            resetOption();
            
            ownerMenu();
            ownerOption = input.nextInt();
            resetPage();
                switch(ownerOption)
                {
                    case 1: System.out.println("Manage hall");
                            manageHall();
                            break;
                    case 2: System.out.println("Manage Booking");
                            break;
                    case 3: System.out.println("Manage discounts");
                            break;
                    case 4: System.out.println("View Halls Booking History");
                            break;
                    case 5: System.out.println("Manage Receipt");
                            break;
                    case 6: System.out.println("View Feedback");
                            break;
                    case 7: loginOption = 4;
                            break;
                            default: System.out.println("You can only choose a number between 1 and 7!");
                }
        }
    }
    
    private void manageHallMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events -- Owner Page +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to Create Hall");
        System.out.println("Press 2 to Search Hall");
        System.out.println("Press 3 to Update Hall");
        System.out.println("Press 4 to Delete Hall");
        System.out.println("Press 5 Back to Owner Page\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    private void manageHall()
    {
        Scanner input = new Scanner(System.in);
        while(manageHallOption != 5)
        {
            manageHallMenu();
            manageHallOption = input.nextInt();
            resetPage();
                switch(manageHallOption)
                {
                    case 1: System.out.println("Create Hall");
                            break;
                    case 2: System.out.println("Search Hall");
                            break;
                    case 3: System.out.println("Update Hall");
                            break;
                    case 4: System.out.println("Delete Hall");
                            break;
                    case 5: 
                            break;
                            default: System.out.println("You can only choose a number between 1 and 5!");
                }
            
        }
    }
    
    /**
     * method of get halls Index(ID, unique)
     */   
    public int getHallsNumb()
    {
        int i = 0;
        while(i < owner.getAllHalls().length)
        {
            if(owner.getHalls(i).getHallName().equals("????"))
                return i;
            i++;
        }
        return -1;// result -1 means there is no space another hall
    }
    
    

    /**
     * option of home page
     */      
    public void start()
    {
        Scanner input = new Scanner(System.in);
        while(mainOption != 4)
        {
            resetOption();
            
            mainMenu();
            mainOption = input.nextInt();
            resetPage();
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
    
    private void resetPage()
    {
        System.out.print('\u000C');
    }
    
    private void resetOption()
    {
        viewOption = 0;
        searchOption = 0;
        loginOption = 0;
        ownerOption = 0;
        manageHallOption = 0;
    }
    private void forgotPassword()
    {
        
    }
}
