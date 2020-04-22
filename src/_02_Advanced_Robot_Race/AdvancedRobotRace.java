package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	int x = 200;
	Robot[] robots = new Robot[5];
	Thread[] threads = new Thread[5];
	static boolean raceOver = false;

	public static void main(String[] args) {
		AdvancedRobotRace arr = new AdvancedRobotRace();
		arr.setup();
		arr.start();
	}

	public void setup() {
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setSpeed(10);
			robots[i].moveTo(x, 500);
			x += 200;
		}
		
		for (int i = 0; i < threads.length; i++) {
			final int index = i;
			threads[i] = new Thread(() -> race(robots[index]));
		}
	}

	public void race(Robot r) {
		while(!raceOver) {
			r.move(new Random().nextInt(25));
			if(r.getY() < 0) {
				raceOver = true;
				break;
			}
		}
	}

	public void start() {
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		while(!raceOver) {
			
		}
	}
}
