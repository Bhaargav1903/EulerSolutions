public class P10_SummationOfPrime {
    public static boolean is_Prime(long num) {  
          if (num <= 1) {  
              return false;  
          }  
          double l=Math.sqrt(num);
          for (int i=2;i<=l;i++) {  
              if (num % i == 0) {  
                  return false;  
              }  
          }  
          return true;  
      }
   public static void main(String[] args) {
       long s=0;
       for(long i=2;i<1000000;i++) {
           if(is_Prime(i)==true) {
               s=s+i;
           }
       }
       System.out.println(s);
   }

}