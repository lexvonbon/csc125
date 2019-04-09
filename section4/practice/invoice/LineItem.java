package chapter12;


/**
 * Describes a quantity of an article of product to purchase
 *
 * @BGronneberg
 * @12-03-2018
 */
public class LineItem
{
    private int quantity;
    private Product theProduct;    
    
    /**
     * Constructs an item from a product and quantity
     * @param aProduct the product
     * @param aQuantity the item quantity
     */
    public LineItem(Product aProduct, int aQuantity)
    {
       quantity = aQuantity;
       theProduct = aProduct;
    }
    
    
    /*
     * Computes the total cost of this line item
     * @return the total price
     */
    public double getTotalPrice()
    {
       return theProduct.getPrice()*quantity;
     
    }
    
    public String format()
    {
       return String.format("%-30s%8.2f%5d%8.2f", theProduct.getName(), theProduct.getDescription(), theProduct.getPrice(),
       quantity, getTotalPrice());
       
    }
       
       
}
