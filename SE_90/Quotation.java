
/**
 * Write a description of class Quotation here.
 *
 * @author (Team 90)
 * @version (a version number or a date)
 */
public class Quotation
{
    // instance variables - replace the example below with your own
    private String quotationNo;   //display
    private String customerFirstName;  //display
    private String customerLastName;  //display
    private String hallName;  //display
    private int hallNumber;
    private int eventChoice;   //display event type
    private int numberPeople;  //display
    private String date;    //display
    private boolean catering;  //boolean display if true for Yes &...
    private int caterChoice;// there is a list that customer could make option on the catering
    private boolean photo;     //boolean display if true for Yes &...
    private double totalPrice; //display
    
    
    /**
     * Constructor for objects of class Quotation
     */
    public Quotation()
    {
        // initialise instance variables
        quotationNo = "????";  
        customerFirstName = "????";  
        customerLastName = "????";  
        hallName = "????";  
        hallNumber = -1;
        eventChoice = -1; 
        numberPeople = -1; 
        date = "????";
        catering = false; 
        caterChoice = -1;
        photo = false;  
        totalPrice = -0.01;                
        
    }
    
    public Quotation(String quotationNo,String customerFirstName, String customerLastName, String hallName, int hallNumber, int eventChoice, int numberPeople, String date, boolean catering, int caterChoice, boolean photo, double totalPrice)
    {
        this.quotationNo = quotationNo;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.hallName = hallName;
        this.hallNumber = hallNumber;
        this.eventChoice = eventChoice;  
        this.numberPeople = numberPeople; 
        this.date = date;   
        this.catering = catering;
        this.caterChoice = caterChoice;
        this.photo = photo;     
        this.totalPrice = totalPrice;
    }

    public void setQuotationNo(String quotationNo)
    {
        this.quotationNo = quotationNo;
    }

    public void setCustomerLastName(String customerLastName)
    {
        this.customerLastName = customerLastName;
    }
    
    public void setCustomerFirstName(String customerFirstName)
    {
        this.customerFirstName = customerFirstName;
    }

    public void setHallName(String hallName)
    {
        this.hallName = hallName;
    }
    
    public void setHallNumber(int hallNumber)
    {
        this.hallNumber = hallNumber;
    }

    public void setEventChoice(int eventChoice)
    {
        this.eventChoice = eventChoice;
    }

    public void setNumberPeople(int numberPeople)
    {
        this.numberPeople = numberPeople; 
    }
    
    public void setDate(String date)
    {
        this.date = date;  
    }

    public void setCatering(boolean catering)
    {
        this.catering = catering;
    }
    
    public void setCaterChoice(int caterChoice)
    {
        this.caterChoice = caterChoice;
    }

    public void setPhote(boolean photo)
    {
        this.photo = photo; 
    }
    
    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public String getQuotationNo()
    {
        return quotationNo;
    }
    
    public String getCustomerLastName()
    {
        return customerLastName;
    }
    
    public String getCustomerFirstName()
    {
        return customerFirstName;
    }

    public String getHallName()
    {
        return hallName;
    }
    
    public int getHallNumber()
    {
        return hallNumber;
    }

    public int setEventChoice()
    {
        return eventChoice;
    }

    public int setNumberPeople()
    {
        return numberPeople; 
    }
    
    public String getDate()
    {
        return date;  
    }

    public boolean getCatering()
    {
        return catering;
    }
    
    public int getCaterChoice()
    {
        return caterChoice;
    }

    public boolean getPhote()
    {
        return photo; 
    }
    
    public double setTotalPrice()
    {
        return totalPrice;
    }    
   
}
