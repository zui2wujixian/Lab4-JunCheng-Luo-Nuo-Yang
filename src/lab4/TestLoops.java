/**
 * 
 */
package lab4;

import java.util.Scanner;

/**
 * @author Hughluo
 *
 */
public class TestLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("请输入5个整数：");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=s.nextInt();
			
		}
		int h=4;
		int ji = 0,ou=0;
		int jihe=0,ouhe=0;
		
		do {
			
			if(a[h]==9) {
				System.out.println(a[h]);
				System.out.println("This number is not allowed to be counted.");
			}
			else {	
				if(a[h]==0) {
					System.out.println(a[h]);
					System.out.println("This number is wrong to caculate.");
					
				}
				
				else {
				if(a[h]%2!=0)
				{	System.out.println(a[h]);
					System.out.println("这个数为奇数");
				    ji++;
				    jihe+=a[h];}
				else
				{	System.out.println(a[h]);
			    	System.out.println("这个数为偶数");
				    ou++;
				    ouhe+=a[h];}}
				
			}
			
			h--;
		}
		while(h>=0);
		System.out.println("偶数个数是"+ou);
		System.out.println("奇数个数是"+ji);
		System.out.println("偶数的和是"+ouhe);
		System.out.println("奇数的和是"+jihe);
		
		
		

	}

	private static int a(int h) {
		// TODO Auto-generated method stub
		return 0;
	}

}
