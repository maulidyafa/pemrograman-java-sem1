package Array1D;
public class BubbleShort {
public static void main(String[] args) {
    int data[] = {3,5,1,5,0,6,6,4};
    System.out.println("==============================");
    System.out.println("*****Program Bubble Short*****");
    System.out.println("==============================");
    System.out.print("Data Awal  : ");
    for(int i = 0; i < data.length; i++){
        System.out.print(data[i]+ " ");}
        System.out.println("");
    //Pengurutan array metode bubble short
        for(int i = 0; i < data.length; i++){
           for(int j = 0; j < data.length-1; j++){
            if (data[j] > data[j+1]){
    //Tukar data
    int temp = data[j];
    data[j] = data[j+1]; 
    data [j+1] = temp;
        }//end if   
        }//end loop j
        }//end loop i
    System.out.print("Data Akhir : ");
    for(int i = 0; i < data.length; i++){
        System.out.print(data[i]+ " ");}
    System.out.println("");
    System.out.println("==============================");
    }
    }
    

