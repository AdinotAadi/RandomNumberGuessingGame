import java.util.Scanner;

public class RandomNumberGuessingGame{
	public static void main(String[] args) {
    int gennum;
    int mynum;
    System.out.println("Welcome to Number Guessing Game!");
	Scanner sc = new Scanner(System.in);
	gennum = (int)(Math.random()*100);
	mynum = 0;
	do{
		System.out.println("Guess a number (1-100)");
		mynum = sc.nextInt();
		
		if(mynum == gennum){
			System.out.println("Correct Number!!");
			break;
		}
		else if(mynum > gennum){
			System.out.println("Number Too Big. Guess Lower.");
		}
		else{
			System.out.println("Number Too Small. Guess Higher.");
		}
	} while(mynum > 0);
	System.out.print("Randomly Generated Number was: ");
	System.out.print(gennum);
	}
}