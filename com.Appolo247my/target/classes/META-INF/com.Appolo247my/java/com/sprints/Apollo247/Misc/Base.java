package com.sprints.Apollo247.Misc;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.sprints.Apollo247.Steps.ChromeOptions;

public class Base {

	
	
	private static WebDriver driver;
	public static WebDriver getChromeWebDriver()
	{   	

		System.setProperty("webdriver.chrome.driver", "C:\\Driver_sel\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", 
		    Collections.singletonMap("profile.default_content_settings.popups", 0));

    	driver = new ChromeDriver(options);
    	driver.manage().window().maximize();
    	return driver;

	}

    public static WebDriver getFirefoxWebDriver() {    

	    System.setProperty("webdriver.gecko.driver", "C:\\Driver_sel\\chromedriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    return driver;

	}
}



	
	
	  

