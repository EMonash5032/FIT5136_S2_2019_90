
/**
 * Write a description of class QuotationList here.
 *
 * @author (Team 90)
 * @version (a version number or a date)
 */
public class QuotationList
{
    // instance variables - replace the example below with your own
    private Quotation[] quotas;

    /**
     * Constructor for objects of class ListOfQuotation
     */
    public QuotationList()
    {
        // initialise instance variables
        
        int totalQuot = 99999;
        quotas = new Quotation[totalQuot];
        for(int index = 0; index < totalQuot; index++)
        {
            quotas[index] = new Quotation("????", "????", "????", "????", -1, -1, -1, "????", false, -1, false,  -0.01);
        }
        
    }
}
