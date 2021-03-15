package tp5;

public class CommandTp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GlobalStock globalStock = new GlobalStock();
	    globalStock.getStocks().add(new Stock("myItem"));
	    globalStock.getStocks().add(new Stock("apple"));
	    globalStock.getStocks().add(new Stock("pinapple"));

	    globalStock.PrintStock();
	    System.out.println("\n");

	    
	    Broker broker = new Broker();

	    Stock stock = new Stock("myItem", 20, globalStock);

	    BuyStock buyStockOrder = new BuyStock(stock);
	    SellStock sellStockOrder = new SellStock(stock);

	    broker.takeOrder(buyStockOrder);
	    broker.takeOrder(sellStockOrder);

	    Stock stock1 = new Stock("apple", 4, globalStock);

	    SellStock sellStockOrder1 = new SellStock(stock1);
	    broker.takeOrder(sellStockOrder1);

	    Stock stock2 = new Stock("pinapple", 7, globalStock);

	    BuyStock sellStockOrder2 = new BuyStock(stock2);
	    broker.takeOrder(sellStockOrder2);

	    globalStock.PrintStock();

	    System.out.println("\n");

	   // broker.placeOrders();

	    System.out.println("\n");

	    globalStock.PrintStock();
	  }
	}