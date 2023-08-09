package view;

import model.Operario;

public class TesteOperario {

    public static void main(String[] args) {
    	
        Operario operario = new Operario("João", 1, 2000.0, 10.0, 5000.0, 5.0);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Código Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto());
        System.out.println("Valor de Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());

        double salario = operario.calcularSalario();
        System.out.println("Salário Líquido: " + salario);
    }
}
