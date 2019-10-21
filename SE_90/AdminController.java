import java.io.*;
import java.util.Scanner;

/**
 * The AdminController class is for the most bringing together and furthers
 * the functions of admin Class. It interacts with the PrimeEvents Class
 * for the PrimeEvents System.
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 * 
 */
public class AdminController
{
    private Administrator[] admin;

    /**
     * Constructor class for AdminController
     */
    public AdminController()
    {        
        int totalNumAdmin = 99999;
        admin = new Administrator[totalNumAdmin];
        for(int index = 0; index < totalNumAdmin; index++)
        {
            admin[index] = new Administrator("????","????");
        }
    }
    
    /**
     * Accessor method to get administrator information
     * 
     * @param Index number must be specified
     * @return administrator information within index as specified
     */
    public Administrator getAdmin(int index)
    {
        return admin[index];
    }
    
    /**
     * Set administrator information
     * 
     * @param Admin in list must be specified
     */
    public void setAdmin(Administrator[] admin)
    {
        this.admin = admin;
    }
    
    /**
     * Return all information regarding Administrator list
     * @return administrator list information 
     */
    public Administrator[] getAllAdmin()
    {
        return admin;
    }
    
    /**
     * Mutator method for administrator within specified index
     * 
     * @param index number must be specified for storage
     * @param account name must be specified
     * @param password must be specified
     */
    public void setAdmin(int index, String account, String password)
    {
        admin[index] = new Administrator(account, password);
    }
    
     /**
     * Method to check Admin email validity
     * 
     * @param customer email is required to be specified
     * @return if found, returns index number which stores the email
     * @return if not found, then return -1
     */
    public int checkAdmin(String email)
    {

        for(int index = 0 ; index < getAllAdmin().length; index++)
        {
            if(getAdmin(index).getAdminEmail().toLowerCase().equals(email))
                return index;
        }
        return -1;
    }
    
    /**
     * Method to write administrator details to file
     * 
     * @param filename is to be specified
     * @exception filename not found
     * @exception Unexpected error occurs
     */
    public void writeAdmin(String fileName)
    {
        String message = "";
        String output = "";
        try
        {
            PrintWriter outputFile = new PrintWriter(fileName);
            for(int index = 0; index < getAllAdmin().length; index++)
            {
                if(getAdmin(index).getAdminEmail().equals("????"))
                    break;
                message = getAdmin(index).getAdminEmail() + "," + getAdmin(index).getAdminPassword()+";";
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
     * Method to read administrator details to file 
     * 
     * @param filename must be specified
     * @exception filename not found
     * @exception unexpected error occured
     */
    public void readAdmin(String fileName)
    {
        try
        {
            FileReader inputFile = new FileReader(fileName);
            Scanner parser = new Scanner(inputFile);
            String[] array = parser.nextLine().split(";");
            for(int index = 0; index < array.length; index++)
            {
                String[] elements = array[index].split(",");
                String account = elements[0];
                String password = elements[1];
                setAdmin(index, account, password);
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