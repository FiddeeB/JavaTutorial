class American {
	
}
public class app {

	public static void main(String[] args) {
		int day, date, month, year;
		day = 49;
		date = 03;
		month = 12;
		year = 2016;
		
		System.out.println("What day is it?");
		System.out.println(year + "/" + month + "/" + date + " Vecka:" + day);
		printAmerican("Saturday", "December", 12, 2016);
		printEuropean("Saturday",  03, "December", 2016);
	}
		public static void printAmerican(String day, String date, int month, int year) {
			System.out.println(day + ", " + date + ", " + month + ", " + year);
		}
		public static void printEuropean(String day, int date, String month, int year) {
			System.out.println(day + ", " + date + ", " + month + ", " + year);
		}
	}


