import java.util.Scanner;

/**
 * 
 */

/**
 * @author h.meadows
 * Mr. Hardman
 * demo, Program 1
 *12/9/2016
 */
public class ArrayAverages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double[] student1 = {56.2, 65.7, 45.32, 89.213, 65, 76, 54, 98, 45, 87.2};
		
		double[] student2 = new double[10];
		
		double average1 = 0;
		double average2 = 0;
		
		System.out.println("please enter 10 marks to be averaged");
		
		for(int i = 0; i < student2.length; i++){
			System.out.print("Please enter a mark: ");
			student2[i] = userInput.nextDouble();
		}
		
		average1 = calcAverage( student1 );
	    average2 = calcAverage( student2 );

		if(average2 > average1){
			
			System.out.println("Your average is greater than student 1's by " + (average2 - average1) + " points");
		} else if(average1 > average2){
			
			System.out.println("Your average is greater than student 2's by " + (average1 - average2) + " points");
		}
		else {
			
			System.out.println("your average is equal to student 1's");
		}
		
		userInput.close();
		
	}
	/**
     * calculates the average of the students marks
     *
    * @param the marks array
    * @return returns the students marks as a double
    */

	public static double calcAverage( double[] marks ){
		
		double sum = 0;
		double average = 0;
		
		for(int i = 0; i< marks.length; i++){
			sum += marks[i];
		}

		average = sum / marks.length;
		
		return average;
		
	}
	
}