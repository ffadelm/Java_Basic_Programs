package persamaanakarkuadrat;


class HitungAkar{
   double a;
   double b;
   double c;
   double D = b*b-(4*a*c);
   double x1;
   double x2;

   public double HitungPersamaanX1(){
       x1 = -b/(2*a);
       return x1;
   }

   public double HitungPersamanX2(){
       x2 = b/(2*a);
       return x2;
   }

   public double nilaiD(){
       D = b*b-(4*a*c);
       return D;
   }
}




