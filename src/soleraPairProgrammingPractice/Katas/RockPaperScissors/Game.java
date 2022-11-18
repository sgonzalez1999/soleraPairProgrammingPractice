package soleraPairProgrammingPractice.Katas.RockPaperScissors;

import java.util.Scanner;

public class Game {

	public String play(String myMove, String theirMove) {

		if (myMove.equals(theirMove))
			return "draw";
		if (myMove.equals("rock") && theirMove.equals("scissors"))
			return "win";
		if (myMove.equals("scissors") && theirMove.equals("paper"))
			return "win";
		if (myMove.equals("paper") && theirMove.equals("rock"))
			return "win";
		return "lose";
	}

	public static void main(String[] args) {
		
		String p1="";
		String p2="";
		Scanner sc= new Scanner(System.in);
		
		Game game= new Game();
		
		System.out.println("Juega p1: ");
		p1=sc.nextLine();
		System.out.println("Juega p2: ");
		p2=sc.nextLine();
		System.out.println(game.play(p1, p2));
	}
}
