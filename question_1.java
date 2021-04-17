package lab_2;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		/*Write a program with a loop that lets the user enter a series of integer numbers. 
		 * After all the numbers have been entered,
		 * the program should display the largest and smallest numbers entered.
		 */
		
		int biggest=0;
		int smallest=999999999;
		
		Scanner sc = new Scanner(System.in);
		
		int decision;
		System.out.println("Enter your first number: ");
		int num = sc.nextInt();
		
		if (num>biggest) {
			biggest=num;
		}
		if(num<smallest) {
			smallest=num;
		}
		
	do {
		
		System.out.println("Enter next number");
		num= sc.nextInt();
		
		System.out.println("Do you want to enter another number?: 0-No, 1-Yes");
		decision=sc.nextInt();
		
		if (num>biggest) {
			biggest=num;
		}
		if(num<smallest) {
			smallest=num;
		}
			
	}while(decision==1);
			
			
		
	System.out.println("the biggest number is: " + biggest);
	System.out.println("the smallest number is: " + smallest);


	}

}
