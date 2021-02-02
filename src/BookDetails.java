import java.util.Date;

public class BookDetails {

	private String bookName;
	private String imdb;
	private String price;
	private int count;
	private boolean inStore;
	private Date lastUpdate;
	
	public BookDetails() {
	
	}

	public BookDetails(String bookName) {
		this(bookName, null, null, 0);
	}
	
	public BookDetails(String bookName, String imdb, String price, int quant) {
		this.bookName = bookName;
		this.imdb = imdb;
		this.price = price;
		this.count = quant;
	}
	
	
	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getQuant() {
		return count;
	}

	public void setQuant(int quant) {
		this.count = quant;
	}

	public Date getLastadded() {
		return lastUpdate;
	}

	public void setLastadded(Date lastadded) {
		this.lastUpdate = lastadded;
	}

	public boolean isInstore() {
		return inStore;
	}

	public void setInstore(boolean instore) {
		this.inStore = instore;
	}

	@Override
	public String toString() {
		return "BookDetails [imdb = " + imdb + ", bookName = " + bookName + ", price = " + price + ", quant = " + count
				+ ", lastadded = " + lastUpdate + "]";
	}

}
