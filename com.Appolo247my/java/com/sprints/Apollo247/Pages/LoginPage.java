package com.sprints.Apollo247.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

public class LoginPage {

 

	WebDriver driver;
	WebDriverWait wait;

 

	@FindBy(xpath="//div[@id='loginPopup']")
	WebElement loginIcon;

 

	@FindBy(xpath="//input[@name='mobileNumber']")
	WebElement mobileNumber;

 

	

 

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginArrow;

 

	
	@FindBy(xpath="//button[@type='submit']")
	WebElement otpArrow;

 

 

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

 

	
	public void login()
	{
//		wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeClickable(loginIcon));
		loginIcon.click();
	}

 

	public void enterNumber(String numb) throws InterruptedException
	{
		//wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(mobileNumber));
		Thread.sleep(2000);
//		mobileNumber.click();
		mobileNumber.sendKeys(numb);

	}

 

	public void clickLoginArrow()

 

	{
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(loginArrow));
		loginArrow.click();
	}

 

	public void clickOtpArrow() throws InterruptedException

 

	{
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(otpArrow));
//		Thread.sleep(15000);
		loginArrow.click();
	}

 

 

}

