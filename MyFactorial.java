import java.util.Scanner;

public class MyFactorial 
{
	
	int fact  = 1;
	
	public int getfactorial(int num)
	{
		
		
		for(int i = 1 ; i <= num; i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	public static void main(String[]args)
	{
		int data;
		Scanner input = new Scanner(System.in);
		MyFactorial m1=new MyFactorial();
		System.out.println("Please enter the number for factorial : ");
		data=input.nextInt();
		System.out.println("Factorial for "+data+" : "+m1.getfactorial(data));
	}
}
