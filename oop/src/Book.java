
public class Book {
	//������������������硢���ۡ����߳�Ա���ԣ�
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
		System.out.println("�޲ι��췽��");
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
	
	//дһ��diaplay����ʾ���е�����ֵ
	public void display(){
		System.out.println(this.name+"\t"+press+"\t"+price+"\t"+author);
	}
	/*public String display(){
		return this.name+"\t"+press+"\t"+price+"\t"+author;
	}*/
	
	//����һ������money����ù����������ܽ�Ҫ��û�д�����������û�в�����ʱ��ֱ�ӷ���һ����ļ۸񣻵��������������в�����ʱ�����Ϊ����*������������ֻ����int�͡�ͨ������������ʵ��
	public double money(){
		return price*1;
	}
	public double money(int number){
		return number*price;
	}
}
