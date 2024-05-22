package useful.ch07;

 public class Book {
	private String title;
	private Author author;
	
	public Book(String title, String authorName, String authorEmail) {
		this.title = title;
		this.author = new Author(authorName, authorEmail);
	} // 생성자
	
	public void printBookDetails() {
		System.out.println("Book Title : " +title);
		System.out.println("작가 이름 : " + author.name + ", 이메일 : " +author.email);
	}
	
	public class Author {
		private String name;
		private String email;
		
		public Author(String name, String eamil) {
			this.name = name;
			this.email = email;
		} // Author 생성자
	} // end of Author class

} // end of Book class

