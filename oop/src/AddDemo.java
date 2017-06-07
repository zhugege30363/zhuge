
public class AddDemo {
	//对+进行方法重载
	//方法定义
	public static int  add(int a,int b){
		return a+b;
	}
	public static float  add(float a,float b){
		return a+b;
	}
	public static double  add(double a,double b){
		return a+b;
	}
	
	public  static long  add(long a,long b){
		return a+b;
	}
	
	public static void main(String[] args) {
		//AddDemo demo = new AddDemo();
//	double result = demo.add(10.0, 20);
		double result = AddDemo.add(10.0, 20);
		System.out.println(result);
	}
}
