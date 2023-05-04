package tugasbp.pkg1;
import java.util.Scanner;
public class Kelompok16 {
    static Scanner sc = new Scanner (System.in);
        static String array[][] = new String[100][3];
        static int pilih;
        static String nama;
        static int JumPenumpang = 0;
        static void Cek(){
            System.out.println("\t\t\tDATA PENUMPANG");
            System.out.println("--------------------------------------------------------------");
            System.out.println("NAMA\t\t\t\t\tUSIA\t\tKURSI");
            System.out.println("--------------------------------------------------------------");
            for (int i = 0; i <= array.length-1; i++) {
                    if(array[i][0]==null)
                        continue;
                    if(array[i][0]!=null){
                        if(array[i][0].length()>25){
                        System.out.println(array[i][0]+"\t\t"+array[i][1]+"\t\t"+array[i][2]);
                        }else if(array[i][0].length()>15){
                            System.out.println(array[i][0]+"\t\t\t"+array[i][1]+"\t\t"+array[i][2]);
                        }
                        else if(array[i][0].length()>6){
                            System.out.println(array[i][0]+"\t\t\t\t"+array[i][1]+"\t\t"+array[i][2]);
                        }else System.out.println(array[i][0]+"\t\t\t\t\t"+array[i][1]+"\t\t"+array[i][2]);
                    }
            }
        }    
        static void Kursi(){
            int jawab;
            String d = "-----------------------------------------------------";            
            do{
            System.out.print(""+d+"\nMasukkan Nama Penumpang (1 kata saja) = ");
            nama = sc.next();
                System.out.println("");
                System.out.println("");
                System.out.println("\t\tKURSI PENUMPANG");
                System.out.println(d+"\nNAMA\t\t\t\tKODE");
                System.out.println(d);
            boolean ketemu = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i][0]==null)
                    continue;
                if(array[i][0].contains(nama)){
                    if(array[i][0].length()>15){
                    System.out.print(array[i][0]+"\t\tKode: "+i);
                    }else if(array[i][0].length()>6){
                        System.out.print(array[i][0]+"\t\t\tKode: "+i);
                    }else{
                        System.out.print(array[i][0]+"\t\t\t\tKode: "+i);
                    }
                    
                    System.out.println("");
                    ketemu = true;
                } 
            }System.out.println(d);
                if(ketemu==false){
                    System.out.println("Nama Tidak Ditemukan");
                    return;
                }
                    System.out.print("Masukkan Kode Nama = ");
                    int k = sc.nextInt();
                    System.out.println(d);
                    if(k<0 || k>=100 || array[k][0]==null){
                        System.out.println("Kode Tidak Ditemukan");
                        return;
                    }
                    System.out.println("\nNama \t: "+array[k][0]);
                    System.out.println("Umur \t: "+array[k][1]);
                    System.out.println("Kursi\t: "+array[k][2]);
                    System.out.println(d);
                    System.out.println("Lanjut Mencari ? \n[1 = ya] \n[2 = tidak]");
                    System.out.print("\nPilihan Anda = ");
                    jawab = sc.nextInt();
                    if(jawab!=1){
                        jawab=2;
                    }
                }while(jawab!=2);System.out.println(d + "\n");
        }

        static void TambahDataPenumpang (String nama, String umr, String krs){
            if(JumPenumpang >= 100){
                System.out.println("Kapasitas Penuh");
            }else {
                array[JumPenumpang][0] = nama;
                array[JumPenumpang][1] = umr;
                array[JumPenumpang][2] = krs;
                System.out.println("Data Berhasil Di Input");
                JumPenumpang++;
            }
        }
        static void Tambah(String a,String c){
            int stay;
                             do{
                             String bantu,bantu2;
                             System.out.println("\n\t\tMenambah Data Penumpang");
                             System.out.println(c+"\n~  Catatan : Ganti Spasi Dengan Tanda Hubung/Kurang [-] ~");
                             System.out.println("~  Contoh : Daisuke-Kambe");                   
                             System.out.print(c+"\n\nNama = ");
                             bantu = sc.next();
                             while(bantu.length()>30){
                                 System.out.println("Nama Terlalu Panjang");
                                 System.out.print("\nNama = ");
                                 bantu = sc.next();
                             }
                             String[] kata = bantu.split("-");
                             bantu = "";
                             for (int i = 0; i < kata.length; i++) {
                                bantu += kata[i]+" ";
                             }
                             System.out.print("Kursi = ");
                             bantu2 = sc.next();
                             kata = bantu2.split("-");
                             bantu2 = "";
                             for (int i = 0; i < kata.length; i++) {
                                bantu2 += kata[i]+" ";
                             }
                             System.out.print("Umur = ");
                             String Stock = sc.next();
                             System.out.println("");
                             System.out.println(a);                            
                             TambahDataPenumpang(bantu, Stock, bantu2);
                             System.out.println(a);
                                 System.out.println("\nTetap Menambah ?\n[1. Ya]\n[2. Tidak]");
                                 System.out.print("\nPilihan Anda = ");
                                 stay=sc.nextInt();
                                 System.out.println("");
                             }while (stay!=2);   
        }
        static void Urutkan(String data[][],String a, String c){
            int tetap;
              do{
                System.out.println("\n\t\tMengurutkan Data Penumpang");
                System.out.println(c+"\n1. Menurut Abjad");
                System.out.println("2. Menurut Umur");
                System.out.print(c+"\nPilihan Anda = ");
                int jawab = sc.nextInt();
                if(jawab==1){
                    String nam[][] = MengurutkanStock(data,0);
                    System.out.println(a+"\n\n\n\t    Mengurutkan berdasar a-z");
                    System.out.println(a+"\nNAMA\t\t\t\t\tUSIA");
                    System.out.println(a);
                    MencetakUrutStock(nam);
                    System.out.println(a);
                }else if(jawab==2){
                    String bar[][] = UrutkanAngka(data,jawab); 
                    System.out.println(a+"\n\n\n     Mengurutkan berdasar Umur(Besar-Kecil)");
                    System.out.println(a+"\nNAMA\t\t\t\t\tUSIA");
                    System.out.println(a);
                    MencetakUrutStock(bar);
                    System.out.println(a);
                }else{
                    System.out.println("Pilihan Tidak Tersedia");
                }
                System.out.println("\nTetap mengurutkan ?\n[1. Ya]\n[2. Tidak]");
                System.out.print("\nPilihan Anda = ");                                 
                tetap = sc.nextInt();
            }while (tetap!=2); 
        }
        static String[][] UrutkanAngka(String data[][],int jawab){
            int angka[]=new int[100];
            for (int i = 0; i < JumPenumpang; i++) {
                angka[i] = Integer.valueOf(data[i][1]);
            }       
            String[][] hasiltukar = TukarData(data,angka,jawab);
            return hasiltukar;
        }
        static String[][] TukarData(String [][]data,int []angka,int jawab){
            for (int i = 0; i < JumPenumpang-1; i++) {
                for (int j = i+1; j < JumPenumpang; j++) {
                        if(angka[i]<angka[j]){
                        int temp0 = angka[j];
                        angka[j] = angka[i];
                        angka[i]=temp0;
                        String temp1 = data[i][0];
                        data[i][0] = data[j][0];
                        data[j][0] = temp1;
                        String temp2 = data[i][1];
                        data[i][1] = data[j][1];
                        data[j][1] = temp2;
                        }
                }
            }
            return data;
        }                    
        static String[][] MengurutkanStock(String[][] data, int kolom){
            for (int i = 0 ; i <JumPenumpang-1; i++){
                for (int j = i+1; j < JumPenumpang; j++) {
                        if(data[i][kolom].compareToIgnoreCase(data[j][kolom])>0){
                           String temp1 = data[i][0];
                           data[i][0] = data[j][0];
                           data[j][0] = temp1;
                           String temp2 = data[i][1];
                           data[i][1] = data[j][1];
                           data[j][1] = temp2;
                        }  
                }
            }
            String hasil[][] = new String[JumPenumpang][2];
            for(int i = 0 ; i < JumPenumpang; i++){
                hasil[i][0] = data [i][0];
                hasil[i][1] = data [i][1];
            }
            return hasil;
        }
        static void MencetakUrutStock(String s[][]){
            for (int i = 0; i <= array.length-1; i++) {
                    if(array[i][0]==null)
                        continue;
                    if(array[i][0]!=null){
                        if(array[i][0].length()>25){
                        System.out.println(array[i][0]+"\t\t"+array[i][1]);
                        }else if(array[i][0].length()>15){
                            System.out.println(array[i][0]+"\t\t\t"+array[i][1]);
                        }
                        else if(array[i][0].length()>6){
                            System.out.println(array[i][0]+"\t\t\t\t"+array[i][1]);
                        }else System.out.println(array[i][0]+"\t\t\t\t\t"+array[i][1]);
                    }
            }
        }
        public static void main(String[] args) {
            String s = "================================";
            String a = "--------------------------------------------------------------";
            String c = "=====================================================";
            System.out.println("\n\nProgram Rekap Data Penumpang Pesawat");
            array[0][0]="Ledina Adelia"; array [0][1]="19"; array[0][2]="8A";
            array[1][0]="Daisuke Kambe"; array [1][1]="27"; array[1][2]="8B";
            array[2][0]="Satoru Gojo"; array [2][1]="28"; array[2][2]="8C";
            JumPenumpang = 3;
            do {
                System.out.println("\n~~ PILIHAN MENU ~~");
                System.out.println("1. Data Penumpang");
                System.out.println("2. Cari Penumpang");
                System.out.println("3. Tambah Data Penumpang");
                System.out.println("4. Mengurutkan Data Penumpang");
                System.out.println("5. Exit");
                System.out.print("\n" + "\nPilihan Anda = ");
                pilih = sc.nextInt();
                System.out.println("\t\t");
                switch(pilih){
                    case 1 : Cek();
                             System.out.println(a+"\n");
                             break;
                    case 2 : Kursi();
                             break;
                    case 3 : Tambah(a,c);                          
                             break;
                    case 4 : Urutkan(array,a,c);                            
                             break;
                    case 5 : System.out.println("");
                             break;
                    default : System.out.println("Pilihan Tidak Tersedia");
                }
            } while (pilih!=5);
            System.out.println(""); 
        }
}
