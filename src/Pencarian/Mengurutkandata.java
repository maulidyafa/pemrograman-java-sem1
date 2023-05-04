package Pencarian;
public class Mengurutkandata {
public static void main(String[] args) {
    System.out.println("=========================================================");
    System.out.println("*****************Program Pengurutan Data*****************");
    System.out.println("=========================================================");
    String data[]= {"27","84","36","24","19","58","43","05","61","95","77","01","49","32","88"};
    System.out.print("Data Awal  : ");
    for (int i = 0; i < data.length; i++) {
        System.out.print(data[i]+" ");
    }System.out.println("");
    for (int i = 0; i < data.length-1; i++) {
        for (int j = i+1; j < data.length; j++) {
            if(Integer.parseInt(data[i])>Integer.parseInt(data[j])){
                String tempat = data[j];
                data[j] = data[i];
                data[i]=tempat;
            }
        }
    }System.out.print("Data Akhir : ");
    for (int i = 0; i < data.length; i++) {
        System.out.print(data[i]+" ");
    }
    System.out.println("");
    System.out.println("=========================================================");
}
}
    

