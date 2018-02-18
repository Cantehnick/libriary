package by.htp.homework;

public class Man {

	public void enroleBook(Book b, CaseBook cb, Author authors) {
		cb.addBook(b);
		cb.addAuthors(authors);
	}

	public void printBook(CaseBook cb) {

		Book[] list = cb.getBook();
		//Author[] list1 = cb.getAuthor();

		for (int i = 0; i < list.length; i++) {
			//for (int j = 0; j < list1.length; j++) {
				// System.out.println(group.getStudents()[i]);
				if (list[i] != null) { // && list1[j] != null) {
					System.out.println(cb.getBook()[i].getName() 
						+ "   " + cb.getBook()[i].getPubDate() + "   "
						+ cb.getAuthor()[i].getName()
							+ "  " + cb.getAuthor()[i].getSurName());
				
				}
			}

		}
	//}

}