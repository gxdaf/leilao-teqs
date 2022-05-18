package controle;

import java.util.Scanner;

import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;

public class ControleLance {

	public static Leilao registrarLance(Usuario usuario, Leilao leilao) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("INSIRA O VALOR DO LANCE\n");
		float valor = sc.nextFloat();
				
		Lance lance = new Lance(usuario, valor);
		
		leilao.propoe(lance);
		
		return leilao;
		
	}
	
}
