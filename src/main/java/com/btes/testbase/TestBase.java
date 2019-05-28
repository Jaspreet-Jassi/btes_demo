package com.btes.testbase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	public static WebDriver dr;
	public static Properties pr;
	
	public TestBase()
	{
		try
		{
			FileInputStream ip= new FileInputStream("D:/jassi/com.btes.test/src/main/java/com.configuration");
			pr = new Properties();
			pr.load(ip);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void method()
	{
		dr=new ChromeDriver();
		System.getProperty(pr.getProperty("sysprop_1"), pr.getProperty("sysprop_2"));
		
		dr.get(pr.getProperty("url"));
		
	}
	
	
	

}
