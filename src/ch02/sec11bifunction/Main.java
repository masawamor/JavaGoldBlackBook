package ch02.sec11bifunction;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> greet = (a, b) -> a.concat(b);
		
		String ret = greet.apply("Hello ", "Masawa");

		System.out.println(ret);
	}

}
