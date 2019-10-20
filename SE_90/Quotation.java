
/**
 * This class is responsible for the most basic functions of the Quotation Class
 * for the PrimeEvents System. The class is used by the BookingController Class
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
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
    private boolean cusIsConcession;
    private boolean isBook;

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
        cusIsConcession = false;
        isBook = false;
    }

    /**
     * Method to set all aspects of Quotation Class at once
     */
    public Quotation(int hallNo, String ownerEmail, String customerEmail, String startDate, 
                     String endDate, String bookEventType, int numberPeople, boolean catering, String menuOption, 
                     boolean photography, String contactEmail, String contactPhone, double additionalFee, double 
                     totalPrice, double totalPriceAfterDiscount, boolean ownerConfirmation, boolean cusIsConcession,
                     boolean isBook) 
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
        this.cusIsConcession = cusIsConcession;
        this.isBook = isBook;
    }

    /**
     * Method to display quotation information
     */
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

    /**
     * Accessor method for Hall Number
     */
    public int getHallNo() {
        return hallNo;
    }

    /**
     * Mutator method for hall number 
     */
    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }

    /**
     * Accessor method for Owner Email
     */
    public String getOwnerEmail() {
        return ownerEmail;
    }

    /**
     * Mutator method for owner email 
     */
    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    /**
     * Accessor method for Customer Email
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Mutator method for customer email
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * Accessor method for Quotation Start Date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Mutator method for Quotation start date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Accessor method for Quotation End Date
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Mutator method for quotation end date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Accessor method for Quotation Event Type
     */
    public String getBookEventType() {
        return bookEventType;
    }

    /**
     *  Mutator method for quotation event type
     */
    public void setBookEventType(String bookEventType) {
        this.bookEventType = bookEventType;
    }

    /**
     * Accessor method for Quotation number of people
     */
    public int getNumberPeople() {
        return numberPeople;
    }

    /**
     * Mutator method for number of people quotation
     */
    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    /**
     * Accessor method for Quotation Catering 
     */
    public boolean getCatering() {
        return catering;
    }

    /**
     * Mutator method for quotation catering
     */
    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    /**
     * Accessor method for Quotation Menu Option
     */
    public String getMenuOption() {
        return menuOption;
    }

    /**
     * Mutator method for Quotation Menu Option
     */
    public void setMenuOption(String menuOption) {
        this.menuOption = menuOption;
    }

    /**
     * Accessor method for Quotation Photography
     */
    public boolean getPhotography() {
        return photography;
    }

    /**
     * Mutator method for quotation photograhy
     */
    public void setPhotography(boolean photography) {
        this.photography = photography;
    }

    /**
     * Accessor method for Contact Email information
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Mutator method for Contact Email information
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * Accessor method for Contact phone number information
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Mutator method for Contact phone number information
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * Accessor method for Additional Fee for Quotation
     */
    public double getAdditionalFee() {
        return additionalFee;
    }

    /**
     * Mutator method for Additional fee for quotation
     */
    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
    }

    /**
     * Accessor method for Total Price for Quotation
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Mutator method for Total Price for quotation
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * Accessor method for Total price after discount for quotation
     */
    public double getTotalPriceAfterDiscount() {
        return totalPriceAfterDiscount;
    }

    /**
     * Mutator method for total price after discount information for quotation
     */
    public void setTotalPriceAfterDiscount(double totalPriceAfterDiscount) {
        this.totalPriceAfterDiscount = totalPriceAfterDiscount;
    }

    /**
     * Accessor method for owner confirmation 
     */
    public boolean getOwnerConfirmation() {
        return ownerConfirmation;
    }

    /**
     * Mutator method for owner confirmation
     */
    public void setOwnerConfirmation(boolean ownerConfirmation) {
        this.ownerConfirmation = ownerConfirmation;
    }
    
    /**
     * Accessor method for Customer concession information
     */
    public boolean getCusIsConcession()
    {
        return cusIsConcession;
    }
    
    /**
     * Mutator method for customer concessional information
     */
    public void setCusIsConcession(boolean cusIsConcession)
    {
        this.cusIsConcession = cusIsConcession;
    }
    
    /**
     * Accessor method for Booking confirmation information
     */
    public boolean getIsBook()
    {
        return isBook;
    }
    
    /**
     * Mutator method for for booking confirmation information
     */
    public void setIsBook(boolean isBook)
    {
        this.isBook = isBook;
    }
}
