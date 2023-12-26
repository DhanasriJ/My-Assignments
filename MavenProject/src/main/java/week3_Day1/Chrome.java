package week3_Day1;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Incognito opened----->Subclass A");
		
	}
 public void clearCache() {
	 System.out.println("Cleared cache----->subclass A");
 }
 
 public static void main(String[] args) {
	 
	 Chrome dj=new Chrome();
	 dj.browserVersion();
	 dj.openURL();
	 dj.closeBrowser();
	 dj.openIncognito();
	 dj.clearCache();
 }
}