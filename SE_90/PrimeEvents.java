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
    private BookingController bookCont;
    private CustomerController customers;
    private ListOfAdmins admin;
    private ListOfOwners owners;
    
    private int viewOption;
    private int searchOption;
    private int mainOption;
    private int loginOption;
    private int ownerOption;
    private int manageHallOption;
    private int customerOption;
    /**
     * Constructor for objects of class PrimeEvents
     */
    public PrimeEvents()
    {
        // initialise instance variables
        bookCont = new BookingController();
        customers = new CustomerController();
        admin = new ListOfAdmins();
        owners = new ListOfOwners();
    }

    /**
     * #1
     */
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
    
    /**
     * #2
     */
    public int getCheckOwner(String email)
    {

        for(int index = 0 ; index < owners.getAllOwner().length; index++)
        {
            if(owners.getOwner(index).getEmail().equals(email))
                return index;
        }
        return -1;
    }
    
    /**
     * #3
     */
    private int getCustIndex()
    {
        int index = 0;
        while(index < customers.getAllCus().length)
        {
            if(customers.getCustomer(index).getCusPassword().equals("????"))
                return index;
            index++;
        }
        return -1;
    }
    
    /**
     * #4
     */
    public int getCheckCust(String email)
    {

        for(int index = 0 ; index < customers.getAllCus().length; index++)
        {
            if(customers.getCustomer(index).getCusEmail().equals(email))
                return index;
        }
        return -1;
    }
    
    /**
     *#5
     *Home page Menu list
     */
    private void mainMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to View Hall");
        System.out.println("Press 2 to Login");
        System.out.println("Press 3 to Register");
        System.out.println("Press 4 Exit\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    /**
     * #6
     * View Hall page Menu list
     */
    private void viewMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events -- View Halls +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to List Hall");
        System.out.println("Press 2 to Search Hall");
        System.out.println("Press 3 Back to Home Page\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    /**
     * #7
     */
    private int checkHallList()
    {
        for(int i = 0; i < bookCont.getAllHalls().length; i++)
        {
            if(bookCont.getHalls(i).getHallCapacity() != -1)
                return 1;
        }
        return 0;
    }
    
    /**
     * #8
     */
    private void listHall()
    {
        Scanner input = new Scanner(System.in);
        int check = checkHallList();
        
        if(check == 0)
        {
            System.out.println("There is no hall until Owner has added a hall!");
            System.out.println("Press any key to continue");
            input.nextLine();
            resetPage();
        }
        else
        {
            for(int i = 0; i < bookCont.getAllHalls().length; i++)
            {
                if(bookCont.getHalls(i).getHallCapacity() != -1)
                {
                    bookCont.displayHalls(i);
                }
            }
        }
    }
    
    /**
     * #9
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
     * #10
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
     * #11
     * Owner page Menu list
     */
    private void ownerMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events -- Owner Page +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to Manage Hall");
        System.out.println("Press 2 to Manage Booking");
        System.out.println("Press 3 to Manage Discounts");
        System.out.println("Press 4 to View Halls Booking History");
        System.out.println("Press 5 to Manage Receipt");
        System.out.println("Press 6 to View Feedback");
        System.out.println("Press 7 Back to Home Page and Logout\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    /**
     * #12
     * Customer page Menu list
     */    
    private void customerMenu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("+ Welcome to Prime Events +");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=\r\n");
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to View Hall");
        System.out.println("Press 2 to View Booking History");
        System.out.println("Press 3 to View Receipt");
        System.out.println("Press 4 to Manage Booking");
        System.out.println("Press 5 to Book Hall");
        System.out.println("Press 6 to Rate service");
        System.out.println("Press 7 to Manage Profile");
        System.out.println("Press 8 Back to Home Page and Logout\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    /**
     * #13
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
     * #14
     * option of Search page
     */    
    private void searchHall()
    {
        Scanner input = new Scanner(System.in);
        while(searchOption != 4)
        {
            searchMenu();
            searchOption = input.nextInt();
            String searchName = "?";
                switch(searchOption)
                {
                    case 1: System.out.println("Function Search Hall by Name");
                            userSearchHall(searchName);
                            break;
                    case 2: System.out.println("Function Search Hall by Event Type");
                            break;
                    case 3: System.out.println("Function Search Hall by Date");
                            break;
                    case 4: viewOption = 3;
                            break;
                            default: System.out.println("Please choose an option between 1 and 4!");
                }
        }
    }
    
    /**
     * #15
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
                    case 1: listHall();
                            break;
                    case 2: searchHall();
                            break;
                    case 3: 
                            break;
                            default: System.out.println("Please choose an option between 1 and 3!");
                }
        }
    }

    /**
     * #16
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
                            default: System.out.println("Please choose an option between 1 and 4!");
                }
        }
    }
    
    /**
     * #17
     */
    private void ownerLogin()
    {
        Scanner input = new Scanner(System.in);
        String ownerEmail = "????";
        
        
        
        System.out.println("Please enter Owner Email Address: ");
        ownerEmail = input.nextLine();
        int ownerId = getCheckOwner(ownerEmail);
        if(ownerId == -1)
        {
            System.out.println("Account: " + ownerEmail + " is not registered yet! Press any key to back!");
            input.nextLine();
            resetPage();
        }
        else
        {
            System.out.println("Please enter Owner Password: ");
            String password = input.nextLine();
            boolean status = true;
            while(status == true)
            {
                int index;
                
                for(index = 0; index < owners.getAllOwner().length; index++)
                {
                    if(owners.getOwner(index).getEmail().equals(ownerEmail) && owners.getOwner(index).getPassword().equals(password) && !owners.getOwner(index).getEmail().equals("????"))
                    {
                        ownerEmail = owners.getOwner(index).getEmail();
                        status = false;
                    }
                    if(owners.getOwner(index).getEmail().equals(ownerEmail) && !owners.getOwner(index).getPassword().equals(password))
                    {
                        System.out.println("Password is incorrect for specified email! Please enter your password again(if your forgotten, choose F/f): ");
                        password = input.nextLine();
                    }
                    if(password.toLowerCase().equals("f"))
                    {
                        System.out.println("Please contact administrator or recall security question!!");// method 一次验证机会，如果验证错误就直接admin信息 然后弹出
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
                System.out.println("Welcome! You have successfully login");
                System.out.println("Press any key to continue...");
                input.nextLine();
                resetPage();
                owner(ownerEmail);
            }
        }
        
    }
    
    /**
     * #18
     */
    private void register()
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
            System.out.println("Please type the answer to your first security question");
            String answer1 = input.nextLine();
            System.out.println("Please enter your second security question");
            String question2 = input.nextLine();
            System.out.println("Please type the answer to your second security question");
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
                        System.out.println("Phone number only have digits involved! ALTERNATIVELY, hit enter to skip this step! Please enter again: ");
                        phone = input.nextLine();
                    }
                    else
                    {
                        break;
                    }
                }
                System.out.println("Please enter your address (press enter to skip):");
                address = input.nextLine();
                
                System.out.println("Are you a Veteran/Concession? (Y/N)");
                choice = input.nextLine();
                while(!choice.toLowerCase().matches("[yn]"))
                {
                    System.out.println("Please choose yes(y) or no(n)");
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
                    System.out.println("Phone number may only have digits! Please enter again: ");
                    phone = input.nextLine();
                }
                
                System.out.println("Please enter your address:");
                address = input.nextLine();
                while(address.trim().length() < 5 || address.trim().length() > 50)
                {
                    System.out.println("An Address is required! It must be between 5 to 50 characters! Please enter again: ");
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
    
    /**
     * #19
     */
    private void customerLogin()
    {
        Scanner input = new Scanner(System.in);
        String firstName = "????";
        String lastName = "????";
        
        System.out.println("Please enter a Customer email: ");
        String userName = input.nextLine();
        int custID = getCheckCust(userName);
        if(custID == -1)
        {
            System.out.println("Account: " + userName + " is not registered yet! Press any key to back!");
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
                    if(customers.getCustomer(index).getCusEmail().equals(userName) && customers.getCustomer(index).getCusPassword().equals(password) && !customers.getCustomer(index).getCusEmail().equals("????"))
                    {
                        firstName = customers.getCustomer(index).getCusFirstName();
                        lastName = customers.getCustomer(index).getCusLastName();
                        status = false;
                    }
                    if(customers.getCustomer(index).getCusEmail().equals(userName) && !customers.getCustomer(index).getCusPassword().equals(password))
                    {
                        System.out.println("You have a wrong password! Please Enter your password again(if your forgot just type F/f): ");
                        password = input.nextLine();
                    }
                    if(password.toLowerCase().equals("f"))
                    {
                        System.out.println("Please contact administrator or recall security question!!");// method 一次验证机会，如果验证错误就直接admin信息 然后弹出
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
                customer(firstName, lastName);
            }
        }
    }
   
    
    /**
     * #20
     * Administrator Login
     */
    private void administratorLogin()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter admin user name: ");
        String userName = input.nextLine();
        System.out.println("Please enter admin password: ");
        String password = input.nextLine();
        while(!admin.getAdmin(0).getAdminEmail().equals(userName) || !admin.getAdmin(0).getAdminPassword().equals(password) )
        {
            if(!admin.getAdmin(0).getAdminEmail().equals(userName))
            {
                System.out.println("There is no account as '" + userName + "' Please try another account");
                userName = input.nextLine();
                System.out.println("Please enter password: ");
                password = input.nextLine();
            }
            if(!admin.getAdmin(0).getAdminPassword().equals(password))
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
    
    /**
     * #21
     */
    public void customer(String firstName, String lastName)
    {
        Scanner input = new Scanner(System.in);
        while(customerOption != 8)
        {
            resetOption();
            
            customerMenu();
            customerOption = input.nextInt();
            resetPage();
                switch(customerOption)
                {
                    case 1: System.out.println("View Hall");
                            listHall();
                            break;
                    case 2: System.out.println("View Booking History");
                            bookHistroy(firstName, lastName);
                            break;
                    case 3: System.out.println("View Receipt");
                            break;
                    case 4: System.out.println("Manage Booking");
                            break;
                    case 5: System.out.println("Book Hall");
                            bookHall(firstName, lastName);
                            break;
                    case 6: System.out.println("Rate service");
                            break;
                    case 7: System.out.println("Manage Profile");
                            break;
                    case 8: loginOption = 4;
                            break;
                            default: System.out.println("You can only choose a number between 1 and 8!");
                }
        }
    }
    
    /**
     * #22
     */
    public void getCusBookHistory(String firstName, String lastName)
    {
        int index = 0;
        for(index = 0; index < bookCont.getAllBook().length; index++)
        {
            if(bookCont.getBook(index).getFirstName().equals(firstName) && bookCont.getBook(index).getLastName().equals(lastName))
            {
                bookCont.displayBook(index);
            }
        }
        
    }
    
    /**
     * #23
     */
    private void bookHistroy(String firstName, String lastName)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Your booking history is: \r\n");
        getCusBookHistory(firstName, lastName);
        System.out.println("Press any to continue...");
        input.nextLine();
    }
    
    /**
     * #24
     */
    private int checkBook()
    {
        for(int i = 0; i < bookCont.getAllBook().length; i++)
        {
            if(bookCont.getBook(i).getPrice() != -1)
                return 1;
        }
        return 0;
    }
    
    /**
     * #25
     */
    private void bookHall(String firstName, String lastName)
    {
        Scanner input = new Scanner(System.in);
        boolean validation = true;
        int hallChoice = -1;
        listHall();
        int checkHall = checkBook();
        
        if(checkHall == 1)
        {
            do
            {
                validation = true;//set loop into while true
                try
                {
                    System.out.println("Please make a choice for the hall you want to book with(by hall number)");
                    hallChoice = Integer.parseInt(input.nextLine());//transfer the input value from String into int
                    while(bookCont.getHalls(hallChoice - 1).getHallCapacity() == -1)
                    {
                        System.out.println("There is no option of " + hallChoice  + "! Please enter again:");
                        hallChoice = Integer.parseInt(input.nextLine());
                    }
                    validation = false;
                }
                catch(Exception e)//if input not a string, then it cant transfer from string to int
                {
                System.out.println("You can only enter Number here!");
                }
            }while(validation == true);
    
            String hallName = bookCont.getHalls(hallChoice - 1).getHallName();
            String hallEvents = bookCont.getHalls(hallChoice - 1).getHallEvents();
            String date = "this need input date";
            double hallPrice = bookCont.getHalls(hallChoice - 1).getHallPrice();
            double hallDeposit = hallPrice * 0.5;
            double acutalFee = hallPrice * 1; //hall price times discount rate, now set as 1
            
            int bookID = getBookID();
            bookCont.setBook(bookID, firstName, lastName, hallName, hallEvents, date, hallPrice, acutalFee, hallDeposit);
            System.out.println("Congratulations! Booking Successful!");
            System.out.println("Press any to continue...");
            input.nextLine();
        }
        else
        {
            System.out.println("There is no hall could book");
            System.out.println("Press any to continue...");
            input.nextLine();
        }
    }
    
    /**
     * #26
     */
    private int getBookID()
    {
        int index = 0;
        while(index < bookCont.getAllBook().length)
        {
            if(bookCont.getBook(index).getPrice() == -0.01)
                return index;
            index++;
        }
        return -1;
    }
    
    /**
     * #27
     */
    private void owner(String hallOwnerEmail)
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
                            manageHall(hallOwnerEmail);
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
    
    /**
     * #28
     */
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
        System.out.println("Press 5 to View Hall");
        System.out.println("Press 6 Back to Owner Page\r\n");
        System.out.println("Please Enter Your Choice: ");
    }
    
    /**
     * #29
     */
    private void manageHall(String hallOwnerEmail)
    {
        Scanner input = new Scanner(System.in);
        while(manageHallOption != 6)
        {
            manageHallMenu();
            manageHallOption = input.nextInt();
            resetPage();
            int index;
            String search = "?";
                switch(manageHallOption)
                {
                    case 1: System.out.println("Create Hall");
                            index = getHallIndex();
                            createHall("c",index, hallOwnerEmail);
                            break;
                    case 2: System.out.println("Search Hall");
                            System.out.println("Please Enter the hall name you want to search");
                            searchHall(hallOwnerEmail);
                            //no search validation here such as if there is no match
                            break;
                    case 3: System.out.println("Update Hall");
                            System.out.println("Plesase chose the hall you want to edit(by hall number)");
                            index = input.nextInt() - 1;
                            createHall("e",index , hallOwnerEmail);
                            break;
                    case 4: System.out.println("Delete Hall");
                            break;
                    case 5: resetPage();
                            System.out.println("View Hall");
                            getOwnerHall(hallOwnerEmail);
                            input.nextLine();
                            break;
                    case 6: 
                            break;
                            default: System.out.println("Please enter a choice between 1 and 6!");
                }
            
        }
    }
    
    /**
     * #30
     */
    public void searchHall(String hallOwnerEmail)
    {
        Scanner input = new Scanner(System.in);
        int index = 0;
        boolean returnHall = false;
        int hallID = -1;
        
        String searchName = input.nextLine();
        for(index = 0; index < bookCont.getAllHalls().length; index++)
        {
            if(bookCont.getHalls(index).getHallOwnerEmail().equals(hallOwnerEmail))
            {
                if(bookCont.getHalls(index).getHallName().equals(searchName))
                {
                    returnHall = true;
                    hallID = index;
                    break;
                }
            }
        }
        
        if(returnHall == true)
        {
            bookCont.displayHalls(hallID);
        }
        else
        {
            System.out.println("There is no hall named '" + searchName +"'!");
        }
    }
    
    /**
     * #31
     */
    public void userSearchHall(String searchName)
    {
        int index = 0;
        for(index = 0; index < bookCont.getAllHalls().length; index++)
        {
            if(bookCont.getHalls(index).getHallName().equals(searchName))
                bookCont.displayHalls(index);
        }
    }
    
    /**
     * #32
     */
    private int getHallIndex()
    {
        int index = 0;
        while(index < bookCont.getAllHalls().length)
        {
            if(bookCont.getHalls(index).getHallCapacity() == -1)
                return index;
            index++;
        }
        return -1;
    }
    
    /**
     * #33
     */
    public void createHall(String type, int index, String hallOwnerEmail)
    {
        Scanner input = new Scanner(System.in);
        boolean validation = true;
        int hallCapacity = -1;
        double hallPrice = -0.01;
        String confirm;
        
        System.out.println("Pleas enter a Hall Name: ");
        String hallName = input.nextLine();
        while(hallName.trim().length() < 3 || hallName.trim().length() > 25)
        {
            System.out.println("Must be between 3 and 25 characters long!");
            System.out.println("Please enter your hall name again: ");
            hallName = input.nextLine();
        }
        
        System.out.println("Pleas enter the Hall Address: ");
        String hallAddress = input.nextLine();
        while(hallAddress.trim().length() < 5 || hallAddress.trim().length() > 505)
        {
            System.out.println("Must be between 5 and 50 characters long!");
            System.out.println("Please enter your hall address again: ");
            hallAddress = input.nextLine();
        }
        
        do
        {
            validation = true;//set loop into while true
            try
            {
                System.out.println("Please enter the Hall Capacity: ");
                hallCapacity = Integer.parseInt(input.nextLine());//transfer the input value from String into int
                while(hallCapacity < 10 || hallCapacity > 100)//validate the input range
                {
                    System.out.println("Hall capacity Must Be between 10 and 100");
                    System.out.println("Please enter again:");
                    hallCapacity = Integer.parseInt(input.nextLine());
                }
                validation = false;
            }
            catch(Exception e)//if input not a string, then it cant transfer from string to int
            {
            System.out.println("You can only Enter a number here!");
            }
        }while(validation == true);    
        
        do
        {
            validation = true;//set loop into while true
            try
            {
                System.out.println("Please enter the Hall Price: ");
                hallPrice = Double.parseDouble(input.nextLine());//transfer the input value from String into int
                while(hallPrice < 0 )//validate the input range
                {
                    System.out.println("Price of hall cannot be lower than 0");
                    System.out.println("Please enter again:");
                    hallPrice = Double.parseDouble(input.nextLine());
                }
                validation = false;
            }
            catch(Exception e)//if input not a string, then it cant transfer from string to int
            {
            System.out.println("You can only Enter a number here!");
            }
        }while(validation == true);   
        
        
        System.out.println("Pleas enter event type you want to host: ");
        String hallEvents = input.nextLine();
        while(hallEvents.trim().length() < 0)
        {
            System.out.println("Hall must be available for at least one event!");
            System.out.println("Please enter the event type again: ");
            hallEvents = input.nextLine();
        }
        
        System.out.println("Are you sure you want to add this hall information? Please enter Y/y for yes, N/n for No");
        confirm = input.nextLine();
        
        while(!confirm.toLowerCase().matches("[yn]"))
        {
            System.out.println("Error! you can only type in Y/y to confirm or N/n to go back");
        }
        
        if(confirm.toLowerCase().equals("y") && type.equals("c"))
        {
            System.out.println("Hall has been added in successfully! ");
            bookCont.setHall(index, hallOwnerEmail, hallName, hallAddress, hallCapacity, hallPrice, hallEvents);
        }
        
        if(confirm.toLowerCase().equals("y") && type.equals("e"))
        {
            System.out.println("Hall has been edited successfully! ");
            bookCont.setHall(index, hallOwnerEmail, hallName, hallAddress, hallCapacity, hallPrice, hallEvents);
        }
        
        if(confirm.toLowerCase().equals("n"))
        {
            resetPage();
        }
        
    }
    
    /**
     * #34
     * method of get halls Index(ID, unique)
     */   
    private int getHallsNumb()
    {
        int i = 0;
        while(i < bookCont.getAllHalls().length)
        {
            if(bookCont.getHalls(i).getHallCapacity() == -1)
                return i;
            i++;
        }
        return -1;// result -1 means there is no space another hall
    }
    
    /**
     * #35
     */
    public void getOwnerHall(String email)
    {
        int index = 0;
        for(index = 0; index < bookCont.getAllHalls().length; index++)
        {
            if(bookCont.getHalls(index).getHallOwnerEmail().equals(email))
            {
                bookCont.displayHalls(index);
            }
        }
        
    }
    
    /**
     * #36
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
                    case 4: System.out.println("Thank you for using Prime Events"); break;
                            default: System.out.println("Please select an option between 1 and 4!");
                }
        }
    }
    
    /**
     * #37
     */
    private void resetPage()
    {
        System.out.print('\u000C');
    }
    
    /**
     * #38
     */
    private void resetOption()
    {
        viewOption = 0;
        searchOption = 0;
        loginOption = 0;
        ownerOption = 0;
        manageHallOption = 0;
        customerOption = 0;
    }
    
    /**
     * #39
     */
    public void test()
    {
        
    }
}
