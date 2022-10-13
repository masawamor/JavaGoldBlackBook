package ch02.sec04consumer;

public class Main {

	public static void main(String[] args) {
		
		var apple = new Item.Builder(100)
			.with((b) -> {
				b.name = "apple";
				b.price = 1000;
			}).build();
		System.out.println("りんごか？");
		System.out.println("-- " + apple.toString());

		var orange = new Item.Builder(200)
			.with((b) -> {
				b.name = "orange";
				b.price = 2000;
			}).build();
		System.out.println("みかんか？");
		System.out.println("-- " + orange.toString());
	}

}
