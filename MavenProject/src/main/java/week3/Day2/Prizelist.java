package week3.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prizelist {

	public static void main(String[] args) {
	
		ChromeDriver dr=new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("OnePlus mobiles",Keys.ENTER);
	List<WebElement> allprizes = dr.findElements(By.xpath("//span[@class='a-price-whole']"));
	List<String> strlist = new ArrayList<String>();
	for (WebElement each: allprizes) {
		String text=each.getText();
		strlist.add(text);
	}
		System.out.println(strlist);
		
		Collections.sort(strlist);
		System.out.println("the lowest prized mobile is: "+strlist.get(0));
		
			
		
	}
	
	

}