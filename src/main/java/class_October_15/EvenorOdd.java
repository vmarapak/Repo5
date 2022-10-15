package class_October_15;

public class EvenorOdd {
	int num = 23;
	int year = 2000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program - WAP - to determine whether this number is even or odd
//WAP to determine whether this number is a prime number or not

		//WAP to determine whether this is leap year or not
		int num = 23;
		if(num%2 == 0) {
			System.out.println("num is an even number :" + num);
		}else if (num%2 !=0){
			System.out.println("num is an odd number :" + num);
	}
// for a number to be prime it can only be divided by 1 and itself
	if (num%num == 0 && num%1 == 0) {
		System.out.println("num is prime :" + num);
	}else {
		System.out.println("num is not prime :" + num);
	}

	
	
	
	
	
	//a leap year has to be evenly divisible  by 4
	//if the same leap year is also evenly divisible by 100 
	//then it is NOT leap year
	//UNLESSalso divisible by 400 
	// so if divisble by 4 AND 100 not leap year
	//but if divisible by 4 , 100 AND 400 THEN IT IS LEAP YEAR
	//technicallyl leap year should be evenly divis. by 4 and 400
	int year = 2008;
	if (year%4 ==0 && year%100 == 0 || year%400 ==0){// || means or 
		// 4%2 ==0 , means that 4 divisible by 2 evenly without remainder
	System.out.println("year is a leap year:" + year);
	}else {
		System.out.println("not a leap year : " + year);
	
		
		
	}
	
}
}
