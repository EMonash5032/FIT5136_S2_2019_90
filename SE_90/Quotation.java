
/**
 * Write a description of class Quotation here.
 *
 * @author (Team 90)
 * @version (a version number or a date)
 */
public class Quotation
{
    // instance variables - replace the example below with your own
    private int hallNo;
    private String ownerEmail;
    private String customerEmail;
    private String startDate;
    private String endDate;
    private String bookEventType;   //display event type
    private int numberPeople;  //display
    private boolean catering;  //boolean display if true for Yes &...
    private String menuOption;// there is a list that customer could make option on the catering
    private boolean photography;     //boolean display if true for Yes &...
    private String contactEmail;
    private String contactPhone; 
    private double additionalFee;
    private double totalPrice; //display
    private double totalPriceAfterDiscount;
    private boolean ownerConfirmation;

    /**
     * Constructor for objects of class Quotation
     */
    public Quotation()
    {
        // initialise instance variables
        hallNo = -1;  
        ownerEmail = "????";  
        customerEmail = "????";  
        startDate = "????";  
        endDate = "????";  
        bookEventType = "????";
        numberPeople = -1; 
        catering = false; 
        menuOption = "????";
        photography = false;
        contactEmail = "????";
        contactPhone = "????";
        additionalFee = -0.01;  
        totalPrice = -0.01;  
        totalPriceAfterDiscount = -0.01;  
        ownerConfirmation = false; 
    }

    public Quotation(int hallNo, String ownerEmail, String customerEmail, String startDate, 
                     String endDate, String bookEventType, int numberPeople, boolean catering, String menuOption, 
                     boolean photography, String contactEmail, String contactPhone, double additionalFee, double 
                     totalPrice, double totalPriceAfterDiscount, boolean ownerConfirmation) 
    {
        this.hallNo = hallNo;
        this.ownerEmail = ownerEmail;
        this.customerEmail = customerEmail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookEventType = bookEventType;
        this.numberPeople = numberPeople;
        this.catering = catering;
        this.menuOption = menuOption;
        this.photography = photography;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.additionalFee = additionalFee;
        this.totalPrice = totalPrice;
        this.totalPriceAfterDiscount = totalPriceAfterDiscount;
        this.ownerConfirmation = ownerConfirmation;
    }

    public void displayQuotation()
    {
        System.out.println("hall No: " + hallNo);
        System.out.println("owner Email: " + ownerEmail);
        System.out.println("customer Email: " + customerEmail);
        System.out.println("start Date: " + startDate);
        System.out.println("end Date: " + endDate);
        System.out.println("photography: " + photography);
        System.out.println("book Event Type: " + bookEventType);
        System.out.println("number of people: " + numberPeople);
        System.out.println("catering: " + catering);
        System.out.println("menu option: " + menuOption);
        System.out.println("photography: " + photography);
        System.out.println("contact email: " + contactEmail);
        System.out.println("contact phone: " + contactPhone);
        System.out.println("additional fee: " + additionalFee);
        System.out.println("total price: " + totalPrice);
        System.out.println("total price after discount: " + totalPriceAfterDiscount);
        System.out.println("owner confirmation: " + ownerConfirmation);
    }

    public int getHallNo() {
        return hallNo;
    }

    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getBookEventType() {
        return bookEventType;
    }

    public void setBookEventType(String bookEventType) {
        this.bookEventType = bookEventType;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public boolean getCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    public String getMenuOption() {
        return menuOption;
    }

    public void setMenuOption(String menuOption) {
        this.menuOption = menuOption;
    }

    public boolean getPhotography() {
        return photography;
    }

    public void setPhotography(boolean photography) {
        this.photography = photography;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public double getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPriceAfterDiscount() {
        return totalPriceAfterDiscount;
    }

    public void setTotalPriceAfterDiscount(double totalPriceAfterDiscount) {
        this.totalPriceAfterDiscount = totalPriceAfterDiscount;
    }

    public boolean getOwnerConfirmation() {
        return ownerConfirmation;
    }

    public void setOwnerConfirmation(boolean ownerConfirmation) {
        this.ownerConfirmation = ownerConfirmation;
    }
}
