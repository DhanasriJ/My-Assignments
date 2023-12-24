package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assn_CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		   
		  
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");	   
	   	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();	
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();	
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("DJS");
		//select Industry dropdown
	 	WebElement Ind = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	 	Select sec=new Select(Ind);
	 	sec.selectByIndex(3);
	 	
	 	//select ownership dropdown	 	
		WebElement Own = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	 	Select sec1=new Select(Own);
	 	sec1.selectByVisibleText("S-Corporation");
	 	
	 	 //Select source dropdown	 	
	 	WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
	 	Select sec2=new Select(source);
	 	sec2.selectByValue("LEAD_EMPLOYEE");
	 	
	 	 //Select marketing campaign dropdown	 	
	 	WebElement mrkt = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	 	Select sec3=new Select(mrkt);
	 	sec3.selectByIndex(6);
	 	
	 	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	 	
	 	 //Select state/province dropdown	 	
	 	WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
	 	Select sec4=new Select(state);
	 	sec4.selectByValue("TX");		
		
	 	//click create account
	 	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	 	
	 	//verify the account name is correct	 	
	 	driver.findElement(By.xpath("//span[contains(text(), 'DJS')]"));
	 	
	 	System.out.println("Account created successfully");
	 	
	 	driver.close();
	 	
		
		
		
		
	}

}
