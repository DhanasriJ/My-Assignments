package week3_Day1;

public class Safari extends Browser{

	public void  readerMode() {
		System.out.println("readermode on----->Subclass C");
		
	}
 public void  fullScreenMode() {
	 System.out.println("fullscreen mode on---->subclass C");
 }
 
 public static void main(String[] args) {
	 
	 Safari dj=new Safari();
	 dj.browserVersion();
	 dj.openURL();
	 dj.closeBrowser();
	 dj.readerMode();
	 dj.fullScreenMode();
 }
}