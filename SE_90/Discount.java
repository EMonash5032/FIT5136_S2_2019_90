
/**
 * This class is for the most basic functions of Discount Class. It is used by the
 * BookingController Class of the PrimeEvents System. 
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 */
public class Discount
{
    // instance variables - replace the example below with your own
    private String discountName;
    private String discountDesc;
    private double discountRate;

    /**
     * Constructor for objects of class Discount
     */
    public Discount()
    {
        // initialise instance variables
        discountName = "????";
        discountDesc = "????";
        discountRate = -0.01;

    }

    /**
     * Method for setting all Discount information at once 
     */
    public Discount(String discountName, String discountDesc, double discountRate) 
    {
        this.discountName = discountName;
        this.discountDesc = discountDesc;
        this.discountRate = discountRate;
    }

    /**
     * Display Discount Information
     */
    public void displayDiscount()
    {
        System.out.println("Discount name: " + discountName);
        System.out.println("Discount description: " + discountDesc);
        System.out.println("Discount Rate: " + discountRate);
    }

    /**
     * Accessor method for Discount Name
     */
    public String getDiscountName() {
        return discountName;
    }

    /**
     * Mutator method for Discount Name
     */
    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    /**
     * Accessor method for Discount Description
     */
    public String getDiscountDesc() {
        return discountDesc;
    }

    /**
     * Mutator Method for Discount Description
     */
    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc;
    }

    /**
     * Accessor method for Discount Rate
     */
    public double getDiscountRate() {
        return discountRate;
    }

    /**
     * Mutator method for Discount Rate
     */
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
