//������
public class Test {
	public static void main(String[] args) {
	//	User user = new User(); //int i =10;
		/*User user = new User(333333,"123214@12.com");
		//System.out.println(user.pwd);//privateʹ�����Բ��ɼ�
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
		
		Book book1 = new Book("�߼�java������");//���췽�����������г�ʼ��
		book1.setName("�߼�java������2");//set��ֵ
		book1.setPrice(34.0);
		
		book1.display();
		
		double m = book1.money();
		System.out.println(m);
		m = book1.money(3);
		System.out.println(m);
		
		
	}
}
