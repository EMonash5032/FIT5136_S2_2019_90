
/**
 * Write a description of class Administrator here.
 *
 * @author Jialiang Wu
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
        email = "";
        password = "";
    }
    
    public Administrator(String newEmail, String newPassword)
    {
        email = newEmail;
        password = newPassword;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPassword()
    {
        return password;
    }
}
