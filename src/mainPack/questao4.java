package mainPack;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int pi = 0, pp = 0, i;
		int valores[] = new int[10];
		for (i = 0; i <= 9; i++) {
			System.out.print("Informe o valor " + (i + 1) + ":");
			valores[i] = leia.nextInt();

			if (valores[i] % 2 == 0) {
				pp++;
			} else {
				pi++;
			}
		}
		System.out.print("No vetor foram inseridos " + pp + " números páres, \n que representam um total de " + (pp * 10)
				+ "%, e " + pi + " números ímpares, \n que resultal em " + (pi * 10) + "% dos valores inseridos");

	

	}

}
