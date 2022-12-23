package restassured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Objectcreation {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification a =RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name", "kavin");
		obj.put("job", "sdet");
		a.contentType(ContentType.JSON);
		a.body(obj.toJSONString());
		
		Response res=a.request(Method.POST,"/api/users");
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		
		

}
}
