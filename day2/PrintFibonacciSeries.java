package week1.day2;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
	
		// 0 1 1 2 3 5 8 13
		
		int d=0;
		int j=1;
		int s;
		System.out.println(d + " "+ j);
		 for(int i=2;i<=13;i++) {
	
			 s=d+j;
				System.out.println(s);	 	 
			 d=j;
			 j=s;
	
		 }
			

	}

}
