package chapter12;

import java.util.ArrayList;
/**
 * Describes an invoice for a set of purchased products
  * @BGronneberg
 * @12-03-2018
 */
public class Invoice
{
    private Address billingAddress;
    private ArrayList<LineItem> items;    
    /**
     * Constructor for objects of class Invoice
     * @param anAddress the billing address
     */
    public Invoice(Address anAddress)
    {
         billingAddress = anAddress;
         items = new ArrayList<LineItem>();
    }
    
    /*
     * Computes the total amount due
     * @return the amount due
     */
    public double getAmountDue()
    {
      double amountDue = 0;
       
      System.out.println("Initial amount: "+ amountDue);
      for(LineItem item: items)
       {
          amountDue = amountDue + item.getTotalPrice();
       }
       
        System.out.println("Final amount: "+ amountDue);
       return amountDue;
    }    
    
    /*
     * Adds a charge for a product to this invoice
     * @param aProduct the product that a customer ordered
     * @param quantity the quantity of the product
     */
    public void add(Product aProduct, int quantity)
    {    
         LineItem anItem = new LineItem(aProduct, quantity);
         items.add(anItem);    
    }
    
    /*
     * Formats the invoice
     * @return the formatted invoice
     */
    public String format()
    {    
      String r = "     INVOICE\n\n"
      +billingAddress.format()
      +String.format("\n\n",
      "Description", "Price", "Qty", "Total");
      for(LineItem item: items)
      {
          r = r + item.format() + "\n";  
        
      }      
      r = r + String.format("\nAmount Due: ", getAmountDue());      
      return r;      
    }
}
