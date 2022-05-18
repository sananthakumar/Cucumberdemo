package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class regex {
	 @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
     System.out.println("Given step: landing page");
 }

	@When("^username using \"([^\"]*)\" and \"([^\"]*)\" and click login button$")
 public void username_using_something_and_something_and_click_login_button(String strArg1, String strArg2) throws Throwable {    
		System.out.println(strArg1);
     System.out.println(strArg2);
     
     
 }

 @Then("^Home page is displayed$")
 public void home_page_is_displayed() throws Throwable {
	System.out.println("Home page displayed");
 }

 @And("^Page displayed are \"([^\"]*)\"$")
 public void page_displayed_are_something(String strArg1) throws Throwable {
 	System.out.println(strArg1);  
 }


}
