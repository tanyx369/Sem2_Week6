import java.util.Scanner;

public class MyTriangle
{
    public static void main(String[]args)
    {
    	
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter row for Triangle : ");
		int row = input.nextInt();
		String star = "* ";
		String space = " ";
		
		
		for (int i = 1 ;i<=row; i++) {
			int q = row - i ;
			
			//if(i>1) {
				//System.out.println(space.repeat(q-i) + star.repeat(i) + space.repeat(q-i));
			//}
			//else {
				//System.out.println(space.repeat(q) + star.repeat(i) + space.repeat(q));
			//}
			
			//q--;
			System.out.println(space.repeat(q) + star.repeat(i) + space.repeat(q));
		}
		//print the triangle
    }
}
