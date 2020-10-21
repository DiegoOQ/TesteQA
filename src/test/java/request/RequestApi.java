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
	
	
	public Response getApiCadastroUser(String ddd, String telefone) {
		String url  = "http://localhost:8080/pessoas/{ddd}/{numero}";
		Response response = RestAssured.given().relaxedHTTPSValidation().log().all()
				.header("Content-Type","application/json")
				.header("Accept","application/json")
				.pathParam("ddd",ddd)
		        .pathParam("numero",telefone)
				.get(url);
		return response;		
		}

}
