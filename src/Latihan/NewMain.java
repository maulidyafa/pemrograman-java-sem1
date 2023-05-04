package Latihan;
import java.util.Scanner;
public class NewMain {
public static void main(String[] args) {
Scanner s = new Scanner (System.in);
String nama, alamat;
int nik,hasil,usaha;
            System.out.println("                 Daftar Bantuan UMKM");
            System.out.print("Nama Lengkap : ");nama=s.next();
            System.out.print("Alamat kota  : ");alamat=s.next();
            System.out.print("NIK          : ");nik=s.nextInt();
            System.out.print("Penghasilan  : ");hasil=s.nextInt();
            System.out.print("Jenis Usaha  : ");usaha=s.nextInt();
            if(hasil<=3000000){
                System.out.println("Selamat Anda Mendapat bantuan UMKM ^_^");
            }else{
                System.out.println("Mohon Maaf Anda Tidak Bisa Mendapat Bantuan UMKM");
            }
            String bulan[]={"bln1       ", "bln2       ", "bln3       ", "bln4       ", "bln5       ", "bln6       ", "bln7       ", "bln8       ", "bln9       ", "bln10       ", "bln11       ", "bln12       "};
            long pemasukan[]=new long[12];
            for (int i = 0; i < 12; i++) {
            System.out.print(bulan[i]);
            } System.out.println("");
            for (int j = 0; j < 12; j++) {
            System.out.print("");
            pemasukan[j]=s.nextLong();
            System.out.println("*PEMASUKAN*   :");
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
                System.out.print("Masukkan Jumlah Pelanggan : ");
            int p = s.nextInt();
            int totalhtg = 0;
            String nama1[] = new String[p];
            int wa[] = new int[p];
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
            for(int i = 0; i<p; i++){
                System.out.println("");
                System.out.println("Pelanggan ke "+(i+1));
                        System.out.print("Nama       : ");
                        nama1[i]=s.next();
                        System.out.print("WhatsApp   : ");
                        wa[i]=s.nextInt();
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
                        System.out.print("Total      : Rp ");
                        totalhtg = hutang1[i]+hutang2[i]+hutang3[i]+hutang4[i];
            }
            System.out.println("                                                                                            *Hutang Pelanggan Anda*\n");
            System.out.println("No\t\t Nama \t\tWhatsApp \t\tHutang 1\t\tHutang 2\t\tHutang 3\t\tHutang 4\t\tHutang 5");
            for(int i = 0; i<p; i++){
                System.out.println((i+1)+"\t\t"+nama1[i]+"\t\t"+wa[i]+"\t\t"+hutang1+"\t\t"+hutang2+"\t\t"+hutang3+"\t\t"+hutang4+"\t\t"+hutang5+"\t\t"+hutang6+"\t\t"+hutang7+"\t\t"+hutang8+"\t\t"+hutang9+"\t\t"+hutang10+"\t\t"+totalhtg);
            }
            }
    }
    }


    

   

    
    

