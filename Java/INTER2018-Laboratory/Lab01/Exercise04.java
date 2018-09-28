// By: Kevin E. Hernandez Vazquez
// Date: 2/11/2018
/*
 * This program grades arithmetic quizzes as follows:
 * a) Asks the user how many questions are in the quizz
 * b) Asks the user to enter the key (that is, the correct answers).
 * c) Asks the user to enter the answers for the quiz to be graded.
 * d) When the user has entered all of the answers to be graded, 
 *    prints the number correct and the percent correct.
 */

import java.util.Scanner;
import java.util.stream.*;

public class Exercise04 {

	public static void main(String[] args) {
		System.out.print("How many questions are in the quiz? ");
		Scanner input = new Scanner(System.in);
		int x, correct = 0, ktotal, atotal;
		float percent;
		
		x = input.nextInt();
		
		int[] key = new int[x];
		int[] answers = new int[x];
		
		System.out.printf("Enter the key of the quizzes: ");
		for(int i=0; i<key.length ;i++) {
			key[i] = input.nextInt();
		}
		System.out.printf("Enter the score for quizzes: ");
		for(int i=0; i<key.length ; i++) {
			answers[i] = input.nextInt();
		}
		
		for(int i=0; i<key.length ;i++) {
			if (key[i] == answers[i]) {
				correct += 1;
			}
		}
		
		ktotal = IntStream.of(key).sum();
		atotal = IntStream.of(answers).sum();
		percent = ((float)atotal/ktotal)*100;
		
		System.out.printf("CORRECT: %d\n",correct);
		System.out.print("PERCENT: "+ percent +"%");
	}
}
