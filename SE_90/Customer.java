
/**
 * Write a description of class Customer here.
 *
 * @author Jialiang Wu
 * @version 09 September 2019
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String password;
    private String phone;
    private String concessions;

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
        firstName = "";
        lastName = "";
        email = "";
        address = "";
        password = "";
        phone = "";
        concessions = "";
    }
    
    public Customer(String newFirstName, String newLastName, String newEmail, String newAddress, String newPassword, String newPhone, String newConcessions)
    {
        firstName = newFirstName;
        lastName = newLastName;
        email = newEmail;
        address = newAddress;
        password = newPassword;
        phone = newPhone;
        concessions = newConcessions;
    }
    
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    
    public void setPassword(String newPassword)
    {
        password = newPassword;
    }
    
    public void setPhone(String newPhone)
    {
        phone = newPhone;
    }
    
    public void setConcessions(String newConcessions)
    {
        concessions = newConcessions;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public String getConcessions()
    {
        return concessions;
    }
}