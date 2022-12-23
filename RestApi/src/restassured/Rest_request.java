package restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_request
{
 public static void main(String[] args) 
 { 
	 RestAssured.baseURI="https://reqres.in/";
	 RequestSpecification a= RestAssured.given();
	 Response res=a.request(Method.GET,"/api/users/2");
	 String value=res.asString();
	 System.out.println(value);
	
}

}
