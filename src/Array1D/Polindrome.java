package Array1D;
//Membuat program polindrome
import java.util.Scanner;
public class Polindrome {
public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  String kata, katabalik = "";
    System.out.println("*********PROGRAM POLINDROME********");
    System.out.print("Masukkan Kata : ");
    kata = sc.nextLine();
    for(int i = kata.length() - 1; i >= 0; i--)
    {
        katabalik = katabalik + kata.charAt(i);
    }
    if(kata.equalsIgnoreCase(katabalik))
    {
        System.out.println("Kata "+kata+" adalah POLINDROME");
    }
    else
    {
        System.out.println("Kata "+kata+" BUKAN POLINDROME");
    }
    }
    
}
