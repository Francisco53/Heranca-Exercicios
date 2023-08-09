
public class Lista4_exercicio5 {
	public static void main(String[] args) {
		pombo pombo = new pombo("Pombinho", 2, 2, 1.5, 2);

        System.out.println("Nome: " + pombo.getNome());
        System.out.println("Tipo: " + pombo.getTipoAnimal());
        System.out.println("Idade: " + pombo.getIdade());
        System.out.println("Quantidade de Asas: " + pombo.getQuantidadeAssas());
        System.out.println("Envergadura das Asas: " + pombo.getEnvergaduraAsas());

        pombo.comer();
        pombo.mover();
        pombo.dormir();
        pombo.voar();
	}
}