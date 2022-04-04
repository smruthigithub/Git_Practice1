package PracticeforGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Git_Practice\\drivers\\Chrome\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");		
	}

}
