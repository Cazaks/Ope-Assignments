import java.util.Scanner;
	public class LargestSmallestInteger{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer one ");
		int numOne = input.nextInt();

		System.out.print("Enter integer one ");
		int numTwo = input.nextInt();
		
		System.out.print("Enter integer one ");
		int numThree = input.nextInt();
		
		System.out.print("Enter integer one ");
		int numFour = input.nextInt();

		System.out.print("Enter integer one ");
		int numFive = input.nextInt();

		int largest = 0;
		int smallest = 0;

		largest = numOne;
		smallest = numOne;

		if(numTwo > largest){
		largest = numTwo;

		if(numThree > largest)
		largest = numThree;

		if(numFour > largest)
		largest = numFour;

		if(numFive > largest)
		largest = numFive;}

		if(numTwo < smallest){
		smallest = numTwo;

		if(numThree < smallest)
		smallest = numThree;

		if(numFour < smallest)
		smallest = numFour;

		if(numFive < smallest)
		smallest = numFive;}

		System.out.printf("The largest integer is: %d%n", numOne);

		System.out.printf("The smallest integer is: %d%n", numOne);
}
}