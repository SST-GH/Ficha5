package exer5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	//Atributos
	List<Pessoa>listaPessoas;
	
	//Construtor
	public Mercado() {
		listaPessoas = new ArrayList<Pessoa>();
	}
	
	//Métodos
	
	public void addPessoa(Pessoa a) {
		listaPessoas.add(a);
	}
	
	
	
	
	
	public double totalSaldo() {
		double saldoTotal = 0;
		for(Pessoa aux: listaPessoas) {
			saldoTotal += aux.getSaldo();
		}
		return saldoTotal;
	}
	

}
