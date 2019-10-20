
/**
 * Class CustomerController
 * 
 * @author Team 90
 * @version 10 September 2019
 */
public class CustomerController
{
    private Customer[] customer;

    /**
     * 
     */
    public CustomerController()
    {
        int totalNumCus = 99999;
        customer = new Customer[totalNumCus];
        for(int index = 0; index < totalNumCus; index++)
        {
            customer[index] = new Customer("????","????","????","????", "????", "????","????","????","????","????",false);
        }
    }

    /**
     *#1
     */
    public Customer[] getAllCus()
    {
        return customer;
    }
    
    /**
     * #2
     */
    public Customer getCustomer(int index)
    {
        return customer[index];
    }
    
    /**
     * #3
     */
    public void setCustomer(int index, String firstName, String lastName, String email, String address, String password, String phone, String question1, String answer1, String question2, String answer2, boolean isConcession)
    {
        customer[index] = new Customer(firstName, lastName, email, address, password, phone, question1, answer1, question2, answer2, isConcession);
    }
    
    public int checkEmail(String email)
    {
        for(int index = 0; index < getAllCus().length; index++)
        {
            if(getCustomer(index).getCusEmail().equals(email))
                return 1;
        }
        
        return 0;
    }
    
    public int checkCusIndex(String email)
    {
        for(int index = 0; index < getAllCus().length; index++)
        {
            if(getCustomer(index).getCusEmail().equals(email))
                return index;
        }
        return 0;
    }
}
