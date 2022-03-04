package main;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
	
	private static final DecimalFormat df0 = new DecimalFormat("0");
	private static final DecimalFormat df2 = new DecimalFormat("0.00");

	
	public static Double calcGrossSal(double weeklyHours, double hourlyRate) {
		int workWeeks = 52;
		System.out.println("Calculating gross annual salary over " + workWeeks + " weeeks with an average of " + df0.format(weeklyHours) + " hours per week and a payrate of $" + df2.format(hourlyRate) + " per hour");
		double finalAmt = (weeklyHours * hourlyRate * workWeeks);
		return finalAmt;
	}
	
    public static void main(String[] args) {
    	System.out.println("How many hours did the employee work per week?");
		Scanner input = new Scanner(System.in);
		Double numWeeklyHours = input.nextDouble();
    	System.out.println("What is the employee's hourly rate?");
		input = new Scanner(System.in);
		Double hourlyIn = input.nextDouble();
				
		double grossAnnualSalary = calcGrossSal(numWeeklyHours, hourlyIn);
		
		System.out.println("The Gross Annual Salary = $" + df2.format(grossAnnualSalary));
			
        boolean collectingVac = true;
        double userVac = 0;
        
		while(collectingVac) {
     		System.out.println("How many days vacation did the employee take?");
            userVac = input.nextDouble();
            if(userVac >= 0) {
                collectingVac = false;}
            else {
            	System.out.println("*** ERROR *** Please enter zero or a positive value");
            }
        }
		System.out.println("Calculating Net Annual Salary taking into account " + df0.format(userVac) + " vacation days");
        
		double hoursPerDay = 8;
		double vacDeduction = (userVac * hourlyIn * hoursPerDay);
		double netAnnualSalary = grossAnnualSalary - vacDeduction;
						
		System.out.println("The Net Annual Salary = $" + df2.format(netAnnualSalary));
    }
}
