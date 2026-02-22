package main;
import java.util.Scanner;
import model.Account;
import service.AccountService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountService service = new AccountService();
        
        System.out.println("-- Seja muito bem-vindo--");
        int escolha = 0;
        
        Account myAccount = new Account (0.0);
        
        do{
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Consultar Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Transação");
                System.out.println("5 - Extrato");
                System.out.println("6 - Sair");
                escolha = sc.nextInt();

                switch (escolha) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", myAccount.getBalance());
                    System.out.println();
                    break;
            
                case 2:
                    System.out.println("Insira o valor para depositar: ");
                    double amountDeposit = sc.nextDouble();

                    try {
                        service.deposit(myAccount, amountDeposit);
                        System.out.println("Depósito realizado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    System.out.println();

                    break;

                case 3:
                    System.out.println("Digite o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    try {
                        service.withdraw (myAccount, valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    System.out.println();

                    break;

                case 4:
                    System.out.println("Nova Transação");
                    System.out.println("1 - Entrada");
                    System.out.println("2 - Saída");
                    int typeTransaction = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Descrição: ");
                    String description = sc.nextLine();

                    System.out.println("Valor: ");

                    double amount = sc.nextDouble();

                    try {
                        switch (typeTransaction) {
                        case 1:
                            service.registerTransaction(myAccount, "RECEITA", description, amount);
                            System.out.println("Recebimento registrado com sucesso!");
                            break;
                            
                        case 2:
                            service.registerTransaction(myAccount, "DESPESA", description, amount);
                            System.out.println("Pagamento registrado com sucesso!");
                            break;
                            
                        default:
                            System.out.println("Tipo de transação inválido. Operação cancelada.");
                            break;
                    }

                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                    break;

                case 5:
                    System.out.println("Saindo...");
                    System.out.println();
                    break;
                    
                case 6:
                    System.out.println("Saindo...");
                    System.out.println();
                    break;
            
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    System.out.println();
                    break;
            }
        }while (escolha != 6);
            sc.close();
        }

    }

