public abstract class AnimalMarinhoAB extends AnimalAB {
    private String habitat;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat) {
        super(nome, tipoAnimal, idade);
        this.habitat = habitat;
    }

    public abstract void nadar();

    public String getHabitat() {
        return habitat;
    }
}
