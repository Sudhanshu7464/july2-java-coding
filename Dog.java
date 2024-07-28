package july2;

public class Dog extends Animal{
	
	void docalculation()throws WrongCalculationException
	
	{
		int a=2;
		int b=0;
		if(b==0) {
			throw new WrongCalculationException("you divide by zero");
		}
		else {
			System.out.println("you can do it");
		}
	
		
		
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		try {
			d.docalculation();
		} catch (WrongCalculationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}