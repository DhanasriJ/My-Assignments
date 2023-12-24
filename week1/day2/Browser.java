package week1.day2;

public class Browser {
	
	public String browserName (String browerName) {
		System.out.println("Browser lanuched successfully");
		return(browerName);
	}
	void loadUrl() {
		System.out.println("Application Url loaded successfully");
	}

	public static void main(String[] args) {
		
		Browser dj =new Browser();
		
		String name= dj.browserName("Chrome");
		System.out.println(name);
		dj.loadUrl();
		
		
		
		
	}

}
