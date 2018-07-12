package oopsConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
		String age = "25";
		System.out.println("Before converting :"+age+20);
		
		//converting string to integer using parseInt
		int i = Integer.parseInt(age);
		System.out.println("After converting :"+(i+20));
		
		//converting string to double using parseDobule
		String value = "12.11";
		System.out.println("Before converting :"+value);
		
		double d = Double.parseDouble(value);
		System.out.println("After converting :" +(d+10.20));
		
		//converting string to boolean using parse
		String bool = "true";
		System.out.println("Before converting :"+bool);
		
		boolean b = Boolean.parseBoolean(bool);
		System.out.println("After converting :" +b);
				

	}

}
