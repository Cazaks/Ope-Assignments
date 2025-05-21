import java.util.Scanner;

public class Divisible {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer ");
int number = input.nextInt();

if (number % 3 == 0){
System.out.printf("%d is divisble by 3 %n", number);
}
if (number % 3 != 0){
System.out.printf("%d is not divisble by 3 %n", number);
}

}
}