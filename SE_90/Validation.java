
/**
 * Class Validation - a class to check values and loops to meet the program requirements.
 * 
 * @author Jialiang Wu
 * @version 09 September 2019
 */
public class Validation
{
    /**
     * Constructor for objects of class Validation.
     */
    public Validation()
    {
        
    }

    /**
     * Check if the value input is blank.
     * 
     * @param value The value to be checked in String type.
     * @return The checking result in boolean type.
     */
    public boolean stringIsBlank(String value)
    {
        boolean flag = false;
        if(value.isEmpty() == true || value == null)
        {
            flag = true;
        }
        return flag;
    }
    
    /**
     * Check if the length of value input is within the specified range.
     * 
     * @param value The value to be checked in String type.
     * @param min The minimum length of string.
     * @param max The maximum length of string.
     * @return The checking result in boolean type.
     */
    public boolean stringLengthWithinRange(String value, int min, int max)
    {
        boolean flag = true;
        int stringLength = value.length();
        if(stringLength < min || stringLength > max)
        {
            flag = false;
        }
        return flag;
    }
    
    /**
     * Check if the value input is within the specified range.
     * 
     * @param value The value to be checked in integer type.
     * @param min The minimum value required.
     * @param max The maximum value required.
     * @return The checking result in boolean type.
     */
    public boolean numberWithinRange(int value, int min, int max)
    {
        boolean flag = true;
        if(value < min || value > max)
        {
            flag = false;
        }
        return flag;
    }
    
    /**
     * Check if the value input is a valid email address.
     * 
     * @param value The value input by user as email address to be checked.
     * @return The checking result in boolean type.
     */
    public boolean stringIsEmailAddr(String value)
    {
        boolean flag = false;
        if(value.contains("@"))
        {
            flag = true;
        }
        return flag;
    }
}