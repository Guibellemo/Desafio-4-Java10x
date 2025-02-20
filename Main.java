package Desafio4;


public class Main {
    public static void main(String[] args) {
        Ninja sakura = new NinjaBasico("Sakura",18,"GENJUTSU");
        sakura.mostrarInformacoes();
        sakura.executarHabilidade();



       Ninja naruto = new NinjaAvancado("Naruto",17, "NINJUTSU", "Rasengan");
       naruto.mostrarInformacoes();
       naruto.executarHabilidade();

    }
}
