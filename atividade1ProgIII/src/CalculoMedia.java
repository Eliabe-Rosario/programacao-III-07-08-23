import br.edu.umfg.tecnologia.Aluno;

import java.util.Scanner;

public class CalculoMedia extends Aluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULO DE MÉDIA");

        System.out.println("Digite seu nome");
        aluno.setNomeAcademico(scanner.next());

        System.out.println("Digite seu registro acadêmico");
        aluno.setRegistroAcademico(scanner.next());

        System.out.println("Digite a nota da prova1");
        aluno.setProva1(Double.parseDouble(scanner.next()));

        System.out.println("Digite a nota da prova2");
        aluno.setProva1(Double.parseDouble(scanner.next()));

        System.out.println("Digite a nota de trabalho");
        aluno.setTrabalho(Double.parseDouble(scanner.next()));

        System.out.println("Resultado:" + "" + aluno + " " + "Média:" +
                aluno.getMedia());
        System.out.printf("situação:" + " " + aluno.situacao());


    }
}