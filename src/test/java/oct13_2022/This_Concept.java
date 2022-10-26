package oct13_2022;
//this - refers to the current Class instance variable
//this - is a keyword and it acts as a arefernce variable pointing to the object 
// instance variables and local variable > when their names become same and we need to equate them then this keyword is required 
public class This_Concept {

	int i;
	String name;
	boolean check;
	
	public void empData(String name, int i, boolean check) {
		this.i = i;
		this.name = name;
		this.check = check;
		
	}
	public void result() {
		System.out.println(i+"---"+name+"---"+check);
	}
}
