package Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    String especialidade;


    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public void mostrarInformacoes(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(habilidade);
        System.out.println(nome + " tem a habilidade especial " + especialidade);
    }

}
