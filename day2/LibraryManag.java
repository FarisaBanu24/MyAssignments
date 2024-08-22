package week1.day2;

public class LibraryManag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Library Mgt = new Library();
		Mgt.issueBook();
		String book = Mgt.addBook("School of Talents");
		System.out.println(book);
		
	}

}
