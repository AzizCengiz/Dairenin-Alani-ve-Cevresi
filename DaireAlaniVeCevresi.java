package ilk;

import java.util.Scanner;

public class DaireAlaniVeCevresi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		double pi, r, alan,cevre;
		
		pi=3.14;
		
		System.out.println("Yarıçapı Giriniz: ");
		r=input.nextDouble();
		
		alan = pi * (r*r) ;
		cevre= 2 * pi * r ;
		
		System.out.println("Dairenin Alanı: "+alan);
		System.out.println("Dairenin Çevresi: "+cevre);
	
		
		
		
		
	}

}
