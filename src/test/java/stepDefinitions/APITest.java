package stepDefinitions;

import org.junit.Test;
import org.testng.AssertJUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest {
	private Response response;
	private String apiEndpoint;
	
	@Test
	@Given("I set the API endpoint {string}")
	public void setApiEndpoint(String endpoint) {
		apiEndpoint = endpoint;
	}

	@Test
	@When("I send a GET request to the API")
	public void sendGetRequest() {
		response = RestAssured.get(apiEndpoint);
	}
	
	@Test
	@Then("I should receive a {int} status code")
	public void verifyStatusCode(int statusCode) {
		AssertJUnit.assertEquals(response.getStatusCode(), statusCode);
	}
}
