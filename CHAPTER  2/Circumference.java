import java.util.Scanner;

public class Circumference{
 
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter radius ");
Double r = input.nextDouble();

Double diameter = 2 * r;
Double circumference = 2 * 3.14159 * r; 
Double area = 3.14159 * r * r;

System.out.printf("The diameter is: %f%n", diameter);
System.out.printf("The Circumference is: %f%n", circumference);
System.out.printf("The area is: %f%n", area);

}
}