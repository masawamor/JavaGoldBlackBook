package ch03.sec06schedule_atfixedrate_random;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws Exception {

		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.scheduleAtFixedRate(() -> {

			int r = new Random().nextInt(10);
			System.out.print(r);
			
			try {
				Thread.sleep(r * 1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("interrupt");
			
		}, 0, 1, TimeUnit.SECONDS);
		
		int count = 0;
		while(true) {
			Thread.sleep(100);
			System.out.print(">");
			
			count++;
			if (count == 100) {
				exec.shutdown();
				break;
			}
		}
		
	}

}
