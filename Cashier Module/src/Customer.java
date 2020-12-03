/**
*@author Malik Kington
*@version 1.0
*/

import java.util.*;

public class Customer{
	
	private ArrayList<Invoice> inv = new ArrayList<Invoice>();
	private String fName;
	private String lName;
	private String contact;
	
	/**
	*Constructor for a customer object
	*@param fName customer's first name
	*@param lName customer's last name
	*@param contact customer's contact information
	*@param inv arraylist storing customer's invoices
	*/
	public Customer(String fName, String lName, String contact){
		this.contact = contact;
		this.fName = fName;
		this.lName = lName;
	}

	/**
	*Null constructor for a customer object
	*/
	public Customer(){

	}

	/**
	*Retrieves first name of customer
	*@return first name of customer
	*/
	public String getFName(){
		return fName;
	}
	
	/**
	*Retrieves last name of customer
	*@return last name of customer
	*/
	public String getLName(){
		return lName;
	}
	
	/**
	*Retrieves customer contact info
	*@return customer contact info
	*/
	public String getContact(){
		return contact;
	}

	
	/**
	*Adds an invoice to the arraylist
	*@param inv invoice to be added to arraylist
	*/
	public void addInv(Invoice inv){
		this.inv.add(inv);
	}

	/**
	*Updates customer's first name
	*@param fName customer's first name
	*/
	public void setFName(String fName){
		this.fName = fName;
	}
	
	/**
	*Updates customer's last name
	*@param lName customer's last name
	*/
	public void setLName(String lName){
		this.lName = lName;
	}
	
	/**
	*Updates customer's contact information
	*@param contact customer's contact information
	*/
	public void setContact(String contact){
		this.contact = contact;
	}

	/**
	*Converts Customer object to String
	*@return customer details as String
	*/
	public String toString(){
		System.out.println(fName+" "+lName);
		System.out.println("Contact: "+contact);
		return null;
	}

	/**
	*Converts Customer object to String with invoices
	*@param l string "all" to override toString()
	*@return customer details and invoices as String
	*/
	public String toString(String l){
		if (l.equalsIgnoreCase("All")){
			System.out.println(fName+" "+lName);
			System.out.println("Contact: "+contact);
			System.out.println();
			int i = 0;
			while (i<inv.size()){
				inv.get(i).toString();
				i++;
			}
		}
		return null;
	}
}