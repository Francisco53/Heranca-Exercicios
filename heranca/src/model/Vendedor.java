package model;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(nome, codigoSetor, salarioBase, imposto);
		setValorVendas(valorVendas);
		setComissao(comissao);
	}

	public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(nome, telefone, codigoSetor, salarioBase, imposto);
		setValorVendas(valorVendas);
		setComissao(comissao);
	}
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		setValorVendas(valorVendas);
		setComissao(comissao);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = getValorVendas() * comissao / 100;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + getComissao();
    }
}
