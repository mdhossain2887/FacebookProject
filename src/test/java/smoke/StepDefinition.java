package smoke;

import java.util.List;

import base.BaseTest;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ProfilePage;

public class StepDefinition {

	BaseTest b;
	HomePage hp;
	ProfilePage  pf;
	
	@Given("^open browser3$")
	public void open_browser(DataTable arg1) throws Throwable {
	    List<List<String>>  browsers=arg1.raw();
	    String br=browsers.get(0).get(0);
	    b.openBrowser(br);
	   
	}

	@Given("^fnavigate to facebook\\.com$")
	public void fnavigate_to_facebook_com() throws Throwable {
	    b.goToUrl();
	}

	@When("^user types the username$")
	public void user_types_the_username() throws Throwable {
	  hp.typeUserName("hossainmd671@gmail.com");
	}

	@When("^user types the password$")
	public void user_types_the_password() throws Throwable {
	    hp.typePassword("3475736358");
	}

	@When("^user click on log in button$")
	public void user_click_on_log_in_button() throws Throwable {
	  pf= hp.click();
	}

	@Then("^user should be in his profile page$")
	public void user_should_be_in_his_profile_page() throws Throwable {
	    pf.verifyName();
	}

	@When("^user types the \"([^\"]*)\"$")
	public void user_types_the(String arg1) throws Throwable {
	    hp.typeUserName(arg1);
	}

	@Then("^user should not be in his profile page$")
	public void user_should_not_be_in_his_profile_page() throws Throwable {
	    pf.verifyName();
	}
}
