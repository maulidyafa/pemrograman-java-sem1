package PerulanganBersarang;
//Mmembuat program segitiga atas
import java.util.Scanner;
public class Segitigaatas {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("*******Program Segitiga Angka*******");
    System.out.println("====================================");
    System.out.print("Masukkan Sisi = ");
    int sisi = sc.nextInt();
    System.out.println("====================================");
    for (int i = sisi; i > 0; i--){
      for(int j = i; j > 0; j--){
          System.out.print(j+" "); 
      }  
        System.out.println("");
    }
    }
    
}
