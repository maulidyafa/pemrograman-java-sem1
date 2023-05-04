package ArrrayMultiD;
public class NilaiMhs {
public static void main(String[] args) {
    double data[][]= {{111,80,70,60,90,86,80},{112,90,70,60,70,90,85},{113,70,90,70,80,80,95},
                     {114,80,80,90,70,80,88},{115,80,80,95,70,82,72},};
    System.out.println("=========================================================");
    System.out.println("**************PROGRAM TABEL NILAI MAHASISWA**************");
    System.out.println("=========================================================");
    System.out.println("");
    System.out.println("                     NILAI MAHASISWA                     ");
    System.out.println("=========================================================");
    System.out.println("NPM\tTUGAS\tKUIS\tUTS\tUAS\tFINAL");
    System.out.println("=========================================================");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 6; j++) {
            System.out.print(data[i][j]+"\t");
        }
        System.out.println("");
    }
        double NA;
        for (int i = 0; i < 5; i++) {
            NA = 0;
        for (int j = 1; j < 6; j++) {
            if(j==1) //Tugas
                NA = NA + 0.1*data[i][j];
            else if(j==2||j==5) //Kuis dan Final Project
                NA = NA + 0.2*data[i][j];
            else if(j==3||j==4) //UTS dan UAS
                NA = NA + 0.25*data[i][j];
        }
        data[i][6]= NA; //NA disimpan di array
        }
        System.out.println("");
        System.out.println("                  NILAI AKHIR MAHASISWA                  ");
        System.out.println("=========================================================");
        System.out.println("NPM\tTUGAS\tKUIS\tUTS\tUAS\tFINAL\t NA");
        System.out.println("=========================================================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(data[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
