package Latihan;
import java.util.Scanner;
public class NewMain2 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Pelanggan : ");
    int p = s.nextInt();
            int totalhtg = 0;
            String nama1[] = new String[p];
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
                        totalhtg = hutang1[i]+hutang2[i]+hutang3[i]+hutang4[i]+hutang5[i]+hutang6[i]+hutang7[i]+hutang8[i]+hutang9[i]+hutang10[i];
                        System.out.print("Total      = Rp "+totalhtg);
                        System.out.println("");
            }
            System.out.println("                                                                                            *Hutang Pelanggan Anda*\n");
            System.out.println("No\t\t Nama \t\tWhatsApp \t\tHutang 1\t\tHutang 2\t\tHutang 3\t\tHutang 4\t\tHutang 5\t\tHutang 6\t\tHutang 7\t\tHutang 8\t\tHutang 9\t\tHutang 10\t\tTotal");
            for(int i = 0; i<p; i++){
                System.out.println((i+1)+"\t\t "+nama1[i]+"\t\t"+wa[i]+"\t\t\t"+hutang1[i]+"\t\t\t"+hutang2[i]+"\t\t\t"+hutang3[i]+"\t\t\t"+hutang4[i]+"\t\t\t"+hutang5[i]+"\t\t\t"+hutang6[i]+"\t\t\t"+hutang7[i]+"\t\t\t"+hutang8[i]+"\t\t\t"+hutang9[i]+"\t\t\t"+hutang10[i]+"\t\t\t"+totalhtg);
            }
            
            }
    }
    

