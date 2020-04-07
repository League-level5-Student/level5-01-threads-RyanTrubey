package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
	/*
	 * The goal of this assignment is to create a chain of threads. Thread 1 will create Thread 2, 
	 * Thread 2 will create Thread 3, Thread 3 will create Thread 4 and so on up to 50 threads.
	 * We will accomplish this by creating our own customized Runnable.
	 * 
	 * We will print a greeting from each thread using the thread number like so:
	 * 
	 * Hello from thread number: 1
	 * Hello from thread number: 2
	 * Hello from thread number: 3
	 * Hello from thread number: 4
	 * Hello from thread number: 5
	 * Hello from thread number: 6
	 * Hello from thread number: 7
	 * etc...
	 */
	
	//1. Create a new class called ThreadedGreeter that implements the Runnable interface.
	//   Be sure to implement the run() method.
	
	//2. In the ThreadedGreeter class, create a member variable of type int. 
	//   This variable will contain the thread number. Add a constructor that will 
	//   initialize the value of this variable
	
	//3. In the run method of the ThreadedGreeter class, print the message using the member variable as the thread number.
	//   If the member integer is less than or equal to 50, create a new thread. 
	//   Pass in a new object of the ThreadedGreeter class with the value of the member variable plus one.
	
	//4. Start the thread and then use the join() method to make the parent thread wait for this thread to finish.
	
	public static void main(String[] args) {
		//5. Create the first thread and initialize it with an object of the ThreadedGreeter class.
		//   The ThreadedGreeter object should be initialized with 1.
		
		
		//6. Start and join the thread. Did you get the required output?
	}
}
