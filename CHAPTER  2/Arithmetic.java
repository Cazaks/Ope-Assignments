import java.util.Scanner;

public class Arithmetic{

public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the first numnber");
int firstNumber = input.nextInt();

System.out.print("Enter the seond number");
int secondNumber = input.nextInt();

int square1 = firstNumber * firstNumber;
int square2 = secondNumber * secondNumber;

int sum = square1 + square2;

int difference = square1 - square2;

System.out.printf("%d%n%d%n", sum, difference);

}
}