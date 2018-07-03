package exemplo;

import java.util.ArrayList;

public class ColeComputadores {
	
	private ArrayList<Computador> comp;

	public ColeComputadores() {
		comp = new ArrayList<Computador>();
	}
	
	public boolean AdicionarComp(Computador c, int limit) throws Exception{
		if(comp.size()<limit) {
			comp.add(c);
			return true;
		}
		throw new Exception("Limite de computador excedido.");
	}
	
	public int QntMarca(String marca) {
		int cont = 0;
		for(Computador c: comp) {
			if(c.getMarca().equals(marca)) {
				cont++;
			}
		}
		return cont;
	}
	
	public Computador BuscarPeloCpf(String x) throws Exception{
		for(Computador c: comp){
			if(c.getDono().getCpf().equals(x)) {
				return c;
			}
		}
		throw new Exception("Professor com cpf:" + x + "não encontrado");
	}
	
	public ArrayList<Computador> ClasseC(){
		ArrayList<Computador> aux = new ArrayList<Computador>();
		for(Computador c: comp) {
			if(c.getIp().startsWith("255.255.255")) {
				aux.add(c);
			}
		}
		return aux;
	}
	
	
	public void ExibirTodos() {
		for(Computador c: comp) {
			System.out.println(c);
		}
	}

}
