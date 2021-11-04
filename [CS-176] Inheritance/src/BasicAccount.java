/**
 * A BasicAccount whose withdraw method will not
 * withdraw more money than is currently in the account,
 * but will print an error message instead.
 * Use "Withdraw amount can't be larger than the balance."
 */

/**
 *Modify line below to make BasicAccount a subclass of BankAccount
 */
public class BasicAccount extends BankAccount
{
	/**
	 * Constructs a bank account with a given balance.
	 * @param initialBalance the initial balance
	 */

	/**
	 * Modify constructor below to use the superclass BankAccount method to create the initialBalance
	 */

	BasicAccount(double initialBalance)
	{
		super(initialBalance);
	}


	/**
	 * Withdraws the specified amount.
	 * @param amount the amount to be withdrawn
	 */
	@Override
	/**
	 * Modify method below to use getBalance method from BankAccount to get the balance. Allow withdrawal only if the retrieved balance is greater than amount. Print "Withdraw amount can't be larger than the balance." if amount is greater than or equal balance. Otherwise, use BankAccount withdraw method to withdraw amount.
	 */
	public void withdraw(double amount)
	{
		if (this.getBalance() < amount) {
			System.out.println("Withdraw amount can't be larger than the balance.");
		}
		else {
			super.withdraw(amount);
		}
	}
}
