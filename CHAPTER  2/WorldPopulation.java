import java.util.Scanner;

public class WorldPopulation{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter current world population ");
double currentPopulation = input.nextDouble();

System.out.print("Enter annual population growth rate ");
double growthRate = input.nextDouble();

double yearOne = 8200000 * Math.pow((1 + 0.9),1);
double yearTwo = 8200000 * Math.pow((1 + 0.9),2);
double yearThree = 8200000 * Math.pow((1 + 0.9),3);
double yearFour = 8200000 * Math.pow((1 + 0.9),4);
double yearFive = 8200000 * Math.pow((1 + 0.9),5);

System.out.printf("yearOne Pt is %f%n", yearOne);
System.out.printf("yearTwo Pt is %f%n", yearTwo);
System.out.printf("yearThree Pt is %f%n", yearThree);
System.out.printf("yearFour Pt is %f%n", yearFour);
System.out.printf("yearFive Pt is %f%n", yearFive);


}
}