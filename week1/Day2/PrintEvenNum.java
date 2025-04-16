package week1.Day2;

public class PrintEvenNum {

	public static void main(String[] args) {
		int num = 11;
		// requirement : want to check whether the value is odd or even
		if(num % 2 == 0)
		{
			/*
			 * 4/2 -> 2
			 * 5%2 -> 1
			 */
			System.out.println("the num is even");
		}else
		{
			System.out.println("the num is odd");
		}
		
		// requirement : want to print the even number within the input range
		
		for (int i = 1; i<= num; i++) {
			if (i%2==0)
				System.out.println("Even number is : "+i);
		}

	}


}