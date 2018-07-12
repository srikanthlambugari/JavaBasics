package oopsConceptPart1;

public class StaticVsNonStaticConcept {
	
	String name = "Srikanth"; // global non-static variable
	static int age = 30; // global static variable

	public static void main(String[] args) {
		
		// class object has to be created to call non-static methods and variables.
		StaticVsNonStaticConcept svns = new StaticVsNonStaticConcept();
		svns.sum();
		System.out.println(svns.name);

		
		// we can directly call static method
		add();
		
		//Static variables and classes can also be accessed by object
		System.out.println(svns.age);
		

	}
	
	public void sum(){ // non-static method
		System.out.println("Sum method");
	}
	
	public static void add(){ // static method
		System.out.println("Addition method");
	}

}
