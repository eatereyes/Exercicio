package exemplo;

import java.util.*;

public class Teste {

	public static void main(String[] args) {
		
		int limite = 0;
		int op = 1;
		Scanner sc = new Scanner(System.in);
		ColeComputadores com = new ColeComputadores();
		System.out.println("Digite a quantidade maxima a ser adicionada");
		limite = LerInt(sc);
		
		while(op != 0) {
			
			
			try {
			com.AdicionarComp(LerDados(sc), limite);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			System.out.println("digite a marca a qual deseja perquisar:");
			System.out.println(com.QntMarca(LerString(sc)));
			
			System.out.println("Digite um cpf");
			try {
			System.out.println(com.BuscarPeloCpf(LerString(sc)));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			System.out.println(com.ClasseC());
			
			com.ExibirTodos();	
			
			System.out.println("1:para continuar|0:para sair)");
					op = LerInt(sc);
		}		
	}
	
	
	private static int LerInt(Scanner sc) {
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Numero Invalido.");
		}
		int i = sc.nextInt();
		sc.nextLine();
		return i;
	}
	
	private static String LerString(Scanner sc) {
		String i = sc.nextLine();
		return i;
	}
	//String nome, String ip, String marca, Professor dono
	//String cpf, String matricula, String nome, String departamento
	private static Computador LerDados(Scanner sc) {
		System.out.println("Digite o nome do computador:");
		String nomepc = sc.nextLine();
		System.out.println("Digite o IP:");
		String ip = sc.nextLine();
		System.out.println("Digite a marca");
		String marca = sc.nextLine();
		System.out.println("Digite o Cpf:");
		String cpf = sc.nextLine();
		System.out.println("Digite a Matricula:");
		String matricula = sc.nextLine();
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		System.out.println("Digite o departamento:");
		String departamento = sc.nextLine();
		Computador a = new Computador(nomepc, ip, marca, new Professor(cpf, matricula, nome, departamento));
		return a;
		
	}

}
