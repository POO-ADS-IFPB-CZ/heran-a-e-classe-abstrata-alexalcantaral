package application;

import entities.Conta;
import entities.ContaEspecial;
import entities.ContaPoupanca;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual tipo de conta você deseja criar? \n1-Conta \n2-Conta Especial \n3-Conta Poupança\n");
        System.out.print("Opção: ");
        int tipo = sc.nextInt();

        switch(tipo){
            case 1:
                System.out.println("OPÇÃO CONTA!");
                System.out.print("Informe o nome do titular? ");
                sc.nextLine();
                String nomeConta = sc.nextLine();
                Conta conta = new Conta(nomeConta, 555555);

                System.out.println("\nDados da conta:\nNome: " + conta.getTitular() + "\nNúmero: " + conta.getNumero() + "\nSaldo: " + String.format("%.2f", conta.getSaldo()));

                System.out.print("\nDigite um valor para depositar: ");
                double deposito = sc.nextDouble();
                conta.depositar(deposito);
                System.out.println("\nDados atualizados da conta:\nNome: " + conta.getTitular() + "\nNúmero: " + conta.getNumero() + "\nSaldo: " + String.format("%.2f", conta.getSaldo()));

                System.out.println("\nDigite um valor para saque: ");
                double saque = sc.nextDouble();
                conta.sacar(saque);
                System.out.println("\nDados atualizados da conta:\nNome: " + conta.getTitular() + "\nNúmero: " + conta.getNumero() + "\nSaldo: " + String.format("%.2f", conta.getSaldo()));
                ;break;
            case 2:
                System.out.println("\nOPÇÃO CONTA ESPECIAL!");
                System.out.print("Informe o nome do titular? ");
                sc.nextLine();
                String nomeContaEsp = sc.nextLine();
                ContaEspecial contaEspecial = new ContaEspecial(nomeContaEsp, 543624, 500);

                System.out.println("\nDados da conta:\nNome: " + contaEspecial.getTitular() + "\nNúmero: " + contaEspecial.getNumero() + "\nSaldo: " + contaEspecial.getSaldo() + "\nLimite: " + contaEspecial.getLimite());
                ;break;
            case 3:
                System.out.println("OPÇÃO CONTA POUPANÇA!");
                System.out.print("Informe o nome do titular? ");
                sc.nextLine();
                String nomeContaPou = sc.nextLine();
                ContaPoupanca contaPoupanca = new ContaPoupanca(nomeContaPou, 123434);

                System.out.println("\nDados da conta:\nNome: " + contaPoupanca.getTitular() + "\nNúmero: " + contaPoupanca.getNumero() + "\nSaldo: " + contaPoupanca.getSaldo());
                ;break;
        }

        sc.close();
    }
}
