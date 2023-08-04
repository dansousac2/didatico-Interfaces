package model;
import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.Reprodutor;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, Reprodutor {

	public void tocar() {
		System.out.println("Tocando m�sica no iPhone");
	}

	public void pausar() {
		System.out.println("Pausando m�sica no iPhone");
		
	}

	public void selecionarMusica() {
		System.out.println("Selecionando m�sica no iPhone");
		
	}

	public void exibirPagina() {
		System.out.println("Exibindo p�gina no iPhone");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando p�gina no iPhone");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no iPhone");
		
	}

	public void atender() {
		System.out.println("Atendendo chamada no iPhone");
		
	}

	public void ligar() {
		System.out.println("Ligando chamada no iPhone");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz no iPhone");
		
	}

}
