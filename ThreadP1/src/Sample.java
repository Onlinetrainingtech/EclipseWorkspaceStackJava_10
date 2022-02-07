class Demo extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("This is run methods.."+currentThread().getName());
		System.out.println("Priority of Thread.."+currentThread().getPriority());
		Thread.sleep(10000);
		get1();
		}
		catch(InterruptedException t)
		{
			
		}
	}
	void get1()
	{
		System.out.println("This is the noraml method..");
	}
}
public class Sample {

	public static void main(String[] args) 
	{
		
        Demo t1=new Demo();
        Demo t2=new Demo();
        t1.setName("azar");
        try
        {
        System.out.println("JoinIn");
        t1.join(10000);
        System.out.println("JoinOut");
        t1.start();//Thread-0
        }
        catch(InterruptedException t)
        {
        	
        }
        t2.start();//Thread-1
        t1.setPriority(Thread.MAX_PRIORITY);
	}

}
