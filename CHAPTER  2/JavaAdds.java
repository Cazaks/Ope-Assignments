import java.util.Scanner;

public class JavaAdds{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first interger ");
int number1 = input.nextInt(45);

System.out.print("Enter second integer ");
int number2 = input.nextInt(72);

int sum = number1 + number2;
System.out.printf("Sum %d%n", sum);

} 

}