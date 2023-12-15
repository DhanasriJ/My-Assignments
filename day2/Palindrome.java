package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	
		int Input = 121;
		int num = 0;
		int Output = num;
		
		int rev= 0;
		
		while(Output !=0) {
			int dig = Output%10;
			rev= rev*10+dig;
			Output=Output/10;
			
			
		}
		
		if(num==rev)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
			
				
			}
			
		

	}


