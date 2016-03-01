

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

/**
 * 
 * @author Thang Dao
 * 
 * Compute monthly payment from 4 years 
 * 	of tuition that varies with percentage increase.
 * The total tuition is the different tuition of each year with 
 * 	the fixed apr.
 *
 */
public class FinanceCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create new scanner instance
		Scanner input = new Scanner(System.in);
		
		//Print user introduction
		System.out.println("This program will help you"
				+ "determine total cost of tuition to"
				+ "complete a degree and determine the"
				+ "monthly payment for your student loan.");
		
		//Create a counter for year number from 1 to 4
		int yearNumber = 1;

		//Ask for initial tuition cost which is fixed
		System.out.println("What is the initial tuition cost:");
		double tuition = input.nextDouble();	
		
		//Ask for repayments APR which is fixed for student loan
		System.out.println("What is the fixed repayment APR percentage:");
		double apr = (input.nextDouble()/100);
		
		//Create a loop to obtain each year tuition based on percentage increases
		for(int i = 0; i < 3; i++){
				
			//increment year number ig starts at 2
			yearNumber++;
			
			//Ask for percentage increases for tuition which varies by year
			System.out.println("What is year " + yearNumber + " percentage increases for tuition:");
			double percentageIncrease = (input.nextDouble()/100);
			
			//tuition is accumulator for varying tuition cost each year
			tuition += yearlyTuition(tuition, percentageIncrease, apr);
			
		}
				
		//Ask for length of term
		System.out.println("What is the length of term (years):");
		double term = input.nextDouble();
		
		//Print out total tuition and monthly cost
		System.out.printf("Total tuition of $%.2f ", tuition);
		System.out.printf(" over the term of " + term 
				+ " years will make monthly payment equals $%.2f", monthlyPayment(tuition, term));
		
	
		
		
		
		
	}

	/**
	 * @param double tuition 
	 * @param double percentageIncrease
	 * @return private static double tuition ie yearlyTuition
	 */
	public static double yearlyTuition(double tuition, double percentageIncrease, double apr) {
		tuition = tuition * (1 + percentageIncrease) * (1 + apr);
		return tuition;
	}
	
	/**
	 * 
	 * @param double tuition
	 * @param double term
	 * @return private static double tuition ie monthlyPayment
	 */
	public static double monthlyPayment(double tuition, double term) {
		tuition = tuition / (term * 12) ;
		return tuition;	
	}

	
	
	
}
