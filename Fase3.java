package pacote;

import java.util.Scanner;

public class Fase3 {

   // INIMIGO FASE 3
   public static Personagem criarInimigoFase3() {
      return new Personagem("Dra. LaPollute", 150, 20, 12, 5, 115);
   }
   
   // MENSAGEM DE INTRODUÇÃO DA FASE
   public static void IntroducaoFase() {
      System.out.println("-----------------------------------------");
      System.out.println("\n\ud83c\udf06 FASE 3: A Maligna Dra. LaPollute \ud83c\udf06");
      System.out.println("O caos se instaura nos arredores do Instituto Butantã.");
      System.out.println("Uma cientista se contamina com tóxicos e se transforma em algo sobrehumano.");
      System.out.println("Agora ela ameaça a fauna e flora, pronta para destruir tudo.");
      System.out.println("Você precisa impedi-lá já!");
   }
   //METODO QUE EXECUTA FASE 3 E CHAMA A INTRODUÇÃO
   public static void iniciarFase(Personagem heroi, Scanner scanner) {
      Personagem inimigo = criarInimigoFase3();
      IntroducaoFase();

      //DIALOGO ENTRE OS PERSONAGENS
      System.out.println("\n\ud83d\udc7e " + inimigo.getNome() + ": Em breve não existirá vida que não esteja contaminada pelo meu toque.");
      System.out.println("\ud83d\udc7e " + inimigo.getNome() + ": Sente esse cheiro? É o cheiro da minha dominação!");
      System.out.println("\ud83e\uddb8 " + heroi.getNome() + ": Esse cheiro podre? Me parece mais o cheiro da sua derrota!");
      System.out.println("\ud83d\udc7e " + inimigo.getNome() + ": É o que veremos!");
      System.out.println("\ud83e\uddb8 " + heroi.getNome() + "Vai ser o seu fim!");
      System.out.println("\n\ud83d\udd14 Combate iniciado!");
      heroi.restaurarAtributos();
      
      RPG.combate(heroi, inimigo, scanner); // ULTILIZA METODO DE COMBATE DA CLASSE PRINCIPAL
   }
}
