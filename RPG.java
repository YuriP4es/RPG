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
		darOi();

	}
    private static void darOi() { // METODO PARA TESTE DEPOIS EXCLUIR
		System.out.println("OOOOOOOIIIII");
		
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
            heroi = new Personagem("Bruxinha Rabuda", 120, 20, 10, 25, 40);
            break;
        }
        
        //coisas que faltam fazer
        //criar um metodo só incializar o inimigo
        //fazer um metodo para o combate 
        //fazer um metodo com as fases 
        //fazer metodos de poções para aumentar o valor dos atributos
        
    }
    
    
    
    
}
