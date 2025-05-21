import java.util.Scanner;

	public class ArithmeticSmallestLargest{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer ");
		int firstInt = input.nextInt();

		System.out.print("Enter the second integer ");
		int secondInt = input.nextInt();

		System.out.print("Enter the third integer ");
		int thirdInt = input.nextInt();

		int smallest = 0;
		int largest = 0;

		int sum = firstInt + secondInt + thirdInt;

		int average = sum / 3;

		int product = firstInt * secondInt * thirdInt;

		smallest = firstInt;
		largest = firstInt;

		if(secondInt < smallest)
		smallest = secondInt;

		if(thirdInt < smallest)
		smallest = thirdInt;

		if(secondInt > largest)
		largest = secondInt;

		if(thirdInt > largest)
		largest = thirdInt;


		System.out.printf("The sum of the integers is: %d%n", sum);

		System.out.printf("The average of the integers is: %d%n", average);

		System.out.printf("The product of the integers is: %d%n", product);

		System.out.printf("The smallest the integer is: %d%n", smallest);

		System.out.printf("The largest the integer is: %d%n", largest);
 
}
}

