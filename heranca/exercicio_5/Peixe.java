public class Peixe extends AnimalMarinhoAB {
    private double altura;
    private double peso;

    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat);
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo.");
    }

    @Override
    public void mover() {
        nadar();
    }

    @Override
    public void dormir() {
        System.out.println(getNome() + " está dormindo.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }
}
