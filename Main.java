import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome1, nome2;
        int matricula1, matricula2;
        double nota1_1, nota2_1, nota1_2, nota2_2;
        double media1, media2;

        System.out.println("Digite o nome do primeiro aluno(a):");
        nome1 = ler.nextLine();
        System.out.println("Digite a matrícula:");
        matricula1 = ler.nextInt();
        System.out.println("Digite a nota do 1º grau:");
        nota1_1 = ler.nextDouble();
        System.out.println("Digite a nota do 2º grau:");
        nota2_1 = ler.nextDouble();
        ler.nextLine();

        System.out.println("Digite o nome do segundo aluno(a):");
        nome2 = ler.nextLine();
        System.out.println("Digite a matrícula:");
        matricula2 = ler.nextInt();
        System.out.println("Digite a nota do 1º grau:");
        nota1_2 = ler.nextDouble();
        System.out.println("Digite a nota do 2º grau:");
        nota2_2 = ler.nextDouble();

        media1 = (nota1_1 + nota2_1) / 2;
        media2 = (nota1_2 + nota2_2) / 2;

        System.out.println("\n--- Informações do Aluno 1 ---");
        System.out.println("Nome: " + nome1);
        System.out.println("Matrícula: " + matricula1);
        System.out.println("Média Final: " + media1);

        System.out.println("\n--- Informações do Aluno 2 ---");
        System.out.println("Nome: " + nome2);
        System.out.println("Matrícula: " + matricula2);
        System.out.println("Média Final: " + media2);
    }
}
