package Fb_java_lab_six;
import java.util.Scanner;
import java.util.Random;
public class DiceRollApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		do {
			//ask user to input how many dice sides they want
		System.out.println("\nHow many sides should each die have?");
			int sides = scnr.nextInt();
			
		int num1 = rollDice(sides);       //this retrieves & outputs the numbers generated 
		int num2 = rollDice(sides);      //from the rollDice method further down
		System.out.println("" + num1 + " " + num2);
		
		if (num1 == 1 && num2 == 1)  //this prints out only if double one's are rolled
			System.out.println("Snake Eyes!");
		
		if (num1 == 6 && num2 == 6)  //this prints out only if double six's are rolled
		System.out.println("Box Cars!");
		
		if (num1 + num2 == 7 || num1 + num2 == 11)  //this prints if seven or eleven is rolled
			System.out.println("Craps!");
		
		//prompt user to see if they wish to continue
		System.out.println("Would you like to roll again? (y/n):");
		userInput = scnr.next();
		} while (userInput.equalsIgnoreCase("y"));;
		
		System.out.println("Thank you for playing!");
		scnr.close();
	}
	//this allows us to generate the random numbers for the dice
	public static int rollDice(int sides) {
		Random rand = new Random();
		int randomside = rand.nextInt(sides);  
		return randomside +1;
	
	}
}
