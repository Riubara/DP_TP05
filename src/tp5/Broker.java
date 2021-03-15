package tp5;

public class Broker {

	private Invoker invoker;
	
	public Broker() {
		this.invoker = new Invoker();
	}

	public void takeOrder(Command stockOrder) {
		this.invoker.push(stockOrder);

	}

}
