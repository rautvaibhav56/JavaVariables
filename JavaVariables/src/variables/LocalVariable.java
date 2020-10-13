package variables;
//LocalVariable
public class LocalVariable {
	
public void methodIEmpid(){ 
		int id = 0; //local variable
		id = id + 1;
		System.out.println("empId is:" + id);
	}

	public void methodAge(){ 
		 int age = 0; //local variable
		age = age + 24;
		System.out.println("Age is:" + age);
	}
	
	public static void main(String[] args) {
		LocalVariable objeLocalVariable = new LocalVariable(); //create object
		
		objeLocalVariable.methodIEmpid(); 
		objeLocalVariable.methodAge();
		

	}

}
