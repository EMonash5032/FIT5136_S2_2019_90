
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
    
    public String getHallOwnerFirstName()
    {
        return hallOwnerFirstName;
    }
    
    public String getHallOwnerLastName()
    {
        return hallOwnerLastName;
    }
    
    public String getHallName()
    {
        return hallName;
    }
    
    public String getHallAddress()
    {
        return hallAddress;
    }
    
    public int getHallCapacity()
    {
        return hallCapacity;
    }
    
    public double getHallPrice()
    {
        return hallPrice;
    }
    
    public String getHallEvents()
    {
        return hallEvents;
    }
    
    public void setHallOwnerFirstName()
    {
        this.hallOwnerFirstName = hallOwnerFirstName;
    }
    
    public void setHallOwnerLastName()
    {
        this.hallOwnerLastName = hallOwnerLastName;
    }
    
    public void setHallName(String name)
    {
        this.hallName = hallName;
    }
    
    public void setHallAddress(String hallAddress)
    {
        this.hallAddress = hallAddress;
    }
    
    public void setHallCapacity(int hallCapacity)
    {
        this.hallCapacity = hallCapacity;
    }
    
    public void setHallPrice(double hallPrice)
    {
        this.hallPrice = hallPrice;
    }
    
    public void setHallEvents(String hallEvents)
    {
        this.hallEvents = hallEvents;
    }
    
}
