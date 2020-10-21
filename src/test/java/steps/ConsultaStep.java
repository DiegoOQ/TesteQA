package steps;

import actions.ConsultaAction;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ConsultaStep {
	
	ConsultaAction consultaAction = new ConsultaAction();
	
	@Dado("^que estou fazendo uma colsulta dos dados do usuário$")
	public void queEstouFazendoUmaColsultaDosDadosDoUsuário() throws Throwable {
      //implementado no quando
	}
	
	@Quando("^consulto os dados com o telefone \"([^\"]*)\" \"([^\"]*)\"$")
	public void consultoOsDadosComOTelefone(String ddd, String telefone) throws Throwable {
		consultaAction.realizarChamadaGetApi(ddd, telefone);
	}
	

	@Então("^Valido que a consulta foi realizada com sucesso$")
	public void validoQueAConsultaFoiRealizadaComSucesso() throws Throwable {
		consultaAction.validarConsulta();
	}
	
	@Então("^Valido que usuário não está cadastrado$")
	public void validoQueUsuárioNãoEstáCadastrado() throws Throwable {
		consultaAction.validarConsultaNegativa();
	}

}
