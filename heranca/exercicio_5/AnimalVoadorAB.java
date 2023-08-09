public abstract class AnimalVoadorAB extends AnimalAB {
    private int quantidadeAssas;
    private double envergaduraAsas;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, int quantidadeAssas, double envergaduraAsas) {
        super(nome, tipoAnimal, idade);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAsas = envergaduraAsas;
    }

    public abstract void voar();

    public int getQuantidadeAssas() {
        return quantidadeAssas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }
}
