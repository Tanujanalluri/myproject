package stepdefnitions;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjs.loginpage;
import utilities.reportss;

public class loginstepdef extends loginpage
{
	@Given("User is in login page")
	public void user_is_in_login_page() throws IOException, Exception 
	{
		launchchrome();
		ExtentCucumberAdapter.addTestStepLog("User is in login page");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(reportss.screencap());
    }

	@When("User enters email id {string}")
	public void user_enters_email_id(String email) throws IOException, Exception 
	{
		enteremailId(email);
		ExtentCucumberAdapter.addTestStepLog("User entered emailid successfully"+email);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(reportss.screencap());
	}

	@And("User enters password {string}")
	public void user_enters_password(String password) throws IOException, Exception 
	{
		enterpassword(password);
		ExtentCucumberAdapter.addTestStepLog("User entered password successfully"+password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(reportss.screencap());
	}

	@Then("User clicks the signin button")
	public void user_clicks_the_signin_button() throws IOException, Exception 
	{
		clicksignin();
		ExtentCucumberAdapter.addTestStepLog("User clicked signin successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(reportss.screencap());
	}
}
