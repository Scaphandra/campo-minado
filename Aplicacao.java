package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,3);
		
		new TabuleiroConsole(tabuleiro);
		
		/*tabuleiro.abrir(3,3);
		tabuleiro.alternarMarcacao(4,4);
		tabuleiro.alternarMarcacao(4,5);
		System.out.println(tabuleiro);se ao abrir aparecer a exception é porque o escolhido foi um campo minado*/
	}
}
