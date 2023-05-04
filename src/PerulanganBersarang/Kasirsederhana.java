package PerulanganBersarang;
//Membuat program kasir warung makan sederhana
import java.util.Scanner;
public class Kasirsederhana {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
     System.out.println("========================================");
     System.out.println("*****Selamat Datang Di Warung Makan*****");
     System.out.println("========================================");
     
     long Total = 0;
     int Pilih, Daging, Lombok, Jumlah = 0, Harga1 = 0, Harga2 = 0, Harga3 = 0, Harga4 = 0, Harga5 = 0, Harga6 = 0;
     do {
         System.out.println("MENU MAKANAN\n1. Sate\n2. Rujak\n3. Selesai");
         System.out.println("----------------------------------------");
         System.out.print("Pilih Menu : ");Pilih = sc.nextInt();
         switch(Pilih){
             case 1:
               do{
                 System.out.println("----------------------------------------");
                 System.out.println("JENIS SATE\n1. Ayam    Rp15.000\n2. Kelinci Rp20.000\n3. Kambing Rp25.000\n4. Selesai");
                 System.out.print("Pilih Jenis Sate : ");Daging = sc.nextInt();
                if(Daging==1){
                 System.out.print("Jumlah Sate : ");Jumlah = sc.nextInt();
                 Harga1 += 15000*Jumlah;
                 System.out.println("Harga = Rp"+Harga1);
               }else if(Daging==2){
                 System.out.print("Jumlah Sate : ");Jumlah = sc.nextInt();
                 Harga2 += 20000*Jumlah;
                 System.out.println("Harga = Rp"+Harga2);
               }else if(Daging==3){
                 System.out.print("Jumlah Sate : ");Jumlah = sc.nextInt();
                 Harga3 += 15000*Jumlah;
                 System.out.println("Harga = Rp"+Harga3);}
                }while(Daging!=4);break;
             case 2:   
               do{
                  System.out.println("----------------------------------------");
                  System.out.println("JENIS KEPEDASAN\n1. Biasa\n2. Pedas\n3. X-Pedas\n4. Selesai");
                  System.out.println("----------------------------------------");
                  System.out.print("Pilih Jenis Kepedasan : ");Lombok = sc.nextInt();
                if (Lombok==1){
                  System.out.print("Jumlah Rujak : ");Jumlah = sc.nextInt();
                  Harga4 += 15000*Jumlah;
                  System.out.println("Harga = Rp"+Harga4);
               }else if(Lombok==2){
                  System.out.print("Jumlah Rujak : ");Jumlah = sc.nextInt();
                  Harga5 += 17000*Jumlah;
                  System.out.println("Harga = Rp"+Harga5);
               }else if(Lombok==3){
                  System.out.print("Jumlah Rujak : ");Jumlah = sc.nextInt();
                  Harga6 += 20000*Jumlah;
                  System.out.println("Harga = Rp"+Harga6);}
                }while(Lombok!=4);break;
             }
     }while(Pilih!=3);
            Total = Harga1 + Harga2 + Harga3 + Harga4 + Harga5 + Harga6;
             System.out.println("----------------------------------------");
             System.out.println("Total Pembayaran = Rp"+Total);
             System.out.println("========TERIMAKASIH TELAH MEMESAN========");
             
    }
    
}
