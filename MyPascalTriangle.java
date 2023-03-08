import java.util.Scanner;

public class MyPascalTriangle
{
	String finalans = "";
	int answer = 0;
	
	int ansf;
	String finalansf = "";
	

	
	//method to calculate factorial
	public int factorial(int num) {
		int fact  = 1;
		
		for(int i = 1 ; i <= num; i++) {
				fact = fact * i;
		}
			
			return fact;	
	}
	
	//method for pascal triangle formula
	
	public void binomial(int num) {
		
		for (int n = 0; n <= num;n++) {
			
			for(int r = 0; r<=n;r++) { 
				answer = factorial(n)/(factorial(r)*factorial(n-r));
				finalans += answer + " " ;
			}
			
			
		}
		
	
	
	}
	
	public void arrange(int num1) {
		
		String emptyspace = "";
		String space = " ";
		
		String sub ;
		
		int x = 0;
		for (int p = 1; p <= num1 + 1;p++) {
			sub = finalans.substring(x*2, (x+p)*2);
			x = x+p;
			for (int u = num1; u >= p;u--) {
				emptyspace += space;
			}
			
			System.out.println(emptyspace + sub);
			emptyspace = "";
		

		}
	}
	
	public void flip(int num2) {
		
		
		
		for (int n = num2 -1; n >= 0;n--) {
			
			for(int r = n; r>=0;r--) { 
				ansf = factorial(n)/(factorial(r)*factorial(n-r));
				finalansf += ansf + " " ;
			}
			
		}
		
		//System.out.println(finalansf);
		
	}
	
	
	public void fliparr(int num3) {
		
		String subflip ;
		
		String emptyspace = "";
		String space = " ";
		
		int x = 0;
		for (int p = num3 ; p > 0 ;p--) {
			subflip = finalansf.substring(x*2, (x+p)*2);
			x = x+p;
			emptyspace += space;
			
			System.out.println(emptyspace + subflip);
			

		}
	}
	
	public void calculate(int row) {
		
		binomial(row);
		arrange(row);
		flip(row);
		fliparr(row);

	}

	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter row for Pascal Triangle : ");
		int row = input.nextInt();
		MyPascalTriangle tri1 = new MyPascalTriangle();
		tri1.calculate(row);
		
		//generate pascal triangle
	
	}
}
