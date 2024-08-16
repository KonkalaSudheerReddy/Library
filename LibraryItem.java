package Abstraction_3_Library;

public abstract class LibraryItem {
	String title;
	String itemId;
	private boolean isCheckedOut;
	public LibraryItem(String title, String itemId) {
		this.title  = title;
		this.itemId = itemId;
	}
	public abstract void checkOut();
	
	public void displayInfo() {
		System.out.println("Title is : "+title);
		System.out.println("item Id is : "+itemId);
		System.out.println("Check Out Status : "+(isCheckedOut ? "Yes":"No"));
		System.out.println("=================================================");
	}
	protected void setCheckedOut(boolean status) {
		this.isCheckedOut = status;
	}
	
	public boolean isCheckedOut() {
		return isCheckedOut;
	}
	public String getTitle() {
		return title;
	}
	public String getItemId() {
		return itemId;
	}
//	protected abstract String itemId();
}
