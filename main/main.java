package main;
import java.util.Scanner;

import model.Account;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-- Seja muito bem-vindo--");
        int escolha = 0;
        
        Account minhaConta = new Account (0.0);
        
        do{
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Consultar Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Sair");
                escolha = sc.nextInt();

                switch (escolha) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", minhaConta.getBalance());
                    System.out.println();
                    break;
            
                case 2:
                    System.out.println("Insira o valor para depositar: ");
                    break;

                case 3:
                    
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    System.out.println();
                    break;
            
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    System.out.println();
                    break;
            }
        }while (escolha != 4);
            sc.close();
        }

    }

