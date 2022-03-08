public class Main {

    public static void main(String[] args) {
    	Student stud00001 = new Student("Charlie", "Brown", 2024, 3.6, "Anthropology");
    	Student stud00002 = new Student("Jen", "Jabrowski", 2026, 2.5, "Business Administration");
  	
    	System.out.println("Student 00001 is:  " + stud00001.firstName + " " + stud00001.lastName);
    	System.out.println("       Grad year:  " + stud00001.gradYear);
    	System.out.println("             GPA:  " + stud00001.gpa);
    	System.out.println("  Declared Major:  " + stud00001.major);
    	System.out.println(" ");

    	System.out.println("Student 00002 is:  " + stud00002.firstName + " " + stud00002.lastName);
    	System.out.println("       Grad year:  " + stud00002.gradYear);
    	System.out.println("             GPA:  " + stud00002.gpa);
    	System.out.println("  Declared Major:  " + stud00002.major);
    	System.out.println(" ");

    	System.out.println("Incrementing graduation year for " + stud00001.firstName + " " + stud00001.lastName);
    	stud00001.incrementExpectedGraduationYear(); 
    	System.out.println("The new graduation year for " + stud00001.firstName + " " + stud00001.lastName + " is " + stud00001.gradYear);
    	
    }

}

