
/*
 * WAP to check  whether the char is  uppercase or lower case 
 *
 */

import java.util.*;

class CheckUpperLowerChar{
	public static void main(String[] args ){
		
		char ch = 'A';

		if(ch >= 'A' && ch <= 'Z'){
			System.out.println(ch + " is UpperCase");
		}
		else if(ch >= 'a' && ch <= 'z'){
			System.out.println(ch + " is LoweerCase");
		}else{
			 System.out.println(ch + " is Invalid Char ");
		}

	}
}
