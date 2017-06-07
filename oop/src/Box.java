//盒子类 不是真实存在
public class Box {
	//属性 n 一般都是私有的
	//[<访问说明符>] [<修饰符>] <数据类型> <变量名>=[初始值];
	private int length;//有默认值 0
	private int width;
	private int height;
	//方法v
	/*[<访问说明符>] [<修饰符>] <返回类型> <方法名> ([参数列表])
	{
			//方法体
	} */
	public int calVolumn(int l,int w,int h){
		return l*w*h;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static void main(String[] args) {
		//类创建对应的对象(真实存在，占用了内存)，通过对象名box.访问该对象的内存
		Box box = new Box();
		System.out.println(box.length);
		
		int result = box.calVolumn(20, 10, 10);
		System.out.println("体积为"+result);
	}
	
}
