package oct13_2022;

public class Execution_Super extends Under_Super {

	int i = 2;
	
	Execution_Super(){
		super();
		System.out.println("This will be printed after printing super constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution_Super child = new Execution_Super();
		child.logic(10);
		
		

	}
	
	public void logic(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		
	}

}
