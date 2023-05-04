package looping;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("========================================");
        System.out.println("*****Selamat Datang Di Warung Makan*****");
        System.out.println("========================================");
        int Pilih, Jumlah = 0, Harga1 = 0, Harga2 = 0, Harga3 = 0, Harga4 = 0;
        do{
        System.out.println("MENU MAKANAN\n1. Sate Ayam : Rp.15.000\n2. Rawon     : Rp.18.000"
        + "\n"+ "3. Gado-Gado : Rp.20.000\n4. Rujak     : Rp.25.000\n5. Selesai");
        System.out.println("----------------------------------------");
        System.out.print("Pilih Menu Makanan : ");Pilih = sc.nextInt();
        if (Pilih < 5) {
            System.out.print("Masukkan Jumlah Makanan : ");Jumlah = sc.nextInt();
            System.out.println("----------------------------------------");
        }switch(Pilih){
            case 1:
                Harga1 += 15000*Jumlah;
                System.out.println("Sate Ayam = Rp."+Harga1);break;
            case 2:
                Harga2 += 18000*Jumlah;
                System.out.println("Rawon = Rp."+Harga2);break;
            case 3:
                Harga3 += 20000*Jumlah;
                System.out.println("Gado-Gado = Rp."+Harga3);break;
            case 4:
                Harga4 += 25000*Jumlah;
                System.out.println("Rujak = Rp."+Harga4);break;
            case 5 :
                System.out.println("Pesanan Tidak Ada");
                System.out.println("Selamat Menikmati");break;
            } System.out.println("----------------------------------------");
        }while(Pilih != 5);
             int Total = Harga1 + Harga2 + Harga3 + Harga4;
            System.out.println("Total Harga Pesanan = Rp."+Total);
            System.out.println("========TERIMAKASIH TELAH MEMESAN========");
        }   
        }

