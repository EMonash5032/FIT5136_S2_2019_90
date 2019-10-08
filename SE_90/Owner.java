
/**
 * Write a description of class Owner here.
 *
 * @author Team 90
 * @version 09 September 2019
 */
public class Owner
{
    // instance variables - replace the example below with your own
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerEmail;
    private String ownerAddress;
    private String ownerPassword;
    private String ownerPhone;
    private String ownerQuestion1;
    private String ownerAnswer1;
    private String ownerQuestion2;
    private String ownerAnswer2;
    
    
    /**
     * Constructor for objects of class Owner
     */
    public Owner()
    {
        // initialise instance variables
        ownerFirstName = "????";
        ownerLastName = "????";
        ownerEmail = "????";
        ownerAddress = "????";
        ownerPassword = "????";
        ownerPhone = "????";
        ownerQuestion1 = "????";
        ownerAnswer1 = "????";
        ownerQuestion2 = "????";
        ownerAnswer2 = "????";

    }

    public Owner(String ownerFirstName, String ownerLastName, String ownerEmail, String ownerAddress, String ownerPassword, String ownerPhone, String ownerQuestion1, String ownerAnswer1, String ownerQuestion2, String ownerAnswer2)
    {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.ownerEmail = ownerEmail;
        this.ownerAddress = ownerAddress;
        this.ownerPassword = ownerPassword;
        this.ownerPhone = ownerPhone;
        this.ownerQuestion1 = ownerQuestion1;
        this.ownerAnswer1 = ownerAnswer1;
        this.ownerQuestion2 = ownerQuestion2;
        this.ownerAnswer2 = ownerAnswer2;
    }
    
    /**
     * #1
     */
    public void setOwnerFirstName(String ownerFirstName)
    {
        this.ownerFirstName = ownerFirstName;
    }
    
    /**
     * #2
     */
    public void setOwnerLastName(String ownerLastName)
    {
        this.ownerLastName = ownerLastName;
    }
    
    /**
     * #3
     */
    public void setOwnerEmail(String ownerEmail)
    {
        this.ownerEmail = ownerEmail;
    }
    
    /**
     * #4
     */
    public void setOwnerAddress(String ownerAddress)
    {
        this.ownerAddress = ownerAddress;
    }
    
    /**
     * #5
     */
    public void setOwnerPassword(String ownerPassword)
    {
        this.ownerPassword = ownerPassword;
    }
    
    /**
     * #6
     */
    public void setOwnerPhone(String ownerPhone)
    {
        this.ownerPhone = ownerPhone;
    }
    
    /**
     * #7
     */
    public void setOwnerQuestion1(String ownerQuestion1)
    {
        this.ownerQuestion1 = ownerQuestion1;
    }
    
    /**
     * #8
     */
    public void setOwnerAnswer1(String ownerAnswer1)
    {
        this.ownerAnswer1 = ownerAnswer1;
    }
    
    /**
     * #9
     */
    public void setOwnerQuestion2(String ownerQuestion2)
    {
        this.ownerQuestion2 = ownerQuestion2;
    }
    
    /**
     * #10
     */
    public void setOwnerAnswer2(String ownerAnswer2)
    {
        this.ownerAnswer2 = ownerAnswer2;
    }
    
    /**
     * #11
     */
    public String getOwnerFirstName()
    {
        return ownerFirstName;
    }
    
    /**
     * #12
     */
    public String getOwnerLastName()
    {
        return ownerLastName;
    }
    
    /**
     * #13
     */
    public String getOwnerEmail()
    {
        return ownerEmail;
    }
    
    /**
     * #14
     */
    public String getOwnerAddress()
    {
        return ownerAddress;
    }
    
    /**
     * #15
     */
    public String getOwnerPassword()
    {
        return ownerPassword;
    }
    
    /**
     * #16
     */
    public String getOwnerPhone()
    {
        return ownerPhone;
    }
    
    /**
     * #17
     */
    public String getOwnerQuestion1()
    {
        return ownerQuestion1;
    }
    
    /**
     * #18
     */
    public String getOwnerAnswer1()
    {
        return ownerAnswer1;
    }
    
    /**
     * #19
     */
    public String getOwnerQuestion2()
    {
        return ownerQuestion2;
    }
    
    /**
     * #20
     */
    public String getOwnerAnswer2()
    {
        return ownerAnswer2;
    }
    

}