
/**
 * The Administrator class is responsible for the most basic administrator actions for the
 * PrimeEvents System. It is used by the AdminController Class
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 */
public class Administrator
{
    // instance variables - replace the example below with your own
    private String adminEmail;
    private String adminPassword;

    /**
     * Constructor for objects of class Administrator
     */
    public Administrator()
    {
        // initialise instance variables
        adminEmail = "admin@gmail.com";
        adminPassword = "admin";
    }
    
    /**
     * Responsible for setting both Administrator Email and password at once 
     */
    public Administrator(String adminEmail, String adminPassword)
    {
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }
    
    /**
     * Accessor method for Administrator Email
     */
    public String getAdminEmail()
    {
        return adminEmail;
    }
    
    /**
     * Accessor method for Administrator password
     */
    public String getAdminPassword()
    {
        return adminPassword;
    }
    
    /**
     * Mutator method for Administrator Email
     */
    public void setAdminEmail()
    {
        this.adminEmail = adminEmail;
    }
    
    /**
     * Mutator method Administrator Password
     */
    public void setPassword()
    {
        this.adminPassword = adminPassword;
    }
}
