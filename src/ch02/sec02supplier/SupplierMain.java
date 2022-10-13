package ch02.sec02supplier;

import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {

		A a;
		Supplier<A> supplier;
		
		System.out.println("お決まりの事前処理 - B");
		supplier = () -> new B();
		a = supplier.get();
		a.hello();
		System.out.println("お決まりの事後処理 - B");

		System.out.println("お決まりの事前処理 - C");
		supplier = () -> new C();
		a = supplier.get();
		a.hello();
		System.out.println("お決まりの事後処理 - C");
		
	}
	

}