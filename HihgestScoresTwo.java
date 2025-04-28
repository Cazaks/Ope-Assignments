import java.util.Scanner;

	public class HihgestScoresTwo{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
		
		int firstHighScores = 0;
		int secondHighScores = 0;
		int scores = 0;
		int count = 0;
		String firstHighestScorer = "";
		String secondHighestScorer = "";

		System.out.println("Enter number of students: ");
		int noOfStudent = input.nextInt();

		for(scores = 1; scores <= noOfStudent; scores++){
		System.out.println("Enter student's name: ");
		String studentName = input.next();

		System.out.println("Enter student's scores: ");
		int studentScores = input.nextInt();

		if(studentScores > firstHighScores){
		firstHighScores = studentScores;
		firstHighestScorer = studentName;
		}

		if(firstHighScores  >= secondHighScores){ 
		secondHighestScorer = studentName;
		secondHighScores = studentScores; 
		count = -1;
		}
		}
		System.out.println("Student who had the the higest score is " + firstHighestScorer + ". With the score of " + firstHighScores);

		System.out.println("The Student with the second hiest score is " + secondHighestScorer + ". Withe the score of " + secondHighScores);
		
		
	}
}