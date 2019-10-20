
/**
 * This class is responsible for the most basic functions of the Hall Class
 * for the PrimeEvents System. The class is used by the BookingController Class
 *
 * @author Team 90
 * @since 10 September 2019
 * @version 21 October 2019
 */
public class Hall
{
    // instance variables - replace the example below with your own
    private String hallOwnerEmail;
    private String hallName;
    private String hallAddress;
    private int hallCapacity;
    private double hallPrice;
    private boolean anniversary;
    private boolean birthday;
    private boolean weddingCeremony;
    private boolean weddingReception;
    private boolean catering;
    private String menuDesc;
    private boolean photography;

    /**
     * Constructor for objects of class Hall
     */
    public Hall()
    {
        // initialise instance variables
        hallOwnerEmail = "????";
        hallName = "????";
        hallAddress = "????";
        hallCapacity = -1;
        hallPrice = -0.01;
        anniversary = false;
        birthday = false;
        weddingCeremony = false;
        weddingReception = false;
        catering = false;
        menuDesc = "????";
        photography = false;
    }

    /**
     * Method to set all information regarding a hall
     */
    public Hall(String hallOwnerEmail, String hallName, String hallAddress, int hallCapacity, double hallPrice, 
    boolean anniversary, boolean birthday, boolean weddingCeremony, boolean weddingReception, boolean catering, 
    String menuDesc, boolean photography) {
        this.hallOwnerEmail = hallOwnerEmail;
        this.hallName = hallName;
        this.hallAddress = hallAddress;
        this.hallCapacity = hallCapacity;
        this.hallPrice = hallPrice;
        this.anniversary = anniversary;
        this.birthday = birthday;
        this.weddingCeremony = weddingCeremony;
        this.weddingReception = weddingReception;
        this.catering = catering;
        this.menuDesc = menuDesc;
        this.photography = photography;
    }

    /**
     * display method for display hall 
     */
    public void display(String hallName, String hallAddress, int hallCapacity, double hallPrice, String hallEvents)
    {
        System.out.println("Hall Name: " + hallName);
        System.out.println("Hall Address: " + hallAddress);
        System.out.println("Hall Capacity: " + hallCapacity);
        System.out.println("Hall Price: " + hallPrice);
        System.out.println("Hall Events Type: " + hallEvents);
    }

    /**
     * Display method for display hall with display types 
     */
    public void displayHall()
    {
        System.out.println("Hall Name: " + hallName);
        System.out.println("Hall Address: " + hallAddress);
        System.out.println("Hall Capacity: " + hallCapacity);
        System.out.println("Hall Price: " + hallPrice);
        System.out.println("Hall Events Type: " + anniversary + birthday + weddingCeremony + weddingReception);
        System.out.println("menuDesc: " + menuDesc);
        System.out.println("photography: " + photography);
    }

    /**
     * Accessor method for Hall Owner Email
     */
    public String getHallOwnerEmail() {
        return hallOwnerEmail;
    }

    /**
     * Mutator method for Hall Owner Email
     */
    public void setHallOwnerEmail(String hallOwnerEmail) {
        this.hallOwnerEmail = hallOwnerEmail;
    }

    /**
     * Accessor method for Hall Name
     */
    public String getHallName() {
        return hallName;
    }

    /**
     * Mutator method for Hall Name
     */
    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    /**
     * Accessor method for Hall Address
     */
    public String getHallAddress() {
        return hallAddress;
    }

    /**
     * Mutator method for Hall Address
     */
    public void setHallAddress(String hallAddress) {
        this.hallAddress = hallAddress;
    }

    /**
     * Accessor method for Hall Capacity
     */
    public int getHallCapacity() {
        return hallCapacity;
    }

    /**
     * Mutator method for Hall Capacity
     */
    public void setHallCapacity(int hallCapacity) {
        this.hallCapacity = hallCapacity;
    }

    /**
     * Accessor method for Hall Price
     */
    public double getHallPrice() {
        return hallPrice;
    }

    /**
     * Mutator method for Hall Price
     */
    public void setHallPrice(double hallPrice) {
        this.hallPrice = hallPrice;
    }

    /**
     * Accessor method for Anniversary
     */
    public boolean getAnniversary() {
        return anniversary;
    }

    /**
     * Mutator method for Anniversary
     */
    public void setAnniversary(boolean anniversary) {
        this.anniversary = anniversary;
    }

    /**
     * Accessor method for Birthday
     */
    public boolean getBirthday() {
        return birthday;
    }

    /**
     * Mutator method for Birthday
     */
    public void setBirthday(boolean birthday) {
        this.birthday = birthday;
    }

    /**
     * Accessor method for Wedding Ceremony
     */
    public boolean getWeddingCeremony() {
        return weddingCeremony;
    }

    /**
     * Mutator method for Wedding Ceremony
     */
    public void setWeddingCeremony(boolean weddingCeremony) {
        this.weddingCeremony = weddingCeremony;
    }

    /**
     * Accessor method for Wedding Receiption
     */
    public boolean getWeddingReception() {
        return weddingReception;
    }

    /**
     * Mutator method for Wedding Reception
     */
    public void setWeddingReception(boolean weddingReception) {
        this.weddingReception = weddingReception;
    }

    /**
     * Accessor method for Catering
     */
    public boolean getCatering() {
        return catering;
    }

    /**
     * Mutator method for Catering
     */
    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    /**
     * Accessor method for Menu Description
     */
    public String getMenuDesc() {
        return menuDesc;
    }

    /**
     * Mutator method for Menu Description
     */
    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    /**
     * Accessor method for Photography
     */
    public boolean getPhotography() {
        return photography;
    }

    /**
     * Mutator method for Photography
     */
    public void setPhotography(boolean photography) {
        this.photography = photography;
    }
}
