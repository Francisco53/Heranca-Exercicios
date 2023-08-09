package view;

import model.Vendedor;

public class TesteVendedor {

	public static void main(String[] args) {

		Vendedor vendedor = new Vendedor("Josué", 1, 900.0, 10, 1000, 2);
		System.out.println("Vendedor: " + vendedor.getNome());
		System.out.println("Setor: " + vendedor.getCodigoSetor());
		System.out.println("Salário base: " + vendedor.getSalarioBase());
		System.out.println("Impostos a pagar: " + vendedor.getImposto() + "%");
		System.out.println("Valor de vendas: " + vendedor.getValorVendas());
		System.out.println("Comissão: " + vendedor.getComissao());
		System.out.println("Salário: " + vendedor.calcularSalario());
		
		vendedor.setNome("Josué M. Leite");
		vendedor.setEndereco("R. Bão Demais, 74");
		vendedor.setTelefone("(35) 98765-4321");
		vendedor.setCodigoSetor(0);
		vendedor.setSalarioBase(1000.0);
		vendedor.setImposto(7.1);
		vendedor.setValorVendas(2000.0);
		vendedor.setComissao(3.55);
		
		System.out.println("--------------------------------------");
		System.out.println("Vendedor: " + vendedor.getNome());
		System.out.println("Endereço: " + vendedor.getEndereco());
		System.out.println("Telefone: " + vendedor.getTelefone());
		System.out.println("Salário base: " + vendedor.getSalarioBase());
		System.out.println("Impostos a pagar: " + vendedor.getImposto() + "%");
		System.out.println("Valor de vendas: " + vendedor.getValorVendas());
		System.out.println("Comissão: " + vendedor.getComissao());
		System.out.println("Salário: " + vendedor.calcularSalario());
	}
}
