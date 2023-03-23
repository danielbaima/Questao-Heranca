import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* Elabore um programa acadêmico para o cadastro de um professor
        (nome, endereço, matrícula e salário), bem como o cadastro de um
        aluno (nome, endereço, matrícula, duas notas e média). O sistema
        deve solicitar o cadastro de todos estes campos.
        Para o professor, realize o pagamento do salário deve ocorrer com
        base na quantidade de horas trabalhadas e o valor da hora aula.
        Para o aluno, informe se ele passou por média (acima de 70), se
        reprovou (abaixo de 40) ou se ele está na final (entre 40 e 70)
        */

        
        int x;
        Scanner sc = new Scanner(System.in);

        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        do {


            System.out.println("Escolha um número entre 0 (realizar cadastro professor) e 1 (Realizar cadastro aluno): ");

            int numero = sc.nextInt();
            switch (numero) {

                case 0:
                    System.out.println("Cadastrar Professor");


                    //*cadastro do professor;

                    System.out.println("Informe o nome do professor: ");
                    professor.setNome(sc.next());
                    System.out.println("Informe a idade do professor: ");
                    professor.setIdade(sc.nextInt());
                    System.out.println("Informe a especializacao do professor: ");
                    professor.setEspecializacao(sc.next());
                    System.out.println("Quantas horas você trabalhou esse mês: ");
                    professor.setHorasTrabalhadas(sc.nextInt());
                    System.out.println("Seu salário no mês será de: " +professor.salario());
                    break;
                case 1:
                    System.out.println("Cadastrar Aluno");

                    //cadastro do aluno;

                    System.out.println("Informe o nome do aluno: ");
                    aluno.setNome(sc.next());
                    System.out.println("Informe a idade do aluno: ");
                    aluno.setIdade(sc.nextInt());
                    System.out.println("Informe a nota 01 do aluno: ");
                    aluno.setNota01(sc.nextInt());
                    System.out.println("Informe a nota 02 do aluno: ");
                    aluno.setNota02(sc.nextInt());
                    aluno.calcula_media();
                    System.out.println(aluno.getMedia());

                    break;
            }
            System.out.println("Deseja continuar, digite 2: ");
            x = sc.nextInt();
        } while( x == 2);
    }

}