//FASE 1
package pacote;
import java.util.Scanner;


public class Fase1RPG {
	
	//INIMIGO DA FASE 1
	public static Personagem criarInimigoFase1RPG() {
		return new Personagem(" Big Trash ", 200, 20, 20, 0, 40);  
		}

//MENSAGEM DE INTRODUÇÃO DA FASE 
	public static void IntruducaoFase() {
		System.out.println("\n🌆 FASE 1: A ameaça do Big Trash 🌆 "); //
		System.out.println("Um monstro feito de lixo toxico surgiu na Avenida Paulista.");
		System.out.println("Ele esta espalhando poluição e ameaçando a saúde da população!");
		System.out.println("Você deve derrotá-lo para salvar São Paulo");
		
	
	}
	
//METODO QUE EXECUTA FASE 1 E CHAMA A INTRODUÇÃO 
	public static void iniciarFase(Personagem heroi, Scanner scanner) {
		Personagem inimigo = criarInimigoFase1RPG();
		IntruducaoFase();
		
		//DIALOGO ENTRE OS PERSONAGENS
		System.out.println("\n👾 " + inimigo.getNome() + ": Hahaha! Eu sou Big Trash, o criador do caos urbano!");
		System.out.println("👾 " + inimigo.getNome() + ": Com meu hálito tóxico e minha armadura de lixo, ninguém vai me parar!");
		System.out.println("🦸 " + heroi.getNome() + ": Tóxico? Você devia ser interditado pela vigilância sanitária!");
		System.out.println("👾 " + inimigo.getNome() + ": Chega de papo! Prepare-se para o meu ataque!");
		System.out.println("🦸 " + heroi.getNome() + ": Eu vou te reciclar, Big Trash!");
		System.out.println("\n🔔 Combate iniciado!");

		
		RPG.combate(heroi, inimigo, scanner); //ULTILIZA METODO DE COMBATE DA CLASSE PRINCIPAL 
		}
	
}
