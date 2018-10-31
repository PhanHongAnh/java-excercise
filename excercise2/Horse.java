package excercise2;

import java.util.Random;

public class Horse  extends Thread {
	private int distance = 0;
	private int step = 0;
	
	public void run() {
        while (distance != 100) {
			Random no = new Random();
			distance += no.nextInt(10) + 1;
			step += 1;
			if (distance > 100) {
				distance -= 100;
			}
			System.out.println(Thread.currentThread().getName() + " is on " + distance + " with " + step + " steps.");
			
	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	        	e.printStackTrace();
	        }
		}
        System.out.println("=================" + Thread.currentThread().getName() + " was on target with " + step + " steps.");
    }
	
	public static void main(String[] args) {
		Horse[] horseList = new Horse[10];
		for (int i=0;i<10;i++) {
			horseList[i] = new Horse();
			String name = "Horse" + i;
			horseList[i].setName(name);
		}
		
		for (int i=0;i<10;i++) {
			horseList[i].start();
		}
	}
	
	
}
