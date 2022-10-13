package ch02.sec05biconsumer;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {

		var map = new HashMap<String, Integer>();
		
		BiConsumer<String, Integer> bi = (k, v) -> map.put(k, v);

		bi.accept("apple",100);
		bi.accept("orange",200);
		
		System.out.println(map);

	}

}
