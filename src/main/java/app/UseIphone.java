package app;

import model.Iphone;

public class UseIphone {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
		
		iphone.tocar();
		iphone.pausar();
		iphone.iniciarCorreioVoz();

	}

}
