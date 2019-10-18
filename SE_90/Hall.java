
/**
 * Write a description of class Hall here.
 *
 * @author Team 90
 * @version (10.09.2019)
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
     * #1
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

    public String getHallOwnerEmail() {
        return hallOwnerEmail;
    }

    public void setHallOwnerEmail(String hallOwnerEmail) {
        this.hallOwnerEmail = hallOwnerEmail;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getHallAddress() {
        return hallAddress;
    }

    public void setHallAddress(String hallAddress) {
        this.hallAddress = hallAddress;
    }

    public int getHallCapacity() {
        return hallCapacity;
    }

    public void setHallCapacity(int hallCapacity) {
        this.hallCapacity = hallCapacity;
    }

    public double getHallPrice() {
        return hallPrice;
    }

    public void setHallPrice(double hallPrice) {
        this.hallPrice = hallPrice;
    }

    public boolean getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(boolean anniversary) {
        this.anniversary = anniversary;
    }

    public boolean getBirthday() {
        return birthday;
    }

    public void setBirthday(boolean birthday) {
        this.birthday = birthday;
    }

    public boolean getWeddingCeremony() {
        return weddingCeremony;
    }

    public void setWeddingCeremony(boolean weddingCeremony) {
        this.weddingCeremony = weddingCeremony;
    }

    public boolean getWeddingReception() {
        return weddingReception;
    }

    public void setWeddingReception(boolean weddingReception) {
        this.weddingReception = weddingReception;
    }

    public boolean getCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public boolean getPhotography() {
        return photography;
    }

    public void setPhotography(boolean photography) {
        this.photography = photography;
    }
}
