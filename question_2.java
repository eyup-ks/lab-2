package lab_2;

import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		
		/*A bag of cookies holds 40 cookies. 
		 *The calorie information on the bag claims that there are 10 serving in the bag 
		 *and that a serving equals 300 calories.
		 *write a program that lets the user enter the number of cookies he or she actually ate 
		 *and then reports the number of total calories consumed.
		 */
		
		 Scanner sc = new Scanner(System.in);
		 
		    System.out.print("Enter how many cookies you ate: ");
		 
		    int cookieCount = sc.nextInt();
		 
		    int servingAmount = 40/10; // 40 kurabiye=10 porsiyon / 4 kurabiye= 1 por
		    int calories= 300/servingAmount; //kalori= 300/4
		    int totalCalories = cookieCount * calories; // top kalori=x*75
		 
		    System.out.println("Total calories: " + totalCalories);

	}

}
