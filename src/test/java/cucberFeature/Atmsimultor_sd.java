package cucberFeature;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Atmsimultor_sd {
	@Given("^I enter an valid \"(.*?)\" in the ATM$")
	public void i_enter_an_valid_in_the_ATM(String arg1) throws Throwable {

	}

	@When("^I click on the \"(.*?)\" button$")
	public void i_click_on_the_button(String arg1) throws Throwable {
      System.out.print("clicking on"+ arg1);
      
	}

	@When("^I Enter a \"(.*?)\" number$")
	public void i_Enter_a_number(String arg1) throws Throwable {
		 System.out.print("Entering"+arg1);
	    
	}

	@Then("^i should see \"(.*?)\" displayed$")
	public void i_should_see_displayed(String arg1, DataTable arg2) throws Throwable {
	    
	 
	 
	
	}
	

}
