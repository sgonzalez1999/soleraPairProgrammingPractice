package soleraPairProgrammingPractice.Katas.berlinClock;

public enum Lamps {
	
	RED("R"),YELLOW("Y"),OFF("O");

	private final String lamp;

	private Lamps(String string) {
		this.lamp = string;
	}

	public String getLamp() {
		return lamp;
	}	
	
}
