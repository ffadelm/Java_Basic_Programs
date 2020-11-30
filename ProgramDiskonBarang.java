import java.io.IOException;
import java.util.Scanner;


public class ProgramBarang {

    static Scanner keyboard = new Scanner(System.in);
    static Scanner okey = new Scanner(System.in);
    
    public static void main(String[] args) {
        int jumlah;
        int harga;
        int total;
        int bayar;
        
        boolean loop = true;
        
        System.out.println("Note :");
        System.out.println("*Beli < 5 barang diskon 0%");
        System.out.println("*Beli < 10 barang diskon 5%");
        System.out.println("*Beli > 10  barang diskon 10%");
        while(loop){
            try{
                System.out.print("\nJumlah Barang : ");
                jumlah = keyboard.nextInt();
                
                System.out.print("Harga Barang  : ");
                harga = keyboard.nextInt();
            }
            catch(Exception e){
                break;
            }
        //mencari total harga
        total = jumlah *harga;
        //output    
        System.out.println("--------------------------------------------------");
        System.out.println("Jumlah\tHarga\tTotal\tDiskon\tBayar");
        System.out.println("--------------------------------------------------");
        System.out.print(jumlah+"\t");
        System.out.print(harga+"\t");
        System.out.print(total+"\t");
        if (jumlah<=5){
            //mencari diskon
            bayar = total;
            System.out.print("0%"+"\t");
            System.out.println(bayar+"\t");
        }
        else if (jumlah<=10){
            //mencari diskon 5%
            bayar = (total-(total*5)/100);
            System.out.print("5%"+"\t");
            System.out.println(bayar+"\t");
            
        }
        else{
            //mencari diskon 10%
            bayar = (total-(total*15)/100);
            System.out.print("10%"+"\t");
            System.out.println(bayar+"\t");
        }               
        System.out.println("--------------------------------------------------");
        
        System.out.print("Input Again? (Y/N) : ");            
            String character = okey.nextLine();
            if((character.equals("N"))|(character.equals("n"))){
                loop = false;
            }                  
        }
    }
    
}
