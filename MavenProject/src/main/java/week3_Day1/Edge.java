package week3_Day1;

public class Edge extends Browser{

	public void  takeSnap() {
		System.out.println("take Snap----->Subclass B");
		
	}
 public void  clearCookies() {
	 System.out.println("Cleared cookies----->subclass B");
 }
 
public static void main(String[] args) {
	 
Edge dj=new Edge();
dj.browserVersion();
dj.openURL();
dj.closeBrowser();
dj.takeSnap();
dj.clearCookies();
 }
}