package restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_post1
{

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		
		 RequestSpecification a= RestAssured.given();
		 Response res=a.request(Method.GET,"api/users?page=2");
		 String str =res.asString();
		 JsonPath json=new JsonPath(str);
		 String value=json.getString("data.avatar");
		 System.out.println(value);

	}

}
