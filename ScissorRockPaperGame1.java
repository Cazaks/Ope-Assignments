import java.util.Scanner;

	public class ScissorRockPaperGame1{

	public static void main(String[] args){

		int counter = 0;
		int count = 0;
		while(Math.abs(counter - count) <=2 ){

		Scanner input = new Scanner(System.in);

		int computerChoice = (int)(Math.random() * 3);
		System.out.println("Enter user choice: scissor(0), rock(1), paper(2) ");
		int userChoice = input.nextInt();
		
		
		if(computerChoice == 0 && userChoice == 1){
		System.out.println("You win");
		counter++; 
		}

		if(computerChoice == 2 && userChoice == 2){
		System.out.println("The computer is paper. You are paper too. It's a draw"); 
		}
		
		if(computerChoice == 1 && userChoice == 0){
		System.out.println("The computer is rock. You are scissor. You lost"); 
		count++;
		}

		if(computerChoice == 2 && userChoice == 1){
		System.out.println("The computer is paper. You are rock. You lost"); 
		count++;
		}

		if(computerChoice == 1 && userChoice == 2){
		System.out.println("The computer is rock. You are paper. You won"); 
		counter++;
		}

		if(computerChoice == 1 && userChoice == 1){
		System.out.println(" The computer is rock. You are rock. It's a draw"); 
		}

		if(computerChoice == 0 && userChoice == 0){
		System.out.println("The computer is sciesor. You are scissor too. It's a draw"); 
		}

		if(computerChoice == 0 && userChoice == 2){
		System.out.println("The computer is scissor. Your are paper. You lost"); 
		count++;
		}

		if(computerChoice == 2 && userChoice == 0){
		System.out.println("The computer is Papar. You are scissor. You won"); 
		counter++;
		}

		}
		if(counter > count){
		System.out.println("Congratulation, you won");
		}else
		{System.out.println("The Computer won");
		}
	}
}