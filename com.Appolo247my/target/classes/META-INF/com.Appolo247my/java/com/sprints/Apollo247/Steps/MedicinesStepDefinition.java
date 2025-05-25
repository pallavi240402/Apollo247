package com.sprints.Apollo247.Steps;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.sprints.Apollo247.Misc.Base;
import com.sprints.Apollo247.Misc.ConfigFileReader;
import com.sprints.Apollo247.Pages.LoginPage;
import com.sprints.Apollo247.Pages.MedicinesPageFactory;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MedicinesStepDefinition {


    static Base b = new Base();
	static WebDriver driver;
//	WebDriver driver = b.getFirefoxWebDriver();
	ConfigFileReader cng = new ConfigFileReader();
	LoginPage login;
	MedicinesPageFactory mf;

	
	
	
	/*Created By = Bhavesh Vilas Jibhakate
	 * Modified By = Bhavesh Vilas Jibhakate
	 *  Reviewed By = G Rais,Surbhi
	 *  Method is used to open Apollo24/7 Website
	 * */
	
	
	
	
	
	
//----------------------------------------------login-------------------------------------------------//	

	/*Created By = Bhavesh Vilas Jibhakate
	 * Modified By = Bhavesh Vilas Jibhakate
	 *  Reviewed By = G Rais,Surbhi
	 *  Method is used to open Apollo24/7 Website
	 * */
	
	
	
	
	@Given("user is on Apollo247 login page")
	public void user_is_on_apollo247_login_page() throws InterruptedException {
		driver= b.getChromeWebDriver();
	    driver.get(cng.baseURL());
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@When("user clicks on profile button")
	public void user_clicks_on_profile_button() {
		login=new LoginPage(driver);
		login.login();
		
	}
	@Then("user is in login page")
	public void user_is_in_login_page() throws InterruptedException {
	    System.out.println("User is On login");
	    Thread.sleep(3000);
	}
	@When("user enters valid phone number")
	public void user_enters_valid_phone_number() throws InterruptedException {
	    String a = cng.loginCredentials();
	    login.enterNumber(a);
	    
	}
	@When("clicks on arrow button")
	public void clicks_on_arrow_button() {
	    login.clickLoginArrow();
	}
	@Then("user is in otp page")
	public void user_is_in_otp_page() throws InterruptedException {
	    Thread.sleep(5000);
	}
	@When("user clicks on arrow button")
	public void user_clicks_on_arrow_button() throws InterruptedException {
	    login.clickOtpArrow();
	}
	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() throws InterruptedException {
	    Thread.sleep(5000);
	}
	
	
	
	
	
//------------------------------------------------Homepage---------------------------------------------//	
	
	/*Created By = Bhavesh Vilas Jibhakate
	 * Modified By = Bhavesh Vilas Jibhakate
	 *  Reviewed By = G Rais,Surbhi
	 *  Method is used to open Apollo24/7 Website
	 * */
	
	
	
	@When("user clicks on medicine tab")
	public void user_clicks_on_medicine_tab() throws InterruptedException {
		mf=new MedicinesPageFactory(driver);
	    mf.MedicinesButton();
	}
	@Then("user should be on Medicine Homepage")
	public void user_should_be_on_medicine_homepage() {
//		
	}
	
	
	
	
//---------------------------------------------Search---------------------------------------------------------//.

	/*Created By = Bhavesh Vilas Jibhakate
	 * Modified By = Bhavesh Vilas Jibhakate
	 *  Reviewed By = G Rais,Surbhi
	 *  Method is used to open Apollo24/7 Website
	 * */
	
	
	
	@Given("User should be on homepage of medicine tab2")
	public void user_should_be_on_homepage_of_medicine_tab2() throws InterruptedException {
		mf=new MedicinesPageFactory(driver);
		mf.launchlabtests();
		Thread.sleep(2000);
	}
	@When("user clicks on search medicines tab")
	public void user_clicks_on_search_medicines_tab() throws InterruptedException {
		Thread.sleep(2000);
		mf.ClickSearch();
		System.out.println("Clicks on Search");
	}
	@When("user types some Dolo name")
	public void user_types_some_dolo_name() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		mf.SearchMedicine("Dolo");
	    
	    System.out.println("Enters Dolo in search");
	}
	@When("user should be able to see searched product and able to add to cart the product")
	public void user_should_be_able_to_see_searched_product_and_able_to_add_to_cart_the_product() throws InterruptedException {
		mf.MedAddToCart();
		System.out.println("The user adds to cart");
		mf.ProductAdd();
	}
	@Then("User should get added to cart pop-up")
	public void user_should_get_added_to_cart_pop_up() throws InterruptedException {
//		
	}

	
	
		
//---------------------------------------Sort-------------------------------------------------------//
	
	/*Created By = Bhavesh Vilas Jibhakate
	 * Modified By = Bhavesh Vilas Jibhakate
	 *  Reviewed By = G Rais,Surbhi
	 *  Method is used to open Apollo24/7 Website
	 * */
	
	
	
	@Given("User should be on home page of medicine tab3")
	public void user_should_be_on_homepage_of_medicine_tab3() 
	{
		mf=new MedicinesPageFactory(driver);
	}
	@When("User clicks on Health condition products")
	public void user_clicks_on_health_condition_products() throws InterruptedException
	{
		mf.MedicinesButton();
		mf.HealthCondition();
		Thread.sleep(2000);
	}
	
	@And("user should click on SortBy option")
	public void user_should_click_on_sort_by_option() throws InterruptedException
	{
	   mf.sortby();
	   Thread.sleep(2000);
	   mf.highToLow();
	}
	
	@Then("User should get products according to the options.")
	public void user_should_get_products_according_to_the_options() 
	{
//		
	}
	
	
//--------------------------------RemovedProduct--------------------------------------------//	
	
	/*Created By = Bhavesh Vilas Jibhakate
	 * Modified By = Bhavesh Vilas Jibhakate
	 *  Reviewed By = G Rais,Surbhi
	 *  Method is used to open Apollo24/7 Website
	 * */
	
	
	@Given("User should be on home page of medicine tab4")
	public void user_should_be_on_home_page_of_medicine_tab4() {  
		mf=new MedicinesPageFactory(driver);
	}

	@When("User clicks on Cart option")
	public void user_clicks_on_cart_option() throws InterruptedException {
	   mf.cart();
	   Thread.sleep(5000);
	}
	@And("user click on close icon of product")
	public void user_click_on_close_icon_of_product() throws InterruptedException {
		mf.remove();
	}
	@Then("the product is removed from the cart")
	public void the_product_is_removed_from_the_cart() 
	{
//		
	}
	
	
	
	
//----------------------------------------Invalid------------------------------------------//
	
	/*Created By = Bhavesh Vilas Jibhakate
	 * Modified By = Bhavesh Vilas Jibhakate
	 *  Reviewed By = G Rais,Surbhi
	 *  Method is used to open Apollo24/7 Website
	 * */
	
	
	@When("user types invalid medicine name")
	public void user_types_invalid_medicine_name() throws InterruptedException, AWTException 
	{
		mf=new MedicinesPageFactory(driver);
		Thread.sleep(2000);
		mf.SearchMedicine("kartdfshj2346");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
	    System.out.println("Enters Invalid tablet name in search");
	}
	
	@Then("User should see error message")
	public void user_should_see_error_message() throws InterruptedException 
	{
//		
	}

	
	
	@AfterStep

		public static void tearDown(Scenario scenario) {

	        final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

	        scenario.attach(screenshot, "image/png", scenario.getName()); 

	    }
	
    }
		
//                                           End                                               //



		


		
