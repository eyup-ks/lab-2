package lab_2;

import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
	/*Write a program that will ask the user to enter the amount of a purchase. 
	* The program should then compute the state and county tax sales tax. 
	* Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
	* The program should display the amount of the purchase , the state sales tax, the county sales tax,
	* the total sales tax, and the total of the sale 
	* (which is the sum of the amount of purchase plus the total sales tax)
	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your pay and tax");
		
		double payTotal = sc.nextDouble();
		
		double countyTax = (payTotal/100)*2;
		
		double statesTax = (payTotal/100)*4;
		
		double salesTax = countyTax+statesTax;
		
		
		double payAmamount= payTotal+salesTax;
		
		System.out.println("Pay=" + payTotal+ "\n" + "State sales tax= " + statesTax+ "\n"+ 
		"County sales tax= "+ countyTax+ "\n" + "Total= " +payAmamount);
	}

}
