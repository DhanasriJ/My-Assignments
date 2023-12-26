package Week2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class Assn_CreateFacebookAcount {


	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dhanu");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sri");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9962041309");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Nila123");
        
        //select date of birth
        
        WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
        Select sec= new Select(day);
        sec.selectByValue("29");
        
        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
        Select sec1= new Select(month);
        sec1.selectByIndex(3);     
        
        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
        Select sec2= new Select(year);
        sec2.selectByVisibleText("1995");
        
        //select gender
        driver.findElement(By.xpath("//input[@value='1']")).click();
    
        
        System.out.println("Account information provided");
		
		
			}

}
