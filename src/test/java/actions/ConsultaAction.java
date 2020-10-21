package actions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Assert;

import io.restassured.response.Response;
import request.RequestApi;

public class ConsultaAction {
	
	RequestApi request = new RequestApi();
    static Response response = null;
	
	public void realizarChamadaGetApi(String ddd, String telefone) throws FileNotFoundException, IOException, ParseException {
		response = request.getApiCadastroUser(ddd, telefone);
	}
	
	public void validarConsulta() {
		response.then().statusCode(200);
	}
	
	public void validarConsultaNegativa() {
		response.then().statusCode(404);
		String erro = response.then().extract().path("erro").toString();
		if (!erro.contains("Não existe pessoa com o telefone")) {
			Assert.assertFalse(false);
		}
	}

}
