package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"feature"},
plugin = {"pretty" ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
glue= {"stepdefnitions"},
tags="@login",
monochrome=true)
public class runnerclass extends AbstractTestNGCucumberTests
{

}
