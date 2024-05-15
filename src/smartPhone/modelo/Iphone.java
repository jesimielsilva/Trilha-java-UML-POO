package smartPhone.modelo;

import smartPhone.internet.NavegadorInternet;
import smartPhone.musica.ReprodutorMusical;
import smartPhone.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

	@Override
	public void tocarMusica() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Musica pausada");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida");
		
	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("Correio de voz iniciado");
		
	}

}
