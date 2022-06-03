package Strings;

public class Exercicio03 {

	public static void main(String[] args) {
		String original = "w3resource.com";
		
		System.out.println("original string : "+original);

		System.out.println("Character(unicode point) = "+original.codePointAt(1));
		System.out.println("Character(unicode point) = "+original.codePointAt(9));
		
	}

}
