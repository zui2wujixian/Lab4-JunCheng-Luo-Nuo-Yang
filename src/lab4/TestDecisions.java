/**
 * 
 */
package lab4;
import java.util.*;
/**
 * @author Hughluo
 *
 */
public class TestDecisions {
	
	/**
	 * @param args
	 */
	public static void sortNums(int s[]) {
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++)
		{	int b;
			for(int n=i;n<s.length;n++)
			{if(s[n]>s[i])
			  { b=s[i];
				s[i]=s[n];
				s[n]=b;
				
			  }					
			}
			
		}	
		System.out.println("现在是"+Arrays.toString(s));
	}
	
	private static void alphaToNumbers(String bbc) {
		// TODO Auto-generated method stub
		switch(bbc) {
		case "A":
		case "a":
		case "B":
		case "b":case "C":case "c":case "F":case "f":
			System.out.println(10);
			break;
		case "D":case "d":case "E":case "e":case "G":case "g":
			System.out.println(12);
			break;
		case "H":case "h":case "J":case "M":case "j":case "m":
			System.out.println(6);
			break;
		default:
			System.out.println(20);
			break;
	}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三个整数：");
		Scanner myScan=new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<=2;i++) {
		 a[i]=myScan.nextInt();
		 
		}
		System.out.println("原本是"+Arrays.toString(a));
		sortNums(a);
		System.out.println("请输入一个字母：");
		Scanner qwer=new Scanner(System.in);
		String bbc=qwer.next();
		alphaToNumbers(bbc);
	}

}
