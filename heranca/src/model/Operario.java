package model;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        setValorProducao(valorProducao);
        setComissao(comissao);
    }

    public double calcularSalario() {
        double salarioBaseComComissao = getSalarioBase() + (getValorProducao() * getComissao() / 100);
        double salarioLiquido = salarioBaseComComissao - (salarioBaseComComissao * getImposto() / 100);
        return salarioLiquido;
    }

    // Métodos de seletores e modificadores
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
