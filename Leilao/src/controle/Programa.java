package controle;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;

public class Programa {

	private static boolean at = true;
		
	public static void main(String[] args) {
	
		ArrayList<Usuario> membrosLeilao = new ArrayList<Usuario>(); 
		Leilao leilao = new Leilao("Artefatos do Século XVI");
		
		while (at){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("=============================\nLEILÃO\n=============================");
			System.out.println("Insira a opção desejada: ");
			System.out.println(""
					+ "1)Registrar usuário;\n"
					+ "2)Registrar lance;\n"
					+ "3)Consultar todos os lances;\n"
					+ "4)Consultar lances de um usuário;\n"
					+ "5)Consultar membros.");
			
			int opc = sc.nextInt();
			
			switch (opc) {
			case 1:
				membrosLeilao.add(ControleUsuario.registrarUsuario(membrosLeilao));
				break;
			case 2:
				System.out.print("INSIRA O ID DO USUÁRIO: ");
				int idUsuario = sc.nextInt();
				Usuario usuario = null;
				for(int i = 0; i < membrosLeilao.size(); i++){
		            if (membrosLeilao.get(i).getId() == idUsuario) {
		            	usuario = membrosLeilao.get(i);	
		            }
		        }
				ControleLance.registrarLance(usuario, leilao);
				break;
			case 3:
			    for(Lance lance : leilao.getLances()){
			    	System.out.println(String.format("%s - %,.2f", lance.getUsuario().getNome(), lance.getValor()));
		        }
				break;
			case 4:
				System.out.println("INSIRA O ID DO USUARIO");
				idUsuario = sc.nextInt();
				for(Lance lance : leilao.getLances()){
			            if (lance.getUsuario().getId() == idUsuario) {
			            	System.out.print(lance.getValor());	
			            }
				}
				break;
			case 5:
				for(int i = 0; i < membrosLeilao.size(); i++){
		            System.out.println(membrosLeilao.get(i).getNome());
			}
			}

			System.out.println("ESCOLHA UMA OPÇÃO");
			System.out.println("1)Continuar;\n"
					+ "2)Sair.\n");
			
			opc = sc.nextInt();
			
			if (opc != 1) {
				sc.close();
				at = false;
			}
		}
				
		
}
	
}
