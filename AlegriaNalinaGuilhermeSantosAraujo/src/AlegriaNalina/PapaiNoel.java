package AlegriaNalina;

import java.util.ArrayList;

public class PapaiNoel extends Endereco {
	private String nome;
	private String cpf;
	private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

	public PapaiNoel(String rua, String cidade, int cep, String nome, String cpf, ArrayList<Endereco> enderecos) {
		super(rua, cidade, cep);
		this.nome = nome;
		this.cpf = cpf;
		this.enderecos = enderecos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
