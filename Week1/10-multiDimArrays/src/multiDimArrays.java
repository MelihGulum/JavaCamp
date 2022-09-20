
public class multiDimArrays {

	public static void main(String[] args) {

		String cities[][] = new String[3][3];
		
		cities[0][0] = "Istanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Tekırdag";
		cities[1][0] = "Ankara";
		cities[1][1] = "Konya";
		cities[1][2] = "Kayserı";
		cities[2][0] = "Dıyarbakır";
		cities[2][1] = "Sanlıurfa";
		cities[2][2] = "Gaziantep";
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}

}
