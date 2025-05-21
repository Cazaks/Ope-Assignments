import java.util.Scanner;

	public class TripleDoubleNumbers{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer one: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter integer one: ");
		int secondNumber = input.nextInt();

		int firstTriple = 3 * firstNumber;
		int secondDouble = 2 * secondNumber;

		if(firstTriple % secondDouble == 0){
		System.out.printf("%d is a multiple of %d%n", firstTriple, secondDouble);

}
		if(firstTriple % secondDouble != 0){
		System.out.printf("%d is not a multiple of %d%n", firstTriple, secondDouble);
}
}
}