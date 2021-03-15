package tp5;

import java.util.ArrayList;
import java.util.List;

public class GlobalStock {

	private List<Stock> stocks = new ArrayList<>();

	public List<Stock> getStocks() {
		return stocks;
	}

	public void PrintStock() {
		for ( Stock s : stocks) {
			System.out.println("stock : " + s.getName() + ", " + s.getQuantity());
		}
	}

	
	
}
