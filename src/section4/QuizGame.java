package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
int score = 0;		
		// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog("What is the third planet from the sun?");
		// 3.  Use an if statement to check if their answer is correct
		if(question.equals("Earth")) {
			System.out.println("Correct!");
			score++;
		} else {
			System.out.println("Wrong");
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String secondQuestion = JOptionPane.showInputDialog("What is the title of the seventh Harry Potter book?");
		if(secondQuestion.equals("The Deathly Hallows")) {
			System.out.println("Correct!");
			score++;
		} else {
			System.out.println("Wrong");
		}
		
		
		String thirdQuestion = JOptionPane.showInputDialog("What is the capital of California?");
		if(thirdQuestion.equals("Sacramento")) {
			System.out.println("Correct!");
			score++;
		} else {
			System.out.println("Wrong");
		}
		
			
		// 6.  After all the questions have been asked, print the user's score 
			System.out.println(score);
	}
}
