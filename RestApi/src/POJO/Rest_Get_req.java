package POJO;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Get_req {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification a= RestAssured.given();
		 Response res=a.request(Method.GET,"api/users/2");
		  Single_user s = res.as(Single_user.class);
		  Data d = s.getData();
		  Support s1 = s.getSupport();
		  System.out.println(s1.getUrl());
		  
		  int id = d.getId();
		  System.out.println(id);
		  
		  String name = d.getFirst_name();
		  System.out.println(name);
		  
		  String ln = d.getLast_name();
		  System.out.println(ln);
		  
		  String mail = d.getEmail();
		  System.out.println(mail);
		  
		  String avatar = d.getAvatar();
		  System.out.println(avatar);
		  
		  

	}

}
