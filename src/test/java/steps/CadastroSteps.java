package steps;

import actions.CadastroAction;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {
	
	CadastroAction cadastroAction = new CadastroAction();
	
	@Dado("^que estou fazendo o cadastro de uma pessoa$")
	public void queEstouFazendoOCadastroDeUmaPessoa() throws Throwable {
      //implementado no Quando
	}

	@Quando("^insiro os dados do \"([^\"]*)\"$")
	public void insiroOsDadosDo(String json) throws Throwable {
		cadastroAction.realizarChamadaPostApi(json);
	}

	@Então("^Valido que o cadastrado foi realizado$")
	public void validoQueOCadastradaFoiRealizado() throws Throwable {
		cadastroAction.validarCadastroPositivo();
	}

}
