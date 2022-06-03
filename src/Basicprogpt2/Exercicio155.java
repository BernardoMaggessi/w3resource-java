package Basicprogpt2;

public class Exercicio155 {
	private static void trans(int[][] mat) {
		
		int[][] newVect = new int[mat[0].length][mat.length];
		
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat[0].length;j++) {
				newVect[j][i] = mat[i][j];
			}
		printArray(newVect);

	} 
	private static void printArray(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.println(mat[i][j]+" ");
			}
		}
	}
	

	public static void main(String[] args) {
		int[][] matriz = {{10,20,30},{40,50,60}};
		
		System.out.println("Original array: ");
		printArray(matriz);;
		System.out.println("Tranformed array: ");
		trans(matriz);
		
		

	}

}
