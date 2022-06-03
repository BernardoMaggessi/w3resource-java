package Basicprogpt2;

public class Exercicio154 {

	public static void main(String[] args) {
		boolean[][] array = { { true, false, true }, { false, true, false } };

		int rows_len = array.length;
		int col_len = array[0].length;

		for (int i = 0; i < rows_len; i++) {
			for (int j = 0; j < col_len; j++) {
				if (array[i][j])
					System.out.print("t");
				else
					System.out.print("f");
			}
			System.out.println();
		}

	}

}
