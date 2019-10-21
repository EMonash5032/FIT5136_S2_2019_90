import java.io.*;
import java.util.*;

/**
 * The BookingController class is for the most bringing together and furthers
 * the functions of the Hall, Discount, Review
 * Booking and Quotation Classes. It interacts with the PrimeEvents Class
 * for the overall PrimeEvents System function
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 */
public class BookingController
{
    // instance variables - replace the example below with your own
    private Booking[] book;
    private Hall[] halls;
    private Quotation[] quotas;
    private Review[] reviews;
    private Discount[] discount;

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
        int totalDiscount = 99999;

        halls = new Hall[totalNumHalls];
        for(int index = 0; index < totalNumHalls; index++)
        {
            halls[index] = new Hall("????","????","????", -1, -0.01,false,false,false,false,false,"????",false);
        }

        book = new Booking[bookingID];
        for(int index = 0; index < bookingID; index++)
        {
            book[index] = new Booking(false,"????",-1,-1,"????","????",-1,"????","????","????", "????","????","????",-0.01);
        }

        quotas = new Quotation[totalQuot];
        for(int index = 0; index < totalQuot; index++)
        {
            quotas[index] = new Quotation(-1,"????","????","????", "????","????", -1,false,"????",false,
                "????","????",-0.01,-0.01,-0.01,false,false,false);
        }

        reviews = new Review[totalReview];
        for(int index = 0; index < totalReview; index++)
        {
            reviews[index] = new Review(-1, -1, "????", -0.01, -0.01, -0.01, "????");
        }

