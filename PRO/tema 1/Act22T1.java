public class Act22T1 {
	public static void main(String [] args) {
		System.out.println("Introduce segundos: ");
		int userSec = Integer.parseInt(System.console().readLine());
		int day = userSec / (3600*24);
		int restDay = userSec % (3600*24);
		int hours = restDay / 3600;
		int restHours = userSec % 3600;
		int minutes = restHours / 60;
		int restMin = restHours % 60;
		System.out.println(day + "d " + hours + "h " + minutes + "m " + restMin + "s");
	}
}