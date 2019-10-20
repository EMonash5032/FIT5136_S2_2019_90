
/**
 * This class is responsible for the most basic functions of the Review Class
 * for the PrimeEvents System. The class is used by the BookingController Class
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 */
public class Review
{
    // instance variables - replace the example below with your own
    private int bookingNo;
    private int hallNo;
    private String cusEmail;
    private double decorationRating;
    private double serviceRating;
    private double overallRating;
    private String reviewDesc;

    /**
     * Constructor for objects of class Review
     */
    public Review()
    {
        // initialise instance variables
        bookingNo = -1;
        hallNo = -1;
        cusEmail = "????";
        decorationRating = -0.01;
        serviceRating = -0.01;
        overallRating = -0.01;
        reviewDesc = "????";
    }

    /**
     * Method to set all variables to do with Review class at once
     */
    public Review(int bookingNo, int hallNo, String cusEmail, double decorationRating, double serviceRating,
    double overallRating, String reviewDesc)
    {
        // initialise instance variables
        this.bookingNo = bookingNo;
        this.hallNo = hallNo;
        this.cusEmail = cusEmail;
        this.decorationRating = decorationRating;
        this.serviceRating = serviceRating;
        this.overallRating = overallRating;
        this.reviewDesc = reviewDesc;
    }

    /**
     * Method to display Review information
     */
    public void displayReview()
    {
        System.out.println("Booking No: " + bookingNo);
        System.out.println("Hall No: " + hallNo);
        System.out.println("Customer Email: " + cusEmail);
        System.out.println("Decoration Rating: " + decorationRating);
        System.out.println("Service Rating: " + serviceRating);
        System.out.println("Overall Rating: " + overallRating);
        System.out.println("Review Description: " + reviewDesc);
    }

    /**
     * Accessor method for Booking Number
     */
    public int getBookingNo()
    {
        return bookingNo;
    }

    /**
     * Accessor method for Hall Number
     */
    public int getHallNo()
    {
        return hallNo;
    }

    /**
     * Accessor method for Customer Email
     */
    public String getCusEmail()
    {
        return cusEmail;
    }

    /**
     * Accessor method for Deocration Rating
     */
    public double getDecorationRating()
    {
        return decorationRating;
    }

    /**
     * Accessor method for Service Rating
     */
    public double getServiceRating()
    {
        return serviceRating;
    }

    /**
     * Access method for Overall Rating
     */
    public double getOverallRating()
    {
        return overallRating;
    }

    /**
     * Accessor method for Review Description
     */
    public String getReviewDesc()
    {
        return reviewDesc;
    }

    /**
     * Mutator method for Booking Number
     */
    public void setBookingNo(int bookingNo)
    {
        this.bookingNo = bookingNo;
    }

    /**
     * Mutator method for Hall number
     */
    public void setHallNo(int hallNo)
    {
        this.hallNo = hallNo;
    }

    /**
     * Mutator method for Customer Email
     */
    public void setCusEmail(String cusEmail)
    {
        this.cusEmail = cusEmail;
    }

    /**
     * Mutator method for Decoration Rating
     */
    public void setDecorationRating(double decorationRating)
    {
        this.decorationRating = decorationRating;
    }

    /**
     * Mutator method for Service Rating
     */
    public void setServiceRating(double serviceRating)
    {
        this.serviceRating = serviceRating;
    }

    /**
     * Mutator method for Overall Rating
     */
    public void setOverallRating(double overallRating)
    {
        this.overallRating = overallRating;
    } 

    /**
     * Mutator method for Review Description
     */
    public void setReviewDesc(String reviewDesc)
    {
        this.reviewDesc = reviewDesc;
    }
}
