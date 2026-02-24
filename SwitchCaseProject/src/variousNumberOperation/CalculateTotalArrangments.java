package variousNumberOperation;

import java.util.Scanner;

public class CalculateTotalArrangments {
	
	public static long factorial(int s) {
		
		long fact=1;
		for(int i=1;i<=s;i++) {
			fact=fact*1;
		}
		
		return fact;
	}
	
	public static long totalArrangement(int s,int j) {
		
		return factorial(s)/factorial(s-j);
			
		}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter value of s: ");
		int s=sc.nextInt();
		
		System.out.println("Enter value of j: ");
		int j=sc.nextInt();
		
		if(j<s) {
			System.out.println("j cannot be greater than s");
		}else {
			long result = totalArrangement(s,j);
			System.out.println("Total Arrangements (npr) = " + result);
		}
	}
				{
			
				}
	}

