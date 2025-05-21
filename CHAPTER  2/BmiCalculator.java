import java.util.Scanner;

public class BmiCalculator{

public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds ");
double weight = input.nextDouble();

System.out.print("Enter hight in meters ");
double height = input.nextDouble();

double bmi = weight / (height * height);

System.out.printf("bmi is %f%n", bmi); 
}
}




 