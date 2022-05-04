import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ShopifyAutomation {

	public static WebDriver driver;
	
	@Test (priority=1)
public void launchbrowser() throws InterruptedException {
		
	String ExpectedTitle = "Start and grow your e-commerce business - 14-Day Free Trial" ;
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
    driver = new FirefoxDriver();
	
	//System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
	//driver = new EdgeDriver();
	
	driver.get("https://www.shopify.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	String ActualTitle = driver.getTitle();
	System.out.println("The Actual Title is:" + ActualTitle);
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	
	}
	
	@Test (priority=2)
public void demostore() throws InterruptedException {
	
    //Enter demo Email ID
	WebElement store = driver.findElement
			(By.xpath("/html/body/div[6]/main/section[1]/div/div[1]/div[2]/form/div/div/input"));
	store.sendKeys("abc@gmail.com");
	Thread.sleep(2000);
	
	//Click button
	driver.findElement(By.xpath("//*[@id=\"Hero\"]/div/div[1]/div[2]/form/div/div/button")).click();
	Thread.sleep(2000);
	
	//Click close icon
	driver.findElement(By.xpath("//*[@id=\"CloseIcon\"]")).click();
	
}
	
	@Test (priority=3)
public void sell() throws InterruptedException {
	
	//Click Sell 
	WebElement sell = driver.findElement
			(By.xpath("//*[@id=\"ShopifyMainNav\"]/ul[1]/li[2]/div/button"));
	sell.click();
	Thread.sleep(2000);
	
	//Mouse hover & click on Point of sale
	Actions hover = new Actions(driver);
	hover.moveToElement(driver.findElement
			   (By.xpath("//*[@id=\"Popover5\"]/div/ul/li[3]/div/button")))
	   .build().perform();
	driver.findElement(By.xpath("//*[@id=\"Popover5\"]/div/ul/li[3]/div/button")).click();
	Thread.sleep(2000);
	   
	//Mouse hover and click on Buy Button
	Actions hover1 = new Actions(driver);
	 hover1.moveToElement(driver.findElement
			   (By.xpath("//*[@id=\"Popover5\"]/div/ul/li[4]/div/button")))
	   .build().perform();
	 driver.findElement
	 (By.xpath("/html/body/header/div[1]/nav/ul[1]/li[2]/div/div/div/ul/li[4]/div/button"))
	 .click();
	 Thread.sleep(2000);
	   
}

	@Test (priority=4)
public void market() throws InterruptedException {
	
   //Click on Market menu bar
   WebElement market = driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[1]/li[3]/div/button"));
   market.click();
   Thread.sleep(2000);
   
   //Mouse Hover on Business Chat
   Actions hover = new Actions(driver);
   hover.moveToElement(driver.findElement(By.xpath("//*[@id=\"Popover14\"]/div/ul/li[5]/a")))
   .build().perform();
   Thread.sleep(2000);
   
   //Mouse Hover on Customer Groups
   hover.moveToElement(driver.findElement(By.xpath("//*[@id=\"Popover14\"]/div/ul/li[4]/a")))
   .build().perform();
   Thread.sleep(2000);
   
   //Select a menu bar
   WebElement select = driver.findElement
		   (By.xpath("/html/body/header/div[1]/nav/ul[1]/li[3]/div/div/div/ul/li[1]/a"));
   select.click();
   Thread.sleep(2000);
   
   //Scroll Down Web page Header -> Footer
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
   Thread.sleep(2000);
 				
   //Scroll Up Web Page Footer -> Header
   js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");
   
}
	
	@Test (priority=5)
public void manage () throws InterruptedException {
		
		WebElement manage = driver.findElement(By.xpath("//*[@id=\"ShopifyMainNav\"]/ul[1]/li[4]/div/button"));
		manage.click();
		Thread.sleep(2000);
		
		//Mouse Hover on Balance
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"Popover15\"]/div/ul/li[4]/div/button")))
		.build().perform();
		Thread.sleep(2000);
		
		//Click on Balance
		WebElement balance = driver.findElement(By.xpath("//*[@id=\"Popover15\"]/div/ul/li[4]/div/button"));
		balance.click();
		Thread.sleep(2000);
		
		//Mouse hover on Features 
		Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(By.xpath("//*[@id=\"Popover16\"]/div/ul/li[2]/a")))
		.build().perform();
		Thread.sleep(2000);
		
	}
	
	@Test (priority=6)
public void pricing() throws InterruptedException 

{
	
driver.findElement(By.xpath("//*[@id=\"ShopifyMainNav\"]/ul[3]/li[1]/a")).click();

}

	@Test (priority=7)
public void footer() throws InterruptedException {
	
	   //Scroll Down Web page Header -> Footer
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	   Thread.sleep(2000);
	   
	   //Mouse hover on footer elements
	   Actions hover = new Actions(driver);
	   hover.moveToElement(driver.findElement
			   (By.xpath("//*[@id=\"ShopifyMainFooter\"]/div[1]/div/div[2]/div/ul/li[12]/a")))
	   .build().perform();
	   Thread.sleep(1000);
	   hover.moveToElement(driver.findElement
			   (By.xpath("//*[@id=\"ShopifyMainFooter\"]/div[1]/div/div[2]/div/ul/li[8]/a")))
	   .build().perform();
	   Thread.sleep(1000);
	   hover.moveToElement(driver.findElement
			   (By.xpath("//*[@id=\"ShopifyMainFooter\"]/div[1]/div/div[4]/div/ul/li[1]/a")))
	   .build().perform();
	   Thread.sleep(1000);
	   hover.moveToElement(driver.findElement
			   (By.xpath("//*[@id=\"ShopifyMainFooter\"]/div[1]/div/div[5]/div/ul/li[1]/a")))
	   .build().perform();
	   Thread.sleep(1000);
	 				
	   driver.quit();

}
	
public static void main(String[] args) throws InterruptedException {
	
	/* if (browser.equals("Firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();	
		
	}
	
	else if (browser.equals("edge")) {
		
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
	*/
	
		ShopifyAutomation obj = new ShopifyAutomation();
		obj.launchbrowser();
		obj.demostore();
		obj.sell();
		obj.market();
		obj.pricing();
		obj.footer();
		
	}

}
