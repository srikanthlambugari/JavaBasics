package oopsConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading mol = new MethodOverLoading();
		mol.sum();
		mol.sum(10);
		mol.sum(22.11);
		mol.sum(10, 20);
		

	}
	
	
	public void sum(){
		System.out.println("Sum method with no params");
	}
	
	public void sum(int i){
		System.out.println("Sum method with one params "+ i);
	}
	
	public void sum(double d){
		System.out.println("Sum method with one params "+ d);
	}
	
	public void sum(int i, int j){
		System.out.println("Sum method with two params "+ (i + j));
	}

}
