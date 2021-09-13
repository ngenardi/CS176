
public class CashRegister {
	private double purchase,payment;
	
	CashRegister(){
		purchase = 0;
		payment = 0;
	}
	
	void recordPurchase(double cost){
		this.purchase+=cost;
	}
	
	void recievePayment(double payment) {
		this.payment = payment;
	}
	
	double getPurchase() {
		return purchase;
	}
	
	double giveChange() {
		double change = payment-purchase;
		return change;
	}
}
