package request;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequestApi {
	
	public Response postApiCadastroUser(String json) {
		
		String caminho = System.getProperty("user.dir");
		File body = new File(caminho + "/src/test/resources/massa/"+json+".json");
		
		RestAssured.baseURI = "http://localhost:8080/pessoas";
		Response response = RestAssured.given().relaxedHTTPSValidation().log().all()
				.header("Content-Type","application/json")
				.header("Accept","application/json")
				.body(body)
				.post();
	    return response;
	
	}
	
	
	public void getApiCadastroUser() {
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2/user/createWithList";
		Response response = RestAssured.given().relaxedHTTPSValidation().log().all()
				.header("Content-Type","application/json")
				.header("Accept","application/json")
				.body("[\r\n" + 
						"  {\r\n" + 
						"    \"id\": 0,\r\n" + 
						"    \"username\": \"Ana Maia\",\r\n" + 
						"    \"firstName\": \"string\",\r\n" + 
						"    \"lastName\": \"string\",\r\n" + 
						"    \"email\": \"string\",\r\n" + 
						"    \"password\": \"string\",\r\n" + 
						"    \"phone\": \"string\",\r\n" + 
						"    \"userStatus\": 0\r\n" + 
						"  },\r\n" + 
						"{\r\n" + 
						"    \"id\": 0,\r\n" + 
						"    \"username\": \"Rodrigo Mendes\",\r\n" + 
						"    \"firstName\": \"string\",\r\n" + 
						"    \"lastName\": \"string\",\r\n" + 
						"    \"email\": \"string\",\r\n" + 
						"    \"password\": \"string\",\r\n" + 
						"    \"phone\": \"string\",\r\n" + 
						"    \"userStatus\": 0\r\n" + 
						"  },\r\n" + 
						"{\r\n" + 
						"    \"id\": 0,\r\n" + 
						"    \"username\": \"Tatiana Vasconcelos\",\r\n" + 
						"    \"firstName\": \"string\",\r\n" + 
						"    \"lastName\": \"string\",\r\n" + 
						"    \"email\": \"string\",\r\n" + 
						"    \"password\": \"string\",\r\n" + 
						"    \"phone\": \"string\",\r\n" + 
						"    \"userStatus\": 0\r\n" + 
						"  }\r\n" + 
						"]")
				.post();
		response.then().log().all().statusCode(200);
		response.then().log().all();			
		}

}
