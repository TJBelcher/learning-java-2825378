import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inputtedNum = 1;
    	do{
    	    System.out.println("To get your fortune, pick a number between 1 and 10 - or 0 to exit");
            Scanner scanner = new Scanner(System.in);
            inputtedNum = scanner.nextInt();
            if (inputtedNum ==0) {
                System.out.println("All done! ");
            } else    
		        if (inputtedNum == 1) {
	                System.out.println("You're definitely the one to make a difference! " + inputtedNum);
	            }
	            if (inputtedNum == 2) {
	                System.out.println("It takes two to tango! " + inputtedNum);
	            }   
	            if (inputtedNum == 3) {
	                System.out.println("Three is a crowd! " + inputtedNum);
	            }            
	            if (inputtedNum == 4) {
	                System.out.println("I'll be there in a 'four'tnight! " + inputtedNum);
	            }            
	            if (inputtedNum == 5) {
	                System.out.println("Can you loan me a fivespot? " + inputtedNum);
	            }            
	            if (inputtedNum == 6) {
	                System.out.println("Half a dozen eggs okay? " + inputtedNum);
	            }            
	            if (inputtedNum == 7) {
	                System.out.println("Your lucky number is seven isn't it? " + inputtedNum);
	            }            
	            if (inputtedNum == 8) {
	                System.out.println("Play some eight ball today? " + inputtedNum);
	            }            
	            if (inputtedNum == 9) {
	                System.out.println("I bet your cat has nine lives! " + inputtedNum);
	            }            
	            if (inputtedNum == 10) {
	                System.out.println("Bowling anyone...ten pins? " + inputtedNum);
	            }
	            if (inputtedNum == 11) {
	                System.out.println("My stereo goes to eleven! " + inputtedNum);
	            }            
	            if (inputtedNum == 12) {
	                System.out.println("How about a dozen of those? " + inputtedNum);
	            }
	            if (inputtedNum > 12) {
	                System.out.println("No soup or horoscope for you - try again! " + inputtedNum);
	            }
    	} while (inputtedNum>=1); 
    }
}
