package Abstraction_3_Library;

public class Book extends LibraryItem{
	private String auther;
	public Book(String title, String itemId, String auther) {
		super(title,itemId);
		this.auther = auther;
	}
	@Override
	public void checkOut() {
		if(!isCheckedOut()) {
			setCheckedOut(true);
			System.out.println("Book : "+getTitle()+" by "+auther+" has been checked out");
		} else {
			System.out.println("Book : "+getTitle()+" is already checked out");
		}
	}
	public String itemId() {
		return itemId;
	}
}
