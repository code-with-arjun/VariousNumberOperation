package variousNumberOperation;
import java.util.Scanner;
public class Service {

	public static boolean doYouWantToRepeat() {
		Scanner sc=new Scanner(System.in);
		System.out.println("To Continue Enter (Yes/no):");
		String input=sc.nextLine();
		return input.equalsIgnoreCase("yes");
	}
	
	public static void selectOperation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==>For Factorial");
		System.out.println("Press 2==>For Power");
		System.out.println("Press 3==>For Multiplication Table of a number ");
		System.out.println("Press 4==>For Fibonacci");
		System.out.println("Press 5==>For Prime");
		System.out.println("Press 6==>For Reverse");
		System.out.println("Press 7==>For Palindrome");
		System.out.println("Press 8==>For MultipleTable");
		System.out.println("Press 9==>For Calculate total Arrangments");
		System.out.println("Press 10==>For Calculate total Selections");
		System.out.println("Press 11==>For Row of Pascal Triangle");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			
			System.out.println("You have selected Factorial Operation");
			
			System.out.println("Enter the Number: ");
			
			int n=sc.nextInt();
			int fact=1;
			for(int i=1;i<=n;i++)
				fact=fact*i;
			System.out.println(n+"!= "+fact);
			break;
		case 2:
			System.out.println("You have selected Power Operation");
			System.out.println("Enter a: ");
			int a=sc.nextInt();
			System.out.println("Enter b: ");
			int b=sc.nextInt();
			
			int pow=Power .getPower(a, b);
			
			System.out.println(a+" to power "+b+" is: "+pow);
			break;
			
		case 3:
			System.out.println("You have selected Table Operation");
			System.out.println("Enter : ");
			
			int k=sc.nextInt();
			
			Table.generateTable(k);
			break;
			
		case 4:
			System.out.println("You have Selected Fibonacci Operation");
			System.out.println("Enter : ");
			
			int d=sc.nextInt();
			Fibonacci.printFiboncci(d);
			break;	
			
		case 5:
			System.out.println("You have Selected Prime Operation");
			System.out.println("Enter : ");
			
			int f=sc.nextInt();
			
			if(Prime.isPrime(f)) {
				System.out.println("Is Prime no. "+f);
			}else {
				System.out.println("Is not Prime no. "+f);
			}
			break;
			
		case 6:
			System.out.println("Yot have Selected Reverse Operation");
			System.out.println("Enter :");
			
			int g=sc.nextInt();
			Reverse.isReverse(g);
			
			break;
			
		case 7:
			System.out.println("Yot have Selected Palindrome Operation");
			System.out.println("Enter :");
			
			int h=sc.nextInt();
			Palindrome.isPalindrome(h);
			
			break;
			
		case 8:
			System.out.println("Yot have Selected Multiplication Table Operation");
			System.out.println("Enter :");
			
			int m=sc.nextInt();
			MultipleTable.printMultipleTable(m);
			break;
		
		case 9:
			System.out.println("Yot have Selected Calculate total Arrangments Operation");
			System.out.println("Enter :");
			
			int s=sc.nextInt();
			System.out.println("Enter : ");
			int j=sc.nextInt();
			
			CalculateTotalArrangments.main(null);

		
			break;
			
		case 10:
			System.out.println("Yot have Selected Calculate total Selection Operation");
			System.out.println("Enter :");
			break;
			
		case 11:
			System.out.println("Yot have Selected Pascal Operation");
			System.out.println("Enter :");
			
			int o=sc.nextInt();
			
			Pascal.printPascal(o);
			break;
			
		default:
			System.out.println("Invalid choice enter!! ");
			selectOperation();
			
		}
	
	}

		
	}


		
	

