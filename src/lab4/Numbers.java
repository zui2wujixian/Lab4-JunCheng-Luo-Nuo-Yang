/**

 * 
 */

package lab4;
import java.util.*;

/**
 * @author Hughluo
 *
 */
public class Numbers {

	
	// Replace this comment with a more appropriate one for this function
	private int sumNumbers (int n) {
		int zong=0;
		while(n>=0){
			zong=n+zong;
			n--;}
		return zong;		// Replace with appropriate return value
	}
	
	// Replace this comment with a more appropriate one for this function
	private int sumNumbersFor (int n) {
		int zong=0;
		for(int i=n;i>=0;i--) {
			zong=i+zong;
			
		}
		return zong;
	}
	
	// Replace this comment with a more appropriate one for this function
	private void interestingAge (int age) {
		switch(age){
		case 0:
			System.out.println("The person has been born.");
			break;
		case 13:
			System.out.println("The person is now an adolescent.");
			break;
		case 18:
			System.out.println("The person is now an adult.");
			break;
		case 20:
			System.out.println("You also a nobody.");
			break;
		default:
			System.out.println("It isn't an interesting age.");
		
		
		
		}
		
	}
	
	public static void main (String [] args) {
		Numbers t = new Numbers ();
		
		System.out.println ("Sum of numbers 0 to 5 is " + t.sumNumbersFor(5));
		Scanner s=new Scanner(System.in);
		int s1=s.nextInt();
		t.interestingAge(s1);
		
	}

}
