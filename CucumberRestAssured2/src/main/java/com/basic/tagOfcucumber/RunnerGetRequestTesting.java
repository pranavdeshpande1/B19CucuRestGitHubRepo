package com.basic.tagOfcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features={"src/test/resources/com/basic/GetRequestBasics/GetRequestTesting.feature"},
			glue={"com/basic/GetRequestTestingSD/"}
			)
	
	public class RunnerGetRequestTesting {		

	}
	


