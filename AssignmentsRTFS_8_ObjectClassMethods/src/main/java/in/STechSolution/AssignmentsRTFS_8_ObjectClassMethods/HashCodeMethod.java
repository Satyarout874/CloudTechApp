package in.STechSolution.AssignmentsRTFS_8_ObjectClassMethods;

public class HashCodeMethod {
	int x = 10;
	int y = 20;

	@Override
	public int hashCode() {

		return x + y * (x - 2) / 6;
	}

	public int getHashCodeFromObject() {
		return super.hashCode();
	}

	public static void main(String[] args) {

		HashCodeMethod hc1 = new HashCodeMethod();
		System.out.println(hc1.hashCode());
		System.out.println(hc1.getHashCodeFromObject());
		System.out.println(System.identityHashCode(hc1));

//		HashCodeMethod hc2 = hc1;
//		System.out.println(hc2.getHashCodeFromObject());
		
		
	}
}
//366712646