package excercise3;

public class Chopstick {
	private boolean[] use = { false, false, false, false, false }; 
	
	public synchronized void getChopsticks() {
		int i = Integer.parseInt(Thread.currentThread().getName());
		while (use[i] == true || use[(i+1)%5] == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		use[i] = true;
		use[(i+1)%5] = true;
	}
	
	public synchronized void putChopsticks() {
		int i = Integer.parseInt(Thread.currentThread().getName());

		use[i] = false;
		use[(i + 1) % 5] = false;
		notifyAll();
	}
}
