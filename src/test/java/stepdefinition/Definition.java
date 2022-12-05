package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition {
	WebDriver driver = null;
	@Given("open the browser")
	public void user_is_on_homepage() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		System.out.println("user is on browser");
	   driver =new ChromeDriver();
	   driver.get("https://www.telerik.com/");
	   driver.manage().window().maximize();
	}
	

	@When("user enter the url  {string}")
	public void user_enter_the_url(String string) {
		System.out.println("user enter the url  {string}");
	}

	@Then("Check the logo on header page")
	public void check_the_logo_on_header_page() throws InterruptedException {
		System.out.println("Check the logo on header page");
		WebElement progress=driver.findElement(By.xpath("(//*[name()='svg'])[1]"));
		if(progress.isDisplayed())
		{
		
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		
			System.out.println("progress image is displayed");
		}
		else {
			System.out.println("progress image is not displayed");
	}
		Thread.sleep(5000);
	}

	@When("Check All Products on header")
	public void check_all_products_on_header() {
	   
	}

	@Then("open All Products")
	public void open_all_products() {
	 
		Actions a1 = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//button[normalize-space()='All Products']"));
		a1.moveToElement(mainMenu).build().perform();
	}
	@Then("go to the All Products on header page")
	public void go_to_the_all_products_on_header_page() {
	    
	}

	@Then("click on the All Product arrow icon")
	public void click_on_the_all_product_arrow_icon() {
	   driver.findElement(By.xpath("//i[@class='TK-Arrow']")).click();
	}

	
	@When("click on SERVICES button")
	public void click_on_services_button() {
		driver.findElement(By.xpath("//a[normalize-space()='Services']")).click();
	}
	
	@Then("click on BLOGS button")
	public void click_on_blogs_button() {
		driver.findElement(By.xpath("//a[@class='TK-Menu-Item-Link'][normalize-space()='Blogs']")).click(); 
	}
	
	@When("click on DOCS & SUPPORT button")
	public void click_on_docs_support_button() {
		driver.findElement(By.xpath("//a[normalize-space()='Docs & Support']")).click(); 
	}
	@Then("click on PRICING")
	public void click_on_pricing() {
		driver.findElement(By.xpath("//a[@class='TK-Menu-Item-Link'][normalize-space()='Pricing']")).click(); 
	}
	@When("click on Search icon")
	public void click_on_search_icon() {
		driver.findElement(By.xpath("//a[@id='js-tlrk-nav-search-link']//*[name()='svg']")).click();   
	}
	@When("click on Your Account")
	public void click_on_your_account() {
		driver.findElement(By.xpath("//a[@title='Your Account']//*[name()='svg']")).click(); 
		driver.navigate().back();  
	}
	
	@When("click on GET A FREE TRIAL button")
	public void click_on_get_a_free_trial_button() {
		driver.findElement(By.xpath("(//a[normalize-space()='Get A Free Trial'])[1]")).click(); 
	}
}


