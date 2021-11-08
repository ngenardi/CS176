/**
   This program demonstrates the measurable Country class.
 */

public class MeasurableTester
{
	
	public static void showData (Measurable[] data, String dataName) {
		double avg = Data.average(data);
		System.out.println("Average " + dataName + ": " + avg);
		Measurable max = Data.max(data);
		System.out.println("Maximum " + dataName + ": " + max.getMeasure());
	}
	
	public static void main(String[] args)
	{
		System.out.println("Country data");
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);
		showData(countries, "area");
		System.out.println("\nExpected average: 239950");
		System.out.println("Expected maximum: 513120");

		//Bank Accounts
		System.out.println("\nBank account data");
		Measurable[] bank = new Measurable[3];
		bank[0] = new BankAccount(176220);
		bank[1] = new BankAccount(513120);
		bank[2] = new BankAccount(30510);
		showData(bank, "balance");
		System.out.println("\nExpected average: 239950");
		System.out.println("Expected maximum: 513120");

		//Quizzes
		System.out.println("\nQuiz data");
		Measurable[] quiz = new Measurable[5];
		quiz[0] = new Quiz(95);
		quiz[1] = new Quiz(80);
		quiz[2] = new Quiz(90);
		quiz[3] = new Quiz(50);
		quiz[4] = new Quiz(75);
		showData(quiz, "score");
		System.out.println("\nExpected average: 78");
		System.out.println("Expected maximum: 95");
	}
}
