class LogicalDemo1{
	public static void main(String[] args) {
		int x =  10;
		int y = 11;

		System.out.println((++x >= y) && ( x < ++y));  // (11 >= 11) && (11 < 12) => true && true => true
		System.out.println(x); // 11
		System.out.println(y); // 12
	}
}
