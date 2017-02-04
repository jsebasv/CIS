import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		//The computer's guess is being assigned a random number between 0 and .9 and saved in a variable 
		//named computerNumber.
		//Then it is multiplied by 10 and given integer data type. The integer data type cuts off the 
		//decimals leaving a whole number.
		int computerNumber = (int)(Math.random()*10);
		//Dividing the computer's guess number by 5 will leave a remainder of either 0, 1, 2, 3, or 4
		//depending on the random number chosen. 
		//The computer does not save the answer of the number divided by 5. It is instructed to save the 
		//remainder in the variable computerNumber
		computerNumber = computerNumber % 5;
		//Since the remainder is one of 5 options, we can assign a game selection to each of the 5 options
		//The program is being told to check the random computerNumber. Based off what it is, each value 0-4 
		//is assigned a different text.
		//The text is saved in the computerSelection variable to easily say what the computer chose later on.
		String computerSelection = "0";
		switch (computerNumber) { 
		case 0: computerSelection = "Rock";
			  break;
			case 1: computerSelection = "Paper";
			  break;
			case 2: computerSelection = "Scissors";
			  break;
			case 3: computerSelection = "Lizard";
			  break;
			case 4: computerSelection = "Spock";
			  break;
					}
		//The following two lines are to check for bugs but are marked as comments unless we are testing
		//System.out.println("Debugger: " + computerNumber);
		//System.out.println("Debugger: " + computerSelection);
		//Printing our basic text explaining the game below
		System.out.println("Welcome to Rock Paper Scissors Lizard Spock!");
		System.out.println("--------------------------------------------");
		System.out.println("Select a number 1-5 to make your selection:");
		System.out.println("[1] - Rock");
		System.out.println("[2] - Paper");
		System.out.println("[3] - Scissors");
		System.out.println("[4] - Lizard");
		System.out.println("[5] - Spock");
		System.out.print("Enter your number: ");
		//Asked user for input of their selection in the game and using a scanner to read the input 
		//and save it into a variable named userSelection
		Scanner input = new Scanner(System.in);
		final int userSelection = input.nextInt();

		//Using logical if statements, the game is checking the user's guess if it is Rock against all of 
		//the computer's possible guesses
		//If the user did not select Rock, it moves to the next group of If statements
		//Depending on what the computer selected, the different outcomes of the game are printed
		if (userSelection == 1 && computerNumber == 0) {
			System.out.println("You selected 'Rock' and the computer selected '" + computerSelection +"'. It is a tie!");
		} else if (userSelection == 1 && computerNumber == 1) {
				System.out.println("You selected 'Rock' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 1 && computerNumber == 2) {
			System.out.println("You selected 'Rock' and the computer selected '" + computerSelection +"'. You win!");
		} else if (userSelection == 1 && computerNumber == 3) {
			System.out.println("You selected 'Rock' and the computer selected '" + computerSelection +"'. You win!");
		} else if (userSelection == 1 && computerNumber == 4) {
			System.out.println("You selected 'Rock' and the computer selected '" + computerSelection +"'. You lose!");
		}
		//Using logical if statements, the game is checking the user's guess if it is Paper against all of 
		//the computer's possible guesses
		//If the user did not select Paper, it moves to the next group of If statements
		//Depending on what the computer selected, the different outcomes of the game are printed
		if (userSelection == 2 && computerNumber == 0) {
			System.out.println("You selected 'Paper' and the computer selected '" + computerSelection +"'. You win!");
		} else if (userSelection == 2 && computerNumber == 1) {
				System.out.println("You selected 'Paper' and the computer selected '" + computerSelection +"'. It is a tie!");
		} else if (userSelection == 2 && computerNumber == 2) {
			System.out.println("You selected 'Paper' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 2 && computerNumber == 3) {
			System.out.println("You selected 'Paper' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 2 && computerNumber == 4) {
			System.out.println("You selected 'Paper' and the computer selected '" + computerSelection +"'. You win!");
		}
		//Using logical if statements, the game is checking the user's guess if it is Scissors against all of
		//the computer's possible guesses
		//If the user did not select Scissors, it moves to the next group of If statements
		//Depending on what the computer selected, the different outcomes of the game are printed
		if (userSelection == 3 && computerNumber == 0) {
			System.out.println("You selected 'Scissors' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 3 && computerNumber == 1) {
				System.out.println("You selected 'Scissors' and the computer selected '" + computerSelection +"'. You win!");
		} else if (userSelection == 3 && computerNumber == 2) {
			System.out.println("You selected 'Scissors' and the computer selected '" + computerSelection +"'. It is a tie!");
		} else if (userSelection == 3 && computerNumber == 3) {
			System.out.println("You selected 'Scissors' and the computer selected '" + computerSelection +"'. You win!");
		} else if (userSelection == 3 && computerNumber == 4) {
			System.out.println("You selected 'Scissors' and the computer selected '" + computerSelection +"'. You lose!");
		}
		//Using logical if statements, the game is checking the user's guess if it is Lizard against all of 
		//the computer's possible guesses
		//If the user did not select Lizard, it moves to the next group of If statements
		//Depending on what the computer selected, the different outcomes of the game are printed
		if (userSelection == 4 && computerNumber == 0) {
			System.out.println("You selected 'Lizard' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 4 && computerNumber == 1) {
				System.out.println("You selected 'Lizard' and the computer selected '" + computerSelection +"'. You win!");
		} else if (userSelection == 4 && computerNumber == 2) {
			System.out.println("You selected 'Lizard' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 4 && computerNumber == 3) {
			System.out.println("You selected 'Lizard' and the computer selected '" + computerSelection +"'. It is a tie!");
		} else if (userSelection == 4 && computerNumber == 4) {
			System.out.println("You selected 'Lizard' and the computer selected '" + computerSelection +"'. You win!");
		}
		//Using logical if statements, the game is checking the user's guess if it is Spock against all of 
		//the computer's possible guesses
		//Depending on what the computer selected, the different outcomes of the game are printed
		if (userSelection == 5 && computerNumber == 0) {
			System.out.println("You selected 'Spock' and the computer selected '" + computerSelection +"'. You win!");
		} else if (userSelection == 5 && computerNumber == 1) {
				System.out.println("You selected 'Spock' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 5 && computerNumber == 2) {
			System.out.println("You selected 'Spock' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 5 && computerNumber == 3) {
			System.out.println("You selected 'Spock' and the computer selected '" + computerSelection +"'. You lose!");
		} else if (userSelection == 5 && computerNumber == 4) {
			System.out.println("You selected 'Spock' and the computer selected '" + computerSelection +"'. It is a tie!");
		}
		
	}
}
