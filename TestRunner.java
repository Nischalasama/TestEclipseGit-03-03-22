package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "resources\\parameterizationusingmaps.feature",
				 glue = "com.mapparameterization",
				 dryRun = false,
				 monochrome = true, 
				 plugin = {
		"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json", "junit:target/cucumber-junitresults.xml"}, 
				 strict = false)
public class TestRunner {

}
