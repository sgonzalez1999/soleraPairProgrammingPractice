package soleraPairProgrammingPractice.Katas.berlinClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BerlinClock {

	private String singleMinutesRow(int param) {

		String single = "";
		int lamps = param % 5;

		for (int i = 1; i < 5; i++) {

			single += ((i <= lamps) ? Lamps.YELLOW.getLamp() : Lamps.OFF.getLamp());
		}

		return single;

	}

	private String changeRedYellow(int param) {
		return ((param % 3 == 0) ? Lamps.RED.getLamp() : Lamps.YELLOW.getLamp());
	}

	private String fiveMinutesRow(int param) {
		String five = "";
		int lamps = param / 5;

		for (int i = 1; i < 12; i++) {
			five += ((i <= lamps) ? changeRedYellow(i) : Lamps.OFF.getLamp());
		}

		return five;
	}

	private String singleHoursRow(int param) {
		String h = "";
		int lamps = param % 5;
		for (int i = 1; i < 5; i++) {

			h += ((i <= lamps) ? Lamps.RED.getLamp() : Lamps.OFF.getLamp());
		}
		return h;
	}

	private String fiveHoursRow(int param) {
		String five = "";
		int lamps = param / 5;

		for (int i = 1; i < 5; i++) {
			five += ((i <= lamps) ? Lamps.RED.getLamp() : Lamps.OFF.getLamp());
		}
		return five;
	}

	private String changeYellowOff(int param) {
		return ((param % 2 == 0) ? Lamps.YELLOW.getLamp() : Lamps.OFF.getLamp());
	}

	public String entireBerlinClock(String param) {
		String[] time = param.split(":");
		int hours = Integer.parseInt(time[0]);
		int minutes = Integer.parseInt(time[1]);
		int seconds = Integer.parseInt(time[2]);
		String yellowOff = changeYellowOff(seconds);
		String fiveHours = fiveHoursRow(hours);
		String singleHours = singleHoursRow(hours);
		String fiveMinutes = fiveMinutesRow(minutes);
		String singleMinutes = singleMinutesRow(minutes);
		return yellowOff + fiveHours + singleHours + fiveMinutes + singleMinutes;
	}

	public static void main(String[] args) {

		BerlinClock b = new BerlinClock();

		LocalTime t;

		DateTimeFormatter format = DateTimeFormatter.ISO_TIME;
		String value;

		t = LocalTime.parse("00:00:00");
		value = t.format(format);

		System.out.println(b.entireBerlinClock(value));
		System.out.println((b.entireBerlinClock(value).equals("YOOOOOOOOOOOOOOOOOOOOOOO") ? "Ok" : "Wrong"));
		System.out.println("---------------------------------------");

		t = LocalTime.parse("23:59:59");
		value = t.format(format);

		System.out.println(b.entireBerlinClock(value));
		System.out.println((b.entireBerlinClock(value).equals("ORRRRRRROYYRYYRYYRYYYYYY") ? "Ok" : "Wrong"));
		System.out.println("---------------------------------------");

		t = LocalTime.parse("16:50:06");
		value = t.format(format);

		System.out.println(b.entireBerlinClock(value));
		System.out.println((b.entireBerlinClock(value).equals("YRRROROOOYYRYYRYYRYOOOOO") ? "Ok" : "Wrong"));
		System.out.println("---------------------------------------");

		t = LocalTime.parse("11:37:01");
		value = t.format(format);

		System.out.println(b.entireBerlinClock(value));
		System.out.println((b.entireBerlinClock(value).equals("ORROOROOOYYRYYRYOOOOYYOO") ? "Ok" : "Wrong"));

	}

}
