import java.util.Scanner;
public class SelfTestStringTest {
	


	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		Scanner keyboard1 = new Scanner(System.in);
		//user input integer for palindrome.
		System.out.println("Please enter an integer > 0 : ");
		int palindrome = keyboard1.nextInt();
		int sum,count;
		sum=palindrome;
		count=0;
		
		if(isPalindrome(palindrome))
		{
			System.out.println("The integer : " + palindrome + " is a palindrome");
			while(count<=palindrome)
			{
				
				count++;
			}
			System.out.println("The sum from 1 to"+ palindrome +"is");
		}
		else
		{
			System.out.println("The integer : " + palindrome + " is not a palindrome");
		}  

	}
	//method to check if number is palindrome or not



	private static boolean isPalindrome(int number) 
	{
		int palindrome = number; // copied number into variable
		int reverse = 0;
		int remainder;

		while (palindrome != 0) 
		{
			remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		// if original and reverse of number is equal means
		// number is palindrome 
		if (number == reverse) 
		{
			return true;
		}else
			return false;

	}
}

