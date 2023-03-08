import java.util.Scanner;
import java.util.StringTokenizer;


public class NumberAnalyzer 
{
String in;
	

	
	public void AskInput() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a series of number for analyze");
		in = "";
		in += input.nextLine();
		
	}
	
	public void Calculate() {
		
		String[] insplit = in.split(" ");
		
		int num1 = 0;
		int nummax= 0;
		
		for (int i = 0; i < insplit.length; i++) {
			num1 = Integer.parseInt(insplit[i]);
			if (num1 > nummax) {
				nummax = num1;
			}
		}
		
		int x = 0;
		int q = 0;
		
		while(x<insplit.length) {
			if (insplit[x].equals(String.valueOf(nummax))) {
				q++;
			}
			x++;
		}

		
		
		
		System.out.println("Max number: " + nummax);
		System.out.println("Occurance: " + q);
		
	}

	public static void main(String[] args) {
		
		NumberAnalyzer anl1 = new NumberAnalyzer();
		anl1.AskInput();
		anl1.Calculate();

	}


}
