package pacote;

import java.util.Scanner;

public class Fase1 {
   public static Personagem criarInimigoFase1RPG() {
      return new Personagem(" Big Trash ", 200.0D, 20.0D, 10.0D, 0.0D, 40.0D);
   }

   public static void IntruducaoFase() {
      System.out.println("\n\ud83c\udf06 FASE 1: A ameaça do Big Trash \ud83c\udf06 ");
      System.out.println("Um monstro feito de lixo toxico surgiu na Avenida Paulista.");
      System.out.println("Ele esta espalhando poluição e ameaçando a saúde da população!");
      System.out.println("Você deve derrotá-lo para salvar São Paulo");
   }

   public static void iniciarFase(Personagem heroi, Scanner scanner) {
      Personagem inimigo = criarInimigoFase1RPG();
      IntruducaoFase();
      System.out.println("\n\ud83d\udc7e " + inimigo.getNome() + ": Hahaha! Eu sou Big Trash, o criador do caos urbano!");
      System.out.println("\ud83d\udc7e " + inimigo.getNome() + ": Com meu hálito tóxico e minha armadura de lixo, ninguém vai me parar!");
      System.out.println("\ud83e\uddb8 " + heroi.getNome() + ": Tóxico? Você devia ser interditado pela vigilância sanitária!");
      System.out.println("\ud83d\udc7e " + inimigo.getNome() + ": Chega de papo! Prepare-se para o meu ataque!");
      System.out.println("\ud83e\uddb8 " + heroi.getNome() + ": Eu vou te reciclar, Big Trash!");
      System.out.println("\n\ud83d\udd14 Combate iniciado!");
      RPG.combate(heroi, inimigo, scanner);
   }
}

