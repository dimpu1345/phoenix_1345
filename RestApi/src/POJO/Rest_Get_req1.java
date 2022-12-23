package POJO;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Get_req1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"api/users/2");
		 Single_user x = res.as(Single_user.class);
		 Support a = x.getSupport();
		 
		  String url = a.getUrl();
		  System.out.println(url);
		  
		  String text = a.getText();
		  System.out.println(text);
		
		


	}

}
