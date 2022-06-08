package test;

public class blocks {
	private Object lock1=new Object();
	private Object lock2=new Object();
	private Object lock3=new Object();
	
	private void chemistry() {
		synchronized(lock1) {
			synchronized(lock2) {
				synchronized(lock3) {
					System.out.println("chemistry");
				}
			}
		}
	}
	
	
	public void physics() {
		synchronized(lock1) {
			synchronized(lock2) {
				synchronized(lock3) {
					System.out.println("bar");
				}
			}
		}
	}
	
	public void English() {
		synchronized(lock1) {
			synchronized(lock2) {
				synchronized(lock3) {
					System.out.println("chemistry");}
			}
		}
	}
}

