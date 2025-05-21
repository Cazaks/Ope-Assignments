import java.util.Scanner;

public class ArithmeticDifference{

public static void main(String [] arg){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer");
int firstNumber = input.nextInt();

System.out.print("Enter second integer");
int secondNumber = input.nextInt();

System.out.print("Enter third integer");
int thirdNumber = input.nextInt();

int sum = firstNumber + secondNumber + thirdNumber;
int average = firstNumber + secondNumber + thirdNumber / 3;
int product = firstNumber * secondNumber * thirdNumber;

System.out.printf("Sum is %d%n", sum);

System.out.printf("Average is %d%n", average);

System.out.printf("Product is %d%n", product);

if (firstNumber > secondNumber && firstNumber > thirdNumber){
System.out.printf("%d is the largest %n", firstNumber);
}

if (secondNumber > firstNumber && secondNumber > thirdNumber){
System.out.printf("%d is the largest %n", secondNumber);
}

if (thirdNumber > firstNumber && thirdNumber > secondNumber){
System.out.printf("%d is the largest %n", thirdNumber);
}

if (firstNumber < secondNumber && firstNumber < thirdNumber){
System.out.printf("%d is the smallest %n", firstNumber);
}

if (secondNumber < firstNumber && secondNumber < thirdNumber){
System.out.printf("%d is the smallest %n", secondNumber);
}

if (thirdNumber < firstNumber && thirdNumber < secondNumber){
System.out.printf("%d is the smallest %n", thirdNumber);
}

}
}