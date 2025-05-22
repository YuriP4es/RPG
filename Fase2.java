package pacote;

import java.util.Scanner;

public class Fase2{
	public static Personagem criarInimigoFase2() {
	    return new Personagem("Barão Esgoto", 125, 20, 11, 3, 60);
	}

	public static void introducaoFase() { //Introdução da fase 2, seguindo o padrão das outras fases
		
		System.out.println("-----------------------------------------");
	    System.out.println("\n\ud83c\udf0a FASE 2: O Terror Borbulhante do Barão Esgoto! \ud83c\udf0a");
	    System.out.println("As águas fétidas do Rio Tietê ferveram com uma nova ameaça!");
	    System.out.println("Direto das profundezas poluídas, surge o Barão Esgoto, um lorde da sujeira!");
	    System.out.println("Ele comanda um exército de lodo e planeja afogar São Paulo em seu caldo tóxico!");
	    System.out.println("Você precisa dar um basta nesse banho de imundice!");
	}

	public static void iniciarFase(Personagem heroi, Scanner scanner) {
	      Personagem inimigo = criarInimigoFase2();
	      introducaoFase(); // Chama a introdução da Fase 2
	      // Diálogo entre herói e inimigo, seguindo o padrão das outras fases
	      System.out.println("\n\ud83d\udc7e " + inimigo.getNome() + ": Glub glub! Bem-vindo ao meu reino aquático de poluição!");
	      System.out.println("\ud83d\udc7e " + inimigo.getNome() + ": Minhas ondas tóxicas vão engolir toda São Paulo, começando por você!");
	      System.out.println("\ud83e\uddb8 " + heroi.getNome() + ": Seu reinado de sujeira acaba aqui! Já está na hora de um banho de limpeza!");
	      System.out.println("\ud83d\udc7e " + inimigo.getNome() + ": Insolente! Vou te afogar no meu caldo de dejetos industriais!");
	      System.out.println("\ud83e\uddb8 " + heroi.getNome() + ": Vou te mandar pelo ralo, Barão! Prepare-se para ser filtrado!");
	      System.out.println("\n\ud83d\udd14 Combate iniciado!");
	      heroi.restaurarAtributos();
		//SIMULAÇÃO DE POLIMORFISMO, EXECUTA DIFERENTE PARA CADA TIPO DE HERÓI. pOLIMORFISMO BASEADO EM "DECISÃO PARA O VALOR DO ATRIBUTO 
	      RPG.combate(heroi, inimigo, scanner); // Chama o método de combate padrão
   }
}
 
