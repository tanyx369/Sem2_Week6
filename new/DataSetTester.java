/**
   This program tests the DataSet class.
*/
public class DataSetTester
{
   public static void main(String[] args)
   {
	   /*
      DataSet bankData = new DataSet();

      bankData.add(new BankAccount(0));
      bankData.add(new BankAccount(1000));
      bankData.add(new BankAccount(5000));

      System.out.println("Average balance: " + bankData.getAverage());
      System.out.println("Expected: 2000");
      Measurable max = bankData.getMaximum();
      System.out.println("Highest balance: " + max.getMeasure());
      System.out.println("Expected: 5000");

      DataSet coinData = new DataSet();

      coinData.add(new Coin(0.25, "quarter"));
      coinData.add(new Coin(0.1, "dime"));
      coinData.add(new Coin(0.05, "nickel"));

      System.out.println("Average coin value: " + coinData.getAverage());
      System.out.println("Expected: 0.133");            
      max = coinData.getMaximum();
      System.out.println("Highest coin value: " + max.getMeasure());
      System.out.println("Expected: 0.25");          
      */
	   
	   DataSet data = new DataSet();
	   
	   data.add(new Quiz("Peter"));
	   data.add(new Quiz("John"));
	   data.add(new Quiz("Wilson"));
	   System.out.println("Average score : " + data.getAverage());
	   System.out.println("Highest score: " + ((Quiz)data.getMaximum()).getMeasure() + " Grade: " + ((Quiz)data.getMaximum()).getGrade());
	   System.out.println("Name: " + ((Quiz)data.getMaximum()).getName());
	   
	   Dset dta = new Dset();
	   dta.add(new Quiz("Marco"));
	   dta.add(new Quiz("Bishop"));
	   dta.add(new Person(133, "Jake"));
	   System.out.println("Average score : " + dta.getAverage());
	   System.out.println("Highest score: " + ((Quiz)dta.getMinimum()));
	   
      
   }
}
