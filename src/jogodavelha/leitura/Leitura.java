package jogodavelha.leitura;

import java.util.Scanner;

public class Leitura {
	private Scanner in;

	public void lerDados() throws Exception {
		in = new Scanner(System.in);
		System.out.printf("Informe o Jogador:  ");
		int jogador = in.nextInt();
		if (jogador < 1 || jogador > 2){
			System.out.println("Jogador informado incorreto.");
		}else {
			throw new Exception();
		}
	}
}
