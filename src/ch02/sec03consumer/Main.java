package ch02.sec03consumer;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println("Hello, " + s);
		consumer.accept("Masawa");
	}

}
