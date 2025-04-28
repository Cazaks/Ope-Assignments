import java.util.Scanner;

	public class HihgestScoresOne{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
		
		int highScores = 0;
		int scores = 0;
		String highestScorer = "";
		System.out.println("Enter number of students: ");
		int noOfStudent = input.nextInt();

		for(scores = 1; scores <= noOfStudent; scores++){
		System.out.println("Enter student's name: ");
		String studentName = input.next();

		System.out.println("Enter student's scores: ");
		int studentScores = input.nextInt();

		if(studentScores > highScores){
		highScores = studentScores;
		highestScorer = studentName;
		
		}
		}
		System.out.print("Student who had the higest score is " + highestScorer + ". With the score of " + highScores);
}
}