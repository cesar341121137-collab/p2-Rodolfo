package Aula12.Desafio;
public class Insumo {
    //atributos :D
    private String nome;
    private int quantidade;
    private int mesValidade;

    //Construtor pedido para garantir que o nome e o mes não entrem no sistema sem definição
    // (fiz para garantir o da quantidade também, não tenho certeza se precisa mas ta ai :3)
    public Insumo(String nome, int quantidade, int mesValidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.mesValidade = mesValidade;
    }

    //método para simplesmente verificar se é um mês de 1 a 12. E ele seta também o mes digitado (int mes) no mesValidade
    public void setMesValidade(int mes) {
        if (mes > 0 && mes < 13) {
            this.mesValidade = mes;
        } else {
            System.out.println("Esse mês é inválido Dener. \nDigite um número de 1 a 12 especificamente. ");
        }
        
    }

    //Agora vem o teste para ver se o mes digitado está dentro do prazo de validade
    public boolean estaValido(int mesAtual) {
        if (mesAtual <= this.mesValidade) {
            return true;
        } else {
            System.out.println("ALERTA: Risco de Amendoim '''mucho'''! Produto vencido!!");
            return false;
        }
    }
}