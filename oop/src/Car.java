
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
 		System.out.println("共创建"+count+"台车；");
 		System.out.println("这是第"+count+"台车,是"+this.name+"！");
 		System.out.println("i的值是："+i);
 		System.out.println("----------------------------");
 			
 	}
    public static void main(String[] args) 
    {
        
        Car car1=new Car("红旗 尊驾");  
        Car car2=new Car("宝马 X5"); 
        Car car3=new Car("尼桑 天籁"); 
        Car car4=new Car("斯巴鲁 森林人");
        Car car5=car4;
        System.out.println(car5.name);       
        
    }
    
}

