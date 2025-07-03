package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class WebTest {
 
	static WebDriver driver;

	@Test
  @Given("I open the Google home page")
  public void driverSetup() {
	  driver = new ChromeDriver();
	  driver.get("http://www.google.com");
  }
@Test
  @Then("the page title should be {string} ")
  public void verifyPageTitle() {
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  if(expectedTitle == actualTitle) {
		  System.out.println("Test Case passed");
	  }
	  driver.quit();
  }
  

}
