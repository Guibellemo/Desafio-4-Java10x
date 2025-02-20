package Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico() {
    }

    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(habilidade);

    }


    public void executarHabilidade() {
        System.out.println(nome + " executou " + habilidade);

    }

}
