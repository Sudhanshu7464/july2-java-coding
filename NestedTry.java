package july2;

public class NestedTry {
	
	void call() {
		//if there is exception in first try block then inner try block is not executed
		//if there is no exception in outer try block then inner try block is executed 
		//finally is always execued even exception is not handled
		
		try {
			System.out.println("I am outer try block");
			int a= 22/0;
			
			try {
				System.out.println("i am inner try block");
				int num= 12/0;
				
			} catch(ArithmeticException e1) {
				System.out.println(e1.getMessage());
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("i am finally");
		}
	}
	public static void main(String[] args) {
		NestedTry n = new NestedTry();
		n.call();
	}

}