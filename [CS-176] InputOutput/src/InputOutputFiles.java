import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
 */
public class InputOutputFiles
{
	public static void main(String[] args)
	{
		boolean validIn = false;
		Scanner scan = new Scanner(System.in);

		while (!validIn) {			
			try {
				// File setup
				System.out.print("Enter the path to open the input file (ex. C:\\Downloads\\lines.txt): ");
				String inFileName = scan.nextLine();
				File inputFile = new File(inFileName);
				Scanner in = new Scanner(inputFile);
				PrintWriter outputFile = new PrintWriter("outlines.txt");

				validIn=true;
				// Transfer data
				while (in.hasNext()) 
				{
					String what=in.next();
					outputFile.println(what);
				}
				scan.close();
				in.close();
				outputFile.close();

				System.out.println("Done.");
			}

			catch(FileNotFoundException o) {
				System.out.println("File not found, try again.");
			}
		}
	}
}