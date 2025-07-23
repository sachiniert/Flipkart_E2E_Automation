package com.BaseClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


// Notes 1st create driver 2nd create Library class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	public  WebDriver driver;
	
	public static Properties prop;
	// lancing application 
	public void launchapplication() throws IOException {
		FileInputStream input = new FileInputStream("src/test/resources/Properties/Config.Property");
		
		prop = new Properties();
		prop.load(input);
		
		try {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) 
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("url"));	
		}
		catch(Exception e)
		{
			System.out.println("Browser didnt launch");
		}
	}
	public void teardown()
	{
		driver.close();
		
	}

}
