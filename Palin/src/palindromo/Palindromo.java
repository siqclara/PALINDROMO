package palindromo;

import java.util.Stack;

public class Palindromo {

		Stack<Character> p = new Stack<Character>();
		StringBuilder verifica = new StringBuilder();

		public void inverte(String palavra) {
			for(int cont=0; cont<palavra.length(); cont++) {
				p.push(palavra.charAt(cont));
			}
			
			while(!p.isEmpty()) {
				verifica.append(p.pop());
			}

			this.verifica(palavra);
			
		}
		
		public void verifica(String palavra) {
			if(palavra.equals(verifica.toString())) {
				System.out.println("palindromo");
			}else {
				System.out.println("Não");
			}
		}
	 
	}

