package _03_Threaded_Reverse_Greeting;

import java.util.Stack;

public class ThreadedGreeter implements Runnable {
	int threadNumber;
	static Stack<Thread> stack = new Stack<Thread>();

	public ThreadedGreeter(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	public void createStack() {
		for (int i = 1; i <= 50; i++) {
			final int num = i;
			stack.push(new Thread(() -> new ThreadedGreeter(num).run()));
		}
	}

	public void run() {
		System.out.println("Hello from thread number: " + threadNumber);
		
		if (stack.size() != 0) {
			ThreadedGreeter.stack.pop().start();
		}
	}
}
