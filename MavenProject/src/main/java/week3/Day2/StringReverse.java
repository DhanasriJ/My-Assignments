package week3.Day2;

public class StringReverse {

	public static void main(String[] args) {
		String str= "Testleaf";
		char[] CharArray=str.toCharArray();
		
		for(int i=CharArray.length-1;i>=0;i--)
		{
			System.out.println(CharArray[i]);
		}
	}

}