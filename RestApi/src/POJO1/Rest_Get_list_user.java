package POJO1;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Get_list_user {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification a= RestAssured.given();
		 Response res=a.request(Method.GET,"api/users?page=2");
		 List_users list=res.as(List_users.class);
		 List<Data> d = list.getData();
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getAvatar());
		 }
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getId());
		 }
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getFirst_name());
		 }
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getLast_name());
		 }
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getEmail());
		 }
		 
		 
		 
		 

	}

}
