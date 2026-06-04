package Aula12.Desafio;

public class teste {
    public static void main(String[] args){

    //preenchi os constructos
    Insumo Caixa_de_amendoim_1 = new Insumo("amendoim", 20, 11);
    Insumo Caixa_de_amendoim_2 = new Insumo("miodnema", 12, 3);
    Insumo Caixa_de_amendoim_3 = new Insumo("amendoim", 20, 10);

    //testando nossas validações de validades
    // ( Buguei nessa parte porque o mes já tinha sido definido antes, mas entendi que é para simular uma alteração do atributo :) 
    Caixa_de_amendoim_1.setMesValidade(11);
    Caixa_de_amendoim_2.setMesValidade(3);
    Caixa_de_amendoim_3.setMesValidade(1325);

    //testando o outro método
    Caixa_de_amendoim_1.estaValido(5);
    Caixa_de_amendoim_2.estaValido(5);
    }

    
}
    