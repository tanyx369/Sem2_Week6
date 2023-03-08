import java.util.Scanner;

public class Binarynum 
{
	public static void main(String[] args) 
	{
		
		
		System.out.println("Generating binary number series");
		int initial = 1;
		System.out.println(initial);
		
		Scanner input=new Scanner(System.in);
		//get input from user
		System.out.println("Press Y/y to continue: ");
		String in = input.nextLine();
		
		
		
	
		// loop to continue generate binary series, stop when meet stopping condition
		
		
		
		while(in.equals("y") || in.equals("Y")) {
			int output = initial * 2;
			initial += output - initial;
			System.out.println(initial);
			System.out.println("Press Y/y to continue: ");
			in = input.nextLine();
			if (in.equals("n") || in.equals("N")) {
				break;
			}
			
			
		}
	}

}

