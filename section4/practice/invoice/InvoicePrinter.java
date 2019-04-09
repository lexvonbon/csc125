package chapter12;


/**
 * Prints a sample invoice for a given set of products
 *
 * @BGronneberg
 * @12-3-2018
 */
public class InvoicePrinter
{
    public static void main(String[] args)
    {
    
       Address myAddress = new Address("Company A", "100 Main St", "AnyCity", "CA", "98795");
       
       Invoice myInvoice = new Invoice(myAddress);
       
       myInvoice.add(new Product("Toster", 29.95), 1);
       myInvoice.add(new Product("XBox 360", 500),2);
       myInvoice.add(new Product("Hair dryer", 31.86), 1);
       
       System.out.println(myInvoice.format());
    
    }
}
