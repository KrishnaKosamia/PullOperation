package StepDefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class StarWar {
	
	
	
	
	@Test
	public void f() {
		
		RestAssured.baseURI="https://swapi.dev/api/planets/3";
		RequestSpecification headers = RestAssured.given().header("Content_Type","application/json");
		Response response = headers.request(Method.GET);										
		System.out.print(response.getBody().asString());
		int statusCode = response.getStatusCode();
	    Assert.assertEquals(200, statusCode,"validation is not sucessful`");
		
	}

}
