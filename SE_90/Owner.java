
/**
 * Write a description of class Owner here.
 *
 * @author Team 90
 * @version 09 September 2019
 */
public class Owner
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
    
    
    /**
     * Constructor for objects of class Owner
     */
    public Owner()
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

    }

    public Owner(String firstName, String lastName, String email, String address, String password, String phone, String question1, String answer1, String question2, String answer2)
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
    }
    
    /**
     * #1
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    /**
     * #2
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    /**
     * #3
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * #4
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /**
     * #5
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * #6
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    /**
     * #7
     */
    public void setQuestion1(String question1)
    {
        this.question1 = question1;
    }
    
    /**
     * #8
     */
    public void setAnswer1(String answer1)
    {
        this.answer1 = answer1;
    }
    
    /**
     * #9
     */
    public void setQuestion2(String question2)
    {
        this.question2 = question2;
    }
    
    /**
     * #10
     */
    public void setAnswer2(String answer2)
    {
        this.answer2 = answer2;
    }
    
    /**
     * #11
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * #12
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * #13
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * #14
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * #15
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * #16
     */
    public String getPhone()
    {
        return phone;
    }
    
    /**
     * #17
     */
    public String getQuestion1()
    {
        return question1;
    }
    
    /**
     * #18
     */
    public String getAnswer1()
    {
        return answer1;
    }
    
    /**
     * #19
     */
    public String getQuestion2()
    {
        return question2;
    }
    
    /**
     * #20
     */
    public String getAnswer2()
    {
        return answer2;
    }
    

}