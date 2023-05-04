package tugasbp.pkg1;
//Program Menghitung Usia
import java.util.Scanner;
public class MenghitungUsia {
    public static void main(String[] args) {
        int thnLahir, thnNow, usia;
        Scanner sc = new Scanner (System.in);
        System.out.println("Program Menghitung Usia");
        System.out.print("Masukkan Tahun Lahir = ");
        thnLahir = sc.nextShort();
        System.out.print("Masukkan Tahun Sekarang = ");
        thnNow = sc.nextInt();
        usia = thnNow - thnLahir;
        System.out.println("Usia Anda :"+usia);
    }
    
}
