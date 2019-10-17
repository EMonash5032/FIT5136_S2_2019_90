    
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
        private String cusEmail;
        private String startDate;
        private String endDate;
        private String bookEventType;
        private int numberPeople;
        private boolean catering;
        private String menuOption;
        private boolean photography;
        private String contactEmail;
        private String contactPhone;
    
        /**
         * Constructor for objects of class Bookinging
         */
        public Booking()
        {
            // initialise instance variables
            reviewStatus = false;
            bookingStatus = "????";
            hallNo = 0;
            cusEmail = "????";
            startDate = "????";
            endDate = "????";
            bookEventType = "????";
            numberPeople = 0;
            catering = false;
            menuOption = "????";
            photography = false;
            contactEmail = "????";
            contactPhone = "????";
        } 
        
        /**
         * Constructor for objects of class Bookinging
         */
        public Booking(boolean reviewStatus,String bookingStatus,int hallNo,String cusEmail,String startDate,String endDate,
                          String bookEventType,int numberPeople,boolean catering,String menuOption,boolean photography,
                          String contactEmail, String contactPhone)
        {
            // initialise instance variables
            this.reviewStatus = reviewStatus;
            this.bookingStatus = bookingStatus;
            this.hallNo = hallNo;
            this.cusEmail = cusEmail;
            this.startDate = startDate;
            this.endDate = endDate;
            this.bookEventType = bookEventType;
            this.numberPeople = numberPeople;
            this.catering = catering;
            this.menuOption = menuOption;
            this.photography = photography;
            this.contactEmail = contactEmail;
            this.contactPhone = contactPhone;
        }
    
       
        /**
    
         */
        public void displayBooking()
        {
            System.out.println("review Status: " + reviewStatus);
            System.out.println("booking Status: " + bookingStatus);
            System.out.println("hall No: " + hallNo);
            System.out.println("customer Email: " + cusEmail);
            System.out.println("Start Date: " + startDate);
            System.out.println("End Date: " + endDate);
            System.out.println("EventType for booking: " + bookEventType);
            System.out.println("Number of People: " + numberPeople);
            System.out.println("catering: " + catering);
            System.out.println("Menu Option: " + menuOption);
            System.out.println("photography: " + photography);
            System.out.println("Contact Email: " + contactEmail);
            System.out.println("Contact Phone: " + contactPhone);
        }
        
        public boolean getReviewStatus()
        {
            return reviewStatus;
        }
        
        public String getBookingStatus()
        {
            return bookingStatus;
        }
        
        public int getHallNo()
        {
            return hallNo;
        }
        
        public String getCusEmail()
        {
            return cusEmail;
        }
        
        public String getStartDate()
        {
            return startDate;
        }
        
        public String getEndDate()
        {
            return endDate;
        }

        public String getBookEventType()
        {
            return bookEventType;
        }
        
        public int getNumberPeople()
        {
            return numberPeople;
        }
        
        public boolean getCatering()
        {
            return catering;
        }
        
        public String getMenuOption()
        {
            return menuOption;
        }
        
        public boolean getPhotography()
        {
            return photography;
        }
        
        public String getContactEmail()
        {
            return contactEmail;
        }
        
        public String getContactPhone()
        {
            return contactPhone;
        }
        
        public void setReviewStatus(boolean reviewStatus)
        {
            this.reviewStatus = reviewStatus;
        }
        
        public void setBookingStatus(String bookingStatus)
        {
            this.bookingStatus = bookingStatus;
        }
        
        public void setHallNo(int hallNo)
        {
            this.hallNo = hallNo;
        }
        
        public void setCusEmail(String cusEmail)
        {
            this.cusEmail = cusEmail;
        }
        
        public void setStartDate(String startDate)
        {
            this.startDate = startDate;
        }
        
        public void setEndDate(String endDate)
        {
            this.endDate = endDate;
        }

        public void setBookEventType(String bookEventType)
        {
            this.bookEventType = bookEventType;
        }
        
        public void setNumberPeople(int numberPeople)
        {
            this.numberPeople = numberPeople;
        }
        
        public void setCatering(boolean catering)
        {
            this.catering = catering;
        }
        
        public void setMenuOption(String menuOption)
        {
            this.menuOption = menuOption;
        }
        
        public void setPhotography(boolean photography)
        {
            this.photography = photography;
        }
        
        public void setContactEmail(String contactEmail)
        {
            this.contactEmail = contactEmail;
        }
        
        public void setContactPhone(String contactPhone)
        {
            this.contactPhone = contactPhone;
        }
}
