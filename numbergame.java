package numbergame;
import java.util.Scanner;
public class numbergame {
//function that implements the number guessing game
	public static void guessingNumberGame() {
		
		//using scanner class
		Scanner sc = new Scanner (System.in);
		
		//Generate the numbers
		int number = 1+(int)(100*Math.random());
		
		//given k trails
		int K = 5;
		int i , guess;
		System.out.println("A number is chosen" +" "+ "between 1 to 100");
		System.out.println("You have to guess the number" +" "+ "within 5 trails");
		
		//Iterate over K trails
		for(i=0;i<K;i++){
			System.out.println("Guess the number:");
			
			//taking input for guessing the number
			guess = sc.nextInt();
			
			//if the number is guessed correct
			if(number == guess) {
				System.out.println("Congratulations!" + "You guessed the correct number");
				break;
				}
			else if (number > guess && i!=K-1) {
				System.out.println("The number is" +" "+ "greater than" +" "+ guess);
			}
			else if (number< guess && i!=K-1) {
				System.out.println("The nnumber is" +" "+ "less than" +" "+ guess);
			}
		}
		if (i==K) {
			System.out.println("You have exhausted" +" "+ "K trails");
			System.out.println("The number was" +" "+ number);
		}
	
	}
	 
	//Driver code
	public static void main (String args[]) {
		//function call
		guessingNumberGame();
	}
}
