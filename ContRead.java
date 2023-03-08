import java.util.Scanner;

public class ContRead 
{
	public static void main(String[]args)
	{
		
		Scanner input = new Scanner (System.in);
	
		// get input from user
		float input1;
		float largest=0;
		float smallest = 100;
		int i = 0;
		while (i<4) {
			System.out.println("Enter a floating number: ");
			input1 = input.nextFloat();
			i++;
			if (input1 < smallest ) {
				smallest = input1;
			}
			if (input1 > largest) {
				largest = input1;
			}
		}
		
		// determine the smallestand largest number 
		
		System.out.println("Smallest number entered : "+smallest);
		System.out.println("Largest number entered : "+largest);
	}
}
