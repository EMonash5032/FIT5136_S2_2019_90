import java.io.*;
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
        reviews[index] = new Review(bookingNo,hallNo,cusEmail,decorationRating,serviceRating,overallRating,reviewDesc);
    }
    
    public Quotation[] getAllQuota()
    {
        return quotas;
    }
    
    public Quotation getQuota(int index)
    {
        return quotas[index];
    }
    
    public int reviewIndex()
    {
        for(int index = 0; index < getAllReview().length; index++)
        {
            if(getReview(index).getBookingNo() == -1)
                return index;
        }
        return -1;
    }
    
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
    public void setBook(int index, boolean reviewStatus, String bookingStatus, int hallNo, int customerNo, String ownerEmail, 
                         String customerEmail, int quotationIndex, String startDate, String endDate, String cardholderName, 
                         String cardNumber, String expiryDate, String CVV, double deposit)
    {
        book[index] = new Booking(reviewStatus, bookingStatus, hallNo, customerNo, ownerEmail, customerEmail, quotationIndex, startDate, endDate,
                                  cardholderName, cardNumber, expiryDate, CVV, deposit);
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
     *  Check the hall name in same owner's hall exist or not. If exist return the hall index, if Not return -1
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
     * #24
     */
    public void setHall(int index, String hallOwnerEmail, String hallName, String hallAddress, int hallCapacity, double hallPrice, 
                        boolean anniversary, boolean birthday, boolean weddingCeremony, boolean weddingReception, boolean catering, 
                        String menuDesc, boolean photography)
    {
        halls[index] = new Hall(hallOwnerEmail, hallName, hallAddress, hallCapacity, hallPrice, anniversary, birthday, weddingCeremony,
                                weddingReception, catering, menuDesc, photography);
    }
    
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
     * #26
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
            System.out.println("  Service Type: " + catering + photo + "\r\n");
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
        if(halls[index].getCatering() == false || halls[index].getPhotography() == false)
        {
            System.out.println("\r\n");
        }
        
    }
    
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
     * print all hall which relative the login owner by email address, email address is unique
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
     *  return an empty book Index
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
     *  check customer exist book or not if exist book return 1, no return 0
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
     *  check hall list exist at least one hall or not if Yes return 1, no return 0
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
     * #31  String type with "n" name search  "d" date search "e" event type
     */
    public void searchHallName(String searchName)
    {
        int index = 0;
        for(index = 0; index < getAllHalls().length; index++)
        {
            if(getHalls(index).getHallName().equals(searchName))
                displayHalls(index);
        }
    }
    
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
                break;
            }
        }
        
        if(returnHall == false)
        {
            System.out.println("There is no hall named '" + searchName +"'!");
        }
    }
    
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
     * display the quotation list refer to owner 
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
     * #23  hall list
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
                    System.out.println("Your Confirmation Status of Quotation is Not confirm");
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
                        System.out.println("This Quotation is Booked, you cannot use it again");
                    }
                }
                System.out.println("\r\n");
            }
        }
    }
    
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
    
    public Discount[] getAllDiscount()
    {
        return discount;
    }
    
    public Discount getDiscount(int index)
    {
        return discount[index];
    }
    
    public void setDiscount(int index, String discountName, String discountDesc, double discountRate)
    {
        discount[index] = new Discount(discountName,discountDesc,discountRate);
    }
    
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
}
