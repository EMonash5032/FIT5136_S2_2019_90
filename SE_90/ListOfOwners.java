
/**
 * Class ListOfOwners
 * 
 * @author Team 90
 * @version 10 September 2019
 */
public class ListOfOwners
{
    private Owner[] owner;

    /**
     * 
     */
    public ListOfOwners()
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
    

}
