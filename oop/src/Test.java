//测试类
public class Test {
	public static void main(String[] args) {
	//	User user = new User(); //int i =10;
		/*User user = new User(333333,"123214@12.com");
		//System.out.println(user.pwd);//private使得属性不可见
		System.out.println(user.getPwd());
		
		user.setPwd(444444);
		System.out.println(user.getPwd());
		
		
		int pwd = user.find("11@12.com");
		System.out.println(pwd);
		
		boolean b = user.modify(888886, 111111);
		System.out.println(b);
		System.out.println(user.getPwd());*/
		
		testBook();
	}
	
	public static void testBook(){
		Book book = new Book();
		book.display();
		
		Book book1 = new Book("高级java网络编程");//构造方法对书名进行初始化
		book1.setName("高级java网络编程2");//set赋值
		book1.setPrice(34.0);
		
		book1.display();
		
		double m = book1.money();
		System.out.println(m);
		m = book1.money(3);
		System.out.println(m);
		
		
	}
}
