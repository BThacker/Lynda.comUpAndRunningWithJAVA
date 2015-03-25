// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

package realestatemls;

public class Property {
    
    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int numBeds;
    
    // constructor
    public Property(double askingPrice, String propertyType, double lotSize) {
        
        
        this.askingPrice = askingPrice; 
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        numBaths = 0;
        numBeds = 0;
    }
    
    public Property(double askingPrice, String propertyType, double lotSize, int numBaths, int numBeds) {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
    }
    
    public String toString() {
        return "Asking Price: $" + askingPrice +
                "\nProperty Type: " + propertyType +
                "\nLotSize: " + lotSize +
                "\nNumber of Baths: " + numBaths +
                "\nNumber of Bedroomss: " + numBeds;
    }
    
    public void setAskingPrice(double newValue) {
        askingPrice = newValue;
    }
    
}