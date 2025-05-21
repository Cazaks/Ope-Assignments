import java.util.Scanner;

	public class DivisibleBy3{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer; ");
		int integer1 = input.nextInt();

		System.out.print("Enter an integer; ");
		int integer2 = input.nextInt();

		System.out.print("Enter an integer; ");
		int integer3 = input.nextInt();

		System.out.print("Enter an integer; ");
		int integer4 = input.nextInt();

		System.out.print("Enter an integer; ");
		int integer5 = input.nextInt();

		if(integer1 % 3 == 0){
		System.out.printf("%d is a multiple of 3 %n", integer1);
}
		if(integer1 % 3 != 0){
		System.out.printf("%d is not a multiple of 3 %n", integer1);
}

		if(integer2 % 3 == 0){
		System.out.printf("%d is a multiple of 3 %n", integer2);
}
		if(integer2 % 3 != 0){
		System.out.printf("%d is not a multiple of 3 %n", integer2);
}

		if(integer3 % 3 == 0){
		System.out.printf("%d is a multiple of 3 %n", integer3);
}
		if(integer3 % 3 != 0){
		System.out.printf("%d is not a multiple of 3 %n", integer3);
}

		if(integer4 % 3 == 0){
		System.out.printf("%d is a multiple of 3 %n", integer4);
}
		if(integer4 % 3 != 0){
		System.out.printf("%d is not a multiple of 3 %n", integer4);
}

		if(integer5 % 3 == 0){
		System.out.printf("%d is a multiple of 3 %n", integer5);
}
		if(integer5 % 3!= 0){
		System.out.printf("%d is not a multiple of 3 %n", integer5);
}
		
}
}