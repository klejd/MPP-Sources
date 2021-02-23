package prob2;

public class Book extends LendingItem {

	private String isbn;
	private String authorFirstName;
	private String authorLastName;

	public Book(String isbn, String title, String authorFirstName, String authorLastName) {
		super(title);
		this.isbn = isbn;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

}
