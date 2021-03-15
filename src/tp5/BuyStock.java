package tp5;

public class BuyStock implements Command {
	
	private Stock stock;
	private GlobalStock oldState;
	private GlobalStock currentStock;

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public boolean execute() throws CloneNotSupportedException {
		for(Stock s : currentStock.getStocks()) {
			if(s.getName().equals(this.stock.getName())) {
				s.setQuantity(s.getQuantity() + this.stock.getQuantity());
				return true;
			}
		}
		return false;
	}

}
