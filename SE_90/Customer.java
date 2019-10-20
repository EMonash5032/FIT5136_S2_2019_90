

/**
 * The Customer Class is responsible for the most basic functions for the owner account
 * for the PrimeEvents system. This class is used by the CustomerController Class
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String cusFirstName;
    private String cusLastName;
    private String cusEmail;
    private String cusAddress;
    private String cusPassword;
    private String cusPhone;
    private String cusQuestion1;
    private String cusAnswer1;
    private String cusQuestion2;
    private String cusAnswer2;
    private boolean cusIsConcession;

    
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
        cusFirstName = "????";
        cusLastName = "????";
        cusEmail = "????";
        cusAddress = "????";
        cusPassword = "????";
        cusPhone = "????";
        cusQuestion1 = "????";
        cusAnswer1 = "????";
        cusQuestion2 = "????";
        cusAnswer2 = "????";
        cusIsConcession = false;
        

    }
    
    /**
     * Method to set customer details all at once (upon account creation)
     */
    public Customer(String cusFirstName, String cusLastName, String cusEmail, String cusAddress, String cusPassword, String cusPhone, String cusQuestion1, String cusAnswer1, String cusQuestion2, String cusAnswer2, boolean cusIsConcession)
    {
        this.cusFirstName = cusFirstName;
        this.cusLastName = cusLastName;
        this.cusEmail = cusEmail;
        this.cusAddress = cusAddress;
        this.cusPassword = cusPassword;
        this.cusPhone = cusPhone;
        this.cusQuestion1 = cusQuestion1;
        this.cusAnswer1 = cusAnswer1;
        this.cusQuestion2 = cusQuestion2;
        this.cusAnswer2 = cusAnswer2;
        this.cusIsConcession = cusIsConcession;
    }
    
    /**
     * Mutator method for Customer First name
     */
    public void setCusFirstName(String cusFirstName)
    {
        this.cusFirstName = cusFirstName;
    }
    
    /**
     * Mutator method for Customer Last Name
     */
    public void setCusLastName(String cusLastName)
    {
        this.cusLastName = cusLastName;
    }
    
    /**
     * Mutator method for Customer Email
     */
    public void setCusEmail(String cusEmail)
    {
        this.cusEmail = cusEmail;
    }
    
    /**
     * Mutator method for Customer Address
     */
    public void setCusAddress(String cusAddress)
    {
        this.cusAddress = cusAddress;
    }
    
    /**
     * Mutator method for Customer Password
     */
    public void setCusPassword(String cusPassword)
    {
        this.cusPassword = cusPassword;
    }
    
    /**
     * Mutator method for Customer Phone number
     */
    public void setCusPhone(String cusPhone)
    {
        this.cusPhone = cusPhone;
    }
    
    /**
     * Mutator method for Customer secret question 1
     */
    public void setCusQuestion1(String cusQuestion1)
    {
        this.cusQuestion1 = cusQuestion1;
    }
    
    /**
     * Mutator method for Customer secret answer 1
     */
    public void setCusAnswer1(String cusAnswer1)
    {
        this.cusAnswer1 = cusAnswer1;
    }
    
    /**
     * Mutator method for Customer secret question 2
     */
    public void setCusQuestion2(String cusQuestion2)
    {
        this.cusQuestion2 = cusQuestion2;
    }
    
    /**
     * Mutator method for Customer secret answer 2
     */
    public void setCusAnswer2(String cusAnswer2)
    {
        this.cusAnswer2 = cusAnswer2;
    }
    
    /**
     * Mutator method for Customer if they are concession and/or veteran - for discount purposes
     */
    public void setCusIsConcession(boolean cusIsConcession)
    {
        this.cusIsConcession = cusIsConcession;
    }
    
    /**
     * Accessor method for Customer First name
     */
    public String getCusFirstName()
    {
        return cusFirstName;
    }
    
    /**
     * Accessor method for Customer last name
     */
    public String getCusLastName()
    {
        return cusLastName;
    }
    
    /**
     * Accessor method for Customer email address
     */
    public String getCusEmail()
    {
        return cusEmail;
    }
    
    /**
     * Accessor method for Customer address
     */
    public String getCusAddress()
    {
        return cusAddress;
    }
    
    /**
     * Accessor method for Customer password
     */
    public String getCusPassword()
    {
        return cusPassword;
    }
    
    /**
     * Accessor method for Customer phone number
     */
    public String getCusPhone()
    {
        return cusPhone;
    }
    
    /**
     * Accessor method for Customer secret question 1
     */
    public String getCusQuestion1()
    {
        return cusQuestion1;
    }
    
    /**
     * Accessor method for Customer secret answer 1
     */
    public String getCusAnswer1()
    {
        return cusAnswer1;
    }
    
    /**
     * Accessor method for Customer secret question 2
     */
    public String getCusQuestion2()
    {
        return cusQuestion2;
    }
    
    /**
     * Accessor method for Customer secret answer 2
     */
    public String getCusAnswer2()
    {
        return cusAnswer2;
    }
    
    /**
     * Accessor method for Customer whether they are concession and/or veteran - for discount purposes
     */
    public boolean getCusIsConcession()
    {
        return cusIsConcession;
    }
    

}