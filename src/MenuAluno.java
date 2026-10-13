import java.util.Locale;
import java.util.Scanner;

import Dominio.Aluno;

public class MenuAluno {

    public void executar(){
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

         System.out.println("---- Cadastro Aluno ---");

        System.out.println("Digite o Codigo: ");
        int Codigo = scan.nextInt();
        scan.nextInt();

        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = scan.nextLine();

        System.out.println("Digite o Matricula: ");
        String matricula = scan.nextLine();

        System.out.println("Digite o nota: ");
        Double nota = scan.nextDouble();

        Aluno a1 = new Aluno(Codigo, cpf, nome, matricula);
        a1.setNota(nota);

        scan.close();

        a1.exibir();
    }
}