package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	Thread[] robots = new Thread[5];
	Robot b = new Robot();
	Robot y = new Robot();
	Robot bl = new Robot();
	Robot g = new Robot();
	Robot r = new Robot();
	
	public static void main(String[] args) {
		new OlympicRings_Threaded().setup();
	}
	
	public void circle(Robot r) {
		r.penDown();
		r.setSpeed(10);
		r.show();      
		for(int i = 0; i < 360; i++) {
			r.move(1);
			r.turn(1);
		}
	}
	
	public void setup() {
		for(int i = 0; i < robots.length; i++) {
			robots[i] = new Thread(()->circle());
		}
		for(int i = 0; i < robots.length; i++) {
			robots[i].start();
		}
	}
	
	public void circle() {
		b.setPenColor(0, 0, 255);
		b.moveTo(100, 100);
		b.penDown();
		y.setPenColor(255, 255, 0);
		y.moveTo(200, 200);
		y.penDown();
		bl.setPenColor(0, 0, 0);
		bl.moveTo(300, 100);
		bl.penDown();
		g.setPenColor(0, 255, 0);
		g.moveTo(400, 200);
		g.penDown();
		r.setPenColor(255, 0, 0);
		r.moveTo(500, 100);
		r.penDown();
		for(int i = 0; i < 360; i++) {
			b.setAngle(i);;
			b.move(1);
			y.setAngle(i);
			y.move(1);
			bl.setAngle(i);
			bl.move(1);
			g.setAngle(i);
			g.move(1);
			r.setAngle(i);
			r.move(1);
		}
	}
}

