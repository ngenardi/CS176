import java.util.ArrayList;
import java.util.Scanner;

public class SortedColorSearch {

	// Initializing global ArrayList
	static ArrayList<String> colors = new ArrayList<String>();	

	void SortArrayList(ArrayList<String> array) {
		String [] temp = new String[array.size()];
		for (int i = 0; i<temp.length;i++) {
			String smallest = array.get(0);
			int smallestPos = 0;
			for(int j=1; j < array.size(); j++) {
				if (smallest.compareTo(colors.get(j))>0) {
					smallest = array.get(j);
					smallestPos = j;
				}
			}
			temp[i] = smallest;
			array.remove(smallestPos);
		}
		for(String str:temp) {
			array.add(str);
		}
	}
	
	void BinarySearchStrArrayList(ArrayList<String> array, String target) {
		int first = 0, last = array.size()-1, mid = (int)Math.ceil(((double)(last-first)/2)), count = 1;
		while(true) {
			//Not found
			if (first==last && !array.get(mid).toLowerCase().equals(target.toLowerCase())) {
				System.out.println("The color " + target + " was not found after " + count + " binary searches.");
				return;
			}
			//Found
			else if (array.get(mid).toLowerCase().equals(target.toLowerCase())) {
				System.out.println("The color " + target + " was found after " + count + " binary searches.");
				return;
			}
			// Mid is high
			else if (array.get(mid).toLowerCase().compareTo(target.toLowerCase()) > 0){
				if (mid==last) {
					mid-=1;
				}
				last = mid;
				mid = (int)Math.floor(((double)(last-first)/2))+first;
				count++;
			}
			// Mid is low
			else if (array.get(mid).toLowerCase().compareTo(target.toLowerCase()) < 0) {
				if (mid==first) {
					mid+=1;
				}
				first = mid;
				mid = (int)Math.ceil(((double)(last-first)/2))+first;
				count++;
			}
		}
		
	}
	

	public static void main(String[] args) {

		// Initializing Variables/Objects
		Scanner scan = new Scanner(System.in);
		SortedColorSearch search = new SortedColorSearch();
		String colorIn = "";
		final String SENTINEL = "q";
		boolean firstLoop = true;

		// ArrayList fill loop
		while (!colorIn.toLowerCase().equals(SENTINEL)) {
			// First loop check
			if (firstLoop) {
				firstLoop = false;
			}
			else {
				colors.add(colorIn);
			}
			// Input color
			System.out.print("Enter a color to add to the list or \"q\" to quit (non case-sensitive): ");
			colorIn = scan.nextLine().toLowerCase();
		}

		// Reset variables
		firstLoop = true;
		colorIn = "";

		//sort array
		search.SortArrayList(colors);
		
		// Search for predetermined colors
		System.out.println();
		search.BinarySearchStrArrayList(colors,"violet");
		search.BinarySearchStrArrayList(colors,"green");
		search.BinarySearchStrArrayList(colors,"yellow");
		search.BinarySearchStrArrayList(colors,"teal");

		// SearchColor loop
		while(!colorIn.toLowerCase().equals(SENTINEL)) {
			// First loop check
			if (firstLoop) {
				firstLoop = false;
			}
			else {
				search.BinarySearchStrArrayList(colors,colorIn);
			}
			// Input color
			System.out.print("\nEnter a color to search for or \"q\" to quit (non case-sensitive): ");
			colorIn = scan.nextLine().toLowerCase();
		}
		System.out.println("Goodbye.");
	}
}
