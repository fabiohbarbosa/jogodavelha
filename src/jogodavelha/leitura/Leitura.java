package jogodavelha.leitura;

import java.util.Scanner;

public class Leitura {
	private Scanner in;
	public void lerDados() throws Exception {
		in = new Scanner(System.in);
		System.out.printf("Informe o Jogador:  ");
		int jogador = in.nextInt();
		if (jogador == 1 || jogador == 2){
			System.out.println("Jogador informado corretamente: " + jogador);
		}else {
			throw new Exception("Por favor informar numero do jogador de 1 a 2.");
		}
		System.out.printf("Informe a jogada: ");
		String jogada = in.next();
		if (jogada.equals("x") || jogada.equals("o") ){
			System.out.println("jogada informada corretamente " + jogada);
		}else {
			throw new Exception ("Por favor informar uma jogada corretamente. ");
		}
		System.out.printf("por favor informar a Coluna: ");
		int coluna = in.nextInt();
		if (coluna >= 0 || coluna < 3){
			System.out.println("Coluna aceita: " + coluna);
		}else {
			throw new Exception ("Por favor informar coluna entre 0 a 2.");
		}
		System.out.printf("Por favor informar a Linha: ");
		int linha = in.nextInt();
		if (linha >= 0 || linha < 3){
			System.out.println("Linha aceita " + linha);
		}else {
			throw new Exception ("Por favor informar coluna entre 0 a 2");
		}
		iniciarJogada(jogador,jogada,coluna,linha);
			
	}
	private void iniciarJogada(int jogador, String jogada, int coluna, int linha) {
		
	}
}
