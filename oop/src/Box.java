//������ ������ʵ����
public class Box {
	//���� n һ�㶼��˽�е�
	//[<����˵����>] [<���η�>] <��������> <������>=[��ʼֵ];
	private int length;//��Ĭ��ֵ 0
	private int width;
	private int height;
	//����v
	/*[<����˵����>] [<���η�>] <��������> <������> ([�����б�])
	{
			//������
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
		//�ഴ����Ӧ�Ķ���(��ʵ���ڣ�ռ�����ڴ�)��ͨ��������box.���ʸö�����ڴ�
		Box box = new Box();
		System.out.println(box.length);
		
		int result = box.calVolumn(20, 10, 10);
		System.out.println("���Ϊ"+result);
	}
	
}
