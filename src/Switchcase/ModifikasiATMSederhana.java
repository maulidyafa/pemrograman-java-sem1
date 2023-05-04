package Switchcase;
//Membuat Modifikasi Program ATM Sederhana
import java.util.Scanner;
public class ModifikasiATMSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String pin  = "20082010102";
        long saldo  = 25000000;
    System.out.println("***************************************");
    System.out.println("     Selamat Datang Di ATM Bersama     ");
    System.out.println("***************************************");
    //Masukkan Pin
        System.out.print("Masukkan PIN Anda : ");String inputpin = sc.next();
      if (inputpin.equals(pin)){
          System.out.println("Selamat Datang, Maulidya Firdausy");
          System.out.println("=======================================");
      
    //Menu ATM
        System.out.println("Menu ATM\n1. Cek Saldo\n2. Tarik Tunai\n3. Transfer Rekening\n4. Pembayaran Tagihan");
        System.out.print("Masukkan Pilihan : ");int pilihan = sc.nextInt();
        System.out.println("=======================================");
      switch(pilihan){
          case 1 :
              System.out.println("--Cek Saldo--");
              System.out.println("Saldo Anda Sekarang = Rp."+saldo);
              System.out.println("=============Terima Kasih==============");
              break;
          case 2 :
              System.out.println("--Tarik Tunai--");
              System.out.print("Masukkan Nominal Uang    = Rp.");long tarik = sc.nextInt();
              if (tarik >= saldo){
                  System.out.println("Maaf Saldo Anda Tidak Mencukupi ");
              }else if(tarik >= 2500000){
                  System.out.println("Maaf Nominal Uang Maksimum yang Dapat Ditarik Rp.2500000");
              }else if(tarik % 50000 != 0){
                  System.out.println("Maaf Nominal Uang yang Dapat Ditarik dengan Kelipatan Rp.50000");
              }else if(tarik <= saldo){
                  saldo = saldo - tarik;
                  System.out.println("Sisa saldo Anda Sekarang = Rp."+saldo);
              }
                  System.out.println("=============Terima Kasih==============");
              break;
          case 3 :
              System.out.println("--Transaksi Rekening--");
              System.out.print("Masukkan No. Rekening : ");int rek = sc.nextInt();
              System.out.print("Masukkan Nominal Uang yang Anda Transfer = Rp.");long transfer = sc.nextInt();
             if (transfer <= saldo){
              saldo = saldo - transfer;
              System.out.println("Sisa Saldo Anda Sekarang = Rp."+saldo);
             }else{
                 System.out.println("Maaf Saldo Anda Tidak Mencukupi");
             }
                 System.out.println("=============Terima Kasih==============");
             break;
          case 4 :
              System.out.println("--Pembayaran Tagihan --");
              System.out.println("Menu Pembayaran\n1. PLN\n2. PDAM\n3. Telepon");
              System.out.print("Masukkan pilihan pembayaran :");int pilih = sc.nextInt();
              System.out.print("Masukkan Nominal Uang Pembayaran = Rp."); int bayar = sc.nextInt();
             if (bayar <= saldo){
              saldo = saldo - bayar;
              System.out.println("Sisa Saldo Anda Sekarang = Rp."+saldo);
             }else{
              System.out.println("Maaf Saldo Anda Tidak Mencukupi");
             }
              System.out.println("==============Terima Kasih==============");
             break;
            }  
      }else{System.out.println("PIN Yang Anda Masukkan Salah");}

    }
    }
