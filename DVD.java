package Abstraction_3_Library;

public class DVD extends LibraryItem {
	int duration;
	public DVD(String title, String itemId, int duration) {
		super(title,itemId);
		this.duration = duration;
	}
	
	@Override
	public void checkOut() {
		if(!isCheckedOut()) {
			setCheckedOut(true);
			System.out.println("DVD: "+getTitle()+" with "+duration + "has been checked out");
		} else {
			System.out.println("DVD: "+getTitle()+"is already checked out");
		}
	}
	public String itemId() {
		return itemId;
	}
}
