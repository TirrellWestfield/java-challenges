package autoboxing;
import java.util.ArrayList; 

public class customer {
	private String name;
	private ArrayList<Double> transactions;
	
	public customer(String name, double initialAmount) {
		this.name= name;
		this.transactions= new ArrayList<Double>();
		addTransaction(initialAmount);
	}
	public void addTransaction(double amount) {
		this.transactions.add(amount);
	}
	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
}

