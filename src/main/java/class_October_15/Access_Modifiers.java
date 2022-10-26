package class_October_15;

public class Access_Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4 types
		//public - highest accessibility (
			//can be accessed anywherein all the classes of all packages
		//protected
			//can be accessed within classes of thesame package
		//private
			//can only be accesses inside the class - that class only 
		//default( cannot be used in a class). it can only be used in an interface
	// https://www.geeksforgeeks.org/access-modifiers-java/

	}
public static void test() {
	System.out.println("This is a simple test mehthod");
}
protected static void test1() {
	System.out.println("this is a simple test1 method");
	
}
private static void test2() {
	System.out.println("This is a simple test2 method");
}
/*default static void test3() {
	System.out.println("This is a simple test3 method");*/
}

