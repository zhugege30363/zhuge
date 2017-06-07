
public class Book {
	//该类具有书名、出版社、单价、作者成员属性，
	private String name;
	private String press;
	private double price;
	private String author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {
		super();
		System.out.println("无参构造方法");
	}
	public Book(String name) {
		super();
		this.name = name;
	}
	public Book(String name, String press) {
		super();
		this.name = name;
		this.press = press;
	}
	public Book(String name, String press, double price) {
		super();
		this.name = name;
		this.press = press;
		this.price = price;
	}
	public Book(String name, String press, double price, String author) {
		super();
		this.name = name;
		this.press = press;
		this.price = price;
		this.author = author;
	}
	
	//写一个diaplay，显示所有的属性值
	public void display(){
		System.out.println(this.name+"\t"+press+"\t"+price+"\t"+author);
	}
	/*public String display(){
		return this.name+"\t"+press+"\t"+price+"\t"+author;
	}*/
	
	//定义一个方法money，求得购买数量的总金额。要求：没有传入数量（即没有参数）时，直接返回一本书的价格；当传入数量（即有参数）时，金额为单价*数量，且数量只能是int型。通过方法重载来实现
	public double money(){
		return price*1;
	}
	public double money(int number){
		return number*price;
	}
}
