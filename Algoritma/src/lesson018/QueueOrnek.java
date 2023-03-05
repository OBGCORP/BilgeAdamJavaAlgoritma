package lesson018;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek {

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<>();
		q.offer("ahmet");
		q.offer("mehmet");
		q.offer("ayse");
		q.offer("fatma");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll()); 
		}
	}

}
