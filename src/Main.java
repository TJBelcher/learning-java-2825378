import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    String question = "Who is the greatest rock guitarist?";
    String choiceOne = "Eric Clapton";
    String choiceTwo = "Jimmy Page";
	String choiceThree = "Jimi Hendrix";
    String correctAnswer = choiceTwo;
    String artistChoice1 = " ";
    String artistChoice2 = " ";
  	String artistChoice = " ";
  	Boolean loopComplete = false;
  	while (!loopComplete) {
  	System.out.println(question);
    System.out.println("You may answer:  "+ choiceOne + " or " + choiceTwo + " or " + choiceThree);
	    Scanner input = new Scanner(System.in);
	    artistChoice1 = input.next();
	    artistChoice2 = input.next();
	    artistChoice = artistChoice1 + " " + artistChoice2;
	    System.out.println("You answered " + artistChoice);
		if (artistChoice.toLowerCase().equals(choiceOne.toLowerCase())||
				artistChoice.toLowerCase().equals(choiceTwo.toLowerCase())||
					artistChoice.toLowerCase().equals(choiceThree.toLowerCase()))
		{
			if(artistChoice.toLowerCase().equals(correctAnswer.toLowerCase())) {
	           System.out.println("You are a wise person picking " + choiceTwo + "!!!");
	           loopComplete = true;
	        }
	        else {
	           System.out.println("Keep listening. "+artistChoice + " is good, but at some point you'll pick " + choiceTwo + "!!!");
	           loopComplete = true;
	        }
		}
		else {
			System.out.println("Please select one of the offered artists - try again");  	
		}
    }
  } 
}
