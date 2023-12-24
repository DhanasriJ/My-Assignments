package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assn_Button {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		WebElement ele= driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']"));
		ele.click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-mobile layout-menuitem-icon']")).click();
			boolean value = driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		System.out.println("Button is" +value);
		
		//Find and print the position of the button with the text ‘Submit.’
	    Rectangle res =  driver.findElement(By.name("j_idt88:j_idt94")).getRect();
		System.out.println("Postion is:" +res.getX());
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String cssValue = driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color");
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
	    Rectangle res1 =  driver.findElement(By.name("j_idt88:j_idt98")).getRect();
		System.out.println("Width:" +res1.getWidth());
		System.out.println("Height:" +res1.getHeight());
		driver.close();
	}
}