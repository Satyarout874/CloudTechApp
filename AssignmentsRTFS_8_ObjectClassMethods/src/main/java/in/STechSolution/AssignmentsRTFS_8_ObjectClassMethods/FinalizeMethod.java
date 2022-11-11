package in.STechSolution.AssignmentsRTFS_8_ObjectClassMethods;

public class FinalizeMethod {
	int x=10;
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("FinalizeMethod.finalize()");
		x=0;
		System.gc();
	}
	public static void main(String[] args) throws Throwable {
		FinalizeMethod fm=new FinalizeMethod();
		System.out.println(fm.x);
		fm.finalize();
		System.err.println(fm.x);
	}
}
