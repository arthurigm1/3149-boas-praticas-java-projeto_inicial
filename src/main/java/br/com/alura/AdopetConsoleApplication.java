package br.com.alura;

import br.com.alura.Client.Httpdisparar;
import br.com.alura.Services.AbrigoService;
import br.com.alura.Services.PetService;
import java.util.Scanner;

public class AdopetConsoleApplication {

    public static void main(String[] args) {
        Httpdisparar httpdisparar = new Httpdisparar();
        AbrigoService abrigoService = new AbrigoService(httpdisparar);
        PetService petService = new PetService(httpdisparar);
        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
                System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
                System.out.println("1 -> Listar abrigos cadastrados");
                System.out.println("2 -> Cadastrar novo abrigo");
                System.out.println("3 -> Listar pets do abrigo");
                System.out.println("4 -> Importar pets do abrigo");
                System.out.println("5 -> Sair");

                String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);

                if (opcaoEscolhida == 1) {
                    abrigoService.listarabrigos();

                } else if (opcaoEscolhida == 2) {
                    abrigoService.CadastrarAbrigo();

                } else if (opcaoEscolhida == 3) {
                    petService.listarpets();
                } else if (opcaoEscolhida == 4) {
                    petService.importarpets();
                } else if (opcaoEscolhida == 5) {
                    break;
                } else {
                    System.out.println("NÚMERO INVÁLIDO!");
                    opcaoEscolhida = 0;
                }
            }
            System.out.println("Finalizando o programa...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




  }
