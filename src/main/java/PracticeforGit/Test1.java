package PracticeforGit;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Git_Practice\\drivers\\Chrome\\chromedriver.exe");
		
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");	
		
		Actions act = new Actions(driver);
		
		WebElement signin = driver.findElement(By.xpath("(//span[text()='Hello, Sign in'])"));
		
		act.moveToElement(signin).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Smruthi Kandukuri");
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("smruthi_amazonpractice@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("1234567");
		
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("1234567");
		
		driver.findElement(By.xpath("//input[@id='Continue']")).click();
		
		
		
		
		
	}

}
