package FinalProject;
import java.util.Scanner;
public class UMKM1 {
    static String separator = "==============================================================================================================================================================";
    static String batas     = "--------------------------------------------------------------------------------------------------------------------------------------------------------------";
    static   Scanner s = new Scanner(System.in);
    static String[] nama1[];
    static int hutang1[];
    static int hutang2[];
    static int hutang3[];
    static int hutang4[];
    static int hutang5[];
    static int hutang6[];
    static int hutang7[];
    static int hutang8[];
    static int hutang9[];
    static int hutang10[];
    static int jumlah(){
    System.out.print("Jumlah pelanggan : ");
        int p=s.nextInt();
        return p;    
}public static void main(String[] args) {
    
        int p=jumlah();
        String nama1[]= new String[p];
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
    switch(pilih){
        case 1:bantuan();break;
        case 2: daftar();break;
        case 3: laporan();break;
        case 4: 
            do{System.out.println("            Hutang  Pelanggan Anda\n");
        System.out.println("1. Catat Hutang");
        System.out.println("2. Cek Hutang");
        System.out.println("3. Cari Hutang");
        System.out.println("4. Keluar");
        System.out.print("Pilih : ");
        pilih=s.nextInt();
            switch(pilih){
                case 1: 
                
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
                        System.out.print(batas+"\nTotal      = Rp "+total[i]);
                        System.out.println("");
            }
            System.out.println("                                                                                            *Hutang Pelanggan Anda*\n"+batas);
            System.out.println("No\t\tNama\t\tWhatsApp\t\tHutang 1\t\tHutang 2\t\tHutang 3\t\tHutang 4\t\tHutang 5\t\tHutang 6\t\tHutang 7\t\tHutang 8\t\tHutang 9\t\tHutang 10\t\tTotal");
            for(int i = 0; i<p; i++){
                System.out.println((i+1)+"\t\t"+nama1[i]+"\t\t"+wa[i]+"\t\t"+"Rp "+hutang1[i]+"\t\t\t"+"Rp "+hutang2[i]+"\t\t\t"+"Rp "+hutang3[i]+"\t\t\t"+"Rp "+hutang4[i]+"\t\t\t"+"Rp "+hutang5[i]+"\t\t\t"+"Rp "+hutang6[i]+"\t\t\t"+"Rp "+hutang7[i]+"\t\t\t"+"Rp "+hutang8[i]+"\t\t\t"+"Rp "+hutang9[i]+"\t\t\t"+"Rp "+hutang10[i]+"\t\t\t"+"Rp "+total[i]);
            }System.out.println("");
            break;
                case 2:
                    do{
                System.out.println("");
                System.out.println("Urutkan berdasar: ");
                System.out.println("1. Nama\n2. Hutang terbanyak\n3. Keluar");
                System.out.print("Pilih = ");
                pilih = s.nextInt();
                switch(pilih){
                    case 1: urutnama(nama1,total,wa);break;
                    case 2: uruthutang(total, nama1,wa); break;
                }
            }while(pilih<3); break;
                case 3: int jawab = 1;
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
                            System.out.println("Cari Lagi?");
                            System.out.println("1. Ya       2. Tidak");
                            System.out.print("Jawab : ");
                            jawab=s.nextInt();
                        }//end if
            if(ketemu==false){
                System.out.println("Nama Tidak Ada");
                 System.out.println("");
            }
                }
                }while(jawab!=2);
                break;
            }
            }while(pilih!=4); break;
        case 5:System.out.println("Terima kasih");
    }
    }while(pilih!=5);
            }static void urutnama(String[] nama1,int[] total,String[] wa){
                int s=jumlah();
                
                for (int i = 0; i < s-1; i++) {
                    for (int j = i+1; j < s; j++) {
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
                } String nama[]=new String[s];
                int Total[]=new int[s];
                String WA[]=new String[s];
                for (int i = 0; i < s; i++) {
                nama[i]=nama1[i];
                Total[i]=total[i];
                WA[i]=wa[i];
                }
                for (int i = 0; i < s; i++) {
                    System.out.println((i+1)+". "+nama[i]+"\tTotal hutang = Rp "+Total[i]+"\t\tno.wa= "+WA[i]);
            }
            } static void uruthutang(int []total, String[]nama1,String[]wa){
                 int p=jumlah();
                
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
                } String nama[]=new String[p];
                int Total[]=new int[p];
                String WA[]=new String[p];
                for (int i = 0; i < p; i++) {
                Total[i]=total[i];
                nama[i]=nama1[i];
                WA[i]=wa[i];
                }
                for (int i = 0; i < p; i++) {
                    System.out.println((i+1)+". "+"Rp "+Total[i]+"\tatas nama "+nama[i]+"\t\tno.wa = "+WA[i]);
            }
            }
            static void bantuan(){
        int pilih;
        do{
            System.out.println(batas+"\n                  Tentang Bantuan UMKM");
            System.out.println("1. Apa itu Bantuan UMKM");
            System.out.println("2. Fasilitas Bantuan UMKKM ");
            System.out.println("3. Syarat-Syarat PenerimaBantuan UMKM");
            System.out.print("Pilih = ");
            pilih=s.nextInt();
            switch (pilih){
                case 1: System.out.println("                 *Apa itu Bantuan UMKM?*");
            System.out.println("Presiden Jokowi resmi melngeluarkan bantuan produktif"
            + "\nberupa hibah modal kerja untuk pelaku usaha mikro,"
            + "\nkecil, dan menengah (UMKM).Bantuan diperuntukkan"
            + "\nbagi pelaku usaha mikro yang secara tidak langsung "
            + "\nterdampak oleh pandemi covid. ");break;
                case 2: System.out.println("                 *Fasilitas Bantuan UMKM*");
            System.out.println("Bantuan UMKM menyasar 12 juta pelaku UMKM dengan\nmendapat bantuan sebesar Rp 2,4 juta per orang."); break;
                case 3: System.out.println("          *Syarat-Syarat Penerima Bantuan UMKM*");
            System.out.println("1. Warga Negara Indonesia");
            System.out.println("2. Mempunyai NIK");
            System.out.println("3. Memiliki Usaha Mikro");
            System.out.println("4. Bukan Termasuk ASN, Pegawai BUMN/BUMD, TNI/POLRI");
            System.out.println("5. Penghasilan <= Rp3.000.000");
            }break;
            
        }while (pilih!=4);
    }
            static void daftar(){
        String nama, alamat, usaha, nik;
            int hasil,pilih;
            do{
            System.out.println("                 Daftar Bantuan UMKM");
            System.out.println("");
            System.out.print("Nama         : ");
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
            pilih=s.nextInt();
            if(pilih==1 && hasil<=3000000){
                System.out.println("Selamat Pendaftaran Anda Diterima");
            }else if(pilih==1 && hasil>=3000000){
                System.out.println("Mohon Maaf Pendaftaran Tidak Diterima");
            }else if(pilih==3){
                System.out.println("Data Dibatalkan");   
            }
            }while(pilih==2);
    } 
            static void laporan(){
        int pilih;
        do{
            System.out.println("                   Laporan Keuangan Anda");
            System.out.println("1. Catat Pemasukan");
            System.out.println("2. Catat Pengeluaran");
            System.out.println("3. Selesai");
            System.out.print("Pilih : ");
            pilih=s.nextInt();
            switch (pilih){
                case 1: pemasukan(); break;
                case 2: pengeluaran(); break;
            }
        }while(pilih!=3);
    } 
            static void pemasukan(){
        int tahun;
            System.out.print("Masukkan berapa tahun pemasukan = ");
            tahun=s.nextInt();
            int bln1[] = new int[tahun];
                int bln2[] = new int[tahun];
                int bln3[] = new int[tahun];
                int bln4[] = new int[tahun];
                int bln5[] = new int[tahun];
                int bln6[] = new int[tahun];
                int bln7[] = new int[tahun];
                int bln8[] = new int[tahun];
                int bln9[] = new int[tahun];
                int bln10[] = new int[tahun];
                int bln11[] = new int[tahun];
                int bln12[] = new int[tahun];
                int totalmsk[]=new int[tahun];
        System.out.println("");
                System.out.println("                        PEMASUKAN");
                for(int i = 0; i < tahun; i++){
                    System.out.println("");
                    System.out.println("Tahun ke "+(i+1));
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
                    System.out.print(batas+"\nTotal    = Rp "+totalmsk[i]);
                    System.out.println("");
                }
                System.out.println("");
                    System.out.println("                   *Laporan Pemasukkan Anda*\n"+batas);
                     for(int i = 0; i<tahun; i++){
                    System.out.println("Tahun ke "+(i+1));
                    System.out.println("Bulan 1\t\t\tBulan 2\t\t\tBulan 3\t\t\tBulan 4\t\t\tBulan 5\t\t\tBulan 6\t\t\tBulan 7\t\t\tBulan 8\t\t\tBulan 9\t\t\tBulan 10\t\tBulan 11\t\tBulan 12\t\tTotal");
                System.out.println("Rp "+bln1[i]+"\t\t"+"Rp "+bln2[i]+"\t\t"+"Rp "+bln3[i]+"\t\t"+"Rp "+bln4[i]+"\t\t"+"Rp "+bln5[i]+"\t\t"+"Rp "+bln6[i]+"\t\t"+"Rp "+bln7[i]+"\t\t"+"Rp "+bln8[i]+"\t\t"+"Rp "+bln9[i]+"\t\t"+"Rp "+bln10[i]+"\t\t"+"Rp "+bln11[i]+"\t\t"+"Rp "+bln12[i]+"\t\t"+"Rp "+totalmsk[i]);
                    System.out.println("");   
            } System.out.println("");
    } 
            static void pengeluaran(){
        System.out.print("Masukkan berapa bulan pengeluaran = ");
        int bln=s.nextInt();
        int pilih;
        int listrik[]=new int[bln];
        int keluarga[]=new int[bln];
        int stok[]=new int[bln];
        int pulsa[]=new int[bln];
        int sewa[]=new int[bln];
        int hutang[]=new int[bln];
        int cicilan[]=new int[bln];
        int gaji[]=new int[bln];
        int lain[]=new int[bln];
        long totalplrn[]=new long[bln];
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
                pilih=s.nextInt();
                if(pilih==1){
                    for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran listrik di bulan "+(i+1)+" : Rp ");
                    listrik[i]=s.nextInt();
                    }
                    
                }else if(pilih==2){
                    for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran keluarga di bulan "+(i+1)+" : Rp ");
                    keluarga[i]=s.nextInt();
                    }
                    
                }else if(pilih==3){
                    for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran stok di bulan "+(i+1)+" : Rp ");
                    stok[i]=s.nextInt();}
                }else if(pilih==4){
                   for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran pulsa di bulan "+(i+1)+" : Rp ");
                    pulsa[i]=s.nextInt();}
                }else if(pilih==5){
                    for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran sewa di bulan "+(i+1)+" : Rp ");
                    sewa[i]=s.nextInt();}
                }else if(pilih==6){
                    for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran hutang di bulan "+(i+1)+" : Rp ");
                    hutang[i]=s.nextInt();}
                }else if(pilih==7){
                    for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran cicilan di bulan "+(i+1)+" : Rp ");
                    cicilan[i]=s.nextInt();}
                }else if(pilih==8){
                    for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran gaji di bulan "+(i+1)+" : Rp ");
                    gaji[i]=s.nextInt();}
                }else if(pilih==9){
                    for (int i = 0; i < bln; i++) {
                        System.out.print("Pengeluaran lain di bulan "+(i+1)+" : Rp ");
                    lain[i]=s.nextInt();}
                }else if(pilih==10){
                    for (int i = 0; i < bln; i++) {
                        totalplrn[i]=listrik[i]+keluarga[i]+stok[i]+pulsa[i]+sewa[i]+hutang[i]+cicilan[i]+gaji[i]+lain[i];
                    }
                    System.out.println("");
                    System.out.println("                   *Laporan Pengeluaran Anda*\n"+batas);
                     for(int i = 0; i<bln; i++){
                    System.out.println("Bulan ke "+(i+1));
                    System.out.println("Listrik\t\t\tKeluarga\t\tStok\t\t\tPulsa\t\t\tSewa\t\t\tHutang\t\t\tCicilan\t\t\tGaji\t\t\tLain\t\t\tTotal");
                System.out.println("Rp "+listrik[i]+"\t\t"+"Rp "+keluarga[i]+"\t\t"+"Rp "+stok[i]+"\t\t"+"Rp "+pulsa[i]+"\t\t"+"Rp "+sewa[i]+"\t\t"+"Rp "+hutang[i]+"\t\t"+"Rp "+cicilan[i]+"\t\t"+"Rp "+gaji[i]+"\t\t"+"Rp "+lain[i]+"\t\t"+"Rp "+totalplrn[i]);
                    System.out.println("");   
            }
            System.out.println("");

                }

    }while(pilih!=11);
        
}
    }
    

