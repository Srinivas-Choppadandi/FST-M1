package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUKULMEROTHIYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.training-support.net");
driver.manage().window().maximize();

//Check the title of the page
String title = driver.getTitle();
//Print the title of the page
System.out.println("Page title is: " + title);

//Find the About Us link using id()
WebElement idLocator = driver.findElement(By.id("about-link"));
System.out.println("Text in element: " + idLocator.getText());

//Find the About Us link using className()
WebElement classNameLocator = driver.findElement(By.className("green"));
System.out.println("Text in element: " + classNameLocator.getText());

//Find the About Us link using cssSelector()
WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
System.out.println("Text in element: " + cssLocator.getText());

//Find the About Us link using linkText()
WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
System.out.println("Text in element: " + linkTextLocator.getText());
Thread.sleep(3000);

driver.close();

}
}
