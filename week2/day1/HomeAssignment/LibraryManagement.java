package week2.day1.HomeAssignment;

public class LibraryManagement 
{

	public static void main(String[] args) 
	{
		Library lib=new Library();
		System.out.println("Book name : "+lib.addBook("Selenium learning"));
		lib.issueBook();
	}

}
