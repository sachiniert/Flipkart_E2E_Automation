package com.Stepdefenitions;

import java.io.IOException;

import com.BaseClass.Library;
import com.Pages.Searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//This page is stepdefination
public class SearchMobile_Teatcase extends Library {
	Searchpage sp;
	@Given("Launch the Flipkart Application")
	public void launch_the_flipkart_application() throws IOException {
		launchapplication(); 
	}

	@When("close the popup")
	public void close_the_popup() {
		sp = new Searchpage(driver);
		sp.handlepopup();
		System.out.println(driver.getTitle());
	  
	}

	@Then("It should Navigate to the Home page")
	public void it_should_navigate_to_the_home_page() {
		
		 sp=new Searchpage(driver);
		 sp.homescreen();
	}

	@Given("User enter the Text in the Search field")
	public void user_enter_the_text_in_the_search_field() {
	   sp.Search("Mobile");
	}

	@When("Click the search button")
	public void click_the_search_button() {
	    sp.Clicksearch();
	}

	@Then("It should navigate to the search result page the relevent details")
	public void it_should_navigate_to_the_search_result_page_the_relevent_details() {
	   sp.Result();
	}
	@Then("Extract the Result and print in console")
	public void extract_the_result_and_print_in_console() {
	  sp.printentireresult();
	  System.out.println("****************************");
	}

	@Then("Print the Third result and keep it in the console")
	public void print_the_third_result_and_keep_it_in_the_console() {
	    sp.print3edresult();
	}


}
