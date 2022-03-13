package exer5;

import java.util.UUID;

public class Pessoa {
	
	//Atributos
	private String primeiroNome, ultimoNome;
	private int idade;
	private double saldo;
	private UUID id;
	
	//Construtor
	public Pessoa(String aPrimeiroNome, String aUltimoNome, int aIdade, double aSaldo) {
		primeiroNome = aPrimeiroNome;
		ultimoNome = aUltimoNome;
		idade = aIdade;
		saldo = aSaldo; 
		id = UUID.randomUUID();
	}

	//Getter e Setters
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public UUID getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Pessoa [primeiroNome=" + primeiroNome + ", ultimoNome=" + ultimoNome + ", idade=" + idade + ", saldo="
				+ saldo + ", id=" + id + "]";
	}

}
