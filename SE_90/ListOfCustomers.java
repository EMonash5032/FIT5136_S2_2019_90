import java.util.ArrayList;
/**
 * Class ListOfCustomers
 * 
 * @author Jialiang Wu
 * @version 10 September 2019
 */
public class ListOfCustomers
{
    private ArrayList<Customer> customers;

    /**
     * 
     */
    public ListOfCustomers()
    {
        customers = new ArrayList<Customer>();
        Customer customerTest = new Customer("", "", "customer", "", "123", "", false);
        customers.add(customerTest);
    }

    /**
     *
     */
    public ListOfCustomers(ArrayList<Customer> newCustomers)
    {
        customers = newCustomers;
    }
    
    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }
    
    public void setCustomers(ArrayList<Customer> newCustomers)
    {
        customers = newCustomers;
    }
    
    public Customer getCustomer(int index)
    {
        Customer customer = customers.get(index);
        return customer;
    }
}
