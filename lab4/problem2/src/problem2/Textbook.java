package problem2;

public class Textbook extends Course{
	private String isbn;
	private String title;
	private String author;
	
	public Textbook(String isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return this.isbn+" "+this.title+" "+this.author;
	}
	
	public boolean equals(Object o){
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false;
		Textbook p = (Textbook)o;
		return isbn.equals(p.isbn) && title.equals(p.title) && author.equals(p.author);
	}
}
