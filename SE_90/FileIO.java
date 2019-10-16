import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * FileIO - a class to read file and save game results.
 *
 * @author Jialiang Wu
 * @version 09 September 2019
 */
public class FileIO
{
    private String fileName;
    
    /**
     * Constructor for objects of class FileIO.
     */
    FileIO()
    {
        
    }
    
    /**
     * Constructor for FileIO objects with user's input filename.
     * 
     * @param newFileName The target file user wants to read or write.
     */
    FileIO(String newFileName)
    {
        fileName = newFileName;
    }
    
    /**
     * Return the target filename. 
     */
    public String getFileName()
    {
        return fileName;
    }
    
    /**
     * Set the filename of FileIO.
     * 
     * @param newFileName Target filename for input or output.
     */
    public void setFileName(String newFileName)
    {
        fileName = newFileName;
    }
    
    /**
     * Read file and save the contents in string arraylist.
     * 
     * @return The string arraylist that stores the contents of target file.
     */
    public ArrayList<String> readFile()
    {
        ArrayList<String> fileContents = new ArrayList<String>();
        try
        {
            FileReader inputFile = new FileReader(fileName);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while(parser.hasNextLine())
                {
                    fileContents.add(parser.nextLine());
                }
            }
            finally
            {
                inputFile.close();
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O exception occurs");
        }
        return fileContents;
    }
}