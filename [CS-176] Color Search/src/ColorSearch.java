import java.util.ArrayList;
import java.util.Scanner;

public class ColorSearch {

	// Initializing global ArrayList
	static ArrayList<String> colors = new ArrayList<String>();	

	void SearchColor(String searchFor){
		for(int i = 0; i<colors.size(); i++) {
			// check for color
			if (searchFor.toLowerCase().equals(colors.get(i))) {
				System.out.println("The color " + searchFor.toLowerCase() + " was found after " + (i+1) + " searches.");
				return;
			}
		}
		System.out.println("The color " + searchFor.toLowerCase() + " was not found after " + colors.size() + " searches.");
	}

	public static void main(String[] args) {

		// Initializing Variables/Objects
		Scanner scan = new Scanner(System.in);
		ColorSearch search = new ColorSearch();
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

		// Search for predetermined colors
		System.out.println();
		search.SearchColor("violet");
		search.SearchColor("green");
		search.SearchColor("yellow");
		search.SearchColor("teal");

		// SearchColor loop
		while(!colorIn.toLowerCase().equals(SENTINEL)) {
			// First loop check
			if (firstLoop) {
				firstLoop = false;
			}
			else {
				search.SearchColor(colorIn);
			}
			// Input color
			System.out.print("\nEnter a color to search for or \"q\" to quit (non case-sensitive): ");
			colorIn = scan.nextLine().toLowerCase();
		}
		System.out.println("Goodbye.");
	}
}
