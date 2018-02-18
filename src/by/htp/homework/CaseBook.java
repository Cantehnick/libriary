package by.htp.homework;


public class CaseBook {

	private Book[] books;
	private int countB;
	private int countA;
	private Author[] authors;

	public void addBook(Book b) {
		if (this.books != null) {
			if (countB < books.length) {
				books[countB] = b;
				countB++;
			} else {
				Book[] books = new Book[this.books.length + 10];
				for (int i = 0; i < this.books.length; i++) {
					books[i] = this.books[i];
				}
				this.books = books;
				this.books[countB] = b;
				countB++;
			}
		} else {
			this.books = new Book[10];
			this.books[countB] = b;
			countB++;
		}
	}

	public Book[] getBook() {
		return books;
	}

	public Author[] getAuthor() {
		return authors;
	}

	public void addAuthors(Author a) {
		if (this.authors != null) {
			if (countA < authors.length) {
				authors[countA] = a;
				countA++;
			} else {
				Author[] authors = new Author[this.authors.length + 10];
				for (int j = 0; j < this.authors.length; j++) {
					authors[j] = this.authors[j];
					this.authors[countA] = a;
					countA++;
				}
			}
		} else {
			this.authors = new Author[10];
			this.authors[countA] = a;
			countA++;
		}
	}

	public void search(String name) {
		for (int i = 0; i < countB; i++) {
			if (name == authors[i].getName()) {
				System.out.println(books[i].getName() + "  " + books[i].getPubDate() + "   " + authors[i].getName()
						+ "   " + authors[i].getSurName());
			}

		}
	}

	public void deleteBook(String name) {
		for (int i = 0; i < countB; i++) {
			if (name == books[i].getName()) {
				this.books[i] = null;
			
				if (this.books[i] != null ) {
					for (int j = 0; j < countA; j++) {

						System.out.println(books[i].getName() + "  " + books[i].getPubDate() + "   "
								+ authors[i].getName() + "   " + authors[i].getSurName());
					}
				}
			}
		}
	}

	public void bubleSort() {
		
		Book a = new Book();
		for (int i = 0; i < this.countB; i++) {
			for (int j = 1; j < this.countB - i; j++) {
		if (books[j - 1].getPubDate() > books[j].getPubDate()) {
			if (books !=null ) {
			a = this.books[j - 1];
					this.books[j - 1] = this.books[j];
					this.books[j] = a;
				}
				
		}
			}
		}
	}
}
