import java.util.Scanner;

public class Multiple {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter First Integer: ");
int number1 = input.nextInt();

System.out.print("Enter Second Integer: ");
int number2 = input.nextInt();

int firstMultiple = number1 * 3;
int secondNumber = number2 + number2;

if (firstMultiple / secondNumber == 2){
System.out.println("It is a multiple of the Second integer");
}

if (firstMultiple % secondNumber == 0){
System.out.println("it is the double of the Second Integer");
}

if (firstMultiple % secondNumber != 0){
System.out.println("It is not multiple of the Second integer");
}

}
}