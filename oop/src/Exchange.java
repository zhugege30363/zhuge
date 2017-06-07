
public class Exchange {
	//1、交换两个整形的值；
	public void change(int a,int b){
		int temp = a;
		a = b;
		b= temp;
		System.out.println("形参"+a+" "+b);
	}
	
	public void change(int[] m){
		int temp = m[0];
		m[0] = m[1];
		m[1]= temp;
		System.out.println("形参"+m[0]+" "+m[1]);
	}
	//2、交换Box对象的宽和长的值。 
	public void change(Box box){
		int temp = box.getWidth();
		box.setWidth(box.getLength());
		box.setLength(temp);
		
		System.out.println("形参"+box.getWidth()+" "+box.getLength());
	}
	
	public static void main(String[] args) {
		
		Exchange e = new Exchange();
		
		int x=30,y=20;//实际参数
		e.change(x, y);
		System.out.println("实参"+x+" "+y);
		
		int[] arr = {34,40};
		e.change(arr);
		System.out.println("实参"+arr[0]+" "+arr[1]);
		
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setLength(60);
		e.change(myBox);
		System.out.println("实参"+myBox.getWidth()+" "+myBox.getLength());
	}

}
