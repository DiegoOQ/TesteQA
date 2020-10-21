package actions;

import io.restassured.response.Response;
import request.RequestApi;

public class CadastroAction {

	RequestApi request = new RequestApi();
	Response response = null;
	
	public void realizarChamadaPostApi(String json) {
		response = request.postApiCadastroUser(json);
	}
	
	public void validarCadastroPositivo() {
		System.out.println(response.body().asString());
		response.then().statusCode(201);
	
	}
	
	
}
