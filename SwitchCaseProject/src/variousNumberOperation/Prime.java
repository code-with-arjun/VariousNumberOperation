package variousNumberOperation;

public class Prime {

	public static  boolean isPrime(int f) {
		if(f<=1) {
			return false;
		}else {
			for(int i=2;i<=f/2;i++) {
				if(f%i==0) {
					return false;
				}
			}
			return true;
		}
		
		}
}
