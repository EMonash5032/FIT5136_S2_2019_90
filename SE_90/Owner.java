
/**
 * The Owner Class is responsible for the most basic functions of the owner account
 * for the PrimeEvents system. It is used by the OwnerController Class
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
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

    /**
     * Method responsible for setting all owner data at once
     */
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
     * Mutator method for Owner's First name
     */
    public void setOwnerFirstName(String ownerFirstName)
    {
        this.ownerFirstName = ownerFirstName;
    }
    
    /**
     * Mutator method for Owner's last name
     */
    public void setOwnerLastName(String ownerLastName)
    {
        this.ownerLastName = ownerLastName;
    }
    
    /**
     * Mutator method for Owner Email (login)
     */
    public void setOwnerEmail(String ownerEmail)
    {
        this.ownerEmail = ownerEmail;
    }
    
    /**
     * Mutator method for Owner Address
     */
    public void setOwnerAddress(String ownerAddress)
    {
        this.ownerAddress = ownerAddress;
    }
    
    /**
     * Mutator method for owner password
     */
    public void setOwnerPassword(String ownerPassword)
    {
        this.ownerPassword = ownerPassword;
    }
    
    /**
     * Mutator method for owner phone number
     */
    public void setOwnerPhone(String ownerPhone)
    {
        this.ownerPhone = ownerPhone;
    }
    
    /**
     * Mutator method for owner secret question 1
     */
    public void setOwnerQuestion1(String ownerQuestion1)
    {
        this.ownerQuestion1 = ownerQuestion1;
    }
    
    /**
     * Mutator method for owner secret answer 1
     */
    public void setOwnerAnswer1(String ownerAnswer1)
    {
        this.ownerAnswer1 = ownerAnswer1;
    }
    
    /**
     * Mutator method for owner secret question 2
     */
    public void setOwnerQuestion2(String ownerQuestion2)
    {
        this.ownerQuestion2 = ownerQuestion2;
    }
    
    /**
     * #Mutator method for owner secret answer 2
     */
    public void setOwnerAnswer2(String ownerAnswer2)
    {
        this.ownerAnswer2 = ownerAnswer2;
    }
    
    /**
     * Accessor method for owner first name 
     */
    public String getOwnerFirstName()
    {
        return ownerFirstName;
    }
    
    /**
     * Accessor method for owner last name
     */
    public String getOwnerLastName()
    {
        return ownerLastName;
    }
    
    /**
     * Accessor method for owner email
     */
    public String getOwnerEmail()
    {
        return ownerEmail;
    }
    
    /**
     * Accessor method for owner address
     */
    public String getOwnerAddress()
    {
        return ownerAddress;
    }
    
    /**
     * Accessor method for owner pasword
     */
    public String getOwnerPassword()
    {
        return ownerPassword;
    }
    
    /**
     * Accessor method for owner phone number
     */
    public String getOwnerPhone()
    {
        return ownerPhone;
    }
    
    /**
     * Accessor method for owner secret question 1
     */
    public String getOwnerQuestion1()
    {
        return ownerQuestion1;
    }
    
    /**
     * Accessor method for owner secret answer 1
     */
    public String getOwnerAnswer1()
    {
        return ownerAnswer1;
    }
    
    /**
     * Accessor method for owner secret question 2
     */
    public String getOwnerQuestion2()
    {
        return ownerQuestion2;
    }
    
    /**
     * Accessor method for owner secret answer 2
     */
    public String getOwnerAnswer2()
    {
        return ownerAnswer2;
    }
    

}