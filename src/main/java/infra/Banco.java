package infra;

import java.util.ArrayList;
import java.util.List;

import domain.Conta;

public class Banco {
	
	private static List<Conta> contasImposto = new ArrayList<>();
	
	
	static {
		ContaImposto conta1 = new ContaImposto(9999);
		ContaImposto conta2 = new ContaImposto(8888);
		contasImposto.add(conta1);
		contasImposto.add(conta2);
	}
	
	public static void adiciona(Conta conta) {
		Banco.contasImposto.add(conta);
	}
	
	public static List<Conta> getContasImposto(){
		return Banco.contasImposto;
	}
