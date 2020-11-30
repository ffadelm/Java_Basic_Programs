import java.util.Scanner;

public class MenentukanNilaiMin {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //deklarasi variable
        int Min,Max, jumlah, i,array[];
    
        //input elemen
        System.out.print("Masukkan jumlah elemen: ");
        
        // simpan input di array
        jumlah = scan.nextInt();
        array = new int[jumlah];
        
        // input isi elemen array
        System.out.println("Masukkan "+jumlah+" angka");
        for(i = 0; i < jumlah; i++) {
          System.out.print("Elemen ke-"+ (i+1) +": " );
          array[i] = scan.nextInt();
        }
        
        //set min dan max ke array index 0
        Min = array[0];
        Max = array[0];
        //search 
        for(i = 0; i < jumlah; i++) {
          if (array[i] < Min){
              //menampilkan angka minimal
              Min = array[i];
          }
          if(array[i]>Max){
              //menampilkan angka maximal
              Max = array[i];
          }
        }
        
        //output 
        System.out.println("Nilai terkecil adalah "+Min);
        System.out.println("Nilai terbesar adalah "+Max);
    }    
}
