import java.util.*;

enum Answer{
	
	Q1(10), Q2(12) , Q3(13) ,Q4(25);
	final int number;
	
	
	private Answer(int num) {
		number = num;
	}

	public int getNum() {
		return number;
	}
	
}


public class Quiz implements Measurable 
{
	
	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		return score;
	}
	
	double score;
	String grade;
	int ans1;
	int ans2;
	int ans3;
	int ans4;
	
	String name;
	public Quiz(String name) {
		this.name = name;
		ask();
	}

	
	public void ask() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Q1: 5 + 5 = ");
		ans1 = scan.nextInt();
		System.out.println("Q2: 6 x 2 = ");
		ans2 = scan.nextInt();
		System.out.println("Q3: 9 + 4 = ");
		ans3 = scan.nextInt();
		System.out.println("Q4: 5 x 5 = ");
		ans4 = scan.nextInt();
		
		
		check();
		System.out.println(score);
	}
	
	public void check() {
		
		if(ans1 == Answer.Q1.number) {
			score ++;
		}
		
		if(ans2 == Answer.Q2.number) {
			score ++;
		}
		
		if(ans3 == Answer.Q3.number) {
			score ++;
		}
		
		if(ans4 == Answer.Q4.number) {
			score ++;
		}
	
		
		if(score == 4) {
			grade = "A";
		}
		else if (score == 3 || score == 2) {
			grade = "B";
		}
		else {
			grade = "C";
		}
		
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String getName() {
		return this.name;
	}

	
    public static void main(String[] args) {
    	
    	Quiz q = new Quiz();
    	
    
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter value: ");
    	int num = scan.nextInt();
    	System.out.println(num == Answer.Q2.number);
    	
    	
    }
}
