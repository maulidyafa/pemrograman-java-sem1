package FinalProject;
import java.util.Scanner;
public class UMKM {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String separator = "==============================================================================================================================================================";
    String batas     = "--------------------------------------------------------------------------------------------------------------------------------------------------------------";
    System.out.println(separator+"\n                                                    ***Welcome to UMKM Bersama***");
    int pilih;
    do{
    System.out.println(separator+"");
    System.out.println("                   MENU UMKM Bersama");
    System.out.println("1. Tentang Bantuan UMKM");
    System.out.println("2. Daftar Bantuan UMKM");
    System.out.println("3. Laporan Keuangan Anda");
    System.out.println("4. Hutang Pelanggan Anda");
    System.out.println("5. Exit");
    System.out.print("Pilih = ");
    pilih=s.nextInt();
    System.out.println("");
    if(pilih < 5){
    switch(pilih){
        case 1 :
            int pilih1;
            System.out.println(batas+"\n                  Tentang Bantuan UMKM");
            System.out.println("1. Apa itu Bantuan UMKM");
            System.out.println("2. Fasilitas Bantuan UMKKM ");
            System.out.println("3. Syarat-Syarat PenerimaBantuan UMKM");
            System.out.print("Pilih = ");
            pilih1=s.nextInt();
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
            String nama, alamat, usaha, nik;
            int hasil,pilih2;
            do{
            System.out.println("                 Daftar Bantuan UMKM");
            System.out.println("");
            System.out.print("Nama Lengkap : ");
            nama=s.next();
            System.out.print("Alamat kota  : ");
            alamat=s.next();
            System.out.print("NIK          : ");
            nik=s.next();
            System.out.print("Jenis Usaha  : ");
            usaha=s.next();
            System.out.print("Penghasilan  : Rp ");
            hasil=s.nextInt();
            System.out.println("Apakah Data Anda Sudah Benar?\n1. Ya   2. Tidak   3. Keluar");
            System.out.print("Pilih = "); 
            pilih2=s.nextInt();
            if(pilih2==1 && hasil<=3000000){
                System.out.println("Selamat Pendaftaran Anda Diterima");
            }else if(pilih2==1 && hasil>=3000000){
                System.out.println("Mohon Maaf Pendaftaran Tidak Diterima");
            }else if(pilih2==3){
                System.out.println("Data Dibatalkan");   
            }
            }while(pilih2==2);
            break;
        case 3 :
            int pilih3,saldo=0;
            int totalmsk[]=new int[1];
             int bln1[] = new int[1];
                int bln2[] = new int[1];
                int bln3[] = new int[1];
                int bln4[] = new int[1];
                int bln5[] = new int[1];
                int bln6[] = new int[1];
                int bln7[] = new int[1];
                int bln8[] = new int[1];
                int bln9[] = new int[1];
                int bln10[] = new int[1];
                int bln11[] = new int[1];
                int bln12[] = new int[1];
            do{
            System.out.println("                   Laporan Keuangan Anda");
            System.out.println("1. Catat Pemasukan");
            System.out.println("2. Catat Pengeluaran");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Selesai");
            System.out.print("Pilih : ");
            pilih3=s.nextInt();
            switch(pilih3){
                case 1 :
                System.out.println("");
                System.out.println("                        PEMASUKAN");
                for(int i = 0; i < 1; i++){
                    System.out.print("Bulan 1  : Rp ");
                    bln1[i]=s.nextInt();
                    System.out.print("Bulan 2  : Rp ");
                    bln2[i]=s.nextInt();
                    System.out.print("Bulan 3  : Rp ");
                    bln3[i]=s.nextInt();
                    System.out.print("Bulan 4  : Rp ");
                    bln4[i]=s.nextInt();
                    System.out.print("Bulan 5  : Rp ");
                    bln5[i]=s.nextInt();
                    System.out.print("Bulan 6  : Rp ");
                    bln6[i]=s.nextInt();
                    System.out.print("Bulan 7  : Rp ");
                    bln7[i]=s.nextInt();
                    System.out.print("Bulan 8  : Rp ");
                    bln8[i]=s.nextInt();
                    System.out.print("Bulan 9  : Rp ");
                    bln9[i]=s.nextInt();
                    System.out.print("Bulan 10 : Rp ");
                    bln10[i]=s.nextInt();
                    System.out.print("Bulan 11 : Rp ");
                    bln11[i]=s.nextInt();
                    System.out.print("Bulan 12 : Rp ");
                    bln12[i]=s.nextInt();
                    totalmsk[i] = bln1[i]+bln2[i]+bln3[i]+bln4[i]+bln5[i]+bln6[i]+bln7[i]+bln8[i]+bln3[i]+bln9[i]+bln10[i]+bln12[i];
                    System.out.print("Total    = Rp "+totalmsk[i]);
                    System.out.println("");
                }
                    System.out.println("                   *Laporan Pemasukkan Anda*\n"+batas);
                    System.out.println("Bulan 1\t\tBulan 2\t\tBulan 3\t\tBulan 4\t\tBulan 5\t\tBulan 6\t\tBulan 7\t\tBulan 8\t\tBulan 9\t\tBulan 10\t\tBulan 11\t\tBulan 12\t\tTotal");
                    for(int i = 0; i<1; i++){
                System.out.println("\t\t"+bln1[i]+"\t\t"+bln2[i]+"\t\t"+bln3[i]+"\t\t"+bln4[i]+"\t\t"+bln5[i]+"\t\t"+bln6[i]+"\t\t"+bln7[i]+"\t\t"+bln8[i]+"\t\t"+bln9[i]+"\t\t"+bln10[i]+"\t\t"+bln11[i]+"\t\t"+bln12[i]+"\t\t"+totalmsk[i]);
            }
                
                case 2 :
                int pilihan, pb =1, listrik = 0, keluarga=0, stok=0, pulsa=0, sewa=0, hutang=0, cicilan=0, gaji=0, lain=0, totalplrn = 0;
                do{
                System.out.println("");
                System.out.println("                        PENGELUARAN\n"+batas);
                System.out.println("1. Listrik          6. Hutang");
                System.out.println("2. Keluarga         7. Cicilan");
                System.out.println("3. Stok             8. Gaji");
                System.out.println("4. Pulsa            9. Lain-lain");
                System.out.println("5. Sewa             10. Total ");
                System.out.println("11. Keluar");
                System.out.print("Pilih : ");
                pilihan=s.nextInt();
                System.out.print("Pengeluaran Bulan (1-12) : ");
                pb=s.nextInt();
                if(pilihan==1){
                    System.out.print("Listrik : Rp ");
                    listrik=s.nextInt();
                }else if(pilihan==2){
                    System.out.print("Keluarga : Rp");
                    keluarga=s.nextInt();
                }else if(pilihan==3){
                    System.out.print("Stok : Rp");
                    stok=s.nextInt();
                }else if(pilihan==4){
                    System.out.print("pulsa : Rp");
                    pulsa=s.nextInt();
                }else if(pilihan==5){
                    System.out.print("Sewa : Rp");
                    sewa=s.nextInt();
                }else if(pilihan==6){
                    System.out.print("Hutang : Rp");
                    hutang=s.nextInt();
                }else if(pilihan==7){
                    System.out.print("Cicilan : Rp");
                    cicilan=s.nextInt();
                }else if(pilihan==8){
                    System.out.print("Gaji : Rp");
                    gaji=s.nextInt();
                }else if(pilihan==9){
                    System.out.print("Lain-lain : Rp");
                    lain=s.nextInt();
                }else if(pilihan==10){
                    totalplrn= listrik+keluarga+stok+pulsa+sewa+hutang+cicilan+gaji+lain;
                    System.out.print("Total : Rp"+totalplrn);
                }
                }while(pilihan!=11);
                case 3 :
                    System.out.println("            Saldo Anda");
                    System.out.print("Masukkan Bulan (1-12): ");
                    pb=s.nextInt();
            }
            }while(pilih3!=4);
            break;
        case 4 :
        int pilih6; int p;
        System.out.println("            Hutang  Pelanggan Anda\n");
        System.out.println("1. Catat Hutang");
        System.out.println("2. Cek Hutang");
        System.out.println("3. Cari Hutang");
        System.out.println("4. Keluar");
        System.out.print("Pilih : ");
        int pilihan1=s.nextInt();
        System.out.print("Jumlah Pelanggan Berhutang : ");
        p=s.nextInt();
        String namaa[]=new String[p];
            String nama1[] = new String[p];
            int Total[]=new int[p];
            String WA[]=new String[p];
            String wa[] = new String[p];
            int hutang1[] = new int [p];
            int hutang2[] = new int [p];
            int hutang3[] = new int [p];
            int hutang4[] = new int [p];
            int hutang5[] = new int [p];
            int hutang6[] = new int [p];
            int hutang7[] = new int [p];
            int hutang8[] = new int [p];
            int hutang9[] = new int [p];
            int hutang10[] = new int [p];
            int total[] = new int [p];
        do{
            switch(pilihan1){
                case 1 :
                for(int i = 0; i<p; i++){
                System.out.println("");
                System.out.println("Pelanggan ke "+(i+1));
                        System.out.print("Nama       : ");
                        nama1[i]=s.next();
                        System.out.print("WhatsApp   : ");
                        wa[i]=s.next();
                        System.out.print("Hutang 1   : Rp ");
                        hutang1[i]=s.nextInt();
                        System.out.print("Hutang 2   : Rp ");
                        hutang2[i]=s.nextInt();
                        System.out.print("Hutang 3   : Rp ");
                        hutang3[i]=s.nextInt();
                        System.out.print("Hutang 4   : Rp ");
                        hutang4[i]=s.nextInt();
                        System.out.print("Hutang 5   : Rp ");
                        hutang5[i]=s.nextInt();
                        System.out.print("Hutang 6   : Rp ");
                        hutang6[i]=s.nextInt();
                        System.out.print("Hutang 7   : Rp ");
                        hutang7[i]=s.nextInt();
                        System.out.print("Hutang 8   : Rp ");
                        hutang8[i]=s.nextInt();
                        System.out.print("Hutang 9   : Rp ");
                        hutang9[i]=s.nextInt();
                        System.out.print("Hutang 10  : Rp ");
                        hutang10[i]=s.nextInt();
                        total[i] = hutang1[i]+hutang2[i]+hutang3[i]+hutang4[i]+hutang5[i]+hutang6[i]+hutang7[i]+hutang8[i]+hutang9[i]+hutang10[i];
                        System.out.print("Total      = Rp "+total[i]);
                        System.out.println("");
            }//for
            System.out.println("                                                                                            *Hutang Pelanggan Anda*\n"+batas);
            System.out.println("No \tNama \t  WhatsApp \tHutang 1 \tHutang 2 \tHutang 3 \tHutang 4 \tHutang 5 \tHutang 6 \tHutang 7 \tHutang 8 \tHutang 9 \tHutang 10 \tTotal");
            for(int i = 0; i<p; i++){
                System.out.println((i+1)+"\t"+nama1[i]+"\t  "+wa[i]+"\t\t"+hutang1[i]+"\t\t"+hutang2[i]+"\t\t"+hutang3[i]+"\t\t"+hutang4[i]+"\t\t"+hutang5[i]+"\t\t"+hutang6[i]+"\t\t"+hutang7[i]+"\t\t"+hutang8[i]+"\t\t"+hutang9[i]+"\t\t"+hutang10[i]+"\t\t"+total[i]);
            }
                case 2 :
                    do{
                System.out.println("");
                System.out.println("Urutkan berdasar: ");
                System.out.println("1. Nama\n2. Hutang terbanyak\n3. Selesai");
                System.out.print("Pilih = ");
                pilih6 = s.nextInt();
                if(pilih6==1){
                    for (int i = 0; i < p-1; i++) {
                    for (int j = i+1; j < p; j++) {
                        if(nama1[i].compareToIgnoreCase(nama1[j])>0){
                            String temp1=nama1[i];
                            nama1[i]=nama1[j];
                            nama1[j]=temp1;
                            int temp2=total[i];
                            total[i]=total[j];
                            total[j]=temp2;
                            String temp3=wa[i];
                            wa[i]=wa[j];
                            wa[j]=temp3;
                        }
                    }
                } 
                for (int i = 0; i < p; i++) {
                namaa[i]=nama1[i];
                Total[i]=total[i];
                WA[i]=wa[i];
                }
                for (int i = 0; i < p; i++) {
                    System.out.println((i+1)+". "+namaa[i]+"\t Total hutang = Rp "+Total[i]+"\t no.Wa= "+WA[i]);
            }
                }else if(pilih6==2){
            
                 for (int i = 0; i < p-1; i++) {
                    for (int j = i+1; j < p; j++) {
                        if(total[i]<total[j]){
                            int temp1=total[i];
                            total[i]=total[j];
                            total[j]=temp1;
                            String temp2=nama1[i];
                            nama1[i]=nama1[j];
                            nama1[j]=temp2;
                            String temp3=wa[i];
                            wa[i]=wa[j];
                            wa[j]=temp3;
                        }
                    }
                }
                for (int i = 0; i < p; i++) {
                Total[i]=total[i];
                namaa[i]=nama1[i];
                WA[i]=wa[i];
                }
                for (int i = 0; i < p; i++) {
                    System.out.println((i+1)+". "+"Rp "+Total[i]+"\t atas nama "+namaa[i]+"\t no.wa= "+WA[i]);
            }
                }
                
            }while(pilih6<3);//do
                case 3 :
                int jawab = 1;
                do{
                boolean ketemu=false;
                System.out.println("Cari Hutang");
                System.out.print("Masukkan Nama  : ");
                String cari=s.next();
                for(int i = 0; i < p; i++){
                    if(nama1[i]==null){
                            continue;
                        }
                        if(nama1[i].compareToIgnoreCase(cari)==0){
                            System.out.print("Jumlah Hutang  = Rp ");
                            System.out.println((total[i])+"");
                            System.out.print("Segera Hubungi : ");
                            System.out.println((wa[i])+"");
                            ketemu=true; 
                            System.out.println("");  
                        }//end if
            if(ketemu==false){
                System.out.println("Nama Tidak Ada");
                 System.out.println("");
            }
                }
                    System.out.println("Cari Lagi?");
                    System.out.println("1. Ya       2. Tidak");
                    System.out.print("Jawab : ");
                    jawab=s.nextInt();
                }while(jawab!=2);
                break;
            }//end switch pilihan1
        }while(pilihan1!=4);
    }//end switch pilih
    }else{//end if
        System.out.println("Maaf Pilihan Tidak Ada");
    }
        System.out.println("");
    }while(pilih!=5);//end do
    }//public static void main
    
}//public class umkm
