package ch03.sec01thread;

public class Main {
	
	public static void main(String[] args) {
		Thread thread = new SampleThread();
		thread.start();
		
		System.out.println("main");
	}

}
