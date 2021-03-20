package br.com.cadastro;
import java.util.Scanner;

public class MainCadastro {
    public static void main(String[]args){
        CrudTeste crud = new CrudTeste();
        ConnectionFactory cf = new ConnectionFactory();

        Scanner in= new Scanner(System.in);

        int valor;
        int n;

        System.out.println("=============================================");
        System.out.println("IDs no banco de dados...\n");
        crud.select();
        System.out.println("=============================================\n");
        System.out.println("Digite o número para opção desejada:\n1 - Cadastrar\n2 - Procurar\n3 - Alterar\n4 - Excluir");
        valor = in.nextInt();

        switch (valor) {
            case 1:
                crud.insert();
                crud.select();

                break;
            case 2:
                crud.select();
                break;
            case 3:
                crud.update();
                crud.select();

                break;
            case 4:
                crud.delete();
                crud.select();

                break;
            default:
                System.out.println("Opção desconhecida");
        }
        System.out.println("\n---------------------------------\nDeseja consultar novamente?\n1 - Sim\n2 - Não");
        n = in.nextInt();

        while (n == 1){//laço de repetição esquesito, porém funcional
            System.out.println("=============================================\n");
            System.out.println("Digite o número para opção desejada:\n1 - Cadastrar\n2 - Procurar\n3 - Alterar\n4 - Excluir");
            valor = in.nextInt();
            switch (valor) {
                case 1:
                    crud.insert();
                    crud.select();
                    break;
                case 2:
                    crud.select();
                    break;
                case 3:
                    crud.update();
                    crud.select();

                    break;
                case 4:
                    crud.delete();
                    crud.select();

                    break;
                default:
                    System.out.println("Opção desconhecida");
            }
            System.out.println("---------------------------------\nDeseja consultar outro nome?\n1 - Sim\n2 - Não");
            n = in.nextInt();

            if(n == 2){
                System.out.println("Ok, obrigado por consultar.");
            }
            else if(n != 1 && n != 2){
                System.out.println("Operação desconhecida.");
            }
        }
    }
}