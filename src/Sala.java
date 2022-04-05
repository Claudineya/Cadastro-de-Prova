import alunos.Cadastro;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

    public class Sala {
        public static void main(String[] args) throws Exception {
            System.out.println("---CADASTRO DE PROVA---");

            int option;

            do {
                System.out.println("1 - Aloisio");
                System.out.println("2 - Amanda ");
                System.out.println("3 - Veronica ");
                System.out.println("0 - Sair");

                Scanner scanner = new Scanner(System.in);

                System.out.print("Qual dos alunos deseja selecionar: ");
                option = scanner.nextInt();
                process(option);
            } while (option != 0);

        }

        public static void process(int option) throws Exception {
            switch (option) {
                case 1: {
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Matéria da prova: ");
                    String descrição = scanner.nextLine();

                    System.out.print("Qual a Nota da Prova:");
                    int nota = scanner.nextInt();

                    System.out.print(" Qual a data da Prova:");
                    String dataString = scanner.next();

                    Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);



                    Cadastro novoCadastro = new Cadastro(nota, descrição,data);

                    System.out.println("Nota armazenada com sucesso:");
                    System.out.println("---Nota:" + novoCadastro.getNota());
                    System.out.println("---Descrição:" + novoCadastro.getDescrição());
                    System.out.println("---Data da Prova:" + novoCadastro.getData());
                    System.out.println("------------------------------");
                }
                break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

        }
    }
