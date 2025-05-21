import java.util.Scanner;

public class SumDigit{

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter an integer between 0 and 1000: ");
int number1 = input.nextInt();

int remainder = 0;

if (number1 > 0){
if (number1 < 1000){

remainder = number1 % 10;

number1 = number1 / 10;

remainder = remainder + number1 % 10;
number1 = number1 / 10;

remainder = remainder + number1 % 10;
System.out.printf("The sum of the digit is %d%n", remainder);
}
}


}
}
