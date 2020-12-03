/**
*@author Malik Kington
*@version 1.0
*/

import java.util.*;

public class Invoice{

	protected ArrayList<Item> bill = new ArrayList<Item>();
	private boolean type;
	private double subTotal;
	private double total;
	private Date date;
	private static int invNum = 0;
	private final double TAX = 0.165;
	
	/**
	*Constructor for a invoice object
	*/
	public Invoice(){
		invNum++;
	}
	
	/**
	*Retrieves the nature of transaction: cash or credit
	*@return String "Cash" or "Credit"
	*/
	public String getType(){
		if (type = true){
			return "Cash";
		}
		return "Credit";
	}
	
	/**
	*Retrieves total cost of items after tax
	*@return total cost of items after tax
	*/
	public double getTotal(){
		return total;
	}
	
	/**
	*Retrieves total cost of items before tax
	*@return total cost of items before tax
	*/
	public double getSubToal(){
		return subTotal;
	}
	
	/**
	*Retrieves the date of the invoice
	*@return the date of the invoice
	*/
	public Date getDate(){
		return date;
	}
	
	/**
	*Retrieves invoice number
	*@return invoice number
	*/
	public int getInvNum(){
		return invNum;
	}

	/**
	*Sets the date that the invoice was made
	*/
	public void setDate(){
		this.date = new Date();
	}

	/**
	*Sets the date that the invoice was made. Overrides setDate()
	*@param year year input
	*@param month month input
	*@param day day input
	*@param hr hour input
	*@param min minute input
	*/
	public void setDate(int year, int month, int day, int hr, int min){
		this.date = new Date(year, month, day, hr, min);
	}

	/**
	*Calculates the Total before tax of the items on the invoice
	*/
	public void calcSubTotal(){
		int i = 0;
		double sum = 0;
		while (i<bill.size()){
			sum += bill.get(i).getPrice();
			i++;
		}
		this.subTotal = sum;
	}

	/**
	*Calculates the Total after tax of the items on the invoice
	*/
	public void calcTotal(){
		double tax = subTotal * TAX;
		total = subTotal + tax;
	}

	/**
	*Sets the transaction nature of the invoice
	*@param type cash or credit as string
	*/
	public void setType(String type){
		if (type.equalsIgnoreCase("Cash")){
			this.type = true;
		}
		else if (type.equalsIgnoreCase("Credit")){
			this.type = false;			
		}
		System.out.println("Error");
	}

	/**
	*Adds an item to the invoice
	*@param item object to be added to bill
	*/
	public void addItem(Item item){
		bill.add(item);
	}
	
	/**
	*Removes an item from the invoice
	*@param itemID ID of object to be removed from invoice
	*/
	public void removeItem(int itemID){
		int i = 0;
		while(i<bill.size()){
			if (bill.get(i).getId()==itemID){
				i = bill.size();
			}
			i++;
		}
	}

	/**
	*Converts invoice object to string
	*@return invoice details as string
	*/
	public String toString(){
		System.out.println(invNum);
		System.out.println(date+"\n");
		int i = 0;
		while (i<bill.size()){
			System.out.println(bill.get(i).getName()+' '+String.valueOf(bill.get(i).getPrice()));
			i++;
		}
		calcSubTotal();
		calcTotal();
		String s = String.valueOf(subTotal);
		String tx = String.valueOf(subTotal*TAX);
		String t = String.valueOf(total);
		System.out.println("Subtotal: " + s);
		System.out.println("Sales Tax: " + tx);
		System.out.println("Total: " + t);
		return null;
	}
}