package looping;
//Membuat Program Jumlah Deret Fibonacci
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("*********Program Fibonacci*********");
    System.out.print("Maasukkan suku ke = ");int n = sc.nextInt();
    int Fibo, Fibo1, Fibo2, Jumlah;
    Fibo1 = 0; Fibo2 = 1; 
    Jumlah = Fibo1 + Fibo2;
    System.out.print("Deret Fibonacci   = "+Fibo1+" "+Fibo2+" ");  
    for(int i = 2; i <= n; i++){
      Fibo = Fibo1 + Fibo2;
      Fibo1 = Fibo2;
      Fibo2 = Fibo;
      Jumlah = Jumlah + Fibo;
        System.out.print(Fibo+" ");
    }   System.out.println(" ");
      System.out.println("-----------------------------------");
      System.out.println("Jumlah Deret Fibonacci = "+Jumlah);
    }
}
