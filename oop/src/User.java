//1��	�������ҳ����У����������û����������ԣ��û�id���ǳƣ����룬�Ա�Email�������У��޸����룬�һ����루��Email���������������User�ࡣ
public class User {
	private int id;
	private String name;
	private int pwd=888888;
	private String sex;
	private String email="11@11.com";
	//��ȡ��õ�pwd���˽������
	public int getPwd(){
		return this.pwd;
	}
	//��˽������������и�ֵ
	public void setPwd(int pwd){
		this.pwd = pwd;
	}
	
	//�Լ�д���췽��
	/*public User(){//�޲εĹ��췽��
		System.out.println("�޲����Ĺ��췽���������ڴ棬ʹ��������Ĭ��ֵ");
	}
	public User(int pwd,String email){//�вεĹ��췽��
		System.out.println("�в����Ĺ��췽���������ڴ棬���������¸�ֵ");
		this.pwd = pwd;
		this.email = email;
	}
	//ȫ�ι��췽��
	public User(int id, String name, int pwd, String sex, String email) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.email = email;
	}*/
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int pwd, String email) {
		super();
		this.pwd = pwd;
		this.email = email;
	}
	public User(int id, String name, int pwd, String sex, String email) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//����ҵ�񷽷�   <��������> <������> ([�����б�])
	//�޸�����
	public boolean modify(int oldPwd,int newPwd){
		if(oldPwd==pwd){
			pwd = newPwd;
			return true;
		}else{
			System.out.println("���벻��ȷ");
			return false;
		}
		
	}
	
	//�һ����루��Email��������
	public int find(String email){
		if(this.email.equals(email)){//this.����/this.������this����ǰ��������ʱ�Ķ���
			return pwd;
		}else{
			System.out.println("email����ȷ");
			return -1;//���ش�����
		}
	}
	
	//main����һ������ֻ��һ������һ����ר�Ÿ���дmain
	/*
	 *public static void main(String[] args) {
		User user = new User();
		System.out.println(user.pwd);
		
		int pwd = user.find("11@12.com");
		System.out.println(pwd);
		
		boolean b = user.modify(888886, 111111);
		System.out.println(b);
		System.out.println(user.pwd);
	}*/
}
