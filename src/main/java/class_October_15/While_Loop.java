package class_October_15;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//while loop is msotly used for infinite kind of situations
//infinite - meaning that the finite value is not directly defined
		
//while is a  repeated if statement 
while (1<2) {
	//logic
	System.out.println("Logic is true");
	//continue;
	// will only go to the first command either continue or break will not do both
	// can only move onto next code after breaking , unless if there is a variable
	break;
}

int i = 10;//latest value of i is 10
while(i<11) {//as of this statement 10<11 (true)
	System.out.println("Print the valueof i:" + i);//where i is still 10
	i = i+1; // i becomes 11 at this point, i goes back to the loop, since i is 11 the loop is false = break
	
	
}
//WAP to print 1st 50 natual numbers using while loop

int a = 1; //latest val of a is 1
while (a<=50) {
	System.out.print(a+" ");
a++;
}
//wap to print first 100 multiple of 5 and add those multiples
//5, 10, 15 ......... 500
//5 + 10 + ........... + 600 = value
System.out.println(" ");

int b = 5;
int sum = 0;

while (b<=5*100) {
	System.out.print(b+ " ");
	sum=sum+b;
System.out.println("the addition is = " + sum);
b = b+5;




	
}
System.out.println();
System.out.println("Final sum is : " +sum);



	}

}
