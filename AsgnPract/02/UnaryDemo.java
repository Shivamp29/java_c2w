 class UnaryDemo{
 	public static void main(String[] args){
		int x = 19;

		System.out.println( (++x) + (x++)); // 20 + 20 => 40 
		System.out.println( (++x) + (x++) + (++x) ); // 22 + 23 + 25 = 68
							    
		int x1 = 14 ;
		int y1 = 22;

		int res = (++x1) + (y1++);
		int res1 = (x1++) + (++y1) + (++x1) + (++x1);
		int res2 = (y1++) + (++x1) + (++x1);

		System.out.println("res : "+res);
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);

		int x2 = 0;
		int res3 = (++x2) + (++x2) + (++x2) + (++x2);
		int res4 = (x2++) + (x2++) + (x2++) + (x2++);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);

	}
 }
