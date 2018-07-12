package oopsConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava fij = new FunctionsInJava();
		fij.test();
		int addition = fij.addition();
		System.out.println(addition);
		
		int divres = fij.division(3, 23);
		System.out.println(divres);

	}
	
	// Below all methods are non-static methods
	//no input and nothing to return
	//return type is void
	public void test(){
		System.out.println("This is test method");
	}
	
	//no input and something to return
	//return type is int
	public int addition(){
		System.out.println("This is addition method");
		int a = 10;
		int b = 22;
		int c = a+b;
		
		return c;
	}
	
	//no input and something to return
	//return type is String
	public String stringValue(){
		System.out.println("This is String method");
		String s = "Selenium";
		
		return s;
	}
	
	//some input and something to return
	//return type is int
	public int division(int x, int y){
		System.out.println("This is division method");
		int div = x/y;
		return div;
	}

}
