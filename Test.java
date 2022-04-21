import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int guessCount = 3;

		String[] stringStatus = {"hot","warm","cold"};
		String[] days = {"Third","Second","First"};
		Random ran = new Random();
		int num = ran.nextInt(10)+1;   //Generating Random number 
		Scanner scan = new Scanner(System.in);

		while (guessCount > 0) {
			System.out.println("Enter your guess number"  );
			int guessNumber = scan.nextInt();
			if (num == guessNumber) {
				guessCount = 0;
				System.out.println("Congragulations your guess is correct & you won the game ");

			} else {
				guessCount--;				
				if (guessCount == 0) {
					System.out.println("Your " + days[guessCount] + " guess is :- " + guessNumber + " ("+stringStatus[guessCount] + ")");
					System.out.println("Sorry your tries were over.. You lost the game ");
				} else {
					System.out.println("Your " + days[guessCount] + " guess is :- " + guessNumber + " ("+stringStatus[guessCount] + ")");
					System.out.println("Let's have a another try.. you have " + guessCount + " chances more");
				}
			}
		}
	}

}
