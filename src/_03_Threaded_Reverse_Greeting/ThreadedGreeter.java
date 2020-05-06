package _03_Threaded_Reverse_Greeting;

import java.util.Stack;

public class ThreadedGreeter implements Runnable {
	int threadNumber;
	Stack<Thread> stack = new Stack<Thread>();

	public ThreadedGreeter(int threadNumber) {
		this.threadNumber = threadNumber;
		for(int i = 0; i < 50; i++) {
			stack.push(new Thread(() -> new ThreadedGreeter(threadNumber + 1).run()));
		}
	}

	public void run() {
		stack.pop().start();
	}
}
