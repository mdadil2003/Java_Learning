package thread1;
//perform or demonstrate 
//multithreading using runnable interface
/*
 * 
 * If a class implements Runnable  then that class 
 * object need to be passed to thread class
 * 
 *  Runnable doesnot have start method 
 * 
 */
class Banner  implements Runnable
{	public void run() 
	{
	 try{
		   for( int i=0;i<10;i++)
		   {
			   System.out.println(" Banner class");
			   Thread.sleep(1000);//milliseconds
			   }
		}catch(Exception r) {}	
	}  }
public class ThreadExample3 {

	public static void main(String[] args) {
		 Banner b= new Banner();
		 Thread e= new Thread(b);
		 e.start();
		 Message m= new Message();
		 m.start();
		 
	}

}
