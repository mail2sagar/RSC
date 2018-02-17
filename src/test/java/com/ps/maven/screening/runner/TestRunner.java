package com.ps.maven.screening.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resource"},
		glue = {"com.ps.maven.rsc.stepDefinition"},
		plugin = {"pretty","html:Reports/screen-pretty","usage:Reports/screen-json/cucumber-usage.json","json:Reports/cucumber.json","junit:target/cucumber-results.xml"},	
		monochrome = true		
		)
public class TestRunner{

}

