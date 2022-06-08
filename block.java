package test;

public class block {
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
	
	public void maths() {
		synchronized(lock1) {
			synchronized(lock2) {
				synchronized(lock3) {
					System.out.println("chemistry");}
			}
		}
	}
}

