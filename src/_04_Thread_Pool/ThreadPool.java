package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] threads;
	ConcurrentLinkedQueue<Task> taskQueue;
	
	public ThreadPool(int totalThreads) {
		threads = new Thread[totalThreads];
		for(int i = 0; i < totalThreads; i++) {
			threads[i] = new Thread(() -> new Worker());
		}
		taskQueue = new ConcurrentLinkedQueue<Task>();
	}
}
