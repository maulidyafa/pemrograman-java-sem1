package Latihan;
public class TabelMahasiswa {
public static void main(String[] args) {
    double nilai[][]={
        {111,80,70,60,90,0},{112,90,70,60,70,0},
        {113,70,90,70,80,0},{114,80,80,90,70,0},
        {115,80,80,95,70,0},
    };
    //kolom ke 6 berisi 0 untuk tempat Nilai Akhir
    System.out.println("Program Nilai Akhir");
    //menampilkan data nilai awal mahasiswa
    System.out.println("NPM\tTugas\tKuis\tUTS\tUAS");
    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
            System.out.print(nilai[i][j]+"\t");
        }
        System.out.println("");
    }
    //menghitung nilai akhir setiap mahasiswa
    double NA;
    for(int i = 0; i < 5; i++){
        NA = 0; //NA setiap mahasiswa dimulai dari 0
    for(int j = 0; j < 5; j++){
        if(j==1||j==2)//tugas dan kuis
            NA = NA + 0.2*nilai[i][j];
        else if(j==3||j==4)//UTS dan UAS
            NA = NA + 0.3*nilai[i][j];
    }
    nilai[i][5] = NA; //simpan NA ke array
    //menampilkan nilai akhir
        System.out.println("NPM\tTugas\tKuis\tUTS\tUAS\tNA");}
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(nilai[i][j]+"\t");
            }
        }
        System.out.println("");
    }
    
}
