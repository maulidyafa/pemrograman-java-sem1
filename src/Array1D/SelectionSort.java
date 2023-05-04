package Array1D;
import java.util.Scanner;
public class SelectionSort {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int data[] = new int[8];
    System.out.println("==============================");
    System.out.println("*****Program Selection Sort*****");
    System.out.println("==============================");
    System.out.println("Masukkan 8 Digit KTP Anda : ");
    for(int i = 0; i < 8; i++){
        System.out.print("Data "+(i+1)+ " = ");
        data[i] = sc.nextInt();}
    System.out.println("==============================");
        System.out.print("Data Awal  : ");
      for(int i = 0; i < data.length; i++){
        System.out.print(data[i]+" ");  
      }
        System.out.println("");
    for(int i = 0; i < data.length-1; i++){
      for(int j = i+1; j<data.length; j++){
        if(data[i] > data[j]){
    //Tukar Data
    int temp = data[j];
    data[j]  = data [i];
    data[i]  = temp;
    }//End if 
    }//End loop j
    }//End loop i
    System.out.print("Data Akhir : ");
    for(int i = 0; i < data.length; i++){
        System.out.print(data[i]+" ");
    }
    System.out.println("");
    System.out.println("==============================");
}
    
}