
public class Count
{
    private int serialNumber;//实例成员
    private static int counter;//静态成员，也称类成员
    public Count() 
    {
       counter++;
       serialNumber = counter;
       System.out.println("My serialNumber is： " + serialNumber);
	}
	public static void main(String args[])
	{
	  	System.out.println("At first,counter="+ counter);
	  	Count count1=new Count();
        		System.out.println("after create count1, counter="+counter);
	  	Count count2=new Count();
	  	System.out.println("At last counter="+counter);
	  	System.out.println("count1.serialNumber;"+count1.serialNumber);
        		System.out.println("count2.serialNumber:"+count2.serialNumber);
       		System.out.println("count1.counter:"+count1.counter);
        		System.out.println("count2.counter:"+count2.counter);
        		System.out.println("Count.counter:"+Count.counter);
   }
} 

