package ch04;

import java.util.Arrays;

public class ResponsiEnamK {
	public static void main (String[] args) {
		int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println ("Nilai Dalam Arrays : " + Arrays.toString(angka));
		
		int banyak = angka.length;
		int henti = banyak - 1;
		
		System.out.println ("\nAngka-Angka Yang Setelahnya Bernilai Lebih Besar Dalam Array : ");
		for (int i = 0; i < banyak; i++) {
			if (i == henti) {
			}else{
				if (angka[i+1] > angka[i])
				System.out.print (angka[i] + " ");
			}	
		}
		System.out.println ("");
	}
}