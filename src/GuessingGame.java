import java.util.Scanner;
public class GuessingGame {
	public static void main(String[] args) {
		int randomNumber = (int)(Math.random()*10);
		System.out.println("Debugger: " + randomNumber);
		System.out.println("Guess a number between 0 and 9!");
		System.out.print("Enter your number: ");
		Scanner input = new Scanner(System.in);
		final int guess = input.nextInt();
		if (guess == randomNumber) {
			System.out.print("Your guess is correct. You win!");
		}else
			System.out.print("Your guess is incorrect. You lose.");
		}
		}

	

