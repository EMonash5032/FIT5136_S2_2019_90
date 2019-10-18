
/**
 * Write a description of class Bookinging here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    private int cardNumber;
    private String expiryDate;
    private int CVV;
    private double deposit;

    /**
     * Constructor for objects of class Bookinging
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
        cardNumber = -1;
        expiryDate = "????";
        CVV = -1;
        deposit = -0.01;
    } 

    /**
     * Constructor for objects of class Bookinging
     */
    public Booking(boolean reviewStatus, String bookingStatus, int hallNo, int customerNo, String ownerEmail, 
                   String customerEmail, int quotationIndex, String startDate, String endDate, String cardholderName, 
                   int cardNumber, String expiryDate, int CVV, double deposit) 
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

    public boolean getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(boolean reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getHallNo() {
        return hallNo;
    }

    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
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

    public int getQuotationIndex() {
        return quotationIndex;
    }

    public void setQuotationIndex(int quotationIndex) {
        this.quotationIndex = quotationIndex;
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

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
