import java.util.Scanner;

public class DNAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@ author msapre
		Scanner sc = new Scanner(System.in);
		Integer num1=0;
		System.out.println("Please enter the original number");
		num1 = sc.nextInt();
		Integer org = num1;
		System.out.println("Original number is =" +org);
		Integer rev = 0;
		while( num1 != 0 )
	      {
			rev = rev * 10;
			rev = rev + num1%10;
	        num1 = num1/10;
	      }
		
		System.out.println("Reverse number is =" +rev);
		if(org == rev)
		{
			System.out.println("Given number is a palindrome");
		}
		else
		{
			System.out.println("Given number is not a palindrome");
		}
	}
}
		
		
		 