/**
*@author Malik Kington
*@version 1.0
*/

import java.util.*;
import java.io.*;

package comp2140Code;

//	NEEDDS TO IMPORT ITEM CLASS
//	IMPLEMENT ADMIN PASSWORD FEATURE TO REMOVE ITEMS

public class TransMgmt{

	Invoice inv = new Invoice();
	Customer customer = new Customer();
//	GET ADMIN INFO FROM TEXT
//	Admin admin = new Admin();
	String filepath = "Transactions.txt";
	File transactions = new File(filepath);

	/**
	*Adds an item to the invoice
	*@param item object to be added to invoice
	*/
	public void addItem(Item item){
		inv.addItem(item);
	}

	/**
	*Removes an item from the invoice
	*@param item object to be removed from invoice
	*@param pword admin password
	*/
	public void removeItem(int itemID, String pword){
		
		inv.removeItem(itemID);
	}

	/**
	*Begins the Checkout process for a transaction
	*/
	public void checkOut() throws IOException{
		if (!inv.isEmpty()){
			try{
				String cash = "Cash";
				String credit = "Credit";
				Scanner check = new Scanner(System.in);
				FileWriter tw = new FileWriter(filepath, true);
				String i;

				System.out.println("\nCustomer First Name: ");
				i = check.next();
				customer.setFName(i);
				System.out.print("\nCustomer Last Name: ");
				i = check.next();
				customer.setLName(i);
				System.out.print("\nCustomer Contact: ");
				i = check.next();
				customer.setContact(i);
				System.out.println();

				inv.setDate();
				inv.toString();
				System.out.print("Cash or Credit: ");
				String type = check.next();
				if (cash.equalsIgnoreCase(type)){
					inv.setType(cash);
					tw.write(customer.toString()+"\n"+inv.toString()+"\n "+inv.getType());
					tw.close();
					System.out.println("Checkout Successful");
				}
				else if (credit.equalsIgnoreCase(type)){
					inv.setType(credit);
					tw.write(customer.toString()+"\n"+inv.toString()+"\n"+inv.getType());
					tw.close();
					System.out.println("Checkout Successful");
				}
				System.out.println("Error. Check out again.");
			}
			catch (Exception e){
				System.out.println("Error");
				e.printStackTrace();
			}
		}
		System.out.println("Error. Check out again.");
	}
}
