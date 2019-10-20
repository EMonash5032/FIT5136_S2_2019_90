
/**
 * This class is responsible for the most basic functions of the Booking Class
 * for the PrimeEvents System. The class is used by the BookingController Class
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 */
public class Booking
{
    // instance variables - replace the example below with your own
    private boolean reviewStatus;
    private String bookingStatus;
    private int hallNo;
    private int customerNo;
    private String ownerEmail;
    private String customerEmail;
    private int quotationIndex;
    private String startDate;
    private String endDate;
    private String cardholderName;
    private String cardNumber;
    private String expiryDate;
    private String CVV;
    private double deposit;

    /**
     * Constructor for objects of class Booking
     */
    public Booking()
    {
        // initialise instance variables
        reviewStatus = false;
        bookingStatus = "????";
        hallNo = -1;
        customerNo = -1;
        ownerEmail= "????";
        customerEmail = "????";
        quotationIndex = -1;
        startDate = "????";
        endDate = "????";
        cardholderName = "????";
        cardNumber = "????";
        expiryDate = "????";
        CVV = "????";
        deposit = -0.01;
    } 

    /**
     * Method for updating all booking information at once
     */
    public Booking(boolean reviewStatus, String bookingStatus, int hallNo, int customerNo, String ownerEmail, 
                   String customerEmail, int quotationIndex, String startDate, String endDate, String cardholderName, 
                   String cardNumber, String expiryDate, String CVV, double deposit) 
    {
        this.reviewStatus = reviewStatus;
        this.bookingStatus = bookingStatus;
        this.hallNo = hallNo;
        this.customerNo = customerNo;
        this.ownerEmail = ownerEmail;
        this.customerEmail = customerEmail;
        this.quotationIndex = quotationIndex;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
        this.deposit = deposit;
    }

    /**
     * Method for displaying booking information
     */
    public void displayBooking()
    {
        System.out.println("review Status: " + reviewStatus);
        System.out.println("booking Status: " + bookingStatus);
        System.out.println("hall No: " + hallNo);
        System.out.println("owner Email: " + ownerEmail);
        System.out.println("customer Email: " + customerEmail);
        System.out.println("quotation Index: " + quotationIndex);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("cardholder name: " + cardholderName);
        System.out.println("cardNumber: " + cardNumber);
        System.out.println("expiryDate: " + expiryDate);
        System.out.println("CVV: " + CVV);
        System.out.println("deposit: " + deposit);
    }

    /**
     * Accessor method for Review Status
     */
    public boolean getReviewStatus() {
        return reviewStatus;
    }

    /**
     * Accessor method for Review Status
     */
    public void setReviewStatus(boolean reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * Accessor method for Booking Status
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Mutator method for Booking Status
     */
    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    /**
     * Accessor method for Hall Number
     */
    public int getHallNo() {
        return hallNo;
    }

    /**
     * Mutator method for Hall Number
     */
    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }

    /**
     * Accessor method for Customer Number
     */
    public int getCustomerNo() {
        return customerNo;
    }

    /**
     *  Mutator method for Customer Number
     */
    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    /**
     * Accessor method for Owner Email
     */
    public String getOwnerEmail() {
        return ownerEmail;
    }

    /**
     * Mutator method for Owner Email
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
     * Mutator method for Customer Email
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * Accessor method for Quotation Index
     */
    public int getQuotationIndex() {
        return quotationIndex;
    }

    /**
     * Mutator method for Quotation Index
     */
    public void setQuotationIndex(int quotationIndex) {
        this.quotationIndex = quotationIndex;
    }

    /**
     * Accessor method for Booking start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Mutator method for Booking start date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Accessor method for Booking end date
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Mutator method for booking end date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Accessor method for Cardholder Name
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     *  Mutator method for cardholder name
     */
    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    /**
     * Accessor method for card number
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Mutator method for card number
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Accessor method for card expiry date
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Mutator method for card expiry date
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Accessor method for CVV
     */
    public String getCVV() {
        return CVV;
    }

    /**
     * Mutator method for CVV
     */
    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    /**
     * Accessor method for deposit information
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * Mutator method for deposit information
     */
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
