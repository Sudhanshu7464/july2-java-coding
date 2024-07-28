package july2;

public class FinallyBlock {
	//even a return statement finally block is executed
	//finally block is not execute when it threre is system.exit(0) called
	
	public int calculate() {
		
	
	try {
		int a=12/0;
		return a;
		
	}
	catch(ArithmeticException e) {
		return 0;
		
	}
	finally {
		System.out.println("i am finally");
	}



}
	
	public static void main(String[] args) {
		FinallyBlock f = new FinallyBlock();
		System.out.println(f.calculate());
	}
}