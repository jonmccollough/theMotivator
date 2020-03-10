package theMotivator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		List<String> complimentsList = new ArrayList<String>();
		complimentsList.add("you are amazin!");
		complimentsList.add("you got this bro!");
		complimentsList.add("you are going to do great today!");
		complimentsList.add("wow are you attractive!");
		complimentsList.add("looking real good!");
		complimentsList.add("you are so brilliant!");
		complimentsList.add("never doubt yourself!");

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please, enter your name: ");
		String userName = userInput.nextLine();
		System.out.println(userName + ", " + complimentsList.get((new Random().nextInt(complimentsList.size()))));
		System.out.println("Press 1 for more motivation or Press 2 to Exit");
		String userInput2 = userInput.nextLine();
		boolean exit = false;
		while (!exit) {
		if(userInput2.contentEquals("2")) {
			exit = true;
		}
			try {
			System.out.println(userName + ", " + complimentsList.get((new Random().nextInt(complimentsList.size()))));
			System.out.println("Press 1 for more motivation or 2 to Exit.");
			String userInput3 = userInput.nextLine();
			if(userInput3.contentEquals("2")) {
				exit = true;
			}
			} finally {
				System.out.println("Have a great day " + userName + "!");
			}
		}
	}
}
