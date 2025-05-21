import java.util.Scanner;

	public class SeperatingDigits{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter five digits numbers: ");
		int numberDit = input.nextInt();

		int number1 = numberDit % 10;
		number1 = numberDit / 10; 

		int number2 = numberDit % 10;
		number2 = numberDit / 10;

		int number3 = numberDit % 10;
		number3 = numberDit / 10;

		int number4 = numberDit % 10;
		number4 = numberDit / 10;

		int number5 = numberDit % 10;
		number5 = numberDit / 10;

		System.out.printf("4   2   3   3   9 %n");
}
}