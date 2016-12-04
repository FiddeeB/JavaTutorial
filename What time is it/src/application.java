
public class application {

	public static void main(String[] args) {
		int hour, minute, second;
		hour = 15;
		minute = 25;
		second = 33;
		
		System.out.println("What time is it?");
		System.out.println("The time is: " + hour + ":" + minute + ";" + second);
		System.out.println("How many seconds since midnight? ");
		System.out.println(second + (minute*60) + (hour*3600));
		System.out.println("How many seconds to midnight?");
		System.out.println((60-second) + ((60-1-minute)*60) + ((24-1-hour)*3600));
		
		
	}

}
