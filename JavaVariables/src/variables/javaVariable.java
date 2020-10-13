package variables;
//javaVariables
public class javaVariable {
	
	int a = 10; //Instance variable
	static  int b = 12; // Static variable 
	
	public void add(){
		int c = 14,d; // local variable
		d = a+b+c;
		System.out.println(d);
}
	public void mul(){
		int e = 16,f;
		f = a*b*e;
		System.out.println(f);
		
	}
	
	public static void main(String[] args) {
		javaVariable objjavaVariable = new javaVariable();
		objjavaVariable.add();
		objjavaVariable.mul();

	}

}
