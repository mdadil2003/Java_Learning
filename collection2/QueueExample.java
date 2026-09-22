package collection2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/*
 * Queue - FIFO DS 
 *     a) using LinkedList  - FIFO order
 *     b) using Priorityqueue  --priority
 *     Queue Method offer poll remove peek
 *     stack        push  pop   peek  
 */
public class QueueExample {

	public static void main(String[] args) {
		
		//Queue<Integer> e= new LinkedList();//FIFO
		Queue<Integer> e= new   PriorityQueue();//
		e.offer(123400);
		e.offer(200);
		System.out.println(e.poll());// null if empty 
		System.out.println(e.remove());//exception if empty
	
		}

}
