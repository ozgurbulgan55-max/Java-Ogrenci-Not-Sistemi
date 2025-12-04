package NotHesaplama;
import java.util.Scanner;

public class NotHesaplama {
	public static void main(String[] args) {
		
		double ortalama;
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------------------\n");
		System.out.println("      Öğrenci Not Sistemi\n");
		System.out.println("-----------------------------------\n");
		System.out.print("Lütfen vize notunuzu giriniz : ");
		double vize = scanner.nextDouble();
		System.out.print("Lütfen final notunuzu giriniz : ");
		double fınal = scanner.nextDouble();
		
		if(fınal >= 35) {
		System.out.print("Vize notunuzun ortalamanızı % kaç etkiledğini yazınız : ");
		float VizeEtkisi = scanner.nextFloat();
		System.out.print("Final notunuzun ortalamanızı % kaç etkiledğini yazınız : ");
		float FınalEtkisi = scanner.nextFloat();
		ortalama = (vize * VizeEtkisi + fınal * FınalEtkisi) / 100;
		System.out.println("\n-----------------------------------\n");
		System.out.println("Ortalama Notunuz : " + ortalama);
		System.out.println("Harf Notunuz : " + HarfNotu(ortalama));
		}else {   System.out.println("Final notunuz barajı geçemediği için FF ile kaldınız.");
		}
	}
	
	public static String HarfNotu(double not) {
		if(not >= 90 && not <= 100) {       return "AA";  }
		else if (not >= 85 && not <=89) {   return "BA";  }
		else if (not >= 80 && not <=84) {   return "BB";  }
		else if (not >= 75 && not <=79) {   return "CB";  }
		else if (not >= 65 && not <=74) {   return "CC";  }
		else if (not >= 55 && not <=64) {   return "DC";  }
		else if (not >= 45 && not <=54) {   return "DD";  }
		else if (not >= 35 && not <=44) {   return "FD";  }
		else if (not >= 0 && not <=34) {    return "FF";  }
		return "Girdiğiniz notları kontrol ediniz !";
	}
}
