import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objects
		Scanner scan = new Scanner(System.in);
		CashRegister customer1 = new CashRegister();
		
		//variables
		double price=0,payment=0;
		
		//input prices
		do {
			if (price!=0) {
				customer1.recordPurchase(price);
			}
			System.out.print("Enter a purchase amount or -1 to stop: ");
			price = scan.nextDouble();
			scan.nextLine();
		} while (price!=-1);
		
		//output total cost
		System.out.print("Total cost: $");
		System.out.printf("%.2f%n", customer1.getPurchase());
		
		//input payment
		System.out.print("Enter payment: ");
		payment = scan.nextDouble();
		scan.nextLine();
		customer1.recievePayment(payment);
		
		//output change
		System.out.print("Change: $");
		System.out.printf("%.2f%n", customer1.giveChange());
	}

}
