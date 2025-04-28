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
        System.out.println("-------------------------------------------------------------------------------------------------");
        Fase1.iniciarFase(heroi, scanner);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\n\ud83c\udfc6 Parabéns! Você venceu o vilão da fase 1 e ajudou a limpar São Paulo!");
        
        System.out.println("Preparado para a próxima fase? (Digite 'sim' para continuar)");
        String respostaFase2 = scanner.nextLine(); 
        if (respostaFase2.equalsIgnoreCase("sim")) {
      	 Fase2.introducaoFase(); 
           Fase2.iniciarFase(heroi, scanner); 
        } else {
           System.out.println("Ok! Volte quando estiver pronto.");
           System.exit(0);
        }
        
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\n\ud83c\udfc6 Parabéns! Você venceu o vilão da fase 2!");
        
        System.out.println("Preparado para a próxima fase? (Digite 'sim' para continuar)");
        String respostaFase3 = scanner.nextLine();
        if (respostaFase3.equalsIgnoreCase("sim")) {
           Fase3.IntroducaoFase();
           Fase3.iniciarFase(heroi, scanner);
        } else {
           System.out.println("Ok! Volte quando estiver pronto.");
           System.exit(0);
        }
        
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\n\ud83c\udfc6 Parabéns! Você venceu o vilão da fase 3 e ajudou mais uma vez a limpar São Paulo!");
        
        System.out.println("Preparado para a próxima fase? (Digite 'sim' para continuar)");
        String respostaFase4 = scanner.nextLine();
        if (respostaFase4.equalsIgnoreCase("sim")) {
           Fase4.IntruducaoFase();
           Fase4.iniciarFase(heroi, scanner);
        } else {
           System.out.println("Ok! Volte quando estiver pronto.");
           System.exit(0);
        }

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\n\ud83c\udfc6 Parabéns! Você venceu o vilão da fase 4 e finalmente livrou São Paulo da Poluição, Obrigado por Jogar!! ");
    	
	}
    
		
	
	// metodo para escolher o personagem
    public static void escolherHeroi() {
    	System.out.println("-------------------------------------------------------------------------------------------------");
    	System.out.println("Escolha seu Herói");
        System.out.println("1. Bruxinha Rabuda, a Bruxa (Vida: 120, Ataque: 20, Defesa: 10, Magia: 25, Inteligência: 40)");
        System.out.println("2. Cavaleiro Otário, o Cavaleiro (Vida: 100, Ataque: 25, Defesa: 8, Magia: 15, Inteligência: 75)");
        System.out.println("3. Roberto Hood, o Arqueiro (Vida: 150, Ataque: 15, Defesa: 12, Magia: 20, Inteligência: 55)");
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        int escolha = scanner.nextInt(); //input que usuario bota a escolha dele
        scanner.nextLine(); // consumir a quebra de linha
        
        // fazendo a escolha ja instanciando os personagens e criando o objeto
        switch (escolha) {
        case 1:
        	heroi = new Personagem("Bruxinha Rabuda", 120 , 20 , 10 , 25 , 40);
        	System.out.println("Você escolheu Bruxinha Rabuda, a Bruxa");
        	break;
        case 2:
        	heroi = new Personagem("Cavaleiro Otário" , 100 , 25 , 8 , 15 , 75);
        	System.out.println("Você escolheu Cavaleiro Otário, o Cavaleiro");
        	break;
        case 3:
        	heroi = new Personagem("Roberto Hood" , 150 , 15 , 12 , 20 , 55);
        	System.out.println("Você escolheu Roberto Hood, o Arqueiro");
        	break;
        default:
        	System.out.println("Escolha inválida. Você será Bruxinha Rabuda por padrão.");
            heroi = new Personagem("Bruxinha Rabuda", 120 , 20 , 10 , 25 , 40);
            break;
        }
        
        
        }
        
      //INICIANDO PROGRAMAÇÃO DA FASE 1 (BIANKA)
	    public static void combate(Personagem heroi, Personagem inimigo, Scanner scaner) {
	    while (heroi.getVida() > 0 && inimigo.getVida() > 0) {
	    	System.out.println("\n --- Combate ---");
	    	System.out.println("Sua vida: " + heroi.getVida() + "| Magia: " + heroi.getMagia());
	    	System.out.println("Inimigo: " + inimigo.getNome() + "Vida: " + inimigo.getVida());
	    	System.out.println("1. Atacar ");
	    	System.out.println("2. Usar magia ");
	    	
	    	System.out.println("Escolha seu ataque: ");
	    	int acao = scanner.nextInt();
	    	scanner.nextLine(); //LIMPA QUEBRA DE LINHA 
	    	
	    	//CASE 1 SE O JOGADOR ESCOLHER ATAQUE E CASE 2 SE O JOGADOR ESCOLHER MAGIA 
	    	switch (acao) { 
	    	case 1: 
	    		heroi.atacar(inimigo);
	    		break;
	    	case 2:
	    		System.out.println("Digite o tipo de magia (Fogo, Água ou Terra): ");
	    		String tipoMagia = scanner.nextLine();
	    		heroi.usarMagia(inimigo, tipoMagia);
	    		break;
	    	default:
	    		System.out.println("Ação inválida. Você perdeu sua vez!");
	    		break;
	    		
	    		}
	    	
	    	//TURNO DO INIMIGO 
	    	if (inimigo.getVida() > 0); {
	    		inimigo.atacar(heroi);
	    	}
	    	
	   }
	    
	    //VERIFICA O VENCEDOR 
	    if (heroi.getVida() > 0) {
	    	System.out.println("\n✔ " + heroi.getNome() + " venceu o inimigo!");
	    } else {
	    	System.out.println("\n❌ Você foi derrotado...");
	    	System.exit(0);
	    	
	    }
	    
	
        //coisas que faltam fazer
       
        //fazer metodos de poções para aumentar o valor dos atributos
        
    }




			
}

    
    
    

