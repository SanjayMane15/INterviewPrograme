package com.ConversionProgramme;

public class BinaryToDecimal {
	
	
	public static void main(String[] args) {
		// Binary to Decimal
		String binary="111011";
		int idecimal=Integer.parseInt(binary,2);
		System.out.println("111011 Decimal is : "+idecimal); 
		System.out.println(Integer.parseInt("11111", 2)); // direct 
		
		
		// Decimal To Binary:-
		
		int decimal2=15091994;
		String binary2=Integer.toBinaryString(decimal2);
		System.out.println("15091994 BInary is : "+binary2);
		
		
	}

}
