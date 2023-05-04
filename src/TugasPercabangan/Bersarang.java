package TugasPercabangan;
//Program If-Else Bersarang Melengkapi Source Code
import java.util.Scanner;
public class Bersarang {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    boolean lapar, uangcukup;
    System.out.print("Apakah Anda Lapar?");
      lapar = sc.nextBoolean();
    System.out.print("Apakah Uang Anda Cukup?");
      uangcukup = sc.nextBoolean();
    if(lapar==true){
       if (uangcukup==true)System.out.println("Beli Ke Warung");
       else if (uangcukup==false)System.out.println("Banyak Minum");
    }else if(lapar==false){
       if (uangcukup==true)System.out.println("Ditabung Dulu");
       else if (uangcukup==false)System.out.println("Belajar Saja");
    }
            
    }
    
}
