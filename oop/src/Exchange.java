
public class Exchange {
	//1�������������ε�ֵ��
	public void change(int a,int b){
		int temp = a;
		a = b;
		b= temp;
		System.out.println("�β�"+a+" "+b);
	}
	
	public void change(int[] m){
		int temp = m[0];
		m[0] = m[1];
		m[1]= temp;
		System.out.println("�β�"+m[0]+" "+m[1]);
	}
	//2������Box����Ŀ�ͳ���ֵ�� 
	public void change(Box box){
		int temp = box.getWidth();
		box.setWidth(box.getLength());
		box.setLength(temp);
		
		System.out.println("�β�"+box.getWidth()+" "+box.getLength());
	}
	
	public static void main(String[] args) {
		
		Exchange e = new Exchange();
		
		int x=30,y=20;//ʵ�ʲ���
		e.change(x, y);
		System.out.println("ʵ��"+x+" "+y);
		
		int[] arr = {34,40};
		e.change(arr);
		System.out.println("ʵ��"+arr[0]+" "+arr[1]);
		
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setLength(60);
		e.change(myBox);
		System.out.println("ʵ��"+myBox.getWidth()+" "+myBox.getLength());
	}

}
