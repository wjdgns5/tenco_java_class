package basic.ch15;

public class Book {
	
	private int totalPage; // 책의 페이지
	private String title; // 책 제목
	private String author;  // 책 저자
	
	// 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// 생성자 오버로딩
	public Book(String title, String author, int totalPage) {
		this(title, author); // 위의 생성자를 불러내는 방법
		this.totalPage = totalPage;
	}
	
	// get 메서드
	public int getTotalPage() {
		return totalPage;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	// showInfo() 메서드
	public void showInfo() {
		System.out.println(">>> 책 정보 <<<");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
	}

} // end of class
