package variousNumberOperation;

public class Table {
	public static void generateTable(int n) {
		for(int i=1;i<=10;i++)
			
			System.out.println(n+"*"+i+"= "+n*i);
		
	}
	
	public static void generateTableUptoNNumbers(int n) {
		for(int i=1;i<=n;i++) {
			generateTable(i);
			System.out.println(" --------------------");
		}
	}

}
