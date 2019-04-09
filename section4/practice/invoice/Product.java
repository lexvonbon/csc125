package chapter12;


/**
 * Describes the product and its price
 *
 * @BGronneberg
 * @12-03-2018
 */
public class Product
{
    private String description;
    private double price;
    private String name;
    
    /*
     * Constructs a product from a description and a price
     * @param aDescription the product's description
     * @param aPrice the price of the product
     * @param aName the name of the product
     */
    public Product(String aName, String aDescription, double aPrice)
    {
          description = aDescription;
          price = aPrice;
          name = aName;
    }
    
    /*
     * Gets the product description
     * @return description product description
     */
    public String getDescription()
    {
      return description;
    
    }
    
    public String getName()
    {
       return name;
    }
    /*
     * Gets the product price
     * @return price the product price
     */    
    public double getPrice()
    {
       return price;
    }
    
    
}
