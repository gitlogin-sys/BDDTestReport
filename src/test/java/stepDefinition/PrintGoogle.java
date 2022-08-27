package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PrintGoogle {
	public static WebDriver driver=null;

@Given("User launch chrome browser")
public void user_launch_chrome_browser() {
    System.out.println("Launching chrome...");
    
 // System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");  
      
         // Instantiate a ChromeDriver class.     
    driver=new ChromeDriver();  
    System.out.println("After Launching chrome..."); 
    driver.manage().window().maximize();
    driver.get("http://www.google.com");
    
    
}

@When("User enter bdd in searcch box")
public void user_enter_bdd_in_searcch_box() {
	System.out.println("Searching in chrome...");
	
}

@When("User click on search button")
public void user_click_on_search_button() throws InterruptedException {
	System.out.println("clicking in chrome...");
	Thread.sleep(2000);
	driver.close();
}



	

}
