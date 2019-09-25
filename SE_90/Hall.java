
/**
 * Write a description of class Hall here.
 *
 * @author (Yuekai Huang)
 * @version (10.09.2019)
 */
public class Hall
{
    // instance variables - replace the example below with your own
    private String hallOwnerFirstName;
    private String hallOwnerLastName;
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
        hallOwnerFirstName = "????";
        hallOwnerLastName = "????";
        hallName = "????";
        hallAddress = "????";
        hallCapacity = -1;
        hallPrice = -0.01;
        hallEvents = "????";
    }
    
    public Hall(String hallOwnerFirstName, String hallOwnerLastName, String hallName, String hallAddress, int hallCapacity, double hallPrice, String hallEvents)
    {
        this.hallOwnerFirstName = hallOwnerFirstName;
        this.hallOwnerLastName = hallOwnerLastName;
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
     * #2
     */
    public String getHallOwnerFirstName()
    {
        return hallOwnerFirstName;
    }
    
    /**
     * #3
     */
    public String getHallOwnerLastName()
    {
        return hallOwnerLastName;
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
     * #9
     */
    public void setHallOwnerFirstName()
    {
        this.hallOwnerFirstName = hallOwnerFirstName;
    }
    
    /**
     * #10
     */
    public void setHallOwnerLastName()
    {
        this.hallOwnerLastName = hallOwnerLastName;
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
