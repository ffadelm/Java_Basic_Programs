import java.util.Scanner;

public class NilaiRata {

    static Scanner masuk = new Scanner(System.in);
    static Scanner ini = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Deklarasi array, i , n sebagai integer
        int arr[],i,n;
        
        //set nilai array 50
        arr = new int[50];
        
        //deklarasi rata, total = 0 sebagai float
        float rata, total = 0;
        
        // deklarasi balik sebagai string
        String balik;
        
        System.out.println("====================================");
        System.out.println("Program Menghitung Rata - rata Angka");
        System.out.println("====================================");
        
        //looping program
        do {
            
            //input batasan arr
            while(true){
                System.out.print("\nMasukkan Banyaknya jumlah Angka : ");
                n = masuk.nextInt();
                if(n>50){
                    System.out.println("\nBatas Maksimal Hanya 50!!!");
                }
                else
                    break;      
            }
            
            //input angka yang akan di hitung
            System.out.println("Daftar Angka :");
            for(i = 0;i<n;i++){
                System.out.print((i+1)+". ");
                //menyimpan inputan angka
                arr[i] = masuk.nextInt();
                
                //menjumlah setiap angka yang di input 
                total+=arr[i];
                }
            
            // menghitung rata-rata
            rata = total/n;
            
            // output hasil rata-rata
            System.out.print("Hasil Rata-rata adalah : "+rata);
            
            // program kembali Y/y = ke input batasan arr, n = Stop
            System.out.print("\nInput Lagi? (Y/N) : ");            
                balik = ini.nextLine();   
        }   
        while(balik.equals("Y")||balik.equals("y"));             
    }   
}
