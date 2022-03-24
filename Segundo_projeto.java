package segundo_Projeto;

import java.util.Scanner;

public class Segundo_projeto {

	public static void main(String[] args) {
		// Calcular a média aritmética a partir de três valores obtidos 

		Scanner input = new Scanner (System.in); 
		double nota1, nota2, nota3, media; 

		// Pedir ao usúario as três notas 

		System.out.println("Informe as três notas do aluno: ");
		//Obtendo a média
		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		nota3 = input.nextDouble();
		media = (nota1 + nota2 + nota3) / 3; 
		//Mostrando em tela valor da média e situação do aluno
		System.out.println("media é: " + media);
		if (media > 6) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
	} 

}
