package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
	static WebDriver driver;
	public static void main(String [] args) {
		ChromeOptions opcion = new ChromeOptions();
		opcion.addArguments("--incognito");
		opcion.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
		
		//creamos una variable
		driver = new ChromeDriver(opcion);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.close();
		
			
	}

}
