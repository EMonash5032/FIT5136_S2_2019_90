    
    /**
     * Write a description of class Review here.
     *
     * @author (your name)
     * @version (a version number or a date)
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
        
        public int getBookingNo()
        {
            return bookingNo;
        }
        
        public int getHallNo()
        {
            return hallNo;
        }
        
        public String getCusEmail()
        {
            return cusEmail;
        }
        
        public double getDecorationRating()
        {
            return decorationRating;
        }
        
        public double getServiceRating()
        {
            return serviceRating;
        }
        
        public double getOverallRating()
        {
            return overallRating;
        }
        
        public String getReviewDesc()
        {
            return reviewDesc;
        }
        
        public void setBookingNo(int bookingNo)
        {
            this.bookingNo = bookingNo;
        }
        
        public void setHallNo(int hallNo)
        {
            this.hallNo = hallNo;
        }
        
        public void setCusEmail(String cusEmail)
        {
            this.cusEmail = cusEmail;
        }
        
        public void setDecorationRating(double decorationRating)
        {
            this.decorationRating = decorationRating;
        }
        
        public void setServiceRating(double serviceRating)
        {
            this.serviceRating = serviceRating;
        }
        
        public void setOverallRating(double overallRating)
        {
            this.overallRating = overallRating;
        } 
        
        public void setReviewDesc(String reviewDesc)
        {
            this.reviewDesc = reviewDesc;
        }
}
