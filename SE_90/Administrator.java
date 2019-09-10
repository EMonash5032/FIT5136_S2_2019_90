
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
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setEmail()
    {
        this.email = email;
    }
    
    public void setPassword()
    {
        this.password = password;
    }
}
