
/**
 * Write a description of class Hall here.
 *
 * @author Team 90
 * @version (10.09.2019)
 */
public class Hall
{
    // instance variables - replace the example below with your own
    private String hallOwnerEmail;
    private String hallName;
    private String hallAddress;
    private int hallCapacity;
    private double hallPrice;
    private String hallEvents;

    /**
     * Constructor for objects of class Hall
     */
    public Hall()
    {
        // initialise instance variables
        hallOwnerEmail = "????";
        hallName = "????";
        hallAddress = "????";
        hallCapacity = -1;
        hallPrice = -0.01;
        hallEvents = "????";
    }
    
    public Hall(String hallOwnerEmail, String hallName, String hallAddress, int hallCapacity, double hallPrice, String hallEvents)
    {
        this.hallOwnerEmail = hallOwnerEmail;
        this.hallName = hallName;
        this.hallAddress = hallAddress;
        this.hallCapacity = hallCapacity;
        this.hallPrice = hallPrice;
        this.hallEvents = hallEvents;
    }

    /**
     * #1
     * display method for display hall 
     */
    public void display(String hallName, String hallAddress, int hallCapacity, double hallPrice, String hallEvents)
    {
         System.out.println("Hall Name: " + hallName);
         System.out.println("Hall Address: " + hallAddress);
         System.out.println("Hall Capacity: " + hallCapacity);
         System.out.println("Hall Price: " + hallPrice);
         System.out.println("Hall Events Type: " + hallEvents);
    }
    
    /**
     * #3
     */
    public String getHallOwnerEmail()
    {
        return hallOwnerEmail;
    }
    
    /**
     * #4
     */
    public String getHallName()
    {
        return hallName;
    }
    
    /**
     * #5
     */
    public String getHallAddress()
    {
        return hallAddress;
    }
    
    /**
     * #6
     */
    public int getHallCapacity()
    {
        return hallCapacity;
    }
    
    /**
     * #7
     */
    public double getHallPrice()
    {
        return hallPrice;
    }
    
    /**
     * #8
     */
    public String getHallEvents()
    {
        return hallEvents;
    }

    /**
     * #10
     */
    public void setHallOwnerEmail(String hallOwnerEmail)
    {
        this.hallOwnerEmail = hallOwnerEmail;
    }
    
    /**
     * #11
     */
    public void setHallName(String name)
    {
        this.hallName = hallName;
    }
    
    /**
     * #12
     */
    public void setHallAddress(String hallAddress)
    {
        this.hallAddress = hallAddress;
    }
    
    /**
     * #13
     */
    public void setHallCapacity(int hallCapacity)
    {
        this.hallCapacity = hallCapacity;
    }
    
    /**
     * #14
     */
    public void setHallPrice(double hallPrice)
    {
        this.hallPrice = hallPrice;
    }
    
    /**
     * #15
     */
    public void setHallEvents(String hallEvents)
    {
        this.hallEvents = hallEvents;
    }
    
}
