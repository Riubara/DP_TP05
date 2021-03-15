package tp5;

public class SellStock implements Command {

	private Stock stock;
	private GlobalStock oldState;
	private GlobalStock currentStock;
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public boolean execute() throws CloneNotSupportedException {
		for(Stock s : currentStock.getStocks()) {
			if(s.getName().equals(this.stock.getName())) {
				s.setQuantity(s.getQuantity() - this.stock.getQuantity());
				return true;
			}
		}
		return false;
	}
	
}
