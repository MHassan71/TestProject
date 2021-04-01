package operator;

import java.util.Scanner;

public class VowelConsonant {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char alph;
		
	    System.out.print("Enter any letter: ");
	    
	    alph = input.next().charAt(0);
	    
	    if (alph == 'a' ||alph == 'e' ||alph == 'i'||alph == 'o'||alph == 'u' ||alph == 'A'||alph == 'E'||alph == 'I'||alph == 'O'||alph == 'U') {
	    	
	    	System.out.println("This letter is vowel");
	    }
	    
	    else {
	    	System.out.println("This letter is consonant");
	    }
	}

}
