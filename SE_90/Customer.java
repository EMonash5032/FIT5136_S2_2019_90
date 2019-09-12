
/**
 * Write a description of class Customer here.
 *
 * @author Jialiang Wu, Yuekai Huang
 * @version 09 September 2019
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String password;
    private String phone;
    private String question1;
    private String answer1;
    private String question2;
    private String answer2;
    private boolean isConcession;
    private Quotation quota;
    private Quotation[] quotas;
    
    private Booking[] book;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
        firstName = "????";
        lastName = "????";
        email = "????";
        address = "????";
        password = "????";
        phone = "????";
        question1 = "????";
        answer1 = "????";
        question2 = "????";
        answer2 = "????";
        isConcession = false;
        
        int bookingID = 99999;
        book = new Booking[bookingID];
        for(int index = 0; index < bookingID; index++)
        {
            book[index] = new Booking("????","????","????","????","????", -0.01, -0.01, -0.01);
        }
    }
    
    public Customer(String firstName, String lastName, String email, String address, String password, String phone, String question1, String answer1, String question2, String answer2, boolean isConcession)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.question1 = question1;
        this.answer1 = answer1;
        this.question2 = question2;
        this.answer2 = answer2;
        this.isConcession = isConcession;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public void setQuestion1(String question1)
    {
        this.question1 = question1;
    }
    
    public void setAnswer1(String answer1)
    {
        this.answer1 = answer1;
    }
    
    public void setQuestion2(String question2)
    {
        this.question2 = question2;
    }
    
    public void setAnswer2(String answer2)
    {
        this.answer2 = answer2;
    }
    
    public void setIsConcession(boolean isConcession)
    {
        this.isConcession = isConcession;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public String getQuestion1()
    {
        return question1;
    }
    
    public String getAnswer1()
    {
        return answer1;
    }
    
    public String getQuestion2()
    {
        return question2;
    }
    
    public String getAnswer2()
    {
        return answer2;
    }
    
    public boolean getIsConcession()
    {
        return isConcession;
    }
    
    public void quotationInfo(int index)
    {
        String hallName = quota.getHalls(index).getHallName();
        String hallAddress = quota.getHalls(index).getHallAddress();
        int hallCapacity = quota.getHalls(index).getHallCapacity();
        double hallPrice = quota.getHalls(index).getHallPrice();
        String hallEvents = quota.getHalls(index).getHallEvents();
        
        System.out.println("Youe Quotation is");
        System.out.println("Hall Name: " + hallName);
        System.out.println(" Address: " + hallAddress);
        System.out.println(" Capacity: " + hallCapacity);
        System.out.println(" Pirce: $" + hallPrice);
        System.out.println(" Events Type: " + hallEvents + "\r\n");
    }
    
    public void view(int inputIndex)
    {
        System.out.println("This is View Halls");
        
        //System.out.println("Select the hall number " + (inputIndex + 1) + ": ");
        //System.out.println("Hall Name: " + halls[inputIndex].getHallName());
        //System.out.println(" Address: " + halls[inputIndex].getHallAddress());
        //System.out.println(" Capacity: " + halls[inputIndex].getHallCapacity());
        //System.out.println(" Pirce: " + halls[inputIndex].getHallPrice());
        //System.out.println(" Events Type: " + halls[inputIndex].getHallEvents() + "\r\n");
        
        System.out.println("Please Enter 'y' or 'n'");
    }
    
    public Booking[] getAllBook()
    {
        return book;
    }
    
    public Booking getBook(int index)
    {
        return book[index];
    }
    
    public void setBook(int index, String firstName, String lastName, String hallName, String eventType, String date, double price, double actualFee, double deposit)
    {
        book[index] = new Booking(firstName, lastName, hallName, eventType, date, price, actualFee, deposit);
    }
    
    public void displayBook(int inputIndex)
    {
        System.out.println("The Booking reference " + (inputIndex + 1) + ": ");
        System.out.println("Hall Name: " + book[inputIndex].getHallName());
        System.out.println("  Event Types: " + book[inputIndex].getEventType());
        System.out.println("  Hall Price: " + book[inputIndex].getPrice());
        System.out.println("  Acutal Cost: " + book[inputIndex].getActualFee());
        System.out.println("  Deposit: " + book[inputIndex].getDeposit() + "\r\n");
    }
}