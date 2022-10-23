package seliniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Project_Workspace\\Selenium\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
