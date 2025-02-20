package Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = TipoHabilidade.valueOf(habilidade);

    }



    public NinjaBasico() {
    }

    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println("Este ninja usa " + habilidade);

    }


    public void executarHabilidade() {
        System.out.println(nome + " executou " + habilidade);

    }

}
