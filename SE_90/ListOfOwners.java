import java.util.ArrayList;
/**
 * Class ListOfOwners
 * 
 * @author Jialiang Wu
 * @version 10 September 2019
 */
public class ListOfOwners
{
    private ArrayList<Owner> owners;

    /**
     * 
     */
    public ListOfOwners()
    {
        owners = new ArrayList<Owner>();
        Owner ownerTest = new Owner("", "", "owner", "", "123", "");
        owners.add(ownerTest);
    }

    /**
     *
     */
    public ListOfOwners(ArrayList<Owner> newOwners)
    {
        owners = newOwners;
    }
    
    public ArrayList<Owner> getOwners()
    {
        return owners;
    }
    
    public void setOwners(ArrayList<Owner> newOwners)
    {
        owners = newOwners;
    }
    
    public Owner getOwner(int index)
    {
        Owner owner = owners.get(index);
        return owner;
    }
}
