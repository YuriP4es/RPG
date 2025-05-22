//FASE 4
package pacote;

import java.util.Scanner;

public class Fase4 {

	// INIMIGO DA FASE 4
	public static Personagem criarInimigoFase4() {
		return new Personagem("Arkanis", 200, 20, 15, 30, 90);
	}

//MENSAGEM DE INTRODUÇÃO DA FASE 
	public static void IntruducaoFase() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("\n🌆 FASE 4: Arkanis o indomável 🌆");
		System.out.println("Uma névoa de ilusões envolve o Museu do Ipiranga, distorcendo o tempo e o espaço.");
		System.out.println("Arkanis aparece, seus olhos brilham com energia temporal...");
		System.out.println("\"Você ousa desafiar o fio que tece sua existência?\"");

	}

	// MUDAR NARRATIVA
//METODO QUE EXECUTA FASE 4 E CHAMA A INTRODUÇÃO 
	public static void iniciarFase(Personagem heroi, Scanner scanner) {
		Personagem inimigo = criarInimigoFase4();
		IntruducaoFase();

		// DIALOGO ENTRE OS PERSONAGENS
		System.out.println("\n👾 " + inimigo.getNome() + ": O Museu do Ipiranga é apenas o começo...");
		System.out.println("👾 " + inimigo.getNome()
				+ ": Liberei uma tempestade ácida que corroeu o tempo e afogou a história em poluição!");
		System.out.println("🦸 " + heroi.getNome() + ": Você manchou a memória do nosso passado com o seu veneno!");
		System.out.println("👾 " + inimigo.getNome()
				+ ": Cada relíquia afundada é uma vitória do caos! Sinta a fúria do desequilíbrio!");
		System.out.println("🦸 " + heroi.getNome()
				+ ": Então é aqui que a sua destruição termina, Arkanis. Pela história, pelo futuro!");
		System.out.println("\n🔔 Combate iniciado!");
		heroi.restaurarAtributos();
		//SIMULAÇÃO DE POLIMORFISMO, EXECUTA DIFERENTE PARA CADA TIPO DE HERÓI. pOLIMORFISMO BASEADO EM "DECISÃO PARA O VALOR DO ATRIBUTO 
		RPG.combate(heroi, inimigo, scanner); // ULTILIZA METODO DE COMBATE DA CLASSE PRINCIPAL
	}

}
