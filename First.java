package july2;
//parent class occur the any exception not handled then it goes to subclasss where it is called
	//if it is not caught in child class then it goes to those class where the function is called
	//this is called exception propogation
	//in this example exception is 
	//is a process in which the exception is being dropped from to the top to 
	//the bottom of the stack. If not caught once, the exception again drops down to the previous method and so on until it gets caught or until it reach the very bottom of the call stack.
	

public class First {
	
	
	public static void calculate() {
		System.out.println("before exception");
		
		int a=12;
		int b=0;
		int result = a/b;
		
	
		System.out.println("exception handled ");
	
		
	}
	
	public static void main(String[] args) {
		Third t = new Third();
		t.third();
	}

}

class Second{
	static void second() {
		System.out.println("method of second class");
		First.calculate();
		System.out.println("after exception  occur==> second class");
	}
}

class Third{
	void third() {
		System.out.println("this is method of third class");
		try {
		Second.second();
		}catch(Exception e) {
			System.out.println("Exception is handle in bottom of stack");
		}
		System.out.println("after exception occur==> third class");
	}
}