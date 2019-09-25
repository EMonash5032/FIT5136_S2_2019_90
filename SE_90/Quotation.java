
/**
 * Write a description of class Quotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quotation
{
    // instance variables - replace the example below with your own
    private Hall[] halls;
    private String quota;
    
    /**
     * Constructor for objects of class Quotation
     */
    public Quotation()
    {
        // initialise instance variables
        int totalQuot = 99999;
        halls = new Hall[totalQuot];
        for(int index = 0; index < totalQuot; index++)
        {
            halls[index] = new Hall("????","????","????","????", -1, -0.01, "????");
        }
        
        quota = "????";
    }
    
    public Quotation(String quota)
    {
        this.quota = quota;
    }
    
    /**
     * #1
     */
    public void setQuota(String quota)
    {
        this.quota = quota;
    }
    
    /**
     * #2
     */
    public String getQuota()
    {
        return quota;
    }
    
    /**
     * #3
     */
    public Hall getHalls(int index)
    {
        return halls[index];
    }
}
