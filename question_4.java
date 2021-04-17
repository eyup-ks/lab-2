package lab_2;

import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		// Write a program that asks user for the number of males and the number of females registered in a class.
		//The program should display the percentage of males and females in the class.
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number males");
		
		double males=sc.nextDouble();
		
		System.out.println("Enter number females");
		
		double females= sc.nextDouble();
		
		double percentageMales = (males/(males+females))*100;
		double percentageFemales = (females/(males+females))*100;
		
		 System.out.println("percentage of males: " + percentageMales);
		 System.out.println("percentage females: " + percentageFemales);

		
		
		
		
		
		

	}

}
