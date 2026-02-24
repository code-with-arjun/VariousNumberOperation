package variousNumberOperation;

public class MultipleTable {
	
	public static void printMultipleTable(int m) {
		for(int i=1;i<=m;i++) {
			
			System.out.println("Table of:" +i);
			
		}
		for(int j=1;j<=10;j++) {
	
			System.out.println(m+ "x" +j+ "=" +(m*j));
		}
		System.out.println();
	}

}


