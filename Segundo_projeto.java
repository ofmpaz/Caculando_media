package segundo_Projeto;

import java.util.Scanner;

public class Segundo_projeto {

	public static void main(String[] args) {
		// Calcular a m�dia aritm�tica a partir de tr�s valores obtidos 

		Scanner input = new Scanner (System.in); 
		double nota1, nota2, nota3, media; 

		// Pedir ao us�ario as tr�s notas 

		System.out.println("Informe as tr�s notas do aluno: ");
		//Obtendo a m�dia
		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		nota3 = input.nextDouble();
		media = (nota1 + nota2 + nota3) / 3; 
		//Mostrando em tela valor da m�dia e situa��o do aluno
		System.out.println("media �: " + media);
		if (media > 6) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
	} 

}
