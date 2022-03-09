
/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address
{
    String storeName;
    String streetName;
    int streetNumber;
    String cityName;
    
    public Address(String storeName, String streetName, int streetNumber, String cityName)
    {
        this.storeName = storeName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.cityName = cityName;
    }
    
    public String format()
    {
        return storeName + " - " + streetName + ", " + streetNumber + "\n" + cityName;
    }
}
