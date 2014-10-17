import java.util.Scanner;

public class DNAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@ author msapre
		Scanner sc = new Scanner(System.in);
		Integer num1=0;
		System.out.println("enter the original sequence");
		num1 = sc.nextInt();
		Integer org = num1;
		System.out.println("Original sequence is =" +org);
		Integer rev = 0;
		while( num1 != 0 )
	      {
			rev = rev * 10;
			rev = rev + num1%10;
	        num1 = num1/10;
	      }
		
		System.out.println("Reverse sequence is =" +rev);
		if(org == rev)
		{
			System.out.println("Given sequence is a palindrome");
		}
		else
		{
			System.out.println("Given sequence is not a palindrome");
		}
	}
}
		
		
		 
