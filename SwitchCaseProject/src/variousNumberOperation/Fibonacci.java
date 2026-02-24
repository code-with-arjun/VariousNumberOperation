package variousNumberOperation;

public class Fibonacci {
	
	public static void printFiboncci(int d) {
	
		if(d==0) {
			System.out.println(0);
			return ;
		}
		else if(d==1){
			System.out.println(1);
			return;
		}
		System.out.print(0+" "+1+" ");
		int n1=0;
		int n2=1;
		int n3=0;
		
		for(int i=2;i<=d;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
	}

}
