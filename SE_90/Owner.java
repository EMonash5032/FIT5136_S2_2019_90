
/**
 * Write a description of class Owner here.
 *
 * @author Jialiang Wu, Yuekai Huang
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
    
    private Hall[] halls;
    
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
        int totalNumHalls = 99999;
        halls = new Hall[totalNumHalls];
        for(int index = 0; index < totalNumHalls; index++)
        {
            halls[index] = new Hall("????","????","????","????", -1, -0.01, "????");
        }
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
    
    public Hall getHalls(int index)
    {
        return halls[index];
    }
    
    public Hall[] getAllHalls()
    {
        return halls;
    }
    
    public void setHalls(Hall[] halls)
    {
        this.halls = halls;
    }
    
    public void setHall(int index, String hallOwnerFirstName, String hallOwnerLastName, String hallName, String hallAddress, int hallCapacity, double hallPrice, String hallEvents)
    {
        halls[index] = new Hall(hallOwnerFirstName, hallOwnerLastName, hallName, hallAddress, hallCapacity, hallPrice, hallEvents);
    }
    
    public void remove()
    {
        System.out.println("Please select from the following halls that you want to remove: ");
        for(int x = 0; x < halls.length; x++)
        {
            if(!halls[x].getHallName().equals("????"))
            {
                System.out.println("Select the hall number " + (x + 1) + ": ");
                System.out.println("Hall Name: " + halls[x].getHallName());
                System.out.println(" Address: " + halls[x].getHallAddress());
                System.out.println(" Capacity: " + halls[x].getHallCapacity());
                System.out.println(" Pirce: " + halls[x].getHallPrice());
                System.out.println(" Events Type: " + halls[x].getHallEvents() + "\r\n");
                
            }
        }
        System.out.println("Enter Number 0 to exit remove menu");
        System.out.println("Please Enter Hall Number You Want To Remove: ");
    }

    public void displayHalls(int inputIndex)
    {
        System.out.println("The hall number " + (inputIndex + 1) + ": ");
        System.out.println("Hall Name: " + halls[inputIndex].getHallName());
        System.out.println("  Address: " + halls[inputIndex].getHallAddress());
        System.out.println("  Capacity: " + halls[inputIndex].getHallCapacity());
        System.out.println("  Pirce: " + halls[inputIndex].getHallPrice());
        System.out.println("  Events Type: " + halls[inputIndex].getHallEvents() + "\r\n");
    }
    
}