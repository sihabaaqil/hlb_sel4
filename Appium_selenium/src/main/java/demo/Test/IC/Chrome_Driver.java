package demo.Test.IC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Driver {
	public static void main(String args[]) {

		WebDriver driver;

		//

		// Path root = path.getRoot();
		String dir = System.getProperty("user.dir"); // Users/ansible/git/HLB_Sel4/Appium_selenium

		// Setting system properties of ChromeDriver
//		System.setProperty("webdriver.chrome.driver",
//				dir + "/src/main/resources/browser_Driver/chromedriver-mac-x64/chromedriver");

		// directory from where the program was launched
		// e.g /home/mkyong/projects/core-java/java-io
//		System.out.println(dir + "/src/main/resources/browser_Driver/chromedriver-mac-x64/chromedriver");

		// Creating an object of ChromeDriver
		driver = new ChromeDriver();

//		// launching the specified URL
//		driver.get("https://bstackdemo.com/");
	}
}
