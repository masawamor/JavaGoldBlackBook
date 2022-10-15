package ch03.sec03threadpool_fixed;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (var i = 0; i < 10; i++) {
			executor.submit(() -> System.out.println(Thread.currentThread().getId()));
		}

	}

}
