

/**
 * Write a description of class Customer here.
 *
 * @author Team 90
 * @version 09 September 2019
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
     * #1
     */
    public void setCusFirstName(String cusFirstName)
    {
        this.cusFirstName = cusFirstName;
    }
    
    /**
     * #2
     */
    public void setCusLastName(String cusLastName)
    {
        this.cusLastName = cusLastName;
    }
    
    /**
     * #3
     */
    public void setCusEmail(String cusEmail)
    {
        this.cusEmail = cusEmail;
    }
    
    /**
     * #4
     */
    public void setCusAddress(String cusAddress)
    {
        this.cusAddress = cusAddress;
    }
    
    /**
     * #5
     */
    public void setCusPassword(String cusPassword)
    {
        this.cusPassword = cusPassword;
    }
    
    /**
     * #6
     */
    public void setCusPhone(String cusPhone)
    {
        this.cusPhone = cusPhone;
    }
    
    /**
     * #7
     */
    public void setCusQuestion1(String cusQuestion1)
    {
        this.cusQuestion1 = cusQuestion1;
    }
    
    /**
     * #8
     */
    public void setCusAnswer1(String cusAnswer1)
    {
        this.cusAnswer1 = cusAnswer1;
    }
    
    /**
     * #9
     */
    public void setCusQuestion2(String cusQuestion2)
    {
        this.cusQuestion2 = cusQuestion2;
    }
    
    /**
     * #10
     */
    public void setCusAnswer2(String cusAnswer2)
    {
        this.cusAnswer2 = cusAnswer2;
    }
    
    /**
     * #11
     */
    public void setCusIsConcession(boolean cusIsConcession)
    {
        this.cusIsConcession = cusIsConcession;
    }
    
    /**
     * #12
     */
    public String getCusFirstName()
    {
        return cusFirstName;
    }
    
    /**
     * #13
     */
    public String getCusLastName()
    {
        return cusLastName;
    }
    
    /**
     * #14
     */
    public String getCusEmail()
    {
        return cusEmail;
    }
    
    /**
     * #15
     */
    public String getCusAddress()
    {
        return cusAddress;
    }
    
    /**
     * #16
     */
    public String getCusPassword()
    {
        return cusPassword;
    }
    
    /**
     * #17
     */
    public String getCusPhone()
    {
        return cusPhone;
    }
    
    /**
     * #18
     */
    public String getCusQuestion1()
    {
        return cusQuestion1;
    }
    
    /**
     * #19
     */
    public String getCusAnswer1()
    {
        return cusAnswer1;
    }
    
    /**
     * #20
     */
    public String getCusQuestion2()
    {
        return cusQuestion2;
    }
    
    /**
     * #21
     */
    public String getCusAnswer2()
    {
        return cusAnswer2;
    }
    
    /**
     * #22
     */
    public boolean getCusIsConcession()
    {
        return cusIsConcession;
    }
    

}