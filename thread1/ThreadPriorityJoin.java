package thread1;

//demonstrate priority and join concept 
 
class Even implements Runnable 
{	String message;
	Thread e;
	Even(String m ,int p)
	{
		e= new Thread(this);
		message=m;
		e.setPriority(p);
		e.start();// start will call run method
	}
public void run()
{  try{  for( int i=0;i<10;i++)
	   {
		   System.out.println(message);
		   Thread.sleep(1000);//milliseconds
		   }
		}catch(Exception r) {}		
}}
public class ThreadPriorityJoin {
	public static void main(String[] args) throws Exception 
	{
		Even r= new Even("welcome", 10);    
		Even r1= new Even("welcome", Thread.MAX_PRIORITY);//10
		Even r2= new Even("welcome", Thread.MIN_PRIORITY);//1
		Even r3= new Even("welcome", Thread.NORM_PRIORITY);//5

		// Even r1= new Even("java",   7);
		r.e.join();
		r1.e.join();
		Message k= new Message();
		k.start();
		Banner b= new Banner();
		Thread s= new Thread(b);
		s.start();

	}
}















