public class Student {

    String firstName;
    String lastName;
    int gradYear;
    double gpa;
    String major;

    public Student(String firstName, String lastName,
                    int gradYear, double gpa,
                    String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.gpa = gpa;
        this.major = major;
    }

    public int incrementExpectedGraduationYear() {
    	this.gradYear = this.gradYear + 1;
    	return (this.gradYear);
    }
}     

