package DDT;

public class DDT {
	import static org.junit.Assert.fail; 

	 import java.util.concurrent.TimeUnit; 

	 import org.openqa.selenium.Alert; 

	 // TODO Auto-generated method stub 
	                 
	                 

	                 import org.openqa.selenium.By; 
	 import org.openqa.selenium.NoAlertPresentException; 
	 import org.openqa.selenium.NoSuchElementException; 
	 import org.openqa.selenium.WebDriver; 
	 import org.openqa.selenium.firefox.FirefoxDriver; 
	 import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 

	                                 public class TBV { 
	                                   private WebDriver driver; 
	                                   @SuppressWarnings("unused") 
	                                 private String baseUrl; 
	                                   private boolean acceptNextAlert = true; 
	                                   private StringBuffer verificationErrors = new StringBuffer(); 

	                                   @BeforeTest 
	                                   public void setUp() throws Exception { 
	                                     driver = new FirefoxDriver(); 
	                                     baseUrl = "http://pepboys.com/"; 
	                                     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	                                   } 

	                                   @Test(dataProvider="vechileData")
	                                   public void testTBVCheckout(String year, String make, String model,String eng,String DT,String TRM) throws Exception { 
	                                     driver.get("https:\\stage.pepboys.com"); 
	                                     driver.findElement(By.linkText("Tires by Vehicle")).click(); 
	                                     new Select(driver.findElement(By.xpath("//div[@id='wrapper']/div[2]/div[2]/div/div/div/div/div/div/select"))).selectByVisibleText(year); 
	                                     new Select(driver.findElement(By.xpath("//div[@id='wrapper']/div[2]/div[2]/div/div/div/div/div/div/select[2]"))).selectByVisibleText(make); 
	                                     new Select(driver.findElement(By.xpath("//div[@id='wrapper']/div[2]/div[2]/div/div/div/div/div/div/select[3]"))).selectByVisibleText(model); 
	                                     new Select(driver.findElement(By.xpath("//div[@id='wrapper']/div[2]/div[2]/div/div/div/div/div/div/select[4]"))).selectByVisibleText(eng); 
	                                     new Select(driver.findElement(By.xpath("//div[@id='wrapper']/div[2]/div[2]/div/div/div/div/div/div/select[5]"))).selectByVisibleText(DT); 
	                                     new Select(driver.findElement(By.xpath("//div[@id='wrapper']/div[2]/div[2]/div/div/div/div/div/div/select[6]"))).selectByVisibleText(TRM); 
	                                     driver.findElement(By.cssSelector("option[value=\"EX-L 2 DR. V6\"]")).click(); 
	                                     driver.findElement(By.id("chooseZipText")).clear(); 
	                                     driver.findElement(By.id("chooseZipText")).sendKeys("77037"); 
	                                     driver.findElement(By.xpath("//button[@value='']")).click(); 
	                                     driver.findElement(By.linkText("Choose This Location")).click(); 
	                                     driver.findElement(By.xpath("//button[@value='']")).click(); 
	                                     driver.findElement(By.cssSelector("#storePlus > img.glovebarPlus")).click(); 
	                                     driver.findElement(By.id("showStoreMiniModal")).click(); 
	                                     driver.findElement(By.id("zipCode")).clear(); 
	                                     driver.findElement(By.id("zipCode")).sendKeys("19132"); 
	                                     driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	                                     driver.findElement(By.linkText("Choose This Location")).click(); 
	                                     driver.findElement(By.xpath("//div[@id='resultsItem923224']/div[3]/div/div[2]/button")).click(); 
	                                     driver.findElement(By.cssSelector("img.ui-datepicker-trigger")).click(); 
	                                     driver.findElement(By.linkText("16")).click(); 
	                                     driver.findElement(By.xpath("(//a[contains(text(),'Select')])[8]")).click(); 
	                                     driver.findElement(By.cssSelector("img[alt=\"Next\"]")).click(); 
	                                     driver.findElement(By.cssSelector("img.pull-right.j-payOnline")).click(); 
	                                     driver.findElement(By.id("j_username")).clear(); 
	                                     driver.findElement(By.id("j_username")).sendKeys("k.pepboys15@gmail.com"); 
	                                     driver.findElement(By.id("j_password")).clear(); 
	                                     driver.findElement(By.id("j_password")).sendKeys("pepboys123");
	                                     driver.findElement(By.cssSelector("input.loginButton")).click(); 
	                                     driver.findElement(By.cssSelector("img[alt=\"Next\"]")).click(); 
	                                     driver.findElement(By.id("tcCardNumber")).clear(); 
	                                     driver.findElement(By.id("tcCardNumber")).sendKeys("5555555555554444"); 
	                                     new Select(driver.findElement(By.id("tcExpMonth"))).selectByVisibleText("12"); 
	                                     new Select(driver.findElement(By.id("tcExpYear"))).selectByVisibleText("2033"); 
	                                     driver.findElement(By.id("checkoutSecurityCode")).clear(); 
	                                     driver.findElement(By.id("checkoutSecurityCode")).sendKeys("345"); 
	                                     driver.findElement(By.id("termsOfSaleCheckbox")).click(); 
	                                     driver.findElement(By.id("checkoutStep4Submit")).click(); 
	                                     driver.findElement(By.id("functionPrint")).click(); 
	                                   } 
	                                   @DataProvider(name="vechileData")
	                                   public Object[][] DP(){
	                                	   Object data [][]= new Object[2][6];
	                                	   data[0][0]="2012";
	                                	   data[0][1]="HONDA";
	                                	   data[0][2]="ACCORD";
	                                	   data[0][3]="4-2354 2.4L DOHC";
	                                	   data[0][4]="2WD";
	                                	   data[0][5]="EX-L 2 DR. V6";
	                                	   data[1][0]="2013";
	                                	   data[1][1]="ACURA";
	                                	   data[1][2]="ILX";
	                                	   data[1][3]="4-1997 2.0L SOHC";
	                                	   data[1][4]="2WD";
	                                	   data[1][5]="2.0L";
	                                	   return data;
	                                   }
	                                   
	                                   //hiiii
	                                   @AfterTest 
	                                   public void tearDown() throws Exception { 
	                                     driver.quit(); 
	                                     String verificationErrorString = verificationErrors.toString(); 
	                                     if (!"".equals(verificationErrorString)) { 
	                                       fail(verificationErrorString); 
	                                     } 
	                                   } 

	                                   @SuppressWarnings("unused") 
	                                 private boolean isElementPresent(By by) { 
	                                     try { 
	                                       driver.findElement(by); 
	                                       return true; 
	                                     } catch (NoSuchElementException e) { 
	                                       return false; 
	                                     } 
	                                   } 

	                                   @SuppressWarnings("unused") 
	                                 private boolean isAlertPresent() { 
	                                     try { 
	                                       driver.switchTo().alert(); 
	                                       return true; 
	                                     } catch (NoAlertPresentException e) { 
	                                       return false; 
	                                     } 
	                                   } 

	                                   @SuppressWarnings("unused") 
	                                 private String closeAlertAndGetItsText() { 
	                                     try { 
	                                       Alert alert = driver.switchTo().alert(); 
	                                       String alertText = alert.getText(); 
	                                       if (acceptNextAlert) { 
	                                         alert.accept(); 
	                                       } else { 
	                                         alert.dismiss(); 
	                                       } 
	                                       return alertText; 
	                                     } finally { 
	                                       acceptNextAlert = true; 
	                                     } 
	                                   } 
	                                 


	                                 

	                                 
}
}
}
