//1、	在聊天室程序中，经分析，用户有以下属性：用户id，昵称，密码，性别，Email；方法有：修改密码，找回密码（用Email做条件）。请设计User类。
public class User {
	private int id;
	private String name;
	private int pwd=888888;
	private String sex;
	private String email="11@11.com";
	//获取或得到pwd这个私有属性
	public int getPwd(){
		return this.pwd;
	}
	//对私有属性密码进行赋值
	public void setPwd(int pwd){
		this.pwd = pwd;
	}
	
	//自己写构造方法
	/*public User(){//无参的构造方法
		System.out.println("无参数的构造方法申请了内存，使得属性有默认值");
	}
	public User(int pwd,String email){//有参的构造方法
		System.out.println("有参数的构造方法申请了内存，对属性重新赋值");
		this.pwd = pwd;
		this.email = email;
	}
	//全参构造方法
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
	//核心业务方法   <返回类型> <方法名> ([参数列表])
	//修改密码
	public boolean modify(int oldPwd,int newPwd){
		if(oldPwd==pwd){
			pwd = newPwd;
			return true;
		}else{
			System.out.println("密码不正确");
			return false;
		}
		
	}
	
	//找回密码（用Email做条件）
	public int find(String email){
		if(this.email.equals(email)){//this.属性/this.方法，this代表当前对象，运行时的对象
			return pwd;
		}else{
			System.out.println("email不正确");
			return -1;//返回错误码
		}
	}
	
	//main方法一个工程只有一个，有一个类专门负责写main
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
