package ch02.sec04consumer;

import java.util.function.Consumer;

public class Item {

	private int id;
	private String name;
	private int price;
	
	private Item(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.price = builder.price;
	}
	
	@Override
	public String toString() {
		return String.format("Item [id=%d name=%s price=%d]", this.id, this.name, this.price);
	}
	
	public static class Builder {

		private int id;
		public String name;
		public int price;
		
		public Builder(int id) {
			this.id = id;
		}
		
		public Builder with(Consumer<Builder> consumer) {
			consumer.accept(this);
			return this;
		}
		
		public Item build() {
			return new Item(this);
		}
	}
}
