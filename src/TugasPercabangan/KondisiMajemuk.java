package TugasPercabangan;
//Memodifikasi Program, Menambahkan input (Scanner) untuk semua variabel
import java.util.Scanner;
public class KondisiMajemuk {
    public static void main(String[] args) {
        int SKS; double IPK; boolean NilaiE;
        Scanner sc = new Scanner (System.in);
        System.out.println("Program Kondisi Majemuk");
        System.out.print("Masukkan Jumlah SKS           = ");SKS = sc.nextInt();
        System.out.print("Masukkan IPK                  = ");IPK = sc.nextDouble();
        System.out.print("Adakah Nilai E? (true/false)  = ");NilaiE = sc.nextBoolean();
        if (SKS >= 144 && IPK >= 2 && NilaiE == false){
            System.out.println("Selamat, Anda Sudah Bisa Lulus!!");
        }else{
            System.out.println("Maaf, Anda Belum Bisa Lulus");
        }
        boolean Sakit, AcaraKeluarga, MotorMogok, TdkBeralasan;
        System.out.println("Status Kehadiran");
        System.out.println("Alasan Tidak Masuk Kuliah \n1. Sakit\n2. Acara Keluarga\n3. Motor Mogok\n4. Tidak Beralasan");
        System.out.print("Masukkan Alasan = ");int alasan = sc.nextInt();
        if (alasan < 3){
            System.out.println("Anda Tidak Masuk Kuliah");
        }else {
            System.out.println("Anda Harus Masuk Kuliah, Semangat!!");
        }
        }
    }
