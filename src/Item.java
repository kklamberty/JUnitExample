public class Item
{
    private String description;
    private int price;

    public Item(String productDescription, int productPrice)
    { //this provides a template telling what kind of thing the user should input
        description = productDescription;
        price = productPrice;
    } //end constructor

    public String getDescription()
    {
        return description;
    } //end getDescription

    public int getPrice()
    {
        return price;
    } // end getPrice

    public String toString()
    {
        return description + "\t$" + price/100+"."+ price % 100;
    }//end toString
} //end Item
