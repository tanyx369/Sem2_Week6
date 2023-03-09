
public class Dset {
	
	private double sum;
	private Measurable minimum;
	private int count;
 
	public void add(Measurable x)
	{
		sum = sum + x.getMeasure();
		if (count == 0 || minimum.getMeasure() > x.getMeasure())
			minimum = x;
		count++;
	}
	public double getAverage()
	{
		return sum/count;
	}
	public Measurable getMinimum()
	{
		return minimum;
	}

}
