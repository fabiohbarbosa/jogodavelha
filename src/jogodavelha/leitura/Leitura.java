package jogodavelha.leitura;

import java.util.Scanner;

public class Leitura {
	private Scanner in;

	public void lerDados() {
		in = new Scanner(System.in);
		System.out.printf("Informe o Jogador:  ");
		int jogador = in.nextInt();
		
		System.out.println(jogador);
	}
}
