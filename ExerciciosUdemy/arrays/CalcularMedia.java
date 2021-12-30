package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite aqui quantos alunos voc� quer adicionar: ");
		int alunos = ler.nextInt();

		System.out.println("Digite aqui quantas notas voc� quer adicionar: ");
		int notasAluno = ler.nextInt();

		double[][] notaTurma = new double[alunos][notasAluno];
		double total = 0;

		for (int a = 0; a < notaTurma.length; a++) {
			for (int nA = 0; nA < notaTurma.length; nA++) {
				System.out.printf("Digite a nota %d do aluno %d ", (nA + 1), (a + 1));
				notaTurma[a][nA] = ler.nextDouble();
				total += notaTurma[a][nA];
			}
		}
		
		for(double[] notasInformadas: notaTurma) {
			System.out.println(Arrays.toString(notasInformadas));
		}
		
		double media = total / (alunos * notasAluno);
		System.out.println("As M�dia de notas da Turma foi de: " + media);
		
		ler.close();
	}
}
