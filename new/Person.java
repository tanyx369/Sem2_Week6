public class Person implements Measurable
{
	double height;
	String name;
	
	public Person(double height , String name) {
		this.height = height;
		this.name = name;
	}

	@Override
	public double getMeasure() {
		return height;
	}
	
	public String getName() {
		return name;
	}
	
	
	public static void main(String[] args) {
		DataSet data = new DataSet();
		data.add(new Person(122, "Ali"));
		data.add(new Person(132, "Peter"));
		data.add(new Person(142, "Jake"));
		
		System.out.println("Tallest height: " + data.getMaximum().getMeasure() );
		System.out.println("Tallest height: " + ((Person)data.getMaximum()).getName() );
	    
	}
	
	
	
    
}
