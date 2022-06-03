package Basicprogpt2;

public class Exercicio151 {

	public static void main(String[] args) {
		int expressaoA = (101+0)/3;
		double expressaoB = 3.0e-6 * 10000000.1;
		boolean expressaoC = true && true;
		boolean expressaoD = false && true;
		boolean expressaoE = (false && false)||(true && true) ;
		boolean expressaoF =(false||false) && (true && true) ;
		
		System.out.println("(101+0)/3 -> "+expressaoA);
		System.out.println("(3.0e-6 * 10000000.1) -> "+expressaoB);
		System.out.println("(true && true)-> "+expressaoC);
		System.out.println("(false && true)-> "+expressaoD);
		System.out.println("((false && false)||(true&&true))-> "+expressaoE);
		System.out.println("(false||false) && (true&true))-> "+expressaoF);

	}

}
