package actions;

import org.junit.Assert;

import io.restassured.response.Response;
import request.RequestApi;

public class CadastroAction {

	RequestApi request = new RequestApi();
    static Response response = null;
	
	public void realizarChamadaPostApi(String json) {
		response = request.postApiCadastroUser(json);
	}
	
	public void validarCadastroPositivo() {
		System.out.println(response.body().asString());
		response.then().statusCode(201);
	
	}
	
	public void validarCadastroNegativoCpf() {
		response.then().statusCode(400);
		String erro = response.then().extract().path("erro").toString();
		if (!erro.contains("Já existe pessoa cadastrada com o CPF")) {
			Assert.assertFalse(false);
		}
	
	}
	
	public void validarCadastroNegativoTelefone() {
		response.then().statusCode(400);
		String erro = response.then().extract().path("erro").toString();
		if (!erro.contains("Já existe pessoa cadastrada com o Telefone")) {
			Assert.assertFalse(false);
		}
	
	}
	
	
}
