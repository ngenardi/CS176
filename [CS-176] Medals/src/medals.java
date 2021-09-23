
public class medals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int COUNTRIES = 8;
		final int MEDALS = 3;
		int countryMedalTotal = 0, goldTotal = 0, silverTotal = 0, bronzeTotal = 0, totalMedals = 0;
		
		String[] countries = {
				"Canada\t\t",
				"Italy\t\t",
				"Germany\t\t",
				"Japan\t\t",
				"Kazakhstan\t",
				"Russia\t\t",
				"South Korea\t",
				"Untied States\t",
		};
		
		int[][] counts = {
				{0,3,0},
				{0,0,1},
				{0,0,1},
				{1,0,0},
				{0,0,1},
				{0,1,0},
				{0,1,0},
				{1,0,1},
			};
		
		System.out.println("Country\t\tGold\tSilver\tBronze\tTotal\n"
						 + "-------\t\t----\t------\t------\t-----");
		
		for(int i = 0;i<COUNTRIES;i++) {
			countryMedalTotal = 0;
			System.out.print(countries[i]);
			for(int j = 0;j<MEDALS;j++) {
				if (j == 0) {
					goldTotal+=counts[i][j];
				}
				else if (j == 1) {
					silverTotal+=counts[i][j];
				}
				else if (j == 2) {
					bronzeTotal+=counts[i][j];
				}
				System.out.print(counts[i][j]+"\t");
				countryMedalTotal+=counts[i][j];
				totalMedals+=counts[i][j];
			}
			System.out.println(countryMedalTotal);
		}
		System.out.println("Total\t\t" + goldTotal + "\t" + silverTotal + "\t" + bronzeTotal + "\t" + totalMedals);
	}

}
