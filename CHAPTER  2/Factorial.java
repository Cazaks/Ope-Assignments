import java.util.Scanner;

	public class Factorial{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		long factorial = 1;
		for(int count = 1; count <= number; count++){

		factorial = factorial * count;

		}
		System.out.printf("The factorial of the entered number is: %d", factorial, number);
	}
}