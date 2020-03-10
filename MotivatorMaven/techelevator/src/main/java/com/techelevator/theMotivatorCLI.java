package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class theMotivatorCLI {

	public static void main(String[] args) {
		List<String> complimentsList = new ArrayList<String>();
		complimentsList.add("you are amazin!");
		complimentsList.add("you got this bro!");
		complimentsList.add("you are going to do great today!");
		complimentsList.add("wow are you attractive!");
		complimentsList.add("looking real good!");
		complimentsList.add("you are so brilliant!");
		complimentsList.add("never doubt yourself!");
		complimentsList.add("your limitation—it's only your imagination!");
		complimentsList.add("push yourself, because no one else is going to do it for you!");
		complimentsList.add("the harder you work for something, the greater you'll feel when you achieve it!");

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please, enter your name: ");
		String userName = userInput.nextLine();
		if(userName.contentEquals("")) {
			userName = "Mysterious person";
		}
		userName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
		System.out.println(userName + ", " + complimentsList.get((new Random().nextInt(complimentsList.size()))));
		System.out.println("Press 1 for more motivation or Press 2 to Exit");
		String userInput2 = userInput.nextLine();
		boolean exit = false;
		while (!exit) {
			if (userInput2.contentEquals("2")) {
				exit = true;
				System.out.println("Have a great day " + userName + "!");
				System.exit(0);
			}
			System.out.println(userName + ", " + complimentsList.get((new Random().nextInt(complimentsList.size()))));
			System.out.println("Press 1 for more motivation or 2 to Exit.");
			String userInput3 = userInput.nextLine();
			if (userInput3.contentEquals("2")) {
				exit = true;
			}
		}
		System.out.println("Have a great day " + userName + "!");
	}
}
