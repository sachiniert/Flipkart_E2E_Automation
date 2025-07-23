package com.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;

//This page is pom
public class Searchpage extends Library {
	public static SeleniumReusable se;
	
	public Searchpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Searchtext;
	
	
	@FindBy(xpath="//html[@lang='en-IN']")
	WebElement Homepage;
	
	@FindBy(xpath="//html[@lang='en']")
	WebElement Searchresult;
	
	@FindBy(xpath="//button[@class='QqFHMw NEEcDr']")
	WebElement Popup;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]")
	List<WebElement> Entireresult;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]")
	WebElement ThirdResult;
	public void handlepopup()
	{

		se= new SeleniumReusable(driver);
		se.click(Popup);
	}
	
	public void Search(String Text) {
		se = new SeleniumReusable(driver);
		se.EnterValue(Searchtext, Text);
	}
	public void Clicksearch()
	{
		Searchtext.sendKeys(Keys.ENTER);
	}
	
public void homescreen()
{
	System.out.println(Homepage.isDisplayed());
	
}
public void Result()
{
	
System.out.println(Searchresult.isDisplayed());
System.out.println(driver.getTitle());
}

public void printentireresult() 
{
	se.MultipleGettext(Entireresult);
}
public void print3edresult()
{
 se.Getvalue(ThirdResult);	
}


}
