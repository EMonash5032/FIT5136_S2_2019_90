
/**
 * Write a description of class Discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Discount
{
    // instance variables - replace the example below with your own
        private String discountName;
    private String discountDesc;
    private double discountRate;

 public Discount(String discountName, String discountDesc, double discountRate) {
        this.discountName = discountName;
        this.discountDesc = discountDesc;
        this.discountRate = discountRate;
    }
    
    public void displayDiscount()
    {
        System.out.println("Discount name: " + discountName);
        System.out.println("Discount description: " + discountDesc);
        System.out.println("Discount Rate: " + discountRate);
    }
    
    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getDiscountDesc() {
        return discountDesc;
    }

    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
