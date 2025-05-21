import java.util.Scanner;

public class ComparingIntegers{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter an interger");
int number = input.nextInt();

int square = number * number;
int numberAndSquare = number + square;

System.out.printf("The number and its quare is %d%n", numberAndSquare);

if (numberAndSquare > 100){
System.out.printf("Number and its square are greater than 100 %d > %d%n", numberAndSquare, number + square);
}

if(numberAndSquare == 100){
System.out.printf("Number and its square are equal 100 %d == %d%n", numberAndSquare, number + square, 100);
}

if (numberAndSquare != 100){
System.out.printf("Number and its square are not equal to 100 %d != %d%n", numberAndSquare, number + square);
}

if (numberAndSquare < 100) {
System.out.printf(" Number and its square are less than 100 %d < %d%n", numberAndSquare, number + square);
}

}
}
