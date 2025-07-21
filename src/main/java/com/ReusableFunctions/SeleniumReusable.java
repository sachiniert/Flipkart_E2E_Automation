package com.ReusableFunctions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import com.BaseClass.Library;

public class SeleniumReusable extends Library {
	
	public SeleniumReusable(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	//Enter the Text of Element
	public void EnterValue(WebElement element, String Text)
	{
		
		try {
			
			element.sendKeys(Text);
		}catch(Exception e)
		{
			System.out.println("No such element Exception");
		}
	}
	
// click the element	
public void click(WebElement element)
{
	try
	{
		element.click();
	}catch(Exception e) 
	{
		System.out.println("Nosuchelement Exception");
		
	}
}
//get the title of the page
public void gettile()
{
	try {
		System.out.println(driver.getTitle());
	}catch(Exception e)
	{
		
		System.out.println("couldnt get the title ");
	}
}
// take the creenshot of the testcase
public  void screenshot(String path)
{
	TakesScreenshot TS = (TakesScreenshot)driver;
	File source = TS.getScreenshotAs(OutputType.FILE);
	try {
		
		FileUtils.copyFile(source, new File(path));
	}catch(Exception e)
	{
		System.out.println("Screenshot not found");
	}
	
}
}
