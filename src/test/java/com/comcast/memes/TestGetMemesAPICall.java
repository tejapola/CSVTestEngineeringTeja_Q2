package com.comcast.memes;

import org.junit.Test;
import static com.jayway.restassured.RestAssured.expect;

public class TestGetMemesAPICall {

	@Test
	public void test() {
		expect().statusCode(200).when()
				.get("https://api.imgflip.com/get_memes").then()
				.contentType("text/html; charset=UTF-8");

		System.out.println("Step 1: GET Memes API call Successfull ");
	}
}
