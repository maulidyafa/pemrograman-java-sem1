package TugasPercabangan;
//Membuat Program Konversi Nilai Majemuk
import java.util.Scanner;
public class Kombinasional {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int NilaiAngka;
    System.out.println("Program Konversi Nilai");
    System.out.print("Masukkan Nilai Angka = ");
    NilaiAngka = sc.nextInt();
    if(NilaiAngka >= 80 && NilaiAngka <= 100)
        System.out.println("A");
    else if (NilaiAngka >= 70 && NilaiAngka < 80)
        System.out.println("B");
    else if (NilaiAngka >= 60 && NilaiAngka < 70)
        System.out.println("C");
    else if (NilaiAngka >= 50 && NilaiAngka < 60)
        System.out.println("D");
    else System.out.println("E");
    }
    
}
