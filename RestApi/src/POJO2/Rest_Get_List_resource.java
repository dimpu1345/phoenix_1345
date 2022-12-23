package POJO2;

import java.util.Collection;
import java.util.List;

import POJO2.Data;
//import POJO1.List_users;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Get_List_resource {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification a= RestAssured.given();
		 Response res=a.request(Method.GET,"https://reqres.in/api/unknown");
		 List_resource list=res.as(List_resource.class);
		 List<Data> d = list.getData();
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getId());
		 }
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getName());
		 }
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getYear());
			 
		 }
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getColor());
		 }
		 
		 for(Data data:d)
		 {
			
			 System.out.println(data.getPantone_value());
		 }
		 
		
		 
		
		
		 
		
		 
		

	}

}
