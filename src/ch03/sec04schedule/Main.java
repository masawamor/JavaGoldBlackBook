package ch03.sec04schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws Exception {
		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.schedule(() -> {
			System.out.println("finish");
			exec.shutdown();
		}, 10, TimeUnit.SECONDS);
		
		int count = 0;
		while (true) {
			Thread.sleep(1000);
			if (exec.isShutdown()) {
				break;
			}
			System.out.println((++count) * 100 + " ms");
		}
	}

}
