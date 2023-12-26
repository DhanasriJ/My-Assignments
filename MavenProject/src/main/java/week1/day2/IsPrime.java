package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int num= 5;
		int num1=10;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println(num+ "is a Prime number");
			
		}
			for(int j=2;j<num1;j++) {
				if(num%i==0) {
					System.out.println(num1+ "is not a prime number");
				}
			}
	}

}
}
