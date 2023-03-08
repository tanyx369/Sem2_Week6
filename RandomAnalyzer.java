import java.util.Random;
public class RandomAnalyzer 
{
	public static void main(String[] args) 
	{
		
		Random ran = new Random();
		int i = 0;
		int q = 0;
		int largest=0;
		
		while (q<101) {
			int con = ran.nextInt(1000);
			q++;
			i += con ;
			
			if (con >largest) {
				largest = con;
			}

		}
		
		int average = i / 100;
		
		System.out.println("Largest number generated: " + largest);
		System.out.println("Average: " + average);
		
	}
	
		

}
