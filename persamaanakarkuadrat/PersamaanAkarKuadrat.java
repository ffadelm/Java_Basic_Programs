package persamaanakarkuadrat;

public class PersamaanAkarKuadrat {

    public static void main(String[] args) {
        
        HitungAkar nilai = new HitungAkar();

        nilai.a = 1;
        nilai.b = 10;
        nilai.c = 25;
        nilai.D = nilai.nilaiD();
        if( nilai.D <0){
            System.out.println("Akar Imajiner");
        }
        else{
            if (nilai.D == 0){
                System.out.println("Nilai x1 = "+nilai.HitungPersamaanX1());
                System.out.println("Nilai x2 = "+nilai.HitungPersamanX2());
            }
        }
        
        System.out.println("Determinan = "+nilai.D);
    }
}
