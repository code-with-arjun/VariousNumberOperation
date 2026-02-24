package variousNumberOperation;
import java.util.Scanner;

public class NumberOperation {

	public static void main(String[] args) {
		do {
			Service.selectOperation();
		}while(Service.doYouWantToRepeat());
		System.out.println("Thank You!Application Ends!! ");
		
	}
	
}
