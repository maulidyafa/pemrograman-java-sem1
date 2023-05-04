
package tugasbp.pkg1;
//Menghitung Luas Segitiga
import java.util.Scanner;
public class MenghitungLuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int alas, tinggi;
        double luas;
        System.out.println("Program Menghitung Luas Segitiga");
        //1. input alas dan tinggi
        System.out.print("Masukkan alas   = ");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi = ");
        tinggi = input.nextInt();
        //2. Hitung Luas
        luas = alas * tinggi * 0.5;
        //3. Tampilkan Luas
        System.out.println("Luasnya :"+luas);
    }
    
}
