
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    private String description;
    private double price;

    /**
     * Create a product with description and price.
     */
    public Product(String aDescription, double aPrice)
    {
        description = aDescription;
        price = aPrice;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getDescription()
    {
        return description;
    }
}
