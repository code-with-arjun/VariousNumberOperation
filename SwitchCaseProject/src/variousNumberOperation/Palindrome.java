package variousNumberOperation;

public class Palindrome {
	public static void isPalindrome(int h){
		int rev=0;
		int org=h;
		while(h>0) {
			int digit=h % 10;
			rev = rev * 10+ digit;
			h=h/10;
		}
		
		if(org==rev) 
			System.out.println("Palindrome Number" +rev);
			else 
				System.out.println("Not a Palindrome Number"+rev);
				
			
		}
			
			
		
	}


