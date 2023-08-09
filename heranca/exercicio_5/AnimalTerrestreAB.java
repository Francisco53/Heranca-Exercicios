public abstract class AnimalTerrestreAB extends AnimalAB {
    private int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, int quantidadePatas) {
        super(nome, tipoAnimal, idade);
        this.quantidadePatas = quantidadePatas;
    }

    public abstract void correr();

    public int getQuantidadePatas() {
        return quantidadePatas;
    }
}
