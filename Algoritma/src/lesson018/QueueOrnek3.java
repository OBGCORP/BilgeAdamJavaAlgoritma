package lesson018;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnek3 {

	public static void main(String[] args) {
		
		Queue<Musteri> musteriQueue = new PriorityQueue<>();
		musteriQueue.offer(new Musteri("Mustafa", 20));
		musteriQueue.offer(new Musteri("Ali", 30));
		musteriQueue.offer(new Musteri("Mehmet", 40));
		musteriQueue.offer(new Musteri("Aslı", 90));
		musteriQueue.offer(new Musteri("Zeynep", 25));
		musteriQueue.offer(new Musteri("Buğra", 100));
		
		while (!musteriQueue.isEmpty()) {
			System.out.println(musteriQueue.poll().getIsim());
		}
		
	}
}
