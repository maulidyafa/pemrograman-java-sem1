package Array1D;
//Membuat program laporan penjualan warung makan
import java.util.Scanner;
public class LaporanPenjualan {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int makan[], minum[], buah[];
    int ik = 0, in = 0, ib = 0, totalmakan = 0, totalminum = 0, totalbuah = 0;
    makan = new int[50]; minum = new int[50]; buah = new int[50];
    System.out.println("===============================================");
    System.out.println("***********Daftar Menu Warung Manteb***********");
    System.out.println("===============================================");
    int pilih, item, jumlah;
    do{
        System.out.println("DAFTAR MENU\n1. Makanan\n2. Minuman\n3. Buah\n4. Selesai");
        System.out.println("-----------------------------------------------");
        System.out.print("Pilih Menu : "); pilih = sc.nextInt();
      switch(pilih){
        case 1 :
            System.out.println("-----------------------------------------------");
            System.out.println("MENU MAKANAN\n1. Pecel  Rp6.000\n2. Sate   Rp10.000\n3. Soto   Rp15.000");
            System.out.println("-----------------------------------------------");
            System.out.print("Pilih Makanan : "); item = sc.nextInt();
            System.out.print("Jumlah Makanan: "); jumlah = sc.nextInt();
            System.out.println("-----------------------------------------------");
          if (item == 1)makan[ik] = 6000*jumlah;
            else if (item == 2)makan[ik] = 10000*jumlah;
            else if (item == 3)makan[ik] = 15000*jumlah;
            totalmakan = totalmakan + makan[ik]; ik++; break;
        case 2 :
            System.out.println("-----------------------------------------------");
            System.out.println("MENU MINUMAN\n1. Air Mineral Rp2.500\n2. Es Teh      Rp5.000\n3. Es Jeruk    Rp7.500");
            System.out.println("-----------------------------------------------");
            System.out.print("Pilih Minuman : "); item = sc.nextInt();
            System.out.print("Jumlah Minuman: "); jumlah = sc.nextInt();
            System.out.println("-----------------------------------------------");
          if (item == 1)minum[in] = 2500*jumlah;
            else if (item == 2)minum[in] = 5000*jumlah;
            else if (item == 3)minum[in] = 7500*jumlah;
            totalminum = totalminum + minum[in]; in++; break;
        case 3 :
            System.out.println("-----------------------------------------------");
            System.out.println("MENU BUAH\n1. Pepaya  Rp1.000\n2. Nanas   Rp2.000\n3. Melon   Rp3.000");
            System.out.println("-----------------------------------------------");
            System.out.print("Pilih Buah : "); item = sc.nextInt();
            System.out.print("Jumlah Buah: "); jumlah = sc.nextInt();
            System.out.println("-----------------------------------------------");
          if (item == 1)buah[ib] = 1000;
            else if (item == 2)buah[ib] = 2000*jumlah;
            else if (item == 3)buah[ib] = 3000*jumlah;
            totalbuah = totalbuah + buah[ib]; ib++; break;
        case 4 :
            System.out.println("===============================================");
            System.out.println("Terima Kasih Telah Memesan, Selamat Menikmati!!"); break;
      }
    }while(pilih != 4);
        System.out.println("===============================================");
        System.out.println("*********Rekap Penjualan Warung Manteb*********");
        System.out.println("                    Hari Ini                    ");
        System.out.println("===============================================");
        System.out.println("Total Penjualan Makanan : Rp"+totalmakan);
        System.out.println("Total Penjualan Minuman : Rp"+totalminum);
        System.out.println("Total Penjualan Buah    : Rp"+totalbuah);
        System.out.print("Menu Paling Laris : ");
         if (totalmakan > totalbuah && totalmakan > totalminum)
            System.out.println("Makanan");
         else if (totalminum > totalbuah && totalminum > totalmakan)
            System.out.println("Minuman");
         else if (totalbuah > totalmakan && totalbuah > totalminum)
             System.out.println("Buah");
         else if (totalmakan == totalminum)
             System.out.println("Makanan & Minuman");
         else if (totalmakan == totalbuah )
             System.out.println("Makanan & Buah");
         else if (totalminum == totalbuah )
             System.out.println("Minum & Buah");
        System.out.print("Menu Paling Tidak Laris : ");
         if (totalmakan < totalbuah && totalmakan < totalminum)
            System.out.println("Makanan");
         else if (totalminum < totalbuah && totalminum < totalmakan)
            System.out.println("Minuman");
         else if (totalbuah < totalmakan && totalbuah < totalminum)
             System.out.println("Buah"); 
         else if (totalmakan == totalminum)
             System.out.println("Makanan & Minuman");
         else if (totalmakan == totalbuah )
             System.out.println("Makanan & Buah");
         else if (totalminum == totalbuah )
              System.out.println("Minum & Buah");
}
    }
    

