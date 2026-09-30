package thread1;
//wap to create multithreaded application 
class Message extends Thread
{	@Override
	public void run()
	{ try{
		   for( int i=0;i<10;i++)
		   {
			   System.out.println(" Message");
			   Thread.sleep(1000);//milliseconds
		   }
	}catch(Exception r) {}		
}}


public class ThreadExample2 {
	public static void main(String[] args) 
	{
		Message m= new Message();
		m.start();// create child process 
		          // call run 
try
{
   for( int i=0;i<10;i++)
   {
	   System.out.println(" welcome");
	   Thread.sleep(1000);//milliseconds
  }
}catch(Exception r) {}		
	}

}
