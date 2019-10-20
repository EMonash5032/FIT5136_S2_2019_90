import java.io.*;
import java.util.Scanner;

/**
 * Class ListOfAdmins
 * 
 * @author Jialiang Wu && Yuekai Huang
 * @version 10 September 2019
 */
public class AdminController
{
    private Administrator[] admin;

    /**
     * 
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
     * #1
     */
    public Administrator getAdmin(int index)
    {
        return admin[index];
    }
    
    /**
     * #2
     */
    public void setAdmin(Administrator[] admin)
    {
        this.admin = admin;
    }
    
    public Administrator[] getAllAdmin()
    {
        return admin;
    }
    
    public void setAdmin(int index, String account, String password)
    {
        admin[index] = new Administrator(account, password);
    }
    
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