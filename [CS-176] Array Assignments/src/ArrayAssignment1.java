
public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double highestNum = values[1];
		int negitiveCount = 0;
		
		System.out.print("Nubmers in list: ");
		for (double num:values) {
			if (num<0) {
				++negitiveCount;
			}
			if (num>highestNum) {
				highestNum = num;
			}
			System.out.print(num+" ");
		}
		
		System.out.println("\nNumber of negitives: " + negitiveCount);
		System.out.println("Highest number: " + highestNum);
		
	}

}
