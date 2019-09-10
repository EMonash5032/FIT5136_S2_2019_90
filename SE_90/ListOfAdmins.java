import java.util.ArrayList;
/**
 * Class ListOfAdmins
 * 
 * @author Jialiang Wu
 * @version 10 September 2019
 */
public class ListOfAdmins
{
    private ArrayList<Administrator> admins;

    /**
     * 
     */
    public ListOfAdmins()
    {
        admins = new ArrayList<Administrator>();
        Administrator adminTest = new Administrator("admin", "123");
        admins.add(adminTest);
    }

    /**
     *
     */
    public ListOfAdmins(ArrayList<Administrator> newAdmins)
    {
        admins = newAdmins;
    }
    
    public ArrayList<Administrator> getAdmins()
    {
        return admins;
    }
    
    public void setAdmins(ArrayList<Administrator> newAdmins)
    {
        admins = newAdmins;
    }
    
    public Administrator getAdmin(int index)
    {
        Administrator admin = admins.get(index);
        return admin;
    }
}