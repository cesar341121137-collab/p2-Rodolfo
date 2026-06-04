public class Gatos {
    String nome;
    String raca;
    String cor;
    int idade;
    int qi;
    boolean bonito;

    public Gatos(String nome, String raca, String cor, int idade, int qi, boolean bonito) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.qi = qi;
        this.bonito = bonito;
    }

    public String miar() {
        return nome + " faz: Miau Miau!! ";
    }

    public String comer(String comida) {
        return nome + " come " + comida + ".";
    }

    public String dormir(int horas) {
        if(horas >= 7) {
            return nome + " dormiu muito bem <3";
        } else {
            return nome + " dormiu mal demaizi.";
        }
    }

    public String e_do_planeta_terra (boolean real) {   
        if(real == true) {                             
            return "Você está falando a verdade. ";
        } else {
            return "Você esta mentindo";
        }
    }


    
    public static void main(String[] args) {

    // Criação dos objetos :)
    Gatos gato1 = new Gatos("Alexsander", "Humano", "bege, rosa,sla", 19, 289, true);
    Gatos gato2 = new Gatos("Frederico", "Vira-lata", "Laranja", 1, 322, true);
    Gatos gato3 = new Gatos("Mateus", "Humano", "nenhuma", 19, 12, false);

    // Chamando os atributos dos objetos
    System.out.println("O gato se chama " + gato1.nome + ", tem " + gato1.idade + " anos, raça: " + gato1.raca + " , cor: " + gato1.cor + ", tem " + gato1.qi + " de qi e considerando sua aparência a condição: Bonito é " + gato1.bonito + ".");
    System.out.println("O gato se chama " + gato2.nome + ", tem " + gato2.idade + " anos, raça: " + gato2.raca + " , cor: " + gato2.cor + ", tem " + gato2.qi + " de qi e considerando sua aparência a condição: Bonito é " + gato2.bonito + ".");
    System.out.println("O gato se chama " + gato3.nome + ", tem " + gato3.idade + " anos, raça: " + gato3.raca + " , cor: " + gato3.cor + ", tem " + gato3.qi + " de qi e considerando sua aparência a condição: Bonito é " + gato3.bonito + ".");

    // Chamando métodos dos objetos
    System.out.println(gato1.miar());
    System.out.println(gato2.miar());

    System.out.println(gato2.comer("ração"));
    System.out.println(gato3.comer("nada"));

    System.out.println(gato3.dormir(3));
    System.out.println(gato1.dormir(12));
    }
}