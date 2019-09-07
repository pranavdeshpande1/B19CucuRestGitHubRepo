package com.basic.datadrivenForGetFF;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features={"src/test/resources/com/basic/datadrivenForGetFF/GetRequestDataDriven.feature"},
			glue={"com/basic/datadrivenForGetFF"}
			)
	
	public class RunnerGetRequestTesting {		

	}
	


