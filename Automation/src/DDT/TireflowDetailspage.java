package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TireflowDetailspage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://stage.pepboys.com/");
        driver.manage().window().maximize();
        driver.get("https://stage.pepboys.com/tires/details/Definity/HP%2520800/485179/07935/2010/CADILLAC/DTS/0/V8-279%2520%25204.6L%2520DOHC/4WD/1");
        // open the product page 
        driver.findElement(By.xpath("//*[@data-type='PHYSICAL_PICKUP']")).click();
        //changes to PUIS
       // driver.findElement(By.xpath("//*[@data-type='PHYSICAL_SHIP']")).click();
        //changes to STH
        driver.findElement(By.xpath("//*[@data-type='INSTALLATION']")).click();
        //change again to installation
        driver.findElement(By.xpath("//*[@class='span12 j-addItem btn btn-large btn-success']")).click();
        //clicking on the button
        driver.findElement(By.xpath("//*[@class='ui-datepicker-trigger']")).click();
        //clicking on the date tab
        driver.findElement(By.xpath("//a[text()='5']")).click(); 
        // selecting date
        driver.findElement(By.xpath("//a[contains(text(),'Select')])[8]")).click(); 
        // selecting time
        driver.findElement(By.xpath(".//*[@ alt='Next']")).click();
        // next
        driver.findElement(By.xpath(".//*[@class='j-payOnline-top']")).click();
        // click Pay Online
        driver.findElement(By.xpath("//*[@id='j_username']")).clear();
        // clearing anything in the Username module
        driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys("trishaguduru21@gmail.com");
        // input username
        driver.findElement(By.xpath("//*[@id='j_password']")).clear(); 
        // clearing anything in the password module
        driver.findElement(By.xpath("//*[@id='j_password']")).sendKeys("Iluvpink21"); //
        // input password
        driver.findElement(By.cssSelector("input.loginButton")).click();
        // clicking login
        driver.findElement(By.cssSelector("img[alt=\"Next\"]")).click(); 
        // click next in the checkout page
        driver.findElement(By.id("tcCardNumber")).clear(); 
        // clear any credit card info
        driver.findElement(By.id("tcCardNumber")).sendKeys("5555555555554444"); 
        // input credit card info
        new Select(driver.findElement(By.id("tcExpMonth"))).selectByVisibleText("12"); 
        // input expiration
        new Select(driver.findElement(By.id("tcExpYear"))).selectByVisibleText("2033");
        // input exp year
        driver.findElement(By.id("checkoutSecurityCode")).clear();
        // clear any security code info
        driver.findElement(By.id("checkoutSecurityCode")).sendKeys("345"); 
        // input security 
        driver.findElement(By.id("termsOfSaleCheckbox")).click();
        // 
        driver.findElement(By.id("checkoutStep4Submit")).click(); 
        //
        driver.findElement(By.id("functionPrint")).click(); 
        //
        
       
        
        
	}

}
