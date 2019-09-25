
/**
 * Write a description of class Booking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Booking
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String hallName;
    private String eventType;
    private String date;
    private double price;
    private double actualFee;
    private double deposit;
    
    /**
     * Constructor for objects of class Booking
     */
    public Booking()
    {
        // initialise instance variables
        firstName = "????";
        lastName = "????";
        hallName = "????";
        eventType = "????";
        date = "????";
        price = -0.01;
        actualFee = -0.01;
        deposit = -0.01;
    }
    
    public Booking(String firstName, String lastName, String hallName, String eventType, String date, double price, double actualFee, double deposit)
    {
        // initialise instance variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.hallName = hallName;
        this.eventType = eventType;
        this.date = date;
        this.price = price;
        this.actualFee = actualFee;
        this.deposit = deposit;
    }

    /**
     * #1
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * #2
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * #3
     */
    public String getHallName()
    {
        return hallName;
    }
    
    /**
     * #4
     */
    public String getEventType()
    {
        return eventType;
    }
    
    /**
     * #5
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * #6
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * #7
     */
    public double getActualFee()
    {
        return actualFee;
    }
    
    /**
     * #8
     */
    public double getDeposit()
    {
        return deposit;
    }   
    
    /**
     * #9
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    /**
     * #10
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    /**
     * #11
     */
    public void setHallName(String hallName)
    {
        this.hallName = hallName;
    }

    /**
     * #12
     */
    public void setEventType(String eventType)
    {
        this.eventType = eventType;
    }
    
    /**
     * #13
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    /**
     * #14
     */
    public void setPrice(double price)
    {
        this.price = price;
    } 
    
    /**
     * #15
     */
    public void setActualFee(double actualFee)
    {
        this.actualFee = actualFee;
    }

    /**
     * #16
     */
    public void setDeposit(double deposit)
    {
        this.deposit = deposit;
    }    
}
