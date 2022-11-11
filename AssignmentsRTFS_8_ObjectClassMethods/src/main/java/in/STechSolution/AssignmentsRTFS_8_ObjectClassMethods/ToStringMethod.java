package in.STechSolution.AssignmentsRTFS_8_ObjectClassMethods;

public class ToStringMethod {
	private String name;
	private int id;
	private double salary;
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return this.name+"  "+this.id+"   "+this.salary;
	}
	
	public static void main(String[] args) {
		ToStringMethod ob=new ToStringMethod();
		ob.id=2034;
		ob.name="Rohan";
		ob.salary=90000;
		System.out.println(ob.toString());
		
		ToStringMethod ob1=new ToStringMethod();
		ob1.id=6534;
		ob1.name="Rohan";
		ob1.salary=80000;
		System.out.println(ob1.toString());
		System.out.println(ob1.name.equals(ob.name));
		
	}
}
