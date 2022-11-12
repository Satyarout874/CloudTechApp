package in.STechSolution.AssignmentsRTFS_8_ObjectClassMethods;

class A{
	int x=30;
}

class B extends A{
	int z=55;
}

public class JavaLangClassClassMethods {
	int a=10;
	int b=20;
	
	public static void main(String[] args) {
		JavaLangClassClassMethods jc=new JavaLangClassClassMethods();
		System.out.println("Test:              "+jc.getClass().getName());
		
		A a1=new A();
		System.out.println("A :                 "+a1.getClass().getName());
		System.out.println();
	
		A b1=new B();
		System.out.println("B:                     "+b1.getClass().getName());
		
		int x=b1.x;
		//System.err.println(x.get)

		Object ob1=new Object();
		System.out.println(ob1.getClass().getName());
	
	}
	
	
}
