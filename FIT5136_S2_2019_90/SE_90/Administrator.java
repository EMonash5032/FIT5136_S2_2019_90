
/**
 * Write a description of class Administrator here.
 *
 * @author Jialiang Wu && Yuekai Huang
 * @version 10 September 2019
 */
public class Administrator
{
    // instance variables - replace the example below with your own
    private String email;
    private String password;

    /**
     * Constructor for objects of class Administrator
     */
    public Administrator()
    {
        // initialise instance variables
        email = "admin@gmail.com";
        password = "admin";
    }
    
    public Administrator(String email, String password)
    {
        this.email = email;
        this.password = password;
    }
    
    /**
     * #1
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * #2
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * #3
     */
    public void setEmail()
    {
        this.email = email;
    }
    
    /**
     * #4
     */
    public void setPassword()
    {
        this.password = password;
    }
}
