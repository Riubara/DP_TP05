package tp5;

public class Stock {
	
	private String name;
	private long quantity;
	private GlobalStock globalStock;

	public Stock(String string) {
		this.name = string;
		this.quantity = 0;
		this.globalStock = new GlobalStock();
	}

	public Stock(String name, int quantity, GlobalStock globalStock) {
		this.name = name;
		this.quantity = quantity;
		this.globalStock = globalStock;
	}
	
	public String getName() {
		return name;
	}
	
	public long getQuantity() {
		return quantity;
	}
	
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
