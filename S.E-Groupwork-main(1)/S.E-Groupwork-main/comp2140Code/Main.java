package comp2140Code;

import java.io.IOException;



public class Main{

	public static void main(String[] args) throws IOException{

		//Case 1: Add Item (correct)
		Item item1 = new Item(1234, "Pencil", 20, "Writing tool", 10.00);
		InventoryManagement inventory = new InventoryManagement();
		inventory.addItem(item1);
		
		
		//CASE 1: UPDATE AMOUNT
		item1.updateAmount(21);
		System.out.println(item1.toString());
		
		//CASE 1: CHECKOUT BILL HAS ITEM
		TransMgmt transaction = new TransMgmt();
		transaction.addItem(item1);
		transaction.checkOut();

		//CASE 2: CHECKOUT BILL HAS NO ITEM
		transaction = new TransMgmt();
		transaction.checkOut();
	}
}
