package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {

		Browser dj =new Browser();
		
		String name= dj.browserName("Chrome");
		System.out.println(name);
		dj.loadUrl();

	}

}
