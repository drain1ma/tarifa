import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		int megs = scnr.nextInt(); 
		int months = scnr.nextInt();
		int total = 0; 
		
		
		for (int i = 0; i < months; i++)
		{
			int megsPerMonth = scnr.nextInt(); 
			
			int temp = megs - megsPerMonth; 
			
			total = total + temp; 
			
		}
		
		System.out.println(total + megs); 
		
	}

}
