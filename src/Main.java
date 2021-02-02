
public class Main {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		
		//Create
		BookDetails testbook = new BookDetails("Vesture", "001122", "10.20", 10);
		//AND save after creating
		bookService.save(testbook);
		
		BookDetails testbook1 = new BookDetails("Matematika", "001133", "5.60", 5);
		//AND save after creating
		bookService.save(testbook);
		
		BookDetails testbook2 = new BookDetails("Socialas zinibas", "001144", "9.00", 0);
		//AND save after creating
		bookService.save(testbook);
		bookService.save(testbook1);
		bookService.save(testbook2);
		
		//Read
		BookDetails bookStored = bookService.get("Vesture");
		BookDetails bookStored1 = bookService.get("Matematika");
		BookDetails bookStored2 = bookService.get("Socialas zinibas");
		
		System.out.println("---------------------------------------");
		System.out.println(testbook);//->Test
		System.out.println(testbook1);//->Test
		System.out.println(testbook2);//->Test
		
		//Update book0 - > setting new parameters
		bookStored.setBookName("Latviesu val");
		bookStored.setImdb("0011");
		bookStored.setPrice("9.00");
		bookService.update(bookStored);
		

		//Update book1 - > setting new parameters
		bookStored1.setBookName("Matematiika vidussk.");
		bookStored1.setPrice("9.00");
		bookService.update(bookStored1);
		
		//Update book2 - > setting new parameters
		bookStored.setBookName("Latviesu literatura");
		bookStored.setImdb("445599");
		bookService.update(bookStored2);
		
		System.out.println("---------------------------------------");
		System.out.println(testbook);//->Test
		System.out.println(testbook1);//->Test
		System.out.println(testbook2);//->Test
		
		//Remove by id - > bookname
		bookService.remove("Latviesu literatura");
		bookService.save(bookStored);
		
		System.out.println("---------------------------------------");
		System.out.println(bookStored);//->Test
		System.out.println(bookStored1);//->Test
		System.out.println(bookStored2);//->Test
	}

}
