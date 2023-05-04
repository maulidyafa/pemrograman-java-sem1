package ArrrayMultiD;
import java.util.Scanner;
public class Hotel {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String kamar [][][] = new String[5][8][10];
    int menu = 0;
    do{   
        System.out.println("===============================");
        System.out.println("      *****LUX HOTEL*****      ");
        System.out.println("===============================");
        System.out.println("1. Check-In");
        System.out.println("2. Cari Tamu");
        System.out.println("3. Okupansi");
        System.out.println("4. Check-Out");
        System.out.println("5. Exit");
        System.out.print("Pilih : "); menu = s.nextInt();
        switch(menu){
        case 1 :
            String tamu;
            int nomor, lantai, baris, kolom;
            System.out.print("Masukkan Nama = ");tamu=s.next();boolean kosong=false;
            do{
                System.out.print("Nomor Kamar   = ");nomor=s.nextInt();
                lantai = nomor/100;
                kolom  = (nomor-lantai*100)/10;
                baris  = (nomor-lantai*100)-(kolom*10);
                if(kamar[baris-1][kolom-1][lantai-1]==null){
                    kosong=true;
                }
                else{
                    System.out.println("Kamar Terisi");
                }
            }while(kosong!=true);
            kamar[baris-1][kolom-1][lantai-1]=tamu;
            System.out.println("Selamat Menempati ^_^");
            System.out.println("");
            break;
        case 2 :
            boolean ketemu=false;
            String nama;
            System.out.print("Nama Tamu    = ");nama=s.next();
            for(int i = 0; i<5; i++){
                for(int j = 0; j<8; j++){
                    for(int k = 0; k<10; k++){
                        if(kamar[i][j][k]==null){
                            continue;
                        }
                        if(kamar[i][j][k].compareToIgnoreCase(nama)==0){
                            System.out.print("Ada di Kamar = ");
                            System.out.print((k+1)+"");
                            System.out.print((j+1)+"");
                            System.out.println((i+1)+"");
                            ketemu=true; 
                            System.out.println("");
                            break;
                        }//end if
                    }//end loop k
                }//end loop j
            }//end loop i
            if(ketemu==false){
                System.out.println("Tamu Tidak Ada");
                 System.out.println("");
            }break;
        case 3 :
            int booked=0,free=0;
            for(int i = 0; i<5; i++){
                for(int j = 0; j<8; j++){
                     for(int k = 0; k<10; k++){
                         if(kamar[i][j][k]==null){
                             free++;
                         }
                         else booked++;
                     }
                }
            }
            System.out.println("Okupansi Hotel");
            System.out.println("Terisi = "+booked);
            System.out.println("Kosong = "+free);
             System.out.println("");
            break;
        case 4 :
            System.out.print("Masukkan Nama = ");tamu=s.next();
            System.out.print("Nomor Kamar   = ");nomor=s.nextInt();
            lantai = nomor/100;
            kolom  = (nomor-lantai*100)/10;
            baris  = (nomor-lantai*100)-(kolom*10);
            if(kamar[baris-1][kolom-1][lantai-1].equalsIgnoreCase(tamu)){
                kamar[baris-1][kolom-1][lantai-1]=null;
            }else
                System.out.println("Maaf Anda Gagal Check-out");
            break;
        case 5 :
            System.out.println("Terima Kasih");
             System.out.println("");
    }
    }while(menu!=4);
    }
    
}
