package Week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTestLeaf {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("Browser launched successfully");	
	}

}
