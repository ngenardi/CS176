/**
   This program demonstrates the measurable Country class.
 */

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MeasureableButtonTester
{

	private static String metric = "";
	private static final int FRAME_WIDTH = 250;
	private static final int FRAME_HEIGHT = 150;

	public static void setMetric(String string) {
		metric = string;
	}

	public static void showData (Measurable[] data, String dataName) {
		if(metric.equals("Average")) {
			double avg = Data.average(data);
			System.out.println("Average " + dataName + ": " + avg);
		}
		else if(metric.equals("Maximum")){
			Measurable max = Data.max(data);
			System.out.println("Maximum " + dataName + ": " + max.getMeasure());
		}
		else {
			Measurable min = Data.min(data);
			System.out.println("Minimum " + dataName + ": " + min.getMeasure());
		}
	}

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		Object[] possibilities = {"Maximum", "Minimum", "Average"};
		String s = (String)JOptionPane.showInputDialog(
		                    frame,
		                    "Chose the metric to show.",
		                    "Customized Dialog",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    possibilities,
		                    "Maximum");
		
		setMetric(s);
		
		JButton buttonCountries = new JButton("Get " + metric + " Country Area");
		panel.add(buttonCountries);

		JButton buttonBank = new JButton("Get " + metric + " Bank Account Balance");
		panel.add(buttonBank);

		JButton buttonQuiz = new JButton("Get " + metric + " Quiz Score");
		panel.add(buttonQuiz);
		
		/**
		 * Countries
		 * Max = 513120
		 * Min = 39519
		 * Avr = 239950
		 */
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);
		
		/**
		 * Bank Accounts
		 * Max = 513120
		 * Min = 39519
		 * Avr = 239950
		 */
		Measurable[] bank = new Measurable[3];
		bank[0] = new BankAccount(176220);
		bank[1] = new BankAccount(513120);
		bank[2] = new BankAccount(30510);

		/**
		 * Quizzes
		 * Max = 95
		 * Min = 50
		 * Avr = 78
		 */
		Measurable[] quiz = new Measurable[5];
		quiz[0] = new Quiz(95);
		quiz[1] = new Quiz(80);
		quiz[2] = new Quiz(90);
		quiz[3] = new Quiz(50);
		quiz[4] = new Quiz(75);

		ActionListener listenerCountries = new DataListener(countries, "Country Area");
		buttonCountries.addActionListener(listenerCountries);
		ActionListener listenerBank = new DataListener(bank, "Account Balance");
		buttonBank.addActionListener(listenerBank);
		ActionListener listenerQuiz = new DataListener(quiz, "Quiz Score");
		buttonQuiz.addActionListener(listenerQuiz);
		
		frame.add(panel);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}