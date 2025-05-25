package com.sprints.Apollo247.Misc;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

 

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


 

public class ConfigFileReader {
	public String loginCredentials()
	{
		String phoneNumber = "";
		try
		{
			File f = new File("C:\\Users\\BVILASJI\\Sprints\\Apollo247\\src\\test\\resources\\Data\\login.xlsx");
			FileInputStream fis = new FileInputStream(f);

 

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet("Sheet1");

 

			XSSFCell c = ws.getRow(0).getCell(0);
			phoneNumber = NumberToTextConverter.toText(c.getNumericCellValue());
			System.out.println(phoneNumber);
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		return phoneNumber;
	}

 

	public String baseURL()  

 

	{
		String baseUrl="";
		try
		{
			Properties prop = new Properties();
			FileReader reader = new FileReader("C:\\Selenium_training_24dec\\com.Appolo247my\\src\\test\\resources\\Data\\baseURL.Properties");
			prop.load(reader);
			baseUrl = prop.getProperty("baseUrl");
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		return baseUrl;
	}
}
