package controle;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Usuario;

public class ControleUsuario {

	public static Usuario registrarUsuario(ArrayList<Usuario> membrosLeilao) {
		
		int id =+ membrosLeilao.size();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("INSIRA O NOME DO USUÁRIO\n");
		String nome = sc.next().toUpperCase();
				
		Usuario usuario = new Usuario(id, nome);
		
		System.out.println(String.format("USUÁRIO CRIADO COM SUCESSO\nID: %o\nNOME: %s", usuario.getId(), usuario.getNome()));
	
		return usuario;
				
	}
}
	
