package patikaOdevAscSort;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// dizinin eleman sayisini konsoldan aldik.
		System.out.print("Please enter number: ");
		int number = sc.nextInt();
		
		int count;
		int[] array = new int[number];
		// indeks elemanlarýmýzý tek tek konsoldan aldik
		for(int i = 0; i < number; i++) {
			System.out.print(i + ". indeks : ");
			array[i] = sc.nextInt();
		}
		System.out.print("asc sort :");
		// dizinin bir sonraki elemani bir oncekinden kucukse bunlarý bir degiskende tuttuk
		for(int i = 0; i < number; i++) {
			for(int j = i+1; j < number; j++) {
				if(array[j] < array[i]) {
					count = array[i];
					array[i] = array[j];
					array[j] = count;
				}
			}
		}
		// dizimizin son halini ekrana yazdirdik
		for(int i = 0; i < number; i++) {
			System.out.print(" " + array[i]);
		}
		

	}

}
