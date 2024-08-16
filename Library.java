
package Abstraction_3_Library;

import java.util.*;
public class Library {
	private List<LibraryItem> items;
	
	public Library() {
		this.items = new ArrayList<>();
	}
	public void addItem(LibraryItem item) {
		items.add(item);
		System.out.println(item.getTitle()+" is added successfully.");
	}
	public void displayAllItems() {
		for(LibraryItem item : items) {
			item.displayInfo();
			System.out.println();
		}
	}
	public void checkedOutItem(String itemId) {
	    for(LibraryItem item:items) {
	        if(item.getItemId().equals(itemId)) {
	            item.checkOut();
	            return;
	        }
	    }
	    System.out.println("Item with ID: " + itemId + " not found.");
	}
	public void returnItem(String itemId) {
		for(LibraryItem item: items) {
			if(item.getItemId().equals(itemId)) {
				return;
			}
		}
		System.out.println("Item with ID: " + itemId + " not found.");
	}
}
