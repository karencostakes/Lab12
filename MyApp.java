package Lab12;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String nameOpponent;
		String roshambo;
		Player player1 = new HumanPlayer();
		Player player3 = new TheRandomPlayer();
		Player player2 = new TheRockPlayer();
		Scanner scan1 = new Scanner(System.in);
		// Player player1 = new HumanPlayer (String roshambo, String name);

		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("Please enter your name: ");
		player1.setName(scan1.nextLine());
		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Would you like to play against random player or rock player?");
			nameOpponent = scan1.nextLine();

			System.out.println("Rock, Paper, or Scissors?");
			player1.setRoshambo(scan1.nextLine());
			player1.printNameAndChoice();

			while (nameOpponent.equalsIgnoreCase("rock player")) {

				player2.generateRoshambo();
				player2.setName("the rock");
				player2.printNameAndChoice();

				if (player1.getRoshambo().equalsIgnoreCase("rock"))

				{
					System.out.println("There has been a tie!");
				}

				if (player1.getRoshambo().equalsIgnoreCase("paper")) {
					System.out.println(player1.getName() + " has won!");

				}

				if (player1.getRoshambo().equalsIgnoreCase("scissors")) {
					System.out.println(player2.getName() + " has won!");
				}
				nameOpponent = "karen";

			}

			while (nameOpponent.equalsIgnoreCase("random player")) { // generateroshumba.

				player3.generateRoshambo();
				player3.setName("the random player");
				player3.printNameAndChoice();

				if (player1.getRoshambo().equalsIgnoreCase(player3.getRoshambo())) {
					System.out.println("There has been a tie!");
				}

				humanPlayerRock(player1, player3);

				humanPlayerPaper(player1, player3);

				humanPlayerScissors(player1, player3);
				nameOpponent = "karen";
				// System.out.println(player1.getRoshambo());
				// do something

				System.out.println("Continue?");
				choice = scan1.nextLine();
			}

		}

	}

	public static void humanPlayerScissors(Player player1, Player player3) {
		if (player1.getRoshambo().equalsIgnoreCase("scissors")) {
			if (player3.getRoshambo().equalsIgnoreCase("paper")) {
				System.out.println(player1.getName() + " has won!");
			}

			if (player3.getRoshambo().equalsIgnoreCase("rock")) {
				System.out.println(player3.getName() + " has won!");

			}

		}
	}

	public static void humanPlayerPaper(Player player1, Player player3) {
		if (player1.getRoshambo().equalsIgnoreCase("paper")) {

			if (player3.getRoshambo().equalsIgnoreCase("scissors")) {
				System.out.println(player3.getName() + " has won!");
			}
			if (player3.getRoshambo().equalsIgnoreCase("rock")) {
				System.out.println(player1.getName() + " has won!");
			}
		}
	}

	public static void humanPlayerRock(Player player1, Player player3) {
		if (player1.getRoshambo().equalsIgnoreCase("rock")) {
			if (player3.getRoshambo().equalsIgnoreCase("paper")) {
				System.out.println(player3.getName() + " has won!");
			}
			if (player3.getRoshambo().equalsIgnoreCase("scissors")) {
				System.out.println(player1.getName() + " has won!");
			}

		}
	}
}
