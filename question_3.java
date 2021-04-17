package lab_2;

import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		//Write a program that asks the user for a positive nonzero integer value. 
		//The program should use a loop to get the sum of all the integers from 1 up to the number entered. 
		
		int sum=0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Enter your number");
			num=sc.nextInt();
			
			if(num<=0) {
				System.out.println("not valid");
			}else {
				for(int i=0; i<=num; i++) {
					sum=i+sum;
				}
				System.out.println("total: " + sum);
					
			}
		
		


	}

}
