package Latihan;
import java.util.Scanner;
public class NewMain1 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
        System.out.print("Masukkan Jumlah Pelanggan : ");
            int p = s.nextInt(); 
            String nama;
            int pelanggan[][]=new int[p][13];
            long totall=0;
            Long total[]=new Long[p];
            for(int i = 0; i<p; i++){
                System.out.println("");
                System.out.println("Pelanggan ke "+(i+1));
                System.out.print("Nama Pelanggan : ");nama=s.next();
                for (int j = 0; j < 12; j++) {
                    totall=0;
                    if(j==0)
                        System.out.print("No. urut       : "); 
                    else if (j==1)
                        System.out.print("Hutang 1       : Rp ");
                    else if (j==2)
                        System.out.print("Hutang 2       : Rp ");
                    else if (j==3)
                        System.out.print("Hutang 3       : Rp ");
                    else if (j==4)
                        System.out.print("Hutang 4       : Rp ");
                    else if (j==5)
                        System.out.print("Hutang 5       : Rp ");
                    else if (j==6)
                        System.out.print("Hutang 6       : Rp ");
                    else if (j==7)
                        System.out.print("Hutang 7       : Rp ");
                    else if (j==8)
                        System.out.print("Hutang 8       : Rp ");
                    else if (j==9)
                        System.out.print("Hutang 9       : Rp ");
                    else if (j==10)
                        System.out.print("Hutang 10      : Rp ");
                    if(j==10)continue;
                        totall = pelanggan[i][2]+pelanggan[i][3]+pelanggan[i][4]+pelanggan[i][5]+pelanggan[i][6]+pelanggan[i][7]+pelanggan[i][8]+pelanggan[i][9]+pelanggan[i][10];
                        total[i]=totall;
                    System.out.print("");
                    pelanggan[i][j]=s.nextInt();
                    
                }System.out.println("Total hutang   = Rp "+totall);
            }
            System.out.println("                                                                                            *Hutang Pelanggan Anda*\n");
            System.out.println("No. urut \t Nama \t Hutang 1 \t Hutang 2 \t Hutang 3 \t Hutang 4 \t Hutang 5 \t Hutang 6 \t Hutang 7 \t Hutang 8 \t Hutang 9 \t Hutang 10 \t Total Hutang");
            for(int i = 1; i<p; i++){
                for(int j = 0; j<12; j++){
                    System.out.print(pelanggan[i][j]+"\t\t ");
                    if(j==11)
                        System.out.println(total[i]);
                }
                System.out.println("");
            }
        
            
           
    }

    }
    
