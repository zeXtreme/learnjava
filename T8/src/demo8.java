public class demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bk = new Book();

		bk.setBookName("");
		bk.setAuthor("");
		bk.setPrice(23.4);
		bk.setPub("");

		bk.Display();

	}

}

class Book {

	private String bookName;
	private String author;
	private double price;
	private String pub;

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = price;
		} else {
			this.price = 0.0;
		}
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public void Display() {
		System.out.print("书名：" + bookName + "\n作者：" + author + "\n价格：" + price
				+ "\n出版社：" + pub);

	}

}