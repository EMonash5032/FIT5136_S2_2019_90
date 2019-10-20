import java.io.*;
import java.util.Scanner;
/**
 * The OwnerController class is for the most bringing together and furthers
 * the functions of owner Class. It interacts with the PrimeEvents Class
 * for the PrimeEvents System.
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 * 
 */
public class OwnerController
{
    private Owner[] owner;

    /**
     * Constructor class for OwnerController Class
     */
    public OwnerController()
    {
        int totalNumOwners = 99999;
        owner = new Owner[totalNumOwners];
        for(int index = 0; index < totalNumOwners; index++)
        {
            owner[index] = new Owner("????","????","????","????", "????", "????","????","????","????","????");
        }
    }

    /**
     * Accessor method to get all owners
     */
    public Owner[] getAllOwner()
    {
        return owner;
    }

    /**
     * Method responsible for getting specific information, reaching into owner class
     * 
     * @param Requires index of owner to be specified by user
     * @return the user with the owner stored in index identified
     */
    public Owner getOwner(int index)
    {
        return owner[index];
    }

    /**
     * Mutator method to store information within a specified index. Registers owner information
     * 
     * @param firstName Owner first name
     * @param lastName owner last name
     * @param email owner email
     * @param address owner address
     * @param password owner passowrd
     * @param phone owner phone number
     * @param question1 owner secret question 1
     * @param answer1 owner secret answer 1
     * @param question2 owner secret question 2
     * @param answer2 owner secret answer 2
     */
    public void setOwner(int index, String firstName, String lastName, String email, String address, String password, String phone, String question1, String answer1, String question2, String answer2)
    {
        owner[index] = new Owner(firstName, lastName, email, address, password, phone, question1, answer1, question2, answer2);
    }

    /**
     * Check the owner email address
     * @param owner email address to be specified by user
     * 
     * @return whether details are found (True, 1) or not (false, 0)
     */
    public int checkOwnerEmail(String email)
    {
        for(int index = 0; index < getAllOwner().length; index++)
        {
            if(getOwner(index).getOwnerEmail().toLowerCase().equals(email))
                return 1;
        }

        return 0;
    }

    /**
     * Find the number of owner accounts there are. 
     * @return total index number
     */
    public int ownerIndex()
    {
        int index = 0;
        while(index < getAllOwner().length)
        {
            if(getOwner(index).getOwnerPassword().equals("????"))
                return index;
            index++;
        }
        return -1;
    }

    /**
     * Check the owner email address
     * @param owner email address to be specified by user
     * 
     * @return whether details are found (True, 1) or not (false, 0)
     */
    public int checkOwner(String email)
    {

        for(int index = 0 ; index < getAllOwner().length; index++)
        {
            if(getOwner(index).getOwnerEmail().toLowerCase().equals(email))
                return index;
        }
        return -1;
    }

    /**
     * Method to write owner details to file
     * 
     * @param filename is to be specified
     * @exception filename not found
     * @exception Unexpected error occurs
     */
    public void writeOwner(String fileName)
    {
        String message = "";
        String output = "";
        try
        {
            PrintWriter outputFile = new PrintWriter(fileName);
            for(int index = 0; index < getAllOwner().length; index++)
            {
                if(getOwner(index).getOwnerFirstName().equals("????"))
                    break;
                message = getOwner(index).getOwnerFirstName() + "," 
                + getOwner(index).getOwnerLastName() + "," 
                + getOwner(index).getOwnerEmail() + ","
                + getOwner(index).getOwnerAddress() + ","
                + getOwner(index).getOwnerPassword() + "," 
                + getOwner(index).getOwnerPhone() + ","
                + getOwner(index).getOwnerQuestion1() + ","
                + getOwner(index).getOwnerAnswer1() + "," 
                + getOwner(index).getOwnerQuestion2() + ","
                + getOwner(index).getOwnerAnswer2() + ";";
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
     * Method to read owner details to file 
     * 
     * @param filename must be specified
     * @exception filename not found
     * @exception unexpected error occured
     */
    public void readOwner(String fileName)
    {
        try
        {
            FileReader inputFile = new FileReader(fileName);
            Scanner parser = new Scanner(inputFile);
            String[] array = parser.nextLine().split(";");
            for(int index = 0; index < array.length; index++)
            {
                String[] elements = array[index].split(",");
                String ownerFirstName = elements[0];
                String ownerLastName = elements[1];
                String ownerEmail = elements[2];
                String ownerAddress = elements[3];
                String ownerPassword = elements[4];
                String ownerPhone = elements[5];
                String ownerQuestion1 = elements[6];
                String ownerAnswer1 = elements[7];
                String ownerQuestion2 = elements[8];
                String ownerAnswer2 = elements[9];
                setOwner(index, ownerFirstName, ownerLastName, ownerEmail, ownerAddress, ownerPassword, 
                    ownerPhone, ownerQuestion1, ownerAnswer1, ownerQuestion2, ownerAnswer2);
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
