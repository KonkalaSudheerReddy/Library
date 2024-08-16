package Abstraction_3_Library;

public class LibraryManagement {
	public static void main(String[] args) {
		Library library = new Library();
		LibraryItem book1 = new Book("One Piece","B001","Eichiro Oda");
		LibraryItem Maga1 = new Magazine("Forbes","M001","Banks");
		LibraryItem Dvd_1 = new DVD("Gintama","D001",50);
		
		
		library.addItem(book1);
		library.addItem(Maga1);
		library.addItem(Dvd_1);
		System.out.println("----------------");
		library.displayAllItems();
		
		library.checkedOutItem("B001");
		library.checkedOutItem("M001");
		
		library.displayAllItems();
		
//		System.out.println("\nReturning an item:");
        library.returnItem("B001");

//        System.out.println("\nTrying to check out the same item again:");
        library.checkedOutItem("B001");
	}

}
