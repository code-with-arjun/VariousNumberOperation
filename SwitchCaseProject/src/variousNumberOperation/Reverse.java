package variousNumberOperation;

public class Reverse {
	public static void isReverse(int g) {
		int rev=0;
		while(g>0) {
			int digit=g%10;
			rev=rev*10+digit;
			g=g/10;
		}
		System.out.println("Reversed number:"+ rev);
	}

}
