public class pombo extends AnimalVoadorAB {
    private int quantidadePatas;

    public pombo(String nome, int idade, int quantidadeAssas, double envergaduraAsas, int quantidadePatas) {
        super(nome, "Pombo", idade, quantidadeAssas, envergaduraAsas);
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo.");
    }

    @Override
    public void mover() {
        voar();
    }

    @Override
    public void dormir() {
        System.out.println(getNome() + " está dormindo.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }
}
