
/**
 * Class ListOfOwners
 * 
 * @author Team 90
 * @version 10 September 2019
 */
public class OwnerController
{
    private Owner[] owner;

    /**
     * 
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
     * #1
     */
    public Owner[] getAllOwner()
    {
        return owner;
    }
    
    /**
     * #2
     */
    public Owner getOwner(int index)
    {
        return owner[index];
    }
    
    /**
     * #3
     */
    public void setOwner(int index, String firstName, String lastName, String email, String address, String password, String phone, String question1, String answer1, String question2, String answer2)
    {
        owner[index] = new Owner(firstName, lastName, email, address, password, phone, question1, answer1, question2, answer2);
    }
    
    public int checkOwnerEmail(String email)
    {
        for(int index = 0; index < getAllOwner().length; index++)
        {
            if(getOwner(index).getOwnerEmail().toLowerCase().equals(email))
                return 1;
        }
        
        return 0;
    }
    
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
     * #2
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
}
