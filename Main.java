package Desafio4;


public class Main {
    public static void main(String[] args) {

        Ninja sakura = new NinjaBasico("Sakura",18,"Cura");
        sakura.mostrarInformacoes();
        sakura.executarHabilidade();

       Ninja naruto = new NinjaAvancado("Naruto",17, "Rasengan", "Ar");
       naruto.mostrarInformacoes();
       naruto.executarHabilidade();

    }
}
