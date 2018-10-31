package excercise3;

public class Philosopher extends Thread {
	private Chopstick chopsticks;
	
	public Philosopher(String name, Chopstick chopsticks) {
		this.setName(name);
		this.chopsticks  = chopsticks;
	}
	
	public void run() {
		do {
			eating();
			thinking();
		} while (true);
	}
	
	public void eating() {
		chopsticks.getChopsticks();
		System.out.println("Philosopher " + Thread.currentThread().getName() + " is eating.");
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
	}
	
	public void thinking() {
		chopsticks.putChopsticks();
		System.out.println("Philosopher " + Thread.currentThread().getName() + " is thinking.");
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		Chopstick chopsticks = new Chopstick();
		
		Philosopher[] philosopherList = new Philosopher[5];
		
		for(int i=0;i<5;i++) {
			philosopherList[i] = new Philosopher(String.valueOf(i), chopsticks);
			philosopherList[i].start();
		}
	}
}
