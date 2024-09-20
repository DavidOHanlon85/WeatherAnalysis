/**
 * 
 */
package challenge_WeatherAnalysis;

/**
 * 
 */
public class WeatherChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare Variable
		
		int i = 0;
		
		double tempDay1, tempDay2, tempDay3, tempDay4, tempDay5, averageTemp;
		tempDay1 = 15.5;
		tempDay2 = 10.5;
		tempDay3 = 16.0;
		tempDay4 = 12.5;
		tempDay5 = 17.0;
		
		boolean sunDay1, sunDay2, sunDay3, sunDay4, sunDay5;
		
		sunDay1 = true;
		sunDay2 = false;
		sunDay3 = true;
		sunDay4 = true;
		sunDay5 = false;
		
		if (sunDay1 == true) {
			i++;
		}
		if (sunDay2 == true) {
			i++;
		}
		if (sunDay3 == true) {
			i++;
		}
		if (sunDay4 == true) {
			i++;
		}
		if (sunDay5 == true) {
			i++;
		}
		
		
		averageTemp = (tempDay1 + tempDay2 + tempDay3 + tempDay4 + tempDay5) / 5;
		
		System.out.println("Weather analysis\n____________________________________\nDay 1\n" + "Temp : "+tempDay1 + "\nSun: " +sunDay1);
		if (tempDay1 > averageTemp){
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________\nDay 2\n" + "Temp : "+tempDay2 + "\nSun: " +sunDay2);
		if (tempDay2 > averageTemp){
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________\nDay 3\n" + "Temp : "+tempDay3 + "\nSun: " +sunDay3);
		if (tempDay3 > averageTemp){
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________\nDay 4\n" + "Temp : "+tempDay4 + "\nSun: " +sunDay4);
		if (tempDay4 > averageTemp){
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________\nDay 5\n" + "Temp : "+tempDay5 + "\nSun: " +sunDay5);
		if (tempDay5 > averageTemp){
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________\nOverall stats\n" + "Average temp : "+averageTemp + "\nNumber of days of sun: " +i);
	}

}
