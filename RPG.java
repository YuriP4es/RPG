package pacote;

import java.util.Random;
import java.util.Scanner;
//ramdom para numero aleatorio e scanner parar o input do usuario

public class RPG {
	// declarando heroi, inimigo, input e random
	public static Scanner scanner = new Scanner(System.in);
	public static Random random = new Random();
	public static Personagem heroi;
	public static Personagem[] inimigos = new Personagem[3];
	public static int inimigoAtual = 0;

	public static void main(String[] args) {
		escolherHeroi();

		// INICIA A PRIMERA FASE DO JOGO
		Fase1RPG.iniciarFase(heroi, scanner);

		// FINALIZAÇÃO DO JOGO
		System.out.println("\n🏆 Parabéns! Você venceu o vilão da fase 1 e ajudou a limpar São Paulo!");
		System.out.println("Preparado para a próxima fase? (Digite 'sim' para continuar)");
		String resposta = scanner.nextLine();

		// Para outras fases colocar condicionais aqui acima (porém preciso verificar do
		// porque dela não está funcionando.)
		if (resposta.equalsIgnoreCase("sim")) {
			Fase4.IntruducaoFase(); // Aqui chama a fase 4
			Fase4.iniciarFase(heroi, scanner); 
		} else {
			System.out.println("Ok! Volte quando estiver pronto.");
			System.exit(0);
		}
	}

	// metodo para escolher o personagem
	public static void escolherHeroi() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("Escolha seu Herói");
		System.out.println(
				"1. Bruxinha Rabuda, a Bruxa (Vida: 200, Ataque: 20, Defesa: 10, Magia: 25, Inteligência: 40)");
		System.out.println(
				"2. Cavaleiro Otário, o Cavaleiro (Vida: 200, Ataque: 25, Defesa: 8, Magia: 15, Inteligência: 75)");
		System.out.println(
				"3. Roberto Hood, o Arqueiro (Vida: 200, Ataque: 15, Defesa: 12, Magia: 20, Inteligência: 55)");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		int escolha = scanner.nextInt(); // input que usuario bota a escolha dele
		scanner.nextLine(); // consumir a quebra de linha

		// fazendo a escolha ja instanciando os personagens e criando o objeto
		switch (escolha) {
		case 1:
			heroi = new Personagem("Bruxinha Rabuda", 200, 20, 10, 25, 40);
			System.out.println("Você escolheu Bruxinha Rabuda, a Bruxa");
			break;
		case 2:
			heroi = new Personagem("Cavaleiro Otário", 200, 25, 8, 15, 75);
			System.out.println("Você escolheu Cavaleiro Otário, o Cavaleiro");
			break;
		case 3:
			heroi = new Personagem("Roberto Hood", 200, 15, 12, 20, 55);
			System.out.println("Você escolheu Roberto Hood, o Arqueiro");
			break;
		default:
			System.out.println("Escolha inválida. Você será Bruxinha Rabuda por padrão.");
			heroi = new Personagem("Bruxinha Rabuda", 200, 20, 10, 25, 40);
			break;
		}

	}

	// INICIANDO PROGRAMAÇÃO DA FASE 1 (BIANKA)
	public static void combate(Personagem heroi, Personagem inimigo, Scanner scaner) {
		while (heroi.getVida() > 0 && inimigo.getVida() > 0) {
			System.out.println("\n --- Combate ---");
			System.out.println("Sua vida: " + heroi.getVida() + "| Magia: " + heroi.getMagia());
			System.out.println("Inimigo: " + inimigo.getNome() + "Vida: " + inimigo.getVida());
			System.out.println("1. Atacar ");
			System.out.println("2. Usar magia ");

			System.out.println("Escolha seu ataque: ");
			int acao = scanner.nextInt();
			scanner.nextLine(); // LIMPA QUEBRA DE LINHA

			// CASE 1 SE O JOGADOR ESCOLHER ATAQUE E CASE 2 SE O JOGADOR ESCOLHER MAGIA
			switch (acao) {
			case 1:
				heroi.atacar(inimigo);
				break;
			case 2:
				System.out.println("Digite o tipo de magia (fogo, agua pu terra): ");
				String tipoMagia = scanner.nextLine();
				heroi.usarMagia(inimigo, tipoMagia);
				break;
			default:
				System.out.println("Ação inválida. Você perdeu sua vez!");
				break;

			}

			// TURNO DO INIMIGO
			if (inimigo.getVida() > 0)
				;
			{
				inimigo.atacar(heroi);
			}

		}

		// VERIFICA O VENCEDOR
		if (heroi.getVida() > 0) {
			System.out.println("\n✔ " + heroi.getNome() + " venceu o inimigo!");
		} else {
			System.out.println("\n❌ Você foi derrotado...");
			System.exit(0);

		}

	}

//INICIANDO PROGRAMAÇÃO DA FASE 4 (ANA CLARA)
	private static void Fase4() {
		// TODO Auto-generated method stub
		// classe metodo criado somente para realização de teste, pois estava dando erro
		// sem ele...(Mesmo assim não consegui testar, pois a condicional acima para
		// passar para
		// outra fase não está funcionando...)

	}

	public static void Combate(Personagem heroi, Personagem inimigo, Scanner scaner) {
		int especiais = 3;

		while (heroi.getVida() > 0 && inimigo.getVida() > 0) {
			System.out.println("\n --- Combate ---");
			System.out.println("Sua vida: " + heroi.getNome() + " | Vida: " + heroi.getVida());
			System.out.println("Inimigo: " + inimigo.getNome() + " | Vida: " + inimigo.getVida());
			System.out.println("Você tem " + especiais + " ataques especiais restantes.");

			System.out.println("\nEscolha seu ataque:");
			System.out.println("1. Ataque normal");
			System.out.println("2. Ataque especial");

			int escolha = scanner.nextInt();
			double dano = 0;

			switch (escolha) {
			case 1:
				dano = heroi.getAtaque() - inimigo.getDefesa() / 2;
				System.out.println(heroi.getNome() + " atacou com força!");
				break;
			case 2:
				if (especiais > 0) {
					dano = heroi.getMagia() + random.nextInt(10);
					System.out.println(heroi.getNome() + " lançou um feitiço poderoso!");
					especiais--;
				} else {
					System.out.println("Você não tem ataques especiais restantes!");
					continue;
				}
				break;
			default:
				System.out.println("Escolha inválida. Você perdeu o turno.");
				break;
			}

			if (heroi.getVida() <= 0) {
				System.out.println("Você foi derrotado por Arkanis...");
			} else {
				System.out.println("Você derrotou Arkanis e rompeu os fios do destino!");
			}
		}
	}
}
