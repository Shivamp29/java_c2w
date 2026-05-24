/*
 * WAP to check whether the given char is vowel or Consonant
 */
import java.util.Scanner;

class Program03{
	public static void main(String[] args){
	
		char ch = 'a' ;
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
			System.out.println(ch + " is vowel");
		}else if( ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
			System.out.println(ch + " is consonant");
		}
		else{
			System.out.println(" Invalid char");
		}

	}
}
