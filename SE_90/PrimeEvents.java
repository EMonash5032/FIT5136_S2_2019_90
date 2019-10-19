import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat; 

/**
 * Write a description of class PrimeEvents here.
 *
 * @author Team90
 * @version 10 SEP, 2019
 */
public class PrimeEvents
{
    // instance variables - replace the example below with your own
    private BookingController bookCont;
    private CustomerController customers;
    private AdminController admin;
    private OwnerController owners;
    
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
        admin = new AdminController();
        owners = new OwnerController();
    }

    /**
     * #1
     */
    private int ownerIndex()
    {
        int index = 0;
        while(index < owners.getAllOwner().length)
        {
            if(owners.getOwner(index).getOwnerPassword().equals("????"))
                return index;
            index++;
        }
        return -1;
    }
    
    /**
     * #2
     */
    public int checkOwner(String email)
    {

        for(int index = 0 ; index < owners.getAllOwner().length; index++)
        {
            if(owners.getOwner(index).getOwnerEmail().equals(email))
                return index;
        }
        return -1;
    }
    
    /**
     * #3
     */
    private int custIndex()
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
    public int checkCust(String email)
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
        int check = bookCont.checkHallList();
        
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
            resetPage();
            searchMenu();
            
            searchOption = inputNumber();

            String searchName = "?";
                switch(searchOption)
                {
                    case 1: System.out.println("Please Enter the hall name you want to search");
                            searchName = input.nextLine();
                            bookCont.searchHallName(searchName);
                            System.out.println("Enter any to continue");
                            input.nextLine();
                            resetPage();
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
            resetPage();
            viewMenu();
            
            viewOption = inputNumber();
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
            
            loginOption = inputNumber();
            
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
        int ownerId = checkOwner(ownerEmail);
        if(ownerId == -1)
        {
            System.out.println("Account: " + ownerEmail + " is not registered yet! Press any key to go register!");
            input.nextLine();
            resetPage();
            register();
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
                    if(owners.getOwner(index).getOwnerEmail().equals(ownerEmail) && owners.getOwner(index).getOwnerPassword().equals(password) && !owners.getOwner(index).getOwnerEmail().equals("????"))
                    {
                        ownerEmail = owners.getOwner(index).getOwnerEmail();
                        status = false;
                    }
                    if(owners.getOwner(index).getOwnerEmail().equals(ownerEmail) && !owners.getOwner(index).getOwnerPassword().equals(password))
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
            while(!email.contains("@") || !email.contains("."))
            {
                System.out.println("Invalid email address. Please re-enter your email address:");
                email = input.nextLine();
            }
            
            System.out.println("Please enter your password: ");
            String password = input.nextLine();
            while(password.length() < 8 || password.length() > 15)
            {
                if(password.length() < 8 || password.length() > 15 )
                {
                    System.out.println("Password Must contain 8 to 15 character! Please re-enter:");
                    password = input.nextLine();
                }
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
            while(question1.trim().length() < 5 || question1.trim().length() > 50)
            {
                System.out.println("Must be between 5 and 50 character long!");
                System.out.println("Please enter your first security question again: ");
                question1 = input.nextLine();
            }
            
            System.out.println("Please type the answer to your first security question");
            String answer1 = input.nextLine();
            while(answer1.trim().length() < 5 || answer1.trim().length() > 50)
            {
                System.out.println("Must be between 5 and 50 character long!");
                System.out.println("Please enter your first security answer again: ");
                answer1 = input.nextLine();
            }
            
            System.out.println("Please enter your second security question");
            String question2 = input.nextLine();
            while(question2.trim().length() < 5 || question2.trim().length() > 50 || question2.equals(question1))
            {
                if(question2.equals(question1))
                {
                    System.out.println("You cannot enter same question as first question");
                    System.out.println("Please enter your second security question again: ");
                    question2 = input.nextLine();
                }
                if(question2.trim().length() < 5 || question2.trim().length() > 50)
                {
                    System.out.println("Must be between 5 and 50 character long!");
                    System.out.println("Please enter your second security question again: ");
                    question2 = input.nextLine();
                }
            }
            
            System.out.println("Please type the answer to your second security question");
            String answer2 = input.nextLine();
            while(answer2.trim().length() < 5 || answer2.trim().length() > 50)
            {
                System.out.println("Must be between 5 and 50 character long!");
                System.out.println("Please enter your second security answer again: ");
                answer2 = input.nextLine();
            }
            
            boolean isConcession;
            String phone;
            String address;
            String choice;
            if(usertype.toLowerCase().equals("c"))
            {
                System.out.println("Please enter your phone number (press enter to skip):");
                phone = input.nextLine();
                while(!phone.isEmpty() || (!phone.isEmpty() && phone.length() != 10))
                {
                    if(!phone.matches("[0-9]+"))
                    {
                        System.out.println("Phone number only have digits involved! ALTERNATIVELY, hit enter to skip this step! Please enter again: ");
                        phone = input.nextLine();
                    }
                    if(!phone.isEmpty() && phone.length() != 10)
                    {
                        System.out.println("A phone number Must contain 10 digital Number, please enter again or hit enter to skip: ");
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
                
                int custId = custIndex();
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
                
                int ownerId = ownerIndex();
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
        String custEmail = "????";
        
        System.out.println("Please enter a Customer email: ");
        String userName = input.nextLine();
        int custID = checkCust(userName);
        if(custID == -1)
        {
            System.out.println("Account: " + userName + " is not registered yet! Press any key to register!");
            input.nextLine();
            resetPage();
            register();
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
                        custEmail = customers.getCustomer(index).getCusEmail();
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
                customer(custEmail);
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
    public void customer(String cusEmail)
    {
        Scanner input = new Scanner(System.in);
        while(customerOption != 8)
        {
            resetOption();
            customerMenu();
            customerOption = inputNumber();

            resetPage();
                switch(customerOption)
                {
                    case 1: System.out.println("View Hall");
                            listHall();
                            break;
                    case 2: System.out.println("View Booking History");
                            bookHistroy(cusEmail);
                            break;
                    case 3: System.out.println("View Receipt");
                            break;
                    case 4: System.out.println("Manage Booking");
                            break;
                    case 5: System.out.println("Book Hall");
                            cusMakeQuota(cusEmail);
                            break;
                    case 6: System.out.println("Rate service");
                            rateService(cusEmail);
                            break;
                    case 7: System.out.println("Manage Profile");
                            break;
                    case 8: loginOption = 4;
                            break;
                            default: System.out.println("You can only choose a number between 1 and 8!");
                }
        }
    }    
    
    public void rateService(String cusEmail)
    {
        if(bookCont.displayCompletedBooking(cusEmail) == null)
        {
            System.out.println("You don't have any finished booking. Press enter to return to previous page.");
            Scanner input = new Scanner(System.in);
            input.nextLine();
        }
        else
        {
            System.out.println("Select 1 to continue and review your booking(s) or 2 to return to previous page: ");
            customerOption = inputNumber();
            switch(customerOption)
                {
                    case 1: System.out.println("Return to customer home page");
                            break;
                    case 2: System.out.println("Please select a booking that hasn't been reviewed before to start: ");
                            reviewSelectedBooking(cusEmail, bookCont.displayCompletedBooking(cusEmail));
                            
                            break;
                            default: System.out.println("You can only choose 1 or 2!");
                }
            
        }
    }
    
    public void reviewSelectedBooking(String cusEmail, Booking[] completedBookings)
        {
            int size = 0;
            for(Booking booking : completedBookings)
            {
                if(booking != null)
                {
                    size++;
                }
                else
                {
                    break;
                }
            }
            Scanner input = new Scanner(System.in);
            int selection = inputNumber();
            while(selection < 1 || selection > size || completedBookings[selection - 1].getReviewStatus() == true)
            {
                System.out.println("Invalid selection, please reselect a booking to review from the list: ");
                selection = input.nextInt();
            }
                       
            System.out.println("Please rate the decoration of the hall (rating from 1 - 5): ");
            double dR = input.nextDouble();
            while(dR < 1 || dR > 5)
            {
                System.out.println("Invalid rating, please re-enter a rating from 1 - 5: ");
                dR = input.nextDouble();
            }
            
            System.out.println("Please rate the service of the hall (rating from 1 - 5): ");
            double sR = input.nextDouble();
            while(sR < 1 || sR > 5)
            {
                System.out.println("Invalid rating, please re-enter a rating from 1 - 5: ");
                sR = input.nextDouble();
            }
            
            System.out.println("Please rate the overall performance of the hall (rating from 1 - 5): ");
            double oR = input.nextDouble();
            while(oR < 1 || oR > 5)
            {
                System.out.println("Invalid rating, please re-enter a rating from 1 - 5: ");
                oR = input.nextDouble();
            }
            
            System.out.println("Please leave a comment to the hall: ");
            String description = input.nextLine();
            bookCont.setReview(completedBookings[selection - 1].getHallNo(), cusEmail,
                              dR, sR,oR, description, completedBookings[selection - 1]);
        }
    
    /**
     * #23
     */
    private void bookHistroy(String cusEmail)
    {
        Scanner input = new Scanner(System.in);
        int index = 0;
        System.out.println("Your booking history is: \r\n");
        
        for(index = 0; index < bookCont.getAllBook().length; index++)
        {
            if(bookCont.getBook(index).getCustomerEmail().equals(cusEmail)) //&& and booking status is finished
            {
                bookCont.displayBook(index);
            }
        }
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
            if(bookCont.getBook(i).getQuotationIndex() != -1)
                return 1;
        }
        return 0; 
    }
    
    private void booking()
    {
        //There are three difference type of  booking Status: O "on going" means during the time the 
            //hall still use by customer; F "Finish book" means finished book after end date and success 
            //finsh for book process and could make review; C "Cancel booking" means owner who cancel 
            //the customer book; N "Not Start" means the booking process not start yet.
            String bookingStatus = "N";
    }
    
    /**
     * #25
     */
    private void cusMakeQuota(String cusEmail)
    {
        Scanner input = new Scanner(System.in);
        boolean validation = true;
        int hallChoice = -1;
        listHall();
        int checkHall = bookCont.checkHallList();
        
        if(checkHall == 1)
        {
            do
            {
                validation = true;//set loop into while true
                try
                {
                    System.out.println("Please make a choice for the hall you want to book with(by hall number) for quotation");
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
    
            int hallNo = hallChoice - 1;
            
            String startDate = "????";
            String endDate = "????";
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            int checkDate = -1;
            Date sDate = new Date();
            Date eDate = new Date();
            while(checkDate == -1)
            {
                validation = true;
                do
                {
                    try
                    {
                        System.out.println("Please enter the start date (format 'dd/MM/yyyy', must include '/'): ");
                        String inputDate = input.nextLine();
                    
                        sDate = formatter.parse(inputDate);
                    
                        startDate = formatter.format(sDate);
                        System.out.println("Start date is : " + startDate);
                        validation = false;
                    }
                    catch(ParseException e)
                    {
                        System.out.print("Invalid date format! You can only Enter format within 'dd/MM/yyyy' by number");
                    }
                }while(validation == true);
                
                validation = true;
                do
                {
                    try
                    {
                        System.out.println("Please enter the date with format 'dd/MM/yyyy': ");
                        String inputDate = input.nextLine();
                    
                        eDate = formatter.parse(inputDate);
                    
                        endDate = formatter.format(eDate);
                        System.out.println("End date is : " + endDate);
                        validation = false;
                    }
                    catch(ParseException e)
                    {
                        System.out.println("Invalid date format! You can only Enter format within 'dd/MM/yyyy' by number");
                    }
                }while(validation == true);
            
                checkDate = bookCont.checkDate(sDate, eDate);
            }
            
            System.out.println("Please Enter Type of Event that this book contain with, Anniversary(a), Birthday(b), Wedding Ceremony(c) or Wedding Reception(r):");
            String typeChoice = input.nextLine();
            String bookEventType = "????";
            
            while(bookEventType.equals("????"))
            {
                while(!typeChoice.toLowerCase().matches("[abcr]"))
                {
                    System.out.println("Error! you can only type in ");
                    typeChoice = input.nextLine();
                }
                if(typeChoice.toLowerCase().equals("a") && 
                    bookCont.getHalls(hallNo).getAnniversary() == true)
                {
                    bookEventType = "Anniversary";
                }
                
                else if(typeChoice.toLowerCase().equals("b") && 
                    bookCont.getHalls(hallNo).getBirthday() == true)
                {
                    bookEventType = "Birthday";
                }
                
                else if(typeChoice.toLowerCase().equals("c") && 
                    bookCont.getHalls(hallNo).getWeddingCeremony() == true)
                {
                    bookEventType = "Wedding Ceremony";
                }
                
                else if(typeChoice.toLowerCase().equals("r") && 
                    bookCont.getHalls(hallNo).getWeddingReception() == true)
                {
                    bookEventType = "Wedding Reception";
                }
                
                else
                {
                    System.out.println("You can only pick one type that the hall contain with Event Type");
                    System.out.println("Please make a choice Anniversary(a), Birthday(b), Wedding Ceremony(c) or Wedding Reception(r):");
                    System.out.println("The hall you looking for has following event types: ");
                    bookCont.displayEventType(hallNo);
                    typeChoice = input.nextLine();
                }
            }

            int numberPeople = -1;
            do
            {
                validation = true;//set loop into while true
                try
                {
                    System.out.println("Please enter number of people going to attend: ");
                    numberPeople = Integer.parseInt(input.nextLine());//transfer the input value from String into int
                    int hallCapacity = bookCont.getHalls(hallNo).getHallCapacity();
                    while(numberPeople < 10 && numberPeople > hallCapacity)//validate the input range
                    {
                        System.out.println("There must be at least 10 people and no more than " + hallCapacity + "!");
                        System.out.println("Please enter again:");
                        numberPeople = Integer.parseInt(input.nextLine());
                    }
                    validation = false;
                }
                catch(Exception e)//if input not a string, then it cant transfer from string to int
                {
                    System.out.println("You can only Enter a number here!");
                }
            }while(validation == true);
            
            boolean catering = false;
            String menuOption = "????";
            if(bookCont.getHalls(hallNo).getCatering() == true)
            {
                System.out.println("Would you like catering services? Y/y for Yes, N/n for No");
                String cateringOption = input.nextLine();
                while(!cateringOption.toLowerCase().matches("[yn]"))
                {
                    System.out.println("Error! you can only type in Y/y to Catering or N/n for No Catering");
                    cateringOption = input.nextLine();
                }
                
                if(cateringOption.toLowerCase().equals("y"))
                {
                    catering = true;
                    System.out.println("Please Enter the menu that you want to service as: ");
                    menuOption = input.nextLine();
                    while(menuOption.isEmpty())
                    {
                        System.out.println("You cannot leave it as blank. Please Enter it again");
                        menuOption = input.nextLine();
                    }
                }
            }
            
            boolean photography = false;
            if(bookCont.getHalls(hallNo).getPhotography() == true)
            {
                System.out.println("Would you like catering services? Y/y for Yes, N/n for No");
                String photographyOption = input.nextLine();
                while(!photographyOption.toLowerCase().matches("[yn]"))
                {
                    System.out.println("Error! you can only type in Y/y to Photography or N/n for No Photography");
                    photographyOption = input.nextLine();
                }
                
                if(photographyOption.toLowerCase().equals("y"))
                {
                    photography = true;
                }
            }
            
            
            System.out.println("Please enter your contact email address: ");
            String contactEmail = input.nextLine();
            while(!contactEmail.contains("@") || !contactEmail.contains("."))
            {
                System.out.println("Invalid email address. Please re-enter your email address:");
                contactEmail = input.nextLine();
            }
            
            String contactPhone = "????";
            System.out.println("Please enter your phone number (press enter to skip):");
            contactPhone = input.nextLine();
            while(contactPhone.length() != 10 || !contactPhone.matches("[0-9]+"))
            {
                if(!contactPhone.matches("[0-9]+"))
                {
                    System.out.println("Phone number only have digits involved! Please enter again: ");
                    contactPhone = input.nextLine();
                }
                if(contactPhone.length() != 10)
                {
                    System.out.println("A phone number Must contain 10 digital Number, please enter again: ");
                    contactPhone = input.nextLine();
                }
            }
            
            int quotaIndex = bookCont.blankQuota();
            String ownerEmail = bookCont.getHalls(hallNo).getHallOwnerEmail();
            double additionalFee = -0.01;
            double totalPrice = -0.01;
            double totalPriceAfterDiscount = -0.01;
            boolean ownerConfirmation = false;
            
            bookCont.setQuotation(quotaIndex, hallNo, ownerEmail, cusEmail, startDate, endDate, bookEventType, numberPeople, catering, 
                                      menuOption, photography, contactEmail, contactPhone, additionalFee, totalPrice, totalPriceAfterDiscount,
                                      ownerConfirmation);
            resetPage();
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
    
    public void replyQuota(String ownerEmail)
    {
        Scanner input = new Scanner(System.in);
        boolean validation;
        int quotaChoice = -1;
        if(bookCont.checkQuotation(ownerEmail) == 1)
        {
            bookCont.displayOwnerQuotation(ownerEmail);
            
            do
            {
                validation = true;//set loop into while true
                try
                {
                    System.out.println("Please enter the quotation number to further comfirm: ");
                    quotaChoice = Integer.parseInt(input.nextLine());//transfer the input value from String into int
                    while(!bookCont.getQuota(quotaChoice).getOwnerEmail().equals(ownerEmail) 
                            || bookCont.getQuota(quotaChoice).getOwnerConfirmation() == true)
                    {
                        System.out.println("There is no option of " + quotaChoice  + "! Please enter again:");
                        quotaChoice = Integer.parseInt(input.nextLine());
                    }
                    validation = false;
                }
                catch(Exception e)//if input not a string, then it cant transfer from string to int
                {
                    System.out.println("You can only enter Number here!");
                }
            }while(validation == true);
            
            double addFee = 0;
            if(bookCont.getQuota(quotaChoice).getCatering() == true || bookCont.getQuota(quotaChoice).getPhotography() == true)
            {
                do
                {
                    validation = true;//set loop into while true
                    try
                    {
                        System.out.println("Please enter addition cost for catering or photography services:");
                        addFee = Double.parseDouble(input.nextLine());//transfer the input value from String into int
                        while(addFee < 0)//validate the input range
                        {
                            System.out.println("Price of hall cannot be lower than 0");
                            System.out.println("Please enter again:");
                            addFee = Double.parseDouble(input.nextLine());
                        }
                        validation = false;
                    }
                    catch(Exception e)//if input not a string, then it cant transfer from string to int
                    {
                        System.out.println("You can only Enter a number here! Please Enter again:");
                    }
                }while(validation == true); 
            }
            
            System.out.println("Are you sure you want to confirm this information? Please enter Y/y for yes, N/n for No");
            String confirm = input.nextLine();
        
            while(!confirm.toLowerCase().matches("[yn]"))
            {
                System.out.println("Error! you can only type in Y/y to confirm or N/n to go back");
                confirm = input.nextLine();
            }
        
            if(confirm.toLowerCase().equals("y"))
            {
                bookCont.getQuota(quotaChoice).setAdditionalFee(addFee);
                bookCont.getQuota(quotaChoice).setOwnerConfirmation(true);
                System.out.println("Quotation confirm successful!");
                System.out.println("Press any to continue...");
                input.nextLine();
            }
            if(confirm.toLowerCase().equals("n"))
            {
                System.out.println("You are not comfirm this quotation");
                System.out.println("Press any to continue...");
                input.nextLine();
            }
            
        }
        else
        {
            System.out.println("There is no customer make the Quotation ");
            System.out.println("Press any to continue...");
            input.nextLine();
        }
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
            
            ownerOption = inputNumber();

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
            manageHallOption = inputNumber();
            resetPage();
            int index ;
            String search = "?";
                switch(manageHallOption)
                {
                    case 1: System.out.println("Create Hall");
                            index = hallIndex();
                            createHall("c",index, hallOwnerEmail);
                            break;
                    case 2: System.out.println("Search Hall");
                            System.out.println("Please Enter the hall name you want to search");
                            ownerSearchHall(hallOwnerEmail);
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
                            bookCont.displayOwnerHall(hallOwnerEmail);
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
    public void ownerSearchHall(String hallOwnerEmail)
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
     * #32
     */
    private int hallIndex()
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
     * #33 type "e" means edit  type "c" means create
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
        int checkName = bookCont.checkHallName(hallOwnerEmail, hallName);
        while(hallName.trim().length() < 5 || hallName.trim().length() > 25 || checkName != -1)
        {
            if(hallName.trim().length() < 5 || hallName.trim().length() > 25 )
            {
                System.out.println("Must be between 5 and 25 characters long!");
                System.out.println("Please enter your hall name again: ");
                hallName = input.nextLine();
            }
            if(checkName != -1)
            {
                System.out.println("Name " + "'" + hallName + "'" + " already exist, Please try another one:");
                hallName = input.nextLine();
                checkName = bookCont.checkHallName(hallOwnerEmail, hallName);
            }
        }        
        
        System.out.println("Pleas enter the Hall Address: ");
        String hallAddress = input.nextLine();
        while(hallAddress.trim().length() < 5 || hallAddress.trim().length() > 50)
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
                while(hallCapacity < 10 )//validate the input range
                {
                    System.out.println("Hall capacity Must Be at least avaliable for 10 people");
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
        
        System.out.println("Pleas enter event type you want to host. If yes please enter Y/y, N/n for No. ");
        //String hallEvents = input.nextLine();
        boolean anniversary = false;
        boolean birthday = false;
        boolean weddingCeremony = false;
        boolean weddingReception = false;
        validation = true;
        
        while(validation == true)
        {
            System.out.println("The hall with event type anniversary? (y/n)");
            String a = input.nextLine();
            while(!a.toLowerCase().matches("[yn]"))
            {
                System.out.println("Error! you can only type in Y/y to add anniversary or N/n to no anniversary event");
                System.out.println("Please enter again:");
                a = input.nextLine();
            }
            
            System.out.println("The hall with event type birthday? (y/n)");
            String b = input.nextLine();
            while(!b.toLowerCase().matches("[yn]"))
            {
                System.out.println("Error! you can only type in Y/y to add birthday or N/n to no birthday event");
                System.out.println("Please enter again:");
                b = input.nextLine();
            }
            
            System.out.println("The hall with event type Wedding Ceremony? (y/n)");
            String c = input.nextLine();
            while(!c.toLowerCase().matches("[yn]"))
            {
                System.out.println("Error! you can only type in Y/y to add Wedding Ceremony or N/n to no Wedding Ceremony event");
                System.out.println("Please enter again:");
                c = input.nextLine();
            }
            
            System.out.println("The hall with event type Wedding Reception? (y/n)");
            String r = input.nextLine();
            while(!r.toLowerCase().matches("[yn]"))
            {
                System.out.println("Error! you can only type in Y/y to add Wedding Reception or N/n to no Wedding Reception event");
                System.out.println("Please enter again:");
                r = input.nextLine();
            }
            
            if(a.toLowerCase().equals("y"))
            {
                anniversary = true;
            }
            
            if(b.toLowerCase().equals("y"))
            {
                birthday = true;
            }
            
            if(c.toLowerCase().equals("y"))
            {
                weddingCeremony = true;
            }
            
            if(r.toLowerCase().equals("y"))
            {
                weddingReception = true;
            }
            validation = false;
            if(a.toLowerCase().equals("n") && b.toLowerCase().equals("n") && c.toLowerCase().equals("n") && r.toLowerCase().equals("n"))
            {
                System.out.println("Error! you need at least one event type! Please add the event types again:");
                validation = true;
            }
        }
        
        boolean catering = false;
        String menuDesc = "";
        System.out.println("Do you want to add catering service to the hall?(y/n)");
        String cateringOption = input.nextLine();
        while(!cateringOption.toLowerCase().matches("[yn]"))
        {
            System.out.println("Error! you can only type in Y/y to add catering service to hall or N/n for no");
            System.out.println("Please enter again:");
            cateringOption = input.nextLine();
        }
        
        if(cateringOption.toLowerCase().equals("y"))
        {
            catering = true;
            System.out.println("Please enter the menu information into next line:");
            menuDesc = input.nextLine();
            while(menuDesc.trim().length() < 10)
            {
                System.out.println("You must enter something for the menu! Please enter again");
                menuDesc = input.nextLine();
            }
        }
        
        boolean photography = false;
        System.out.println("Do you want to add photography service to the hall?(y/n)");
        String photoOption = input.nextLine();
        while(!photoOption.toLowerCase().matches("[yn]"))
        {
            System.out.println("Error! you can only type in Y/y to add photography service to hall or N/n for no");
            System.out.println("Please enter again:");
            photoOption = input.nextLine();
        }
        
        if(photoOption.toLowerCase().equals("y"))
        {
            photography = true;
        }
        
        System.out.println("Are you sure you want to add this hall information? Please enter Y/y for yes, N/n for No");
        confirm = input.nextLine();
        
        while(!confirm.toLowerCase().matches("[yn]"))
        {
            System.out.println("Error! you can only type in Y/y to confirm or N/n to go back");
            confirm = input.nextLine();
        }
        
        if(confirm.toLowerCase().equals("y") && type.equals("c"))
        {
            System.out.println("Hall has been added in successfully! ");
            bookCont.setHall(index,hallOwnerEmail, hallName, hallAddress, hallCapacity, hallPrice, anniversary, birthday, weddingCeremony,
                                weddingReception, catering, menuDesc, photography);
        }
        
        //need create new edit function
        if(confirm.toLowerCase().equals("y") && type.equals("e"))
        {
            System.out.println("Hall has been edited successfully! ");
            bookCont.setHall(index,hallOwnerEmail, hallName, hallAddress, hallCapacity, hallPrice, anniversary, birthday, weddingCeremony,
                                weddingReception, catering, menuDesc, photography);
        }
        
        if(confirm.toLowerCase().equals("n"))
        {
            resetPage();
        }
        
    }
    
    /**
     * #36
     * option of home page
     */      
    public void start()
    {
        while(mainOption != 4)
        {
            resetOption();
            
            mainMenu();
            mainOption = inputNumber();

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
    
    private int inputNumber()
    {
        Scanner input = new Scanner(System.in);
        boolean validation = true;
        int option = -1;
        do
        {
            try
            {
                option = Integer.parseInt(input.nextLine());
                validation = false;
            }
            catch(Exception e)
            {
                System.out.println("You are ONLY ALLOW input a NUMBER here!");
                System.out.println("Please Enter Your Choice:");
            }
        }while(validation == true);
        
        return option;
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
