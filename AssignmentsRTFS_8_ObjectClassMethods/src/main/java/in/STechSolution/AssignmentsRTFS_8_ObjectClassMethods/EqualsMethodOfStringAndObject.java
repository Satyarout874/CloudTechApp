package in.STechSolution.AssignmentsRTFS_8_ObjectClassMethods;

public class EqualsMethodOfStringAndObject {
	public String name;
	public int roll;

	// Contract between hashcode and equals
	public void compareObjEqualityWithHashCode(Object ob1, Object ob2) {
		if (ob1.equals(ob2)) {
			if (ob1.hashCode() == ob2.hashCode())
				System.out.println("same object pointing...................");
			else
				System.out.println("Different Object.......");
		}
		else {
			System.out.println("HashCode is different............");
		}
	}

	public static void main(String[] args) {
		EqualsMethodOfStringAndObject em1 = new EqualsMethodOfStringAndObject();
		em1.name = "raja";
		em1.roll = 333;

		EqualsMethodOfStringAndObject em2 = new EqualsMethodOfStringAndObject();
		em2.name = "raja";
		em2.roll = 333;

		  em2=em1;
		// System.out.println(em1.equals(em2));
		// System.out.println(em1.name == em2.name);
		// System.out.println(em1.name.equals(em2.name));

		em1.compareObjEqualityWithHashCode(em1, em2);
	}

}
