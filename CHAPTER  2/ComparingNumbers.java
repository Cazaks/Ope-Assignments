import java.util.Scanner;

public class ComparingNumbers{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter integer one ");
int integer1 = input.nextInt();

System.out.print("Enter integer tow ");
int integer2 = input.nextInt();

if (integer1 == integer2){
System.out.printf("%d==%d%n", integer1, integer2);
}

if (integer1 != integer2){
System.out.printf("%d!=%d%n", integer1, integer2);
}

if (integer1 > integer2){
System.out.printf("%d>%d%n", integer1, integer2);
}

if (integer1 < integer2){
System.out.printf("%d<%d%n", integer1, integer2);
}

if (integer1 >= integer2){
System.out.printf("%d>=%d%n", integer1, integer2);
}

if (integer1 <= integer2){
System.out.printf("%d<=%d%n", integer1, integer2);
}

}
}