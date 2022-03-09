
/**
 * Write a description of class InvoiceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InvoiceTest
{
    public static void main()
    {
        Address address = new Address("SHOP", "Shop Street", 3, "Florence");
        Invoice invoice = new Invoice(address);
        
        invoice.add(new Product("Toaster", 29.95), 3);
        invoice.add(new Product("Hairdryer", 24.95), 1);
        invoice.add(new Product("Elec. Brush", 19.99), 2);
        
        System.out.println(invoice.format());
    }
}
