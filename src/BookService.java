import java.util.ArrayList;
import java.util.List;

public class BookService {

	private List<BookDetails> books;

	public BookService() {
		books = new ArrayList<BookDetails>(); // New list, to store the objects
	}

	// CREATE
	public void save(BookDetails bookDetails) {
		books.add(bookDetails);
	}

	//READ
	public BookDetails get(String id) {
		for (BookDetails book : books) { // Do list contains record

			String bookName = book.getBookName();
			if (bookName.equals(id)) { // searching by id
				return book;
			}
		}
		return null;
	}

	//UPDATE
	public void update(BookDetails bookDetails) {
		// find index
		String bookToFind = bookDetails.getBookName();

		for (int i = 0; i < books.size(); i++) { // cycle in full List size
			String currentBookId = books.get(i).getBookName();

			if (currentBookId.equals(bookToFind)) { // Search for specific id and compares if is't equal
				books.set(i, bookDetails); // replace with updated record
				break;
			}
		}
	}

	//DELETE
	public void remove(String id) {
		String bookToFind = id;

		for (int i = 0; i < books.size(); i++) {
			String currentBookId = books.get(i).getBookName();

			if (currentBookId.equals(bookToFind)) {
				books.remove(i); // replace record with 0
				break; // brake, for List size is changed
			}
		}
	}

	

}
