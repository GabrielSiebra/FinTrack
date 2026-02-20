import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-- Seja muito bem-vindo--");
        int escolha = 0;
        
        
        do{
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Sair");
                escolha = sc.nextInt();

                switch (escolha) {
                case 1:
                    
                    break;
            
                case 2:
                    
                    break;

                case 3:
                    
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    break;
            }
        }while (escolha != 4);
            sc.close();
        }

    }

