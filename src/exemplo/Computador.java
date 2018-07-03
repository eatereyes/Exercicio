package exemplo;

public class Computador {
	
	private String nome;
	private String ip;
	private String marca;
	private Professor dono;
	
	
	public Computador(String nome, String ip, String marca, Professor dono) {
		super();
		this.nome = nome;
		this.ip = ip;
		this.marca = marca;
		this.dono = dono;
	}


	public Computador(String nome, String marca, Professor dono) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.dono = dono;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Professor getDono() {
		return dono;
	}


	public void setDono(Professor dono) {
		this.dono = dono;
	}


	@Override
	public String toString() {
		return "Computador [nome=" + nome + ", ip=" + ip + ", marca=" + marca + ", dono=" + dono + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dono == null) ? 0 : dono.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		if (dono == null) {
			if (other.dono != null)
				return false;
		} else if (!dono.equals(other.dono))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
}
