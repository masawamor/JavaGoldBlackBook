package ch02.sec01supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {

		Supplier<List<String>> suppllier = () -> {
			List<String> list = new ArrayList<>();
			list.add("A");
			list.add("B");
			list.add("C");
			return list;
		};
		
		List<String> list = suppllier.get();
		list.forEach(s -> System.out.println(s));

	}

}
