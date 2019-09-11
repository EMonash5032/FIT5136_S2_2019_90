
/**
 * Write a description of class Customer here.
 *
 * @author Jialiang Wu, Yuekai Huang
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
    private String question1;
    private String answer1;
    private String question2;
    private String answer2;
    private boolean isConcession;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
        firstName = "????";
        lastName = "????";
        email = "????";
        address = "????";
        password = "????";
        phone = "????";
        question1 = "????";
        answer1 = "????";
        question2 = "????";
        answer2 = "????";
        isConcession = false;
    }
    
    public Customer(String firstName, String lastName, String email, String address, String password, String phone, String question1, String answer1, String question2, String answer2, boolean isConcession)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.question1 = question1;
        this.answer1 = answer1;
        this.question2 = question2;
        this.answer2 = answer2;
        this.isConcession = isConcession;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public void setQuestion1(String question1)
    {
        this.question1 = question1;
    }
    
    public void setAnswer1(String answer1)
    {
        this.answer1 = answer1;
    }
    
    public void setQuestion2(String question2)
    {
        this.question2 = question2;
    }
    
    public void setAnswer2(String answer2)
    {
        this.answer2 = answer2;
    }
    
    public void setIsConcession(boolean isConcession)
    {
        this.isConcession = isConcession;
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
    
    public String getQuestion1()
    {
        return question1;
    }
    
    public String getAnswer1()
    {
        return answer1;
    }
    
    public String getQuestion2()
    {
        return question2;
    }
    
    public String getAnswer2()
    {
        return answer2;
    }
    
    public boolean getIsConcession()
    {
        return isConcession;
    }
}