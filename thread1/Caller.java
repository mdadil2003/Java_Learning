package thread1;
class Call
{   
	//synchronized void show(String m)
	//synchronized 	static void show(String m)
    void show(String m) 
	{
		System.out.print("[");
		try
		{
			System.out.print(m);
			Thread.sleep(1000);
		}
		catch(InterruptedException r) {}
		System.out.print("]");
		
	}
}
public class Caller extends Thread{

	Call c;
	String message;
	Caller(Call r,String m)
	{
		c=r;
		message=m;
	}
	public void run()
	{ 
	//synchronized (Call.class) { Call.show()}
		synchronized(c)
	{
		c.show(message);
	 }
	}
	public static void main(String[] args) {
		Call c   = new Call();
		Caller  k= new Caller(c,"welcome");
		Caller  k1= new Caller(c,"java");
		Caller  k2= new Caller(c,"linux");
		k.start();
		k1.start();
		k2.start();
		

	}

}