        discount = new Discount[totalDiscount];
        for(int index = 0; index < totalDiscount; index++)
        {
            discount[index] = new Discount("????","????",-0.01);
        }
    }

    /**
     * Method to get all reviews listed 
     * @return review view
     */
    public Review[] getAllReview()
    {
        return reviews;
    }

    /**
     * Get details within specific review method
     * 
     * @param index must be specified to find specific information regarding the review
     */
    public Review getReview(int index)
    {
        return reviews[index];
    }

    /**
     * Mutator method for review.
     * 
     * @param index index number for which to store the incoming information
     * @param bookingNo booking number of the review
     * @param hallNo hall number of which review is referring to
     * @param cusEmail Details of customer (customer Email)
     * @param decorationRating rating on decorations of hall
     * @param serviceRating rating of service of hall
     * @param overallRating overall rating of hall
     * @param reviewDesc additional comments for the review
     */
    public void setReview(int index, int bookingNo, int hallNo, String cusEmail, double decorationRating, 
    double serviceRating, double overallRating, String reviewDesc)
    {
        reviews[index] = new Review(bookingNo,hallNo,cusEmail,decorationRating,serviceRating,overallRating,reviewDesc);
    }

    /**
     * Get all quotation information
     * @return list of quotations
     * 
     */
    public Quotation[] getAllQuota()
    {
        return quotas;
    }

    /**
     * Get information about specific quotation
     * 
     * @param index index number must be specified to find specific information regarding quotation
     * @return quotation information about specific quotation within index
     */
    public Quotation getQuota(int index)
    {
        return quotas[index];
    }

    /**
     * Get information about the number of reviews. 
     * @return maximum number of completed reviews index
     * 
     */
    public int reviewIndex()
    {
        for(int index = 0; index < getAllReview().length; index++)
        {
            if(getReview(index).getBookingNo() == -1)
                return index;
        }
        return -1;
    }

    /**
     * set a quotation details within specified index 
     * 
     * @param index which index to store it in
     * @param hallNo the number of corresponding hall for quotation
     * @param ownerEmail email of owner
     * @param customerEmail email of customer
     * @param startDate proposed startdate of booking
     * @param proposed endDate of booking
     * @param bookEventType which type of event is it
     * @param Numberpeople proposed number of people attending
     * @param catering is catering required
     * @param menuOption if catering is required which option
     * @param contactEmail what is the email to contact
     * @param contactPhone what is the phone number to contact
     * @param additionalFee the additional fees for catering and/or photography service
     * @param TotalPrice total price
     * @param totalpRIceAfterDiscount total price after discount is applied
     * @param photography is photography servces required
     * @param ownerConfirmation has owner confirmed
     * @param cusIScONCESSION IS CUSTOMER A CONCENcession
     * @paraM IsBook has the quotation been turned to a booking
     */
    public void setQuotation(int index, int hallNo, String ownerEmail, String customerEmail, String startDate, String endDate, 
    String bookEventType, int numberPeople, boolean catering, String menuOption, boolean photography, String contactEmail, 
    String contactPhone, double additionalFee, double totalPrice, double totalPriceAfterDiscount,
    boolean ownerConfirmation, boolean cusIsConcession, boolean isBook)
    {
        quotas[index] = new Quotation(hallNo, ownerEmail, customerEmail, startDate, endDate, bookEventType, numberPeople, catering, 
            menuOption, photography, contactEmail, contactPhone, additionalFee, totalPrice, totalPriceAfterDiscount,
            ownerConfirmation,cusIsConcession,isBook);
    }

    /**
     * method to return all bookings
     * 
     * @return all booking list
     */
    public Booking[] getAllBook()
    {
        return book;
    }

    /**
     * method to get specific information about a booking
     * 
     * @param index index needs to be specified to get specific information relevant
     */
    public Booking getBook(int index)
    {
        return book[index];
    }

    /**
     * method to set a booking within a specified index
     * 
     *@param index index is required to place booking details within the index
     *@param reviewStatus Has there been a review made to the booking
     *@param bookingStatus has it been booked
     *@param hallNo which hall is it for
     *@param customerNo which customer is it for
     *@param ownerEmail which owner does the hall belong to
     *@param customerEmail which customer is making the booking
     *@param quotationIndex what is the quotation index which is being turned to booking
     *@param startDate what is the startDate of the booking
     *@param endDate what is the enddate of the booking
     *@param cardholderName card details name of the cardholder
     *@param cardNumber what is the cardnumber of the card
     *@param expiryDate what is the expiry of the card
     *@param CVV what is the cvv number of the card
     *@param deposit how much is the deposit 
     */
    public void setBook(int index, boolean reviewStatus, String bookingStatus, int hallNo, int customerNo, String ownerEmail, 
    String customerEmail, int quotationIndex, String startDate, String endDate, String cardholderName, 
    String cardNumber, String expiryDate, String CVV, double deposit)
    {
        book[index] = new Booking(reviewStatus, bookingStatus, hallNo, customerNo, ownerEmail, customerEmail, quotationIndex, startDate, endDate,
            cardholderName, cardNumber, expiryDate, CVV, deposit);
    }

    /**
     *Get specific information about a hall
     *
     *@param index index is required to get the specific information within index
     */
    public Hall getHalls(int index)
    {
        return halls[index];
    }

    /**
     *get all hall information
     *
     *@return return hall information
     */
    public Hall[] getAllHalls()
    {
        return halls;
    }

    /**
     *method to check the hall name. Whether the hall name exists for the
     * owner of the hall. If it exists, returns hall index
     * if not, return 01
     *
     *@param email owner email needs to be specified to search
     *@param hallName what is the hall name that is being searched
     *@return index returns specific index with the name of the hallowner
     *@return -1 return -1 if not found
     */
    public int checkHallName(String email, String hallName)
    {

        for(int index = 0 ; index < getAllHalls().length; index++)
        {
            if(getHalls(index).getHallOwnerEmail().equals(email) && getHalls(index).getHallName().equals(hallName))
                return index;
        }
        return -1;
    }

    /**
     *method to set information within specified index for hall
     *
     *@param index place information within the specified index
     *@param hallOwnerEmail email of the owner email
     *@param hallName hall name 
     *@param hallAddress address of hall
     *@param hallCapacity Maximum capacity of hall
     *@param hallPrice base price of hall
     *@param anniversary does hall host anniversary
     *@param birthday does hall host birthday event
     *@param weddingCeremony does hall host wedding Cremony event
     *@param weddingReception does hall host wedding Reception event
     *@param catering does the hall offer catering services
     *@param menuDesc the menu description for catering
     *@param photography does the hall offer photography service
     */
    public void setHall(int index, String hallOwnerEmail, String hallName, String hallAddress, int hallCapacity, double hallPrice, 
    boolean anniversary, boolean birthday, boolean weddingCeremony, boolean weddingReception, boolean catering, 
    String menuDesc, boolean photography)
    {
        halls[index] = new Hall(hallOwnerEmail, hallName, hallAddress, hallCapacity, hallPrice, anniversary, birthday, weddingCeremony,
            weddingReception, catering, menuDesc, photography);
    }

    /**
     *method to display the event type of the hall
     *
     *@param index place information within the specified index
     *
     */
    public void displayEventType(int index)
    {
        String a = "";
        String b = "";
        String c = "";
        String r = "";

        if(halls[index].getAnniversary() == true)
        {
            a = "Anniversary, ";
        }
        if(halls[index].getBirthday() == true)
        {      
            b = "Birthday, ";
        }
        if(halls[index].getWeddingCeremony() == true)
        {   
            c = "Wedding Ceremony, ";
        }
        if(halls[index].getWeddingReception() == true)
        {   
            r = "Wedding Reception,";
        }
        System.out.println("    " + a + b + c + r);
    }

    /**
     *method to display hall information within the index
     *
     *@param index information within the specified index
     *
     */
    public void displayHalls(int index)
    {
        System.out.println("The hall number " + (index + 1) + ": ");
        System.out.println("Hall Name: " + halls[index].getHallName());
        System.out.println("  Address: " + halls[index].getHallAddress());
        System.out.println("  Capacity: " + halls[index].getHallCapacity());
        System.out.println("  Price: " + halls[index].getHallPrice());
        System.out.println("  Events Type: " );

        displayEventType(index);

        String catering = "";
        String photo = "";
        if(halls[index].getCatering() == true)
        {
            catering = "Catering, ";
        }
        if(halls[index].getPhotography() == true)
        {      
            photo = "Photography ";
        }
        if(halls[index].getCatering() == true || halls[index].getPhotography() == true)
        {
            System.out.println("  Service Type: " + catering + photo);
        }
        if(avgDR(index) < 0)
        {
            System.out.println("  There is no Rate! No one book this hall yet! " );
        }
        if(avgDR(index) > 0)
        {
            System.out.println("  Decoration Rating: " + avgDR(index));
            System.out.println("  Service Rating: " + avgSR(index));
            System.out.println("  overall Rating: " + avgOR(index));
        }
        System.out.println("\r\n");
    }

    /**
     *method to display average decoration rating of the hall
     *
     *@param hallNo find the information within the specified index
     *
     */
    public double avgDR(int hallNo)
    {
        double dR = 0;
        double times = 0;
        double avgDR = 0;
        for(int index = 0; index < getAllReview().length; index++)
        {
            if(getReview(index).getHallNo() == hallNo)
            {
                times = times + 1;
                double temp = getReview(index).getDecorationRating();
                dR = temp + dR;
            }
        }
        avgDR = dR / times;
        return avgDR;
    }

    /**
     *method to display service rating of the hall
     *
     *@param hallNo find the relevant information within the specified hallNo
     *
     */
    public double avgSR(int hallNo)
    {
        double sR = 0;
        double times = 0;
        double avgSR = 0;
        for(int index = 0; index < getAllReview().length; index++)
        {
            if(getReview(index).getHallNo() == hallNo)
            {
                times = times + 1;
                double temp = getReview(index).getServiceRating();
                sR = temp + sR;
            }
        }
        avgSR = sR / times;
        return avgSR;
    }

    /**
     *method to display overall rating of the hall
     *
     *@param hallNo find the relevant information within the specified hallNo
     *
     */

    public double avgOR(int hallNo)
    {
        double oR = 0;
        double times = 0;
        double avgOR = 0;
        for(int index = 0; index < getAllReview().length; index++)
        {
            if(getReview(index).getHallNo() == hallNo)
            {
                times = times + 1;
                double temp = getReview(index).getOverallRating();
                oR = temp + oR;
            }
        }
        avgOR = oR / times;
        return avgOR;
    }    

    /**
     *method to display all halls which is relevant to the login owner of 
     *email address. owner email address is unique
     *
     *@param email owner email is required to be specified
     *
     */
    public void displayOwnerHall(String email)
    {
        int index = 0;
        for(index = 0; index < getAllHalls().length; index++)
        {
            if(getHalls(index).getHallOwnerEmail().equals(email))
            {
                displayHalls(index);
            }
        }

    }

    /**
     *method to check whether review has been left by specified user
     *
     *@param cusEmail what is the customer email
     *@return 1 if details are found relevant to customer email
     *@return 0 if details are not found relevant customer email
     *
     */
    public int checkReview(String cusEmail)
    {
        int index = -1;
        for(index = 0; index < getAllBook().length; index++)
        {
            if(getBook(index).getCustomerEmail().equals(cusEmail) && 
            getBook(index).getBookingStatus().equals("F") && getBook(index).getReviewStatus() == false)
            {
                return 1;
            }
        }
        return 0;
    }

    /**
     *method check booking review
     * 
     *@param cusEmail customer email needs to be specified
     */
    public void checkBookingReview(String cusEmail)
    {
        int index = -1;
        boolean display = false;
        for(index = 0; index < getAllBook().length; index++)
        {
            if(getBook(index).getCustomerEmail().equals(cusEmail) && 
            getBook(index).getBookingStatus().equals("F") && getBook(index).getReviewStatus() == false)
            {
                int quotaIndex = getBook(index).getQuotationIndex();
                int hallIndex = getBook(index).getHallNo();
                System.out.println("Your booking references " + index + ": ");
                System.out.println("Hall Name: " + halls[hallIndex].getHallName());
                System.out.println("  Date: " + getBook(index).getStartDate() + " to " + getBook(index).getEndDate() 
                    + "\r\n");
                display = true;                    
            }
        }

        if(display == true)
            System.out.println("Do You want to rate a service(y/n): ");
        if(display == false)
            System.out.println("You have not complete a book yet! Please finish a book then come to make review!");
    }

    /**
     *method check the number of days of the booking
     *
     *@param startDate which date is booking supposed to start
     *@param endDate which date is booking supposed to end
     *@return 0 if booking is for 1 day
     *@return 1 if booking is for multiple days
     *@return -1 if booking is not possible
     */
    public int checkDate(Date startDate, Date endDate)
    {
        if(startDate.compareTo(endDate) == 0)
        {
            System.out.println("Book success with 1 day");
            return 0;
        }
        else if(startDate.compareTo(endDate) < 0)
        {
            System.out.println("Book success with multi days!");
            return 1;
        }
        else if(startDate.compareTo(endDate)> 0)
        {
            System.out.println("Book fail!");
            return -1;
        }

        System.out.println("Impossible!");
        return -1;
    }

    /**
     *method to check whether quotations exists
     *
     *@return index return the number of index
     *@return -1 if not found
     */
    public int blankQuota()
    {
        int index = 0;
        while(index < getAllQuota().length)
        {
            if(getBook(index).getHallNo() == -1)
                return index;
            index++;
        }
        return -1;
    }

    /**
     *method to return booking booking
     *
     *@return index number of indexes
     *@return -1 return empty book index
     */
    public int bookID()
    {
        int index = 0;
        while(index < getAllBook().length)
        {
            if(getBook(index).getHallNo() == -1)
                return index;
            index++;
        }
        return -1;
    }

    /**
     *check whether customer booking exists
     *
     *@return 1 if booking exists
     *@return 0 if booking doesn't exist
     */
    public int checkBook()
    {
        for(int i = 0; i < getAllBook().length; i++)
        {
            if(getBook(i).getHallNo() != -1)
                return 1;
        }
        return 0;
    }

    /**
     *check whether hall list exists
     *
     *@return 1 if hall exists
     *@return 0 if hall doesn't exist
     */
    public int checkHallList()
    {
        for(int i = 0; i < getAllHalls().length; i++)
        {
            if(getHalls(i).getHallCapacity() != -1)
                return 1;
        }
        return 0;
    }

    /**
     *searching for specific hall methid
     *
     *@param searchName name must be specified by user when searching
     */
    public void searchHallName(String searchName)
    {
        int index = 0;
        boolean returnHall = false;
        for(index = 0; index < getAllHalls().length; index++)
        {
            if(getHalls(index).getHallName().equals(searchName))
            {
                displayHalls(index);
                returnHall = true;
            }
        }
        
        if(returnHall == false)
            System.out.println("There is no hall named '" + searchName +"'!");
    }

    /**
     *customer search hall method validation check
     *
     *@param searchName name must be specified by user when searching
     *@return 0 if customer search hall not valid
     *@return 1 if customer search hall is valid
     */
    public int customerSearchHallValid(String searchName)
    {
        for(int index = 0; index < getAllHalls().length; index++)
        {
            if(getHalls(index).getHallName().equals(searchName))
            {
                return 1;
            }
        }
        return 0;
    }

    /**
     *Display and validation check for search hall by customer
     *
     *@param searchName name must be specified by user when searching
     */
    public void customerSearchHall(String searchName)
    {
        Scanner input = new Scanner(System.in);
        int index = 0;
        boolean returnHall = false;
        int hallID = -1;

        for(index = 0; index < getAllHalls().length; index++)
        {
            if(getHalls(index).getHallName().equals(searchName))
            {
                returnHall = true;
                displayHalls(index);
            }
        }

        if(returnHall == false)
        {
            System.out.println("There is no hall named '" + searchName +"'!");
        }
    }

    /**
     *method to check quotation
     *
     *@param ownerEmail ownerEmail must be specified
     *@return 1 if found and owner hasn't replied
     *@return 0 if not found
     */
    public int checkQuotation(String ownerEmail)
    {
        for(int index = 0; index < getAllQuota().length; index++)
        {
            if(getQuota(index).getHallNo() != -1 && getQuota(index).getOwnerEmail().equals(ownerEmail)
            && getQuota(index).getOwnerConfirmation() == false)
                return 1;
        }
        return 0;
    }

    /**
     *method to display the quotation list of owner
     *
     *@param ownerEmail ownerEmail must be specified
     */
    public void displayOwnerQuotation(String ownerEmail)
    {
        for(int index = 0; index < getAllQuota().length; index++)
        {
            if(getQuota(index).getOwnerEmail().equals(ownerEmail) && getQuota(index).getOwnerConfirmation() == false)
            {
                int hallNo = getQuota(index).getHallNo();
                System.out.println("Quotation number is: " + index);
                System.out.println("  Hall Name: " + halls[hallNo].getHallName());
                System.out.println("  Address: " + halls[hallNo].getHallAddress());
                System.out.println("  Price: " + halls[hallNo].getHallPrice());
                System.out.println("  Number of People: " + getQuota(index).getNumberPeople());
                System.out.println("  Events Type: "  + getQuota(index).getBookEventType());
                System.out.println("  Date: " + getQuota(index).getStartDate() + " to " + getQuota(index).getEndDate());
                String cater = "";
                if(getQuota(index).getCatering() == true)
                {
                    cater = "Yes! and customer option is: " + getQuota(index).getMenuOption();
                }
                else
                {
                    cater = "No";
                }
                System.out.println("  Catering request: " + cater);
                String photo = "";
                if(getQuota(index).getPhotography() == true)
                {
                    photo = "Yes";
                }
                else
                {
                    photo = "No";
                }
                System.out.println("  photography request: "+ photo + "\r\n");
            }
        }
    }

    /**
     *method to process quotation information from customer input
     *
     *@param customerEmail customer Email must be specified
     *
     */
    public void quotationInfo(String cusEmail)
    {
        for(int index = 0; index < getAllQuota().length; index++)
        {
            if(getQuota(index).getCustomerEmail().equals(cusEmail))
            {
                int hallNo = getQuota(index).getHallNo();
                System.out.println("Quotation number: " + index);
                System.out.println("  Hall Name: " + halls[hallNo].getHallName());
                System.out.println("  Address: " + halls[hallNo].getHallAddress());
                System.out.println("  Number of People: " + getQuota(index).getNumberPeople());
                System.out.println("  Events Type: "  + getQuota(index).getBookEventType());
                if(getQuota(index).getCatering() == true)
                {
                    System.out.println("  Catering: Yes");
                }
                if(getQuota(index).getPhotography() == true)
                {
                    System.out.println("  Photography: Yes");
                }
                System.out.println("  Date: " + getQuota(index).getStartDate() + " to " + getQuota(index).getEndDate());

                if(getQuota(index).getOwnerConfirmation() == false)
                {
                    System.out.println("Your Confirmation Status of Quotation is Not confirmed");
                }
                if(getQuota(index).getOwnerConfirmation() == true)
                {
                    System.out.println("Your Confirmation Status of Quotation is Confirmed");
                    System.out.println("Cost:");
                    double hallPrice = halls[hallNo].getHallPrice();
                    double addFee = getQuota(index).getAdditionalFee();
                    double total = hallPrice + addFee;

                    System.out.println("  Hall Price: $" + hallPrice);
                    System.out.println("  Additional fee: $" + addFee);
                    System.out.println("  Total: $" + total);
                    getQuota(index).setTotalPrice(total);

                    if(getQuota(index).getCusIsConcession() == true)
                    {
                        double discountRate = 1 - 0.05;
                        double afterTotal = total * discountRate;
                        System.out.println("  Total after Discout: $" + afterTotal);
                        getQuota(index).setTotalPriceAfterDiscount(afterTotal);
                    }
                    if(getQuota(index).getIsBook() == true)
                    {
                        System.out.println("This Quotation has Booked and therefore you cannot use it again");
                    }
                }
                System.out.println("\r\n");
            }
        }
    }

    /**
     *method to check whether quotation has been confirmed specific to customer
     *
     *@param customerEmail customer Email must be specified
     *
     */
    public int checkQuotationStatus(String cusEmail)
    {
        for(int index = 0; index < getAllQuota().length; index++)
        {
            if(getQuota(index).getCustomerEmail().equals(cusEmail) && getQuota(index).getOwnerConfirmation() == true)
            {
                return 1;
            }
        }

        return 0;
    }

    /**
     *accessor method to list all discount within list
     *
     *@return list of discount
     */
    public Discount[] getAllDiscount()
    {
        return discount;
    }

    /**
     *accessor method get discount with specific index
     *
     *@param index position to be specified
     *@return discount information regarding the specified index
     */
    public Discount getDiscount(int index)
    {
        return discount[index];
    }

    /**
     *set discount information to specific discount 
     *
     *@param index position to be specified
     *@param discountName discount name to be specified
     *@param discountDesc Discount description to be specified
     *@param discountRate discount rate to be specified
     */
    public void setDiscount(int index, String discountName, String discountDesc, double discountRate)
    {
        discount[index] = new Discount(discountName,discountDesc,discountRate);
    }

    /**
     *method to write discount to discount file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void writeDisc(String fileName)
    {
        String message = "";
        String output = "";
        try
        {
            PrintWriter outputFile = new PrintWriter(fileName);
            for(int index = 0; index < getAllDiscount().length; index++)
            {
                if(getDiscount(index).getDiscountName().equals("????"))
                {
                    break;
                }

                message = getDiscount(index).getDiscountName()+ "," 
                + getDiscount(index).getDiscountDesc() + "," 
                + getDiscount(index).getDiscountRate() + ";";
                output = output + message;
            }
            outputFile.println(output);
            outputFile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     *method to read discount to discount file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void readDisc(String fileName)
    {
        try
        {
            FileReader inputFile = new FileReader(fileName);
            Scanner parser = new Scanner(inputFile);
            String[] array = parser.nextLine().split(";");
            for(int index = 0; index < array.length; index++)
            {
                String[] elements = array[index].split(",");
                String discountName = elements[0];
                String discountDesc = elements[1];
                double discountRate = Double.parseDouble(elements[2]);

                setDiscount(index, discountName, discountDesc, discountRate);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }    

    /**
     *method to write review to reviewfile
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void writeReview(String fileName)
    {
        String message = "";
        String output = "";
        try
        {
            PrintWriter outputFile = new PrintWriter(fileName);
            for(int index = 0; index < getAllReview().length; index++)
            {
                if(getReview(index).getCusEmail().equals("????"))
                {
                    break;
                }
                message = getReview(index).getBookingNo() + "," 
                + getReview(index).getHallNo() + "," 
                + getReview(index).getCusEmail() + ","
                + getReview(index).getDecorationRating() + "," 
                + getReview(index).getServiceRating() + ","
                + getReview(index).getOverallRating() + "," 
                + getReview(index).getReviewDesc() + ";";
                output = output + message;
            }
            outputFile.println(output);
            outputFile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     *method to read review to review file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void readReview(String fileName)
    {
        try
        {
            FileReader inputFile = new FileReader(fileName);
            Scanner parser = new Scanner(inputFile);
            String[] array = parser.nextLine().split(";");
            for(int index = 0; index < array.length; index++)
            {
                String[] elements = array[index].split(",");
                int bookingNo = Integer.parseInt(elements[0]);
                int hallNo =  Integer.parseInt(elements[1]);
                String cusEmail = elements[2];
                double decorationRating = Double.parseDouble(elements[3]);
                double serviceRating = Double.parseDouble(elements[4]);
                double overallRating = Double.parseDouble(elements[5]);
                String reviewDesc = elements[6];

                setReview(index, bookingNo, hallNo, cusEmail, decorationRating, serviceRating, overallRating, reviewDesc);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     *method to write quotation to quotation file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void writeQuota(String fileName)
    {
        String message = "";
        String output = "";
        try
        {
            PrintWriter outputFile = new PrintWriter(fileName);
            for(int index = 0; index < getAllQuota().length; index++)
            {
                if(getQuota(index).getCustomerEmail().equals("????"))
                {
                    break;
                }
                message = getQuota(index).getHallNo() + "," 
                + getQuota(index).getOwnerEmail() + "," 
                + getQuota(index).getCustomerEmail() + ","
                + getQuota(index).getStartDate() + "," 
                + getQuota(index).getEndDate() + "," 
                + getQuota(index).getBookEventType() + ","
                + getQuota(index).getNumberPeople() + "," 
                + getQuota(index).getCatering() + "," 
                + getQuota(index).getMenuOption() + ","
                + getQuota(index).getPhotography() + "," 
                + getQuota(index).getContactEmail() + "," 
                + getQuota(index).getContactPhone() + ","
                + getQuota(index).getAdditionalFee() + "," 
                + getQuota(index).getTotalPrice() + "," 
                + getQuota(index).getTotalPriceAfterDiscount() + "," 
                + getQuota(index).getOwnerConfirmation() + ","
                + getQuota(index).getCusIsConcession() + "," 
                + getQuota(index).getIsBook() + ";";
                output = output + message;
            }
            outputFile.println(output);
            outputFile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     *method to read quotation to quotation file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void readQuota(String fileName)
    {
        try
        {
            FileReader inputFile = new FileReader(fileName);
            Scanner parser = new Scanner(inputFile);
            String[] array = parser.nextLine().split(";");
            for(int index = 0; index < array.length; index++)
            {
                String[] elements = array[index].split(",");
                int hallNo = Integer.parseInt(elements[0]);
                String ownerEmail = elements[1];
                String customerEmail = elements[2];
                String startDate = elements[3];
                String endDate = elements[4];
                String bookEventType = elements[5];
                int numberPeople = Integer.parseInt(elements[6]); 
                boolean catering = Boolean.parseBoolean(elements[7]);  
                String menuOption = elements[8];
                boolean photography = Boolean.parseBoolean(elements[9]);   
                String contactEmail = elements[10];
                String contactPhone = elements[11]; 
                double additionalFee = Double.parseDouble(elements[12]);
                double totalPrice = Double.parseDouble(elements[13]); //display
                double totalPriceAfterDiscount = Double.parseDouble(elements[14]);
                boolean ownerConfirmation = Boolean.parseBoolean(elements[15]);
                boolean cusIsConcession = Boolean.parseBoolean(elements[16]);
                boolean isBook = Boolean.parseBoolean(elements[17]);

                setQuotation(index, hallNo, ownerEmail, customerEmail, startDate, endDate, bookEventType, numberPeople, catering, 
                    menuOption, photography, contactEmail, contactPhone, additionalFee, totalPrice, totalPriceAfterDiscount,
                    ownerConfirmation,cusIsConcession,isBook);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     *method to write hall to hall file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void writeHall(String fileName)
    {
        String message = "";
        String output = "";
        try
        {
            PrintWriter outputFile = new PrintWriter(fileName);
            for(int index = 0; index < getAllHalls().length; index++)
            {
                if(getHalls(index).getHallName().equals("????"))
                {
                    break;
                }
                message = getHalls(index).getHallOwnerEmail() + "," 
                + getHalls(index).getHallName() + "," 
                + getHalls(index).getHallAddress() + ","
                + getHalls(index).getHallCapacity() + ","
                + getHalls(index).getHallPrice() + "," 
                + getHalls(index).getAnniversary() + "," 
                + getHalls(index).getBirthday() + "," 
                + getHalls(index).getWeddingCeremony() + "," 
                + getHalls(index).getWeddingReception() + "," 
                + getHalls(index).getCatering() + "," 
                + getHalls(index).getMenuDesc() + "," 
                + getHalls(index).getPhotography() + ";" ;
                output = output + message;
            }
            outputFile.println(output);
            outputFile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     *method to read hall to hall file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void readHall(String fileName)
    {
        try
        {
            FileReader inputFile = new FileReader(fileName);
            Scanner parser = new Scanner(inputFile);
            String[] array = parser.nextLine().split(";");
            for(int index = 0; index < array.length; index++)
            {
                String[] elements = array[index].split(",");
                String hallOwnerEmail = elements[0];
                String hallAddress = elements[1];
                String hallName = elements[2];
                int hallCapacity = Integer.parseInt(elements[3]);
                double hallPrice = Double.parseDouble(elements[4]);
                boolean anniversary = Boolean.parseBoolean (elements[5]);
                boolean birthday = Boolean.parseBoolean(elements[6]);
                boolean weddingCeremony = Boolean.parseBoolean(elements[7]);
                boolean weddingReception = Boolean.parseBoolean(elements[8]);
                boolean catering = Boolean.parseBoolean(elements[9]);
                String menuDesc = elements[10];
                boolean photography = Boolean.parseBoolean(elements[11]);

                setHall(index, hallOwnerEmail, hallAddress, hallName, hallCapacity, hallPrice, anniversary,
                    birthday, weddingCeremony, weddingReception, catering, menuDesc, photography);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     *method to write booking to booking file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void writeBook(String fileName)
    {
        String message = "";
        String output = "";
        try
        {
            PrintWriter outputFile = new PrintWriter(fileName);
            for(int index = 0; index < getAllBook().length; index++)
            {
                if(getBook(index).getCustomerEmail().equals("????"))
                {
                    break;
                }
                message = getBook(index).getReviewStatus() + "," 
                + getBook(index).getBookingStatus() + "," 
                + getBook(index).getHallNo() + ","
                + getBook(index).getCustomerNo() + ","
                + getBook(index).getOwnerEmail() + "," 
                + getBook(index).getCustomerEmail() + "," 
                + getBook(index).getQuotationIndex() + "," 
                + getBook(index).getStartDate() + "," 
                + getBook(index).getEndDate() + "," 
                + getBook(index).getCardholderName() + "," 
                + getBook(index).getCardNumber() + "," 
                + getBook(index).getExpiryDate() + ","
                + getBook(index).getCVV() + ","
                + getBook(index).getDeposit() + ";" ;
                output = output + message;
            }
            outputFile.println(output);
            outputFile.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }

    /**
     *method to read booking to booking file
     *
     *@param fileName to be specified 
     *@exception exception File not found
     *@exception exception Unknown error occur during input/output
     */
    public void readBook(String fileName)
    {
        try
        {
            FileReader inputFile = new FileReader(fileName);
            Scanner parser = new Scanner(inputFile);
            String[] array = parser.nextLine().split(";");
            for(int index = 0; index < array.length; index++)
            {
                String[] elements = array[index].split(",");

                boolean reviewStatus = Boolean.parseBoolean(elements[0]);
                String bookingStatus = elements[1];
                int hallNo = Integer.parseInt(elements[2]);
                int customerNo = Integer.parseInt(elements[3]);
                String ownerEmail = elements[4];
                String customerEmail = elements[5];
                int quotationIndex = Integer.parseInt(elements[6]);
                String startDate = elements[7];
                String endDate = elements[8];
                String cardholderName = elements[9];
                String cardNumber = elements[10];
                String expiryDate = elements[11];
                String CVV = elements[12];
                double deposit = Double.parseDouble(elements[13]);

                setBook(index, reviewStatus, bookingStatus, hallNo, customerNo, ownerEmail, customerEmail,
                    quotationIndex, startDate, endDate, cardholderName, cardNumber, expiryDate, CVV, deposit);
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(fileName + " not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O error occured");
        }
    }
    
    public int checkOwnerHall(String ownerEmail)
    {
        for(int index = 0; index < getAllHalls().length; index++)
        {
            if(getHalls(index).getHallOwnerEmail().equals(ownerEmail))
                return 1; //there is a owner hall could select
        }   
        return 0;   //the hall may not for this owner
    }
    
    public int checkHallIsOwner(int hallNo, String ownerEmail)
    {
        if(getHalls(hallNo).getHallOwnerEmail().equals(ownerEmail))
            return 1;
        else
            return 0;
    }
    
     /**
     * Method to find maximum hall index of input
     */
    public int hallIndex()
    {
        int index = 0;
        while(index < getAllHalls().length)
        {
            if(getHalls(index).getHallCapacity() == -1)
                return index;
            index++;
        }
        return -1;
    }
}
