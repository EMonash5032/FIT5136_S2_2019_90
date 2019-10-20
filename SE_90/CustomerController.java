import java.io.*;
import java.util.Scanner;

/**
 * The CustomerController class is for the most bringing together and furthers
 * the functions of Customer Class. It interacts with the PrimeEvents Class
 * for the PrimeEvents System.
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 */
public class CustomerController
{
    private Customer[] customer;

    /**
     * Constructor class for CustomerController
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
     * Returns all Customer information
     */
    public Customer[] getAllCus()
    {
        return customer;
    }
    
    /**
     * Method responsible for getting specific information, reaching into customer class
     * 
     * @param Requires index of customer to be specified by user
     * @return the user with the customer stored in index identified
     */
    public Customer getCustomer(int index)
    {
        return customer[index];
    }
    
    /**
     * Mutator method to store information within a specified index. Registers owner information
     * 
     * @param firstName customer first name
     * @param lastName customer last name
     * @param email customer email
     * @param address customer address
     * @param password customer passowrd
     * @param phone customer phone number
     * @param question1 customer secret question 1
     * @param answer1 customer secret answer 1
     * @param question2 customer secret question 2
     * @param answer2 customer secret answer 2
     * @param isConcession verification for whether customer is concession or veteran - discount purposes
     */
    public void setCustomer(int index, String firstName, String lastName, String email, String address, String password, String phone, String question1, String answer1, String question2, String answer2, boolean isConcession)
    {
        customer[index] = new Customer(firstName, lastName, email, address, password, phone, question1, answer1, question2, answer2, isConcession);
    }
    
    /**
     * Method to check email
     * 
     * @param customer email
     * @return if found, equals true (1)
     * @return if not found, equals false (0)
     */
    public int checkEmail(String email)
    {
        for(int index = 0; index < getAllCus().length; index++)
        {
            if(getCustomer(index).getCusEmail().toLowerCase().equals(email))
                return 1;
        }
        
        return 0;
    }
    
    /**
     * Method to find customer based on email 
     * 
     * @param email address of customer is required
     * @return if found, return index number
     * @return if not found, returns false (0)
     */
    public int checkCusIndex(String email)
    {
        for(int index = 0; index < getAllCus().length; index++)
        {
            if(getCustomer(index).getCusEmail().toLowerCase().equals(email))
                return index;
        }
        return 0;
    }
    
    /**
     * Method to return the number of customer indexes there are
     * @return Returns the number of indexes. 
     */
    public int custIndex()
    {
        int index = 0;
        while(index < getAllCus().length)
        {
            if(getCustomer(index).getCusPassword().equals("????"))
                return index;
            index++;
        }
        return -1;
    }
    
    /**
     * Method to check customer email validity
     * 
     * @param customer email is required to be specified
     * @return if found, returns index number which stores the email
     * @return if not found, then return -1
     */
    public int checkCust(String email)
    {

        for(int index = 0 ; index < getAllCus().length; index++)
        {
            if(getCustomer(index).getCusEmail().equals(email))
                return index;
        }
        return -1;
    }
    
    /**
     * Method to write customer details to file
     * 
     * @param fileName needs to be specified to write the details into
     * @exception file not found
     * @exception unexpected error when writing to customer txt file
     */
    public void writeCustomer(String fileName)
    {
        String message = "";
        String output = "";
        try
        {
            PrintWriter outputFile = new PrintWriter(fileName);
            for(int index = 0; index < getAllCus().length; index++)
            {
                if(getCustomer(index).getCusFirstName().equals("????"))
                    break;
                message = getCustomer(index).getCusFirstName() + "," 
                          + getCustomer(index).getCusLastName() + "," 
                          + getCustomer(index).getCusEmail() + "," 
                          + getCustomer(index).getCusAddress() + "," 
                          + getCustomer(index).getCusPassword() + "," 
                          + getCustomer(index).getCusPhone() + "," 
                          + getCustomer(index).getCusQuestion1() + "," 
                          + getCustomer(index).getCusAnswer1() + "," 
                          + getCustomer(index).getCusQuestion2() + "," 
                          + getCustomer(index).getCusAnswer2() + ","
                          + getCustomer(index).getCusIsConcession() + ";" ;
                output = output + message;
            }
            outputFile.println(output);
            outputFile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }
    
    /**
     * Method to read customer details to file
     * 
     * @param fileName needs to be specified to read the details into
     * @exception file not found
     * @exception unexpected error when reading from customer txt file
     */
    public void readCustomer(String fileName)
    {
        try
        {
            FileReader inputFile = new FileReader(fileName);
            Scanner parser = new Scanner(inputFile);
            String[] array = parser.nextLine().split(";");
            for(int index = 0; index < array.length; index++)
            {
                String[] elements = array[index].split(",");
                String cusFirstName = elements[0];
                String cusLastName = elements[1];
                String cusEmail = elements[2];
                String cusAddress = elements[3];
                String cusPassword = elements[4];
                String cusPhone = elements[5];
                String cusQuestion1 = elements[6];
                String cusAnswer1 = elements[7];
                String cusQuestion2 = elements[8];
                String cusAnswer2 = elements[9];
                boolean cusIsConcession = Boolean.parseBoolean(elements[10]);
                
                setCustomer(index, cusFirstName, cusLastName, cusEmail, cusAddress, cusPassword, 
                        cusPhone, cusQuestion1, cusAnswer1, cusQuestion2, cusAnswer2, cusIsConcession);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

}
