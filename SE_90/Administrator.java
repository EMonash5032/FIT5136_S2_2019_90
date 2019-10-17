
/**
 * Write a description of class Administrator here.
 *
 * @author Team 90
 * @version 10 September 2019
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
    
    public Administrator(String adminEmail, String adminPassword)
    {
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }
    
    /**
     * #1
     */
    public String getAdminEmail()
    {
        return adminEmail;
    }
    
    /**
     * #2
     */
    public String getAdminPassword()
    {
        return adminPassword;
    }
    
    /**
     * #3
     */
    public void setAdminEmail()
    {
        this.adminEmail = adminEmail;
    }
    
    /**
     * #4
     */
    public void setPassword()
    {
        this.adminPassword = adminPassword;
    }
}
