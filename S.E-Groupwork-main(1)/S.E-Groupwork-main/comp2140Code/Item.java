/**
 * @author David Byfield
 * @version 1.0
 */
package comp2140Code;

public class Item{
    private int idNum;
    private String itemName;
    private int itemAmount;
    private String description;
    private double price;

    /**
     * Constructor for an item object.
     * @param idNum identification number of an item
     * @param itemName name of an item
     * @param itemAmount quantity of an item available 
     * @param description type of item
     * @param price the cost of an item
     */
    public Item(int idNum, String itemName, int itemAmount, 
    String description, double price){
        this.idNum = idNum;
        this.itemName = itemName;
        this.itemAmount = itemAmount;
        this.description = description;
        this.price = price;
    }

    /**
     * Retrieves the identification number of an item.
     * @return the identification number of an item
     */
    public int getId(){
        return this.idNum;
    }

    /**
     * Retrieves the name of an item.
     * @return the name of an item
     */
    public String getName(){
        return this.itemName;
    }

    /**
     * Retrieves the description of an item.
     * @return the description of an item
     */
    public String getDescription() {
        return this.description;
    }
 
    /**
     * Retrieves the amount on an item available in the inventory.
     * @return the amount of an item present in the inventory
     */
    public int getAmount(){
        return this.itemAmount;
    }

    /**
     * Retrieves the price of an item.
     * @return the price of an item
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Updates the amount of an item in the inventory.
     * @param newAmount an update of the amount of an item in the inventory
     */
    public void updateAmount(int newAmount){
        this.itemAmount = newAmount;
    }

    /**
     * Updates the price of an item in the inventory.
     * @param newPrice an update of the new price for an item
     */
    public void updatePrice(double newPrice){
        this.price = newPrice;
    }

    /**
     * Converts the item object to a string.
     * @param item object of class item
     * @return item details as a string
     */
    public String toString(Item item){
        int id = item.getId();
        String name = item.getName();
        int amount = item.getAmount();
        double iprice = item.getPrice();

        return String.valueOf(id)+','+name+','+String.valueOf(amount)+','+
        String.valueOf(iprice);
    }


}
