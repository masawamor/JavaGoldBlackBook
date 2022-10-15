package ch03.sec03thradpool_chached;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws Exception {

		Runnable test = () -> System.out.println(Thread.currentThread().getId());
		
		ExecutorService pool = Executors.newCachedThreadPool();
		
		System.out.println("----- スタート -----");
		for (var i = 0; i < 3; i++) {
			pool.submit(test);
		}
		
		System.out.println("----- 10秒待ち -----");
		Thread.sleep(10 * 1000);
		for (var i = 0; i < 3; i++) {
			pool.submit(test);
		}
		
		System.out.println("----- 70秒待ち -----");
		Thread.sleep(70 * 1000);
		for (var i = 0; i < 3; i++) {
			pool.submit(test);
		}
		

	}

}
