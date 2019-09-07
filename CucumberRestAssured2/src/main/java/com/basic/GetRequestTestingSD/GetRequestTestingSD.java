package com.basic.GetRequestTestingSD;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetRequestTestingSD {
	
	Response res;
	
	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() throws Throwable {
	System.out.println("Starting of the GET Script");   
	
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
	res = RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api/f1/2017/circuits.json");
	String completeResponse = res.asString();
	System.out.println("=========="+completeResponse);
	
	}

	@Then("^user checks the \"([^\"]*)\" count or size$")
	public void user_checks_the_count_or_size(String limit) throws Throwable {
      String actualLimit = res.body().jsonPath().getString("MRData.limit");
      Assert.assertTrue(actualLimit.equals(limit));
	}
	
	@Then("^user checks at path \"([^\"]*)\" having value \"([^\"]*)\" in jason $")
	public void user_checks_at_path_having_value_in_jason(String jsnpath, String value) throws Throwable {
	String actualLimit = res.body().jsonPath().getString(jsnpath);
    Assert.assertTrue(actualLimit.equals(value));
    
    
    
     //If we have multiple element, get all element and validate that your expected single 
    //List<Object> cirList = res.getBody().jsonPath().getList("MRData.CircuitTable.Circuit.Circuit.ID")
    	//	int cirSize = cirList.size();
    //System.out.println("cir size ="+cirSize);
	
	
	}

	
}



