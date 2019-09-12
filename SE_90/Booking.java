
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

    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getHallName()
    {
        return hallName;
    }
    
    public String getEventType()
    {
        return eventType;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public double getActualFee()
    {
        return actualFee;
    }
    
    public double getDeposit()
    {
        return deposit;
    }   
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setHallName(String hallName)
    {
        this.hallName = hallName;
    }

    public void setEventType(String eventType)
    {
        this.eventType = eventType;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }

    public void setPrice(double price)
    {
        this.price = price;
    } 
    
    public void setActualFee(double actualFee)
    {
        this.actualFee = actualFee;
    }

    public void setDeposit(double deposit)
    {
        this.deposit = deposit;
    }    
}
