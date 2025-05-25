package com.sprints.Apollo247.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicinesPageFactory {
	
	WebDriver driver;

	WebDriverWait wait;
	JavascriptExecutor js;
	

	@FindBy(xpath="//*[@id=\"mainContainerCT\"]/div/div/div[1]/div[1]/ul/li[2]/div/a/div[3]")
	WebElement medicinesbtn;
	@FindBy(xpath="//*[@id=\"searchProduct\"]")
	WebElement searchPro;
	@FindBy(xpath="//img[@src='https://images.apollo247.in/pub/media/catalog/product/d/o/dol0026_2.jpg?tr=w-200,q-80,f-webp,c-at_max']")
	WebElement medclickAddToCart;	
	@FindBy(xpath=("//button[text()='Add To Cart']"))
	WebElement productAdd;
	
	
	
	@FindBy(xpath="(//a[text()='Health Condition'])[1]")
	WebElement healthCondition;
	@FindBy(xpath="//button[text()='Sort By : ']")
	WebElement sortby;
	@FindBy(xpath=("(//input[@name='product-sort'])[2]"))
	WebElement highToLow;		
	
	
	@FindBy(xpath=("//a[@class='Header_icon___ocd6 Header_cart__Juw0v icon-cart_icon']"))
	WebElement cart;	
	@FindBy(xpath=("//button[@class='MedicineProductCard_cartItemsListRemove__LONA8']"))
	WebElement remove;
	
	
	@FindBy(xpath=("//a[@class='Header_icon___ocd6 icon-offers']"))
	WebElement coupon;
	@FindBy(xpath=("//span[@class='OffersCard_icon-copy-file__uYUMp']"))
	WebElement copycode;
	

	
	public void launchApp() {
		driver.get("https://www.apollo247.com/");
	}
	public void launchlabtests() {
		driver.get("https://www.apollopharmacy.in/?_ga=2.77878804.1414540410.1693806965-1420068466.1691815492");
	}
	
	
	
	
	public  MedicinesPageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void MedicinesButton() throws InterruptedException {
		Thread.sleep(2000);
		medicinesbtn.click();
	}

	public void ClickSearch() throws InterruptedException{
		Thread.sleep(2000);
		searchPro.click();
	}
	public void SearchMedicine(String medicine) throws AWTException, InterruptedException {
		searchPro.sendKeys(medicine);
		Thread.sleep(2000);
		Robot robo=new Robot();                          //robot
		robo.keyPress(KeyEvent.VK_ENTER);
		
	}
	public void MedAddToCart() throws InterruptedException {
		
		wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(medclickAddToCart));
//		js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", medclickAddToCart);
		medclickAddToCart.click();
	}
	public void ProductAdd() throws InterruptedException {
		Thread.sleep(2000);
		productAdd.click();
	}
	
	
	
	public void HealthCondition() throws InterruptedException {
		Thread.sleep(3000);
		healthCondition.click();
	}
	
	public void sortby() throws InterruptedException
	{
		Thread.sleep(2000);
		sortby.click();
	}
	
	public void highToLow() throws InterruptedException
	{
		Thread.sleep(0);
		highToLow.click();
	}
	
	
	
	public void cart()
	{
		medicinesbtn.click();
	    cart.click();
	}
	public void remove() throws InterruptedException
	{
		Thread.sleep(1000);
		remove.click();
	}
	
	
	
	
//	public void coupon()
//	{
//		medicinesbtn.click();
//		coupon.click();
//	}
//	public void copy()
//	{
//		copycode.click();
//		driver.close();
	}
	
