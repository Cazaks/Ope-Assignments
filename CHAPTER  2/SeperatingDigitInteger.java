import java.util.Scanner;

public class SeperatingDigitInteger{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter integer with five digits: ");
int number = input.nextInt();
int originalNumber = number;

if (originalNumber >= 99999){

if (originalNumber <= 99999){

int one = number % 10;
number = number / 10;

int two = number % 10;
number = number / 10;

int three = number % 10;
number = number / 10;

int four = number % 10;
number = number / 10;

int five = number % 10;
number = number / 10;

System.out.printf("%d %d %d %d %d%n", five, four, three, two, one);
}
}

if (originalNumber > 99999){
System.out.print("please enter five digits");
}

if (originalNumber < 99999){
System.out.print("please enter five digits");
}
}
}