package in.STechSolution.AssignmentsRTFS_8_ObjectClassMethods;

public class GetInstanceMethod {
	int id;
	String name;
	
	public static void main(String[] args) {
		GetInstanceMethod gc=new GetInstanceMethod();
		String name2 = gc.getClass().getName();

	}
}
