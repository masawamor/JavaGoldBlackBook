package ch03.sec02create_new_thread_runnable;

public class Main {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable Thread");
			}
			
		});
		
		t.start();

	}

}
