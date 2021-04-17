package lab_2;

import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {
		// Write a program that computes the tax and tip on a restaurant bill. 
		//The program should ask the user to enter the charge for the meal. 
		//The tax should be 6.75 percent of the meal charge. 
		//The tip should be 20 percent of the total after adding tax. 
		//Display the meal charge, tax amount, tip amount, and total bill on the screen.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your pay");
		
		double mealCharge = sc.nextDouble();
		
		double tax = (mealCharge/100)*6.75;
		
		double tip = ((tax+mealCharge)/100)*20;
		
		double totalPay= mealCharge+tax+tip;
		
		System.out.println(" MealCharge= " + mealCharge + "\n" +  " Tax= " + tax + "\n"+ " Tip= " +tip+ "\n" + " Total= " + totalPay);

	}

}
