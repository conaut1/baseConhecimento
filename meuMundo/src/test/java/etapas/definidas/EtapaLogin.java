package etapas.definidas;

import io.cucumber.java.pt.*;

public class EtapaLogin {
	
	@Dado("^que o usuario está na tela de login$")
	public void que_o_usuario_está_na_tela_de_login() {

		System.out.println("deu certo");
	}

	@Quando("^inserir o CPF$")
	public void inserir_o_CPF() {

		System.out.println("deu certo2");

	}

	@E("^clicar em avançar$")
	public void clicar_em_avançar() {

		System.out.println("deu certo3");

	}

	@E("^inserir a senha$")
	public void inserir_a_senha() {
		System.out.println("deu certo4");


	}

	@Entao("^realizar o login com sucesso$")
	public void realizar_o_login_com_sucesso() {
		System.out.println("deu certo5");


	}

}
