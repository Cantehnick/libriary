package by.htp.homework;

public class MainApp {

	public static void main(String[] args) {

		Book b = new Book();
		Book b1 = new Book("Name1", 1925);
		Book b2 = new Book("Name2", 1844);
		Book b3 = new Book("Name3", 1915);
		Book b4 = new Book("Name4", 1998);
		Book b5 = new Book("Name5", 1945);

		Author a1 = new Author("Name a1", "Surname a1");
		Author a2 = new Author("Name a2", "Surname a2");
		Author a3 = new Author("Name a3", "Surname a3");
		Author a4 = new Author("Name a4", "Surname a4");
		Author a5 = new Author("Name a5", "Surname a5");

		CaseBook cb = new CaseBook();

		Man man=new Man();


		
		
man.enroleBook(b1, cb, a1);
man.enroleBook(b2, cb, a2);
man.enroleBook(b3, cb, a3);
man.enroleBook(b4, cb, a4);
man.enroleBook(b5, cb, a5);
man.enroleBook(b3, cb, a1);
man.printBook(cb);
System.out.println("=====================");
cb.search("Name a2");
System.out.println("=====================");
cb.deleteBook("Name3"); man.printBook(cb);
System.out.println("=====================");
cb.bubleSort(); man.printBook(cb);

		
	}
}