package Abstraction_3_Library;

public class Magazine extends LibraryItem{
	String issue;
	public Magazine(String title, String itemId, String issue) {
		super(title,itemId);
		this.issue = issue;
	}
	
	@Override
	public void checkOut() {
		if(!isCheckedOut()) {
			setCheckedOut(true);
			System.out.println("Magazine: "+getTitle()+ " (Issue: " + issue + ") has been checked out.");
		} else {
			System.out.println("Magazine: "+getTitle()+"is already checkd out");
		}
	}
	public String itemId() {
		return itemId;
	}
}
