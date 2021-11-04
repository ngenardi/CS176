/**
 * Tests the CheckingAccount.
 */
public class CheckingAccountTester
{
	public static void main(String[] args)
	{
		BankAccount account = new CheckingAccount();
		account.deposit(100.00);
		System.out.println(account.getBalance());
		System.out.println("Expected: 100.0");

		// 1st withdrawal, no overdraft
		account.withdraw(90.00);
		System.out.println(account.getBalance());
		System.out.println("Expected: 10.0");

		//2nd withdrawal($20)
		account.withdraw(20.00);
		System.out.println(account.getBalance());
		System.out.println("Expected: -30.0");

		//3rd withdrawal, ($20)
		account.withdraw(20.00);
		System.out.println(account.getBalance());
		System.out.println("Expected: -70.0");

		//perform end month transactions
		((CheckingAccount) account).monthEnd();
		account.deposit(200);
		System.out.println(account.getBalance());
		System.out.println("Expected: 130.0");

		account.withdraw(20.0);
		System.out.println(account.getBalance());
		System.out.println("Expected: 110");
	}
}
