public abstract class AnimalAB {
    private String nome;
    private String tipoAnimal;
    private int idade;

    public AnimalAB(String nome, String tipoAnimal, int idade) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
    }

    public abstract void comer();
    public abstract void mover();
    public abstract void dormir();

    public String getNome() {
        return nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }
}
