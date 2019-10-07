
/**
 * Class ListOfAdmins
 * 
 * @author Jialiang Wu && Yuekai Huang
 * @version 10 September 2019
 */
public class ListOfAdmins
{
    private Administrator[] admin;

    /**
     * 
     */
    public ListOfAdmins()
    {
        admin = new Administrator[1];
        admin[0] = new Administrator("admin@gmail.com", "admin");
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
}