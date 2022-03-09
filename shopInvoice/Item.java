
/**
 * Write the quantity of an purchased item and get its total price.
 */
public class Item
{
    private int quantity;
    private Product theProduct;
    
    /**
     * Build a item with the product and its quantity.
     */
    
    public Item(Product aProduct, int aQuantity)
    {
        theProduct = aProduct;
        quantity = aQuantity;
    }
    
    /**
     * Calculate the total price of the purchased products.
     */
    
    public double getTotalPrice()
    {
        return theProduct.getPrice() * quantity;
    }
    
    public String format()
    {
        return theProduct.getDescription() + "  \t\t" + quantity + "\t\t" + getTotalPrice();
    }
}
