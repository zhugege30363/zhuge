
public class Car 
{
 	static int count=0;
 	int i=0;
 	String name;
 	public Car(String name)
 	{
 		count++;
 		i++;
 		this.name=name;
 		System.out.println("������"+count+"̨����");
 		System.out.println("���ǵ�"+count+"̨��,��"+this.name+"��");
 		System.out.println("i��ֵ�ǣ�"+i);
 		System.out.println("----------------------------");
 			
 	}
    public static void main(String[] args) 
    {
        
        Car car1=new Car("���� ���");  
        Car car2=new Car("���� X5"); 
        Car car3=new Car("��ɣ ����"); 
        Car car4=new Car("˹��³ ɭ����");
        Car car5=car4;
        System.out.println(car5.name);       
        
    }
    
}

