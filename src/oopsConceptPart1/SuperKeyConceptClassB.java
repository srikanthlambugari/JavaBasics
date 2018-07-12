package oopsConceptPart1;

public class SuperKeyConceptClassB extends SuperKeyConceptClassA{
	
	public SuperKeyConceptClassB(){
		super();
		System.out.println("Child class const B");
		
	}
	
public SuperKeyConceptClassB(int i){
		super(i);
		System.out.println("Child class const with single param");
		
}

public SuperKeyConceptClassB(int i, int j){
	super(i,j);
	System.out.println("Child class const with multiple param");
	
}

public static void main (String args[]){
	SuperKeyConceptClassB b = new SuperKeyConceptClassB();
	SuperKeyConceptClassB b1 = new SuperKeyConceptClassB(10);
	SuperKeyConceptClassB b2 = new SuperKeyConceptClassB(20,30);
}
}
