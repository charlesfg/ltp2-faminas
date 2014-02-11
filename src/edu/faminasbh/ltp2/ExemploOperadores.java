package edu.faminasbh.ltp2;

public class ExemploOperadores {
	public static void main(String[] args) {
		System.out.println(10 % 3);
		System.out.println(~8);
		
		System.out.println(Integer.toBinaryString(-3));
		System.out.print((-3 >> 1) + " \t=> ");
		
		System.out.println(Integer.toBinaryString(-3 >> 1));
		System.out.print((-3 >>> 1) + " \t=> ");
		System.out.println(Integer.toBinaryString(-3 >>> 1));
		
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		
		
		System.out.println(3 | 2);
		System.out.println(3 & 2);
		System.out.println(3 ^ 2);
		
		int a = 5;
		a*=2;
		System.out.println(a);
		
		int arr[][] = {{1,2,3,4},{5,6,7,8},{11,22,33,44},{55,66,77,88}};
		int i = 1;
		System.out.println(arr[i++][++i]);
		
	}
	

}
