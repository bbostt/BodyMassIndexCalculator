import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {

	public static void main(String[] args) {

		double boy, kilo;

		Scanner input = new Scanner(System.in);

		System.out.print("Boyu metre cinsinden giriniz : ");

		boy = input.nextDouble();

		System.out.print("Kiloyu kg cinsinden giriniz : ");

		kilo = input.nextDouble();
		
		double kitleIndeksi = kilo / (boy * boy);
		
		System.out.println(kitleIndeksi);

	}

}
