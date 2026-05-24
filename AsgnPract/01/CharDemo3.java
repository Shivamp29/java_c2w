
/*
 * it will throught the error : "Unclosed character literal : not a statement "
 *
 * bcz char is written in single quotes only
 *
 * */


class CharDemo3{
	public static void main(String[] args){
		char ch;
		ch= '97';
		System.out.println("Char : " +ch);
		System.out.println("Char : " + ch+1);
	}
}
