package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	Thread[] robots = new Thread[5];
	Robot b = new Robot(200, 200);
	Robot y = new Robot(350, 350);
	Robot bl = new Robot(500, 200);
	Robot g = new Robot(650, 350);
	Robot r = new Robot(800, 200);
	public static void main(String[] args) {
		new OlympicRings_Threaded().setup();
	}
	
	public void setup() {
		b.setPenColor(Color.blue);
		y.setPenColor(Color.yellow);
		bl.setPenColor(Color.black);
		g.setPenColor(Color.green);
		r.setPenColor(Color.red);
		b.penDown();
		y.penDown();
		bl.penDown();
		g.penDown();
		r.penDown();
		b.hide();
		y.hide();
		bl.hide();
		g.hide();
		r.hide();
			robots[0] = new Thread(()->circle(b));
			robots[1] = new Thread(()->circle(y));
			robots[2] = new Thread(()->circle(bl));
			robots[3] = new Thread(()->circle(g));
			robots[4] = new Thread(()->circle(r));
		for(int i = 0; i < robots.length; i++) {
			robots[i].start();
		}
	}
	
	public void circle(Robot r) {
		for(int i = 0; i < 360; i++) {
			r.setAngle(i);
			r.move(2);
		}
	}
}

