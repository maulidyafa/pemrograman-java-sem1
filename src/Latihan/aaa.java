package Latihan;
import java.util.Scanner;
public class aaa {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String separator = "==============================================================================================================================================================";
    String batas     = "--------------------------------------------------------------------------------------------------------------------------------------------------------------";
    System.out.println(separator+"\n                                                    ***Welcome to UMKM Bersama***");
    int pilih,pilih1;
    do{
    System.out.println(separator+"");
    System.out.println("                   MENU UMKM Bersama");
    System.out.println("1. Tentang Bantuan UMKM");
    System.out.println("2. Daftar Bantuan UMKM");
    System.out.println("3. Cek Penerima Bantuan UMKM");
    System.out.println("4. Laporan Keuangan Anda");
    System.out.println("5. Hutang Pelanggan Anda");
    System.out.println("6. Exit");
    System.out.print("Pilih = ");pilih=s.nextInt();
    System.out.println("");
    if(pilih < 5){
    switch(pilih){
        case 1 :
            System.out.println(batas+"\n                  Tentang Bantuan UMKM");
            System.out.println("1. Apa itu Bantuan UMKM");
            System.out.println("2. Fasilitas Bantuan UMKKM ");
            System.out.println("3. Syarat-Syarat PenerimaBantuan UMKM");
            System.out.print("Pilih = ");pilih1=s.nextInt();
            if(pilih1==1){
            System.out.println("                 *Apa itu Bantuan UMKM?*");
            System.out.println("Presiden Jokowi resmi melngeluarkan bantuan produktif"
            + "\nberupa hibah modal kerja untuk pelaku usaha mikro,"
            + "\nkecil, dan menengah (UMKM).Bantuan diperuntukkan"
            + "\nbagi pelaku usaha mikro yang secara tidak langsung "
            + "\nterdampak oleh pandemi covid. ");
            }else if(pilih1==2){
            System.out.println("                 *Fasilitas Bantuan UMKM*");
            System.out.println("Bantuan UMKM menyasar 12 juta pelaku UMKM dengan\nmendapat bantuan sebesar Rp 2,4 juta per orang.");
            }else if(pilih1==3){
            System.out.println("          *Syarat-Syarat Penerima Bantuan UMKM*");
            System.out.println("1. Warga Negara Indonesia");
            System.out.println("2. Mempunyai NIK");
            System.out.println("3. Memiliki Usaha Mikro");
            System.out.println("4. Bukan Termasuk ASN, Pegawai BUMN/BUMD, TNI/POLRI");
            }break;
        case 2 :
            String nama, alamat, usaha;
            int nik,hasil;
            System.out.println("                 Daftar Bantuan UMKM");
            System.out.print("Nama Lengkap : ");nama=s.next();
            System.out.print("Alamat kota  : ");alamat=s.next();
            System.out.print("NIK          : ");nik=s.nextInt();
            System.out.print("Jenis Usaha  : ");usaha=s.next();
            System.out.print("Penghasilan  : Rp ");hasil=s.nextInt();
        case 3 :
            String penerima [][] = new String[100][4];
            System.out.println("           *Daftar Penerima Bantuan UMKM*");
            System.out.println(batas+"\nNIK\t\t\tNama\t\t\tKota\t\t\tStatus\n"+batas);
            for(int i=0; i<100; i++){
                for(int j=1; j<4; j++){
                    System.out.println("nik");
                }
            }
            
        case 4 :
            System.out.print("Pemasukan : ");
            int n=s.nextInt();
            System.out.println("");
            String bulan[][]=new String[1][n];
            for(int i = 0; i<1; i++){
                for (int j = 0; j < n; j++) {
                    System.out.println("Bulan ke "+(j+1));
                    if(j==0)
                        System.out.print("Pemasukan : Rp");
                    else if(j==1)
                        System.out.print("Pemasukan : Rp");
                    else if(j==2)
                        System.out.print("Pemasukan : Rp");
                    else if(j==3)
                        System.out.print("Pemasukan : Rp");
                    else if(j==4)
                        System.out.print("Pemasukan : Rp");
                    else if(j==5)
                        System.out.print("Pemasukan : Rp");
                    else if(j==6)
                        System.out.print("Pemasukan : Rp");
                    else if(j==7)
                        System.out.print("Pemasukan : Rp");
                    else if(j==8)
                        System.out.print("Pemasukan : Rp");
                    else if(j==9)
                        System.out.print("Pemasukan : Rp");
                    else if(j==10)
                        System.out.print("Pemasukan : Rp");
                    else 
                        System.out.print("Pemasukan : Rp");
                    System.out.println("");
                    bulan[i][j]=s.next();
                }
                }
            System.out.println("                                                                                            *Laporan Keuangan Anda*\n"+batas);
            System.out.println("\t\t\tBulan 1\t\t\tBulan 2\t\t\tBulan 3\t\t\tBulan 4\t\t\tBulan 5\t\t\tBulan 6\t\t\tBulan 7\t\t\tBulan 8\t\t\tBulan 9\t\t\tBulan 10\t\t\tBulan 11\t\t\tBulan 12");
            for(int i = 0; i<1; i++){
                System.out.println("*PEMASUKAN* :");
                System.out.println("");
                System.out.println("*PENGELUARAN* :");
                System.out.println("Listrik");
                System.out.println("Keluarga");
                System.out.println("Stok");
                System.out.println("Pulsa");
                System.out.println("Sewa");
                System.out.println("Hutang");
                System.out.println("Cicilan");
                System.out.println("Gaji");
                System.out.println("Lain-lain");
                System.out.println("");
                for(int j = 0; j<n; j++){
                    System.out.print("\t\t");
                    System.out.print(bulan[i][j]+"\t");
                }
                System.out.println("");
            }
         System.out.print("Masukkan Jumlah Pelanggan : ");
            int p = s.nextInt();
            String pelanggan[][]=new String[p][7];
            for(int i = 0; i<p; i++){
                System.out.println("");
                System.out.println("Pelanggan ke "+(i+1));
                for (int j = 0; j < 7; j++) {
                    if(j==0)
                        System.out.print("Nama       : ");
                    else if (j==1)
                        System.out.print("WhatsApp   : ");
                    else if (j==2)
                        System.out.print("Hutang 1   : Rp ");
                    else if (j==3)
                        System.out.print("Hutang 2   : Rp ");
                    else if (j==4)
                        System.out.print("Hutang 3   : Rp ");
                    else if (j==5)
                        System.out.print("Hutang 4   : Rp ");
                    else if (j==6)
                        System.out.print("Hutang 5   : Rp ");
                    else
                        System.out.print("Total      : Rp ");
                    System.out.print("");
                    pelanggan[i][j]=s.next();
                }
            }
            System.out.println("                                                                                            *Hutang Pelanggan Anda*\n"+batas);
            System.out.println("Nama \t\tWhatsApp \t\tHutang 1\t\tHutang 2\t\tHutang 3\t\tHutang 4\t\tHutang 5");
            for(int i = 0; i<p; i++){
                for(int j = 0; j<7; j++){
                    System.out.print(pelanggan[i][j]+"\t\t");
                }
                System.out.println("");
            }
            
            
            
    }
    }else{
        System.out.println("Maaf Pilihan Tidak Ada");
    }
        System.out.println("");
    }while(pilih!=5);
    }
    
}
