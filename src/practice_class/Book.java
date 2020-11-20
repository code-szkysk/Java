package practice_class;

public class Book {

	String title;
	String author;
	int year;

	Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	Book(String title, String author){
		this(title, author, 1900);
	}

	Book(){
		this("なし", "不明", 1900);
	}

	public void disp() {
		System.out.println(this.title + ":" + this.author + ":" + this.year);
	}

}
