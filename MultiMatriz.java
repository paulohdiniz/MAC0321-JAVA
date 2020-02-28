import java.util.*;
import java.lang.*;
public class MultiMatriz {
	public static void main(String[] args) {
		Scanner linhas = new Scanner (System.in);
	//Lendo numero de linhas e colunas da matriz 1
		System.out.println("Digite a quantidade de linhas da matriz 1: ");
		int qtdlinhas1 = linhas.nextInt();
		System.out.println("Digite a quantidade de colunas da matriz 1: ");
		int qtdcolunas1 = linhas.nextInt();
	//Lendo numero de linhas e colunas da matriz 2
		System.out.println("Digite a quantidade de linhas da matriz 2: ");
		int qtdlinhas2 = linhas.nextInt();
		System.out.println("Digite a quantidade de colunas da matriz 2: ");
		int qtdcolunas2 = linhas.nextInt();
	//Condição de existência para multiplicação
		if (qtdcolunas1 != qtdlinhas2) {
			System.out.println("Suas matrizes são incompatíves para multiplicação");
			System.exit(0);
		}else {
			double M1[][] = CriaMatriz(qtdlinhas1, qtdcolunas1);
			double M2[][] = CriaMatriz(qtdlinhas2, qtdcolunas2);
			
			double MatRes[][] = MultiplicaMatriz(M1, M2, qtdlinhas1, qtdcolunas2, qtdlinhas2);
			for(int i = 0; i < qtdlinhas1; i++) {
				for(int j = 0; j < qtdcolunas2; j++) {
					System.out.print(MatRes[i][j] + " ");
				}
			System.out.println();
			}
		}
	}
	
	public static double[][] CriaMatriz(int linhas, int colunas) {
		double Matriz[][] = new double[linhas][colunas];
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				Scanner valor = new Scanner (System.in);
				Matriz[i][j] = valor.nextDouble();
			}
		}
	return Matriz;
	}
	public static double[][] MultiplicaMatriz(double MatrizA[][], 
			double MatrizB[][], int qtdlinhas1, int qtdcolunas2, int qtdlinhas2){
		double temp = 0;
		double MatrizRes[][] = new double[qtdlinhas1][qtdcolunas2];
		for (int i = 0; i < qtdcolunas2; i++) {
			for(int j = 0; j < qtdlinhas1; j++) {
				for (int k = 0; k < qtdlinhas2; k++) {
					temp += MatrizA[i][k]*MatrizB[k][j];
					MatrizRes[i][j] = temp;
				}
				temp = 0;

			}
		}
	return MatrizRes;
	}
}
