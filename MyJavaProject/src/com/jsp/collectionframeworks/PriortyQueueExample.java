package com.jsp.collectionframeworks;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriortyQueueExample {
   public static void main(String[] args) {
	 Queue<Integer> q=new PriorityQueue<>();
	 q.add(10);
	 q.add(40);
	 q.add(30);
	 System.out.println(q);
	 System.out.println(q.peek());
	System.out.println(q.poll());
	 System.out.println(q.peek());
}
}
