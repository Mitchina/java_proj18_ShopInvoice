/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
/**
 * Describes an invoice for a set of purchased items.
 */
public class Invoice
{
    private Address billingAddress;
    private ArrayList items; 
    
    /**
     * Build a invoice
     * @param anAddress is the address of the payer.
     */
    
    public Invoice(Address anAddress)
    {
        items = new ArrayList();
        billingAddress = anAddress;
    }
    
    /**
     * Add the charge for a product to the invoice
     * @param aProduct the product purchased
     * @param quantity the purchased quantity 
     */    
    public void add(Product aProduct, int quantity)
    {
        Item anItem = new Item(aProduct, quantity);
        items.add(anItem);
        
    }
    
    /**
     * The format of the invoice page.
     */    
    public String format()
    {
        String r = "***** I N V O I C E *****\n\n" + billingAddress.format() + "\n\nProduct\t\tTotal Qty\t\tTotal Price\n\n";
        
        for(int i=0; i<items.size(); i++)
        {
            Item nextItem = (Item)items.get(i);
            r += nextItem.format() + "\n";
        }
        
        r += "\n\t\t\tTotal Amount: €" + getAmountDue();
        
        return r;
    }
    
    /**
     * Calculate the amount due and return it
     */
    public double getAmountDue()
    {
        double amountDue = 0;
        
        for (int i = 0; i < items.size(); i++)
        {
            Item nextItem = (Item)items.get(i);
            amountDue += nextItem.getTotalPrice();
        }
        return amountDue;
    }
}
