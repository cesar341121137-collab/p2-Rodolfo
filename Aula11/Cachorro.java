// FUNDAMENTOS DE POO (PROGRAMAÇÃO ORIENTADA A OBJETOS)


public class Cachorro {
    // Atributos
    String nome;
    String raca;
    int idade;

    // Contrutor: incializar os atributos do objetos
    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Metodo: Comportamento do Cachorro
    public String latir(){
        return nome + " está latindo: AU AU!! ";
    }

    // Metodo: Comportamento do Cachorro
    public String comer(String comida) {
        return nome + " está comendo " + comida + ".";
    }

    public static void main(String[] args) {
        // Criação de objetos (instâncias da classe: Cachorro)
        Cachorro cachorro1 = new Cachorro("Rex", "Labrador", 3);
        Cachorro cachorro2 = new Cachorro("Bolinha", "Poodle", 5);

        // Acessando atributos dos objetos
        System.out.println("Nome: " + cachorro1.nome + ", Raça: " + cachorro1.raca + ", Idade: " + cachorro1.idade + " anos");
        System.out.println("Nome: " + cachorro2.nome + ", Raça: " + cachorro2.raca + ", Idade: " + cachorro2.idade + " anos");

        // Chamando métodos dos objetos
        System.out.println(cachorro1.latir());
        System.out.println(cachorro2.comer("ração"));
    }
}