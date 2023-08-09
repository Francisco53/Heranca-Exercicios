package view;

import model.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Rua A, 123", 1, 3000, 10);
        System.out.println("Empregado:");
        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Endereço: " + empregado1.getEndereco());
        System.out.println("Código Setor: " + empregado1.getCodigoSetor());
        System.out.println("Salário Base: " + empregado1.getSalarioBase());
        System.out.println("Imposto: " + empregado1.getImposto());
        System.out.println("Salário Líquido: " + empregado1.calcularSalario());
    }
}