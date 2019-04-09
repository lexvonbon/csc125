package chapter12;


/**
 * Describes the billing address
 *
 * @BGronneberg
 * @12-03-2018
 */
public class Address
{
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;    
    
    /*
     * Constructs a mailing address
     * @param aName the receipient name
     * @param aStreet the street
     * @param aCity the city
     * @param aState the state
     * @param aZip the zip
     */
    public Address(String aName, String aStreet, String aCity, String aState, String aZip)
    {
       name = aName;
       street = aStreet;
       city = aCity;
       state = aState;
       zip = aZip;    
    }
    
    /*
     * Formats the billing address
     * @return the formatted billing address
     */
    public String format()
    {
    
      return name+"\n" + street + "\n"+ city+","+state+ " "+ zip;
    }
    
}
