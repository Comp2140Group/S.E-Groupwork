import java.util.*;

public class Main{

	public static void main(String[] args){

		Item item = new Item(1243, "Pencil", 30, "Writing tool", 10.00);
		InventoryManagement inventory = new InventoryManagement();
		
		//CASE 1: ADD ITEM CORRECT
		inventory.addItem(item);

		//CASE 2: ADD ITEM INCORRECT
		item = new Item(1234, "Pencil", 30, "Writing tool", 10);
		inventory.addItem();

		//CASE 1: GET NAME
		item = new Item(1243, "Pencil", 30, "Writing tool", 10.00);
		item.getName();

		//CASE 1: UPDATE AMOUNT
		item.updateAmount(21);
		item.toString();

		//CASE 1: CHECKOUT BILL HAS ITEM
		TransMgmt transaction = new TransMgmt();
		transaction.addItem(item);
		transaction.checkout();

		//CASE 2: CHECKOUT BILL HAS NO ITEM
		transaction = new TransMgmt();
		transaction.checkout();
	}
}