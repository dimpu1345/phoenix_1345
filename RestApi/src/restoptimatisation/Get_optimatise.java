package restoptimatisation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Get_optimatise {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		Response res = given().request(Method.GET,"api/users/2");
		System.err.println(res.asString());
	

	}

}
