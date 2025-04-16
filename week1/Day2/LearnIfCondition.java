package week1.Day2;

public class LearnIfCondition {

	public static void main(String[] args) {
		
		
		boolean isPrimeUser = false;
		// condition expression
		if (isPrimeUser) {
			//body is executed
			System.out.println("Movie will start to play");
		}
		else {
			System.out.println("Please subscribe to the prime");
		}
		int a =2;
		int b = 3;
		if(a==b) {
			System.out.println("a value is equal to b value");
		}
		else if(a>b){
			System.out.println("a value is greater than b value");
		}
		else if(a>b){
			System.out.println("a value is lesser than b value");
		}
		else
		{
			System.out.println("a value is not equal to b value");
		}
	}

}
