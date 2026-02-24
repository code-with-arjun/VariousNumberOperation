package variousNumberOperation;

public class Pascal {
	public static int isPascal(int s, int o) {
		if(o==0||0==s)
			return 1;
		return isPascal(s-1,o-1)+isPascal(s-1,0);
		
	}
	static void printPascal(int n) {
		// space=n;
		for(int i=0;i<n;i++) {
			for(int k=0;k<=n-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print(isPascal(i, j)+" ");
			}
			System.out.println();
		}
		
	}
	

}
