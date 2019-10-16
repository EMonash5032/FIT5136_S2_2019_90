import java.util.*;
/**
 * Write a description of class BookingController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookingController
{
    // instance variables - replace the example below with your own
    private Booking[] book;
    private Hall[] halls;
    private Quotation[] quotas;
    private Review[] reviews;
    
    /**
     * Constructor for objects of class BookingController
     */
    public BookingController()
    {
        // initialise instance variables
        int bookingID = 99999;
        int totalNumHalls = 99999;
        int totalQuot = 99999;        
        int totalReview = 99999;
        
        halls = new Hall[totalNumHalls];
        for(int index = 0; index < totalNumHalls; index++)
        {
            halls[index] = new Hall("????","????","????", -1, -0.01, "????");
        }
        
        book = new Booking[bookingID];
        for(int index = 0; index < bookingID; index++)
        {
            book[index] = new Booking("????","????","????","????","????", -0.01, -0.01, -0.01);
        }
        

        quotas = new Quotation[totalQuot];
        for(int index = 0; index < totalQuot; index++)
        {
            quotas[index] = new Quotation("????", "????", "????", "????", -1, -1, -1, "????", false, -1, false,  -0.01);
        }
        
        reviews = new Review[totalReview];
        for(int index = 0; index < totalReview; index++)
        {
            reviews[index] = new Review(-1, -1, "????", -0.01, -0.01, -0.01, "????");
        }
    }
    
    /**
     * #23  hall list
     */
    public void quotationInfo(int index)
    {
        Quotation quota = new Quotation();
        //String hallName = quota.getHalls(index).getHallName();
        //String hallAddress = quota.getHalls(index).getHallAddress();
        //int hallCapacity = quota.getHalls(index).getHallCapacity();
        //double hallPrice = quota.getHalls(index).getHallPrice();
        //String hallEvents = quota.getHalls(index).getHallEvents();
        
        //System.out.println("Your Quotation is");
        //System.out.println("Hall Name: " + hallName);
        //System.out.println(" Address: " + hallAddress);
        //System.out.println(" Capacity: " + hallCapacity);
        //System.out.println(" Price: $" + hallPrice);
        //System.out.println(" Events Type: " + hallEvents + "\r\n");
    }
    
    /**
     * #24
     */
    public void view(int inputIndex)
    {
        System.out.println("This is View Halls");
        
        //System.out.println("Select the hall number " + (inputIndex + 1) + ": ");
        //System.out.println("Hall Name: " + halls[inputIndex].getHallName());
        //System.out.println(" Address: " + halls[inputIndex].getHallAddress());
        //System.out.println(" Capacity: " + halls[inputIndex].getHallCapacity());
        //System.out.println(" Pirce: " + halls[inputIndex].getHallPrice());
        //System.out.println(" Events Type: " + halls[inputIndex].getHallEvents() + "\r\n");
        
        System.out.println("Please Enter 'y' or 'n'");
    }
    
    /**
     * #25
     */
    public Booking[] getAllBook()
    {
        return book;
    }
    
    /**
     * #26
     */
    public Booking getBook(int index)
    {
        return book[index];
    }
    
    /**
     * #27
     */
    public void setBook(int index, String firstName, String lastName, String hallName, String eventType, String date, double price, double actualFee, double deposit)
    {
        book[index] = new Booking(firstName, lastName, hallName, eventType, date, price, actualFee, deposit);
    }
    
    /**
     * #28
     */
    public void displayBook(int inputIndex)
    {
        System.out.println("The Booking reference " + (inputIndex + 1) + ": ");
        System.out.println("Hall Name: " + book[inputIndex].getHallName());
        System.out.println("  Event Types: " + book[inputIndex].getEventType());
        System.out.println("  Hall Price: " + book[inputIndex].getPrice());
        System.out.println("  Acutal Cost: " + book[inputIndex].getActualFee());
        System.out.println("  Deposit: " + book[inputIndex].getDeposit() + "\r\n");
    }

     /**
     * #21
     */
    public Hall getHalls(int index)
    {
        return halls[index];
    }
    
    /**
     * #22
     */
    public Hall[] getAllHalls()
    {
        return halls;
    }
    
    /**
     * #23
     */
    public void setHalls(Hall[] halls)
    {
        this.halls = halls;
    }
    
    /**
     * #24
     */
    public void setHall(int index, String hallOwnerEmail, String hallName, String hallAddress, int hallCapacity, double hallPrice, String hallEvents)
    {
        halls[index] = new Hall(hallOwnerEmail, hallName, hallAddress, hallCapacity, hallPrice, hallEvents);
    }
    
    /**
     * #25
     */
    public void remove()
    {
        System.out.println("Please select from the following halls that you wish to remove: ");
        for(int x = 0; x < halls.length; x++)
        {
            if(!halls[x].getHallName().equals("????"))
            {
                System.out.println("Select the hall number " + (x + 1) + ": ");
                System.out.println("Hall Name: " + halls[x].getHallName());
                System.out.println(" Address: " + halls[x].getHallAddress());
                System.out.println(" Capacity: " + halls[x].getHallCapacity());
                System.out.println(" Price: " + halls[x].getHallPrice());
                System.out.println(" Event Type: " + halls[x].getHallEvents() + "\r\n");
                
            }
        }
        System.out.println("Enter Number 0 to exit remove menu");
        System.out.println("Please Enter Hall Number You wish To Remove: ");
    }

    /**
     * #26
     */
    public void displayHalls(int inputIndex)
    {
        System.out.println("The hall number " + (inputIndex + 1) + ": ");
        System.out.println("Hall Name: " + halls[inputIndex].getHallName());
        System.out.println("  Address: " + halls[inputIndex].getHallAddress());
        System.out.println("  Capacity: " + halls[inputIndex].getHallCapacity());
        System.out.println("  Price: " + halls[inputIndex].getHallPrice());
        System.out.println("  Events Type: " + halls[inputIndex].getHallEvents() + "\r\n");
    }
    
    public Review[] getAllReview()
    {
        return reviews;
    }
    
    public Review getReview(int index)
    {
        return reviews[index];
    }
    
    public void setReview(int index, int bookingNo, int hallNo, String cusEmail, double decorationRating,
                          double serviceRating, double overallRating, String reviewDesc)
    {
        reviews[index] = new Review(bookingNo, hallNo, cusEmail, decorationRating,
                                    serviceRating, overallRating, reviewDesc);
    }
    
    /**
         *
         * "F" means Finished
         * 
         */
        public Booking[] displayCompletedBooking(String cusEmail)
        {
            Booking[] bookings = new Booking[99999];
            Booking[] completedBookings = new Booking[99999];
            int index = 0;
            for(Booking booking: bookings)
            {
                if(booking.getCusEmail().equals(cusEmail) && 
                   booking.getStatus().equals("F"))
                {
                    
                    completedBookings[index] = booking;
                    System.out.println((index + 1) + "." + booking.displayBooking());
                    index++;
                }
            }
            
            if(index == 0)
            {
                return null;
            }
            else
            {
                return completedBookings;
            }
        }
        
        
    
    public double getAverageRating(int hallNo)
        {
            Review[] hallReviews = new Review[9999];
            int index = 0;
            for(Review review : reviews)
            {
                if(review.getHallNo() == hallNo)
                {
                    hallReviews[index] = review;
                    index++;
                }
            }
            double sumRating = 0.0;
            if(index == 0)
            {
                System.out.println("This hall hasn't been booked by now.");
            }
            else
            {
                for(int i = 0; i < index; i++)
                {
                    sumRating += hallReviews[i].getOverallRating();
                }
            }
            double avgRating = sumRating/index;
            return avgRating;
        }
}
