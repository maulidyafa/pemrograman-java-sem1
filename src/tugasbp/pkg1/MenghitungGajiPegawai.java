package tugasbp.pkg1;
//Menghitung Gaji
import java.util.Scanner;
public class MenghitungGajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Buat variabel gaji pokok, uang harian, jumlah hari masuk, gaji total
        int gajipokok,uangharian, jumharimasuk, gajitotal;
        System.out.println("Program Menghitung Gaji Pegawai ");
        //2. Masukkan Besaran Gaji Pokok, uang harian, jumlah hari
        System.out.print("Masukkan gaji pokok     = ");
        gajipokok = input.nextInt();
        System.out.print("Masukkan uang harian    = ");
        uangharian = input.nextInt();
        System.out.print("Masukkan jumlah hari    = ");
        jumharimasuk = input.nextInt();
        //3. Hitung gaji total
        gajitotal = gajipokok + (uangharian * jumharimasuk);
        //4. Tampilkan gaji total
        System.out.println("Gaji totalnya :"+gajitotal);
     
        
    }
    
}
